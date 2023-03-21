/*
Скрипт заполняет таблицу все поля в navbar и таблицу About User для /admin и /user
 */
const url = "api/user";
$(async function () {
    await loadUser();
});
async function loadUser() {
    fetch(url)
        .then(r => r.json())                //читаем ответ в JSON
        .then(data => {
            // Подставляем полученную информацию в navbar
            $('#navUsername').append(data.username);
            //Получаем роли без подстроки ROLE_
            let roles = data.roles.map(role => role.role.replace('ROLE_', ''));
            $('#navRoles').append(roles);
            //Заполняем таблицу полученными данными
            let user = `$(
            <tr>
                <td>${data.id}</td>
                <td>${data.username}</td>
                <td>${data.password}</td>
                <td>${roles}</td>)`;
            //Вставляем все в тело таблицы
            $('#userPanelBody').append(user);
        })
        //Выводим ошибку если что-то пошло не так
        .catch((error) => {
            alert(error);
        });
}





