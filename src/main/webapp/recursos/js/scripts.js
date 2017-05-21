jQuery(document).ready(function () {
    $.backstretch([
        "recursos/imagenes/backgrounds/1.jpg",
        "recursos/imagenes/backgrounds/2.jpg",
        "recursos/imagenes/backgrounds/3.jpg"
    ], {duration: 3000, fade: 750});

    $('.login-form input[type="text"], .login-form input[type="password"], .login-form textarea').on('focus', function () {
        $(this).removeClass('input-error');
    });

    $('.login-form').on('submit', function (e) {
        $(this).find('input[type="text"], input[type="password"], textarea').each(function () {
            if ($(this).val() == "") {
                e.preventDefault();
                $(this).addClass('input-error');
            } else {
                $(this).removeClass('input-error');
            }
        });
    });
});
