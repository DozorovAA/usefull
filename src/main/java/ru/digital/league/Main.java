package ru.digital.league;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private static String string = "События - просмотр\n" +
        "\n" +
        "PRIV-READ-EVENT\n" +
        "\n" +
        "Печать события\n" +
        "\n" +
        "PRIV-PRINT-EVENT\n" +
        "Инцидент - изменение проекта управленческого решения\tPRIV-WRITEDECISION-INCIDENT\n" +
        "Печать инцидента\tPRIV-PRINT-INCIDENT\n" +
        "Печать управленческого решения\tPRIV-DECISIONPRINT-INCIDENT\n" +
        "Новости\tPRIV-ALL-NEWS\n" +
        "Правила установления факта инцидента - просмотр\tPRIV-ALL-NEWS\n" +
        "SQL-клиент - просмотр\n" +
        "\n" +
        "PRIV-READ-SQL-CLIENT\n" +
        "Реестр управленческих решений - просмотр\tPRIV-READ-REGISTER\n" +
        "Мониторинг управленческих решений - просмотр\tPRIV-READ-MONITORING\n" +
        "Эффективность управленческих решений\tPRIV-ALL-EFFICIENCY\n" +
        "Рабочий стол пользователя - изменение \tPRIV-WRITE-DESKTOP\n" +
        "Настройки рабочего стола пользователя - изменение\tPRIV-WRITE-SETTINGSDESKTOP\n" +
        "Сотрудники - просмотр\tPRIV-READ-SOTRUDNIKI\n" +
        "Клиентское приложение - просмотр \tPRIV-READ-CLIENT\n" +
        "Журнал экспорта\tPRIV-EXPORT\n" +
        "Неструктурированный текстовый документ - просмотр\tPRIV-READ-NTD\n" +
        "Отчет по ЧО\tPRIV-PRINT-CHO\n" +
        "Реестр документов - редактирование\tPRIV-WRITE-DOCUMENTS\n" +
        "Вики-страница - изменение\tPRIV-WRITE-WIKI\n" +
        "Учебные мероприятия  -  прохождение и просмотр результатов теста\tPRIV-WRITE-TEST-RESULT\n" +
        "Учения - Проведение учений - Ход учения - Изменение \tPRIV-WRITE-EXERCISE-FULFILLMENT\n" +
        "Учения - Проведение учений - Мониторинг учений - Назначение и результаты тестирования - Просмотр \tPRIV-READ-EXERCISE-CONDUCTING-TESTS\n" +
        "Учения - Проведение учений - Мониторинг учений - Назначение и результаты тестирования - Изменение \tPRIV-WRITE-EXERCISE-CONDUCTING-TESTS\n" +
        "Учения - Проведение учений - Мониторинг учений - Форма анализа учения - Просмотр \tPRIV-READ-EXERCISE-ANALYSIS\n" +
        "Обучение - Курсы - Просмотр\tPRIV-READ-COURSE\n" +
        "Учения - Проведение учений - Задания - Просмотр\tPRIV-READ-EXERCISE-CONDUCTING-TASKS\n" +
        "Учения - Проведение учений - Задания - Изменение\tPRIV-WRITE-EXERCISE-CONDUCTING-TASKS\n" +
        "Учение - Подготовка - Просмотр КШУ(ТСУ)\tPRIV-READ-EXERCISE-TACTIC\n" +
        "Учение - Подготовка - Просмотр ШТ\tPRIV-READ-EXERCISE-HQ\n" +
        "Учения - Подготовка – Изменение базовое КШУ(ТСУ)\tPRIV-WRITE-EXERCISE-TACTIC\n" +
        "Учения - Подготовка – Изменение базовое ШТ\tPRIV-WRITE-EXERCISE-HQ\n" +
        "Учение - Проведение - Просмотр базовое КШУ(ТСУ)\tPRIV-READ-EXERCISE-TACTIC-CONDUCTING\n" +
        "Учение - Проведение - Просмотр базовое ШТ\tPRIV-READ-EXERCISE-HQ-CONDUCTING\n" +
        "Импорт растровых геоданных в форматах GeoTIFF, BMP, PNG, JPG\n" +
        "\n" +
        "PRIV-IMPORT_RASTER-GIS_LR\n" +
        "\n" +
        "Экспорт растровых геоданных в форматах GeoTIFF, BMP, PNG, JPG\n" +
        "\n" +
        "PRIV-EXPORT_RASTER-GIS_LR\n" +
        "\n" +
        "Импорт векторных геоданных в форматах: SHP, GeoJSON, WKT, Geopackage, SXF, (SVG - УЗ)\n" +
        "\n" +
        "PRIV-IMPORT_VECTOR-GIS_LR\n" +
        "\n" +
        "Экспорт векторных геоданных в форматах: SHP, GeoJSON, WKT, Geopackage, (SVG - УЗ)\n" +
        "\n" +
        "PRIV-EXPORT_VECTOR-GIS_LR\n" +
        "\n" +
        "Интеграция с режимом синхронизации данных внешних поставщиков в БД оперативных слоев\n" +
        "\n" +
        "PRIV-MANAGE_EXTERNAL_SYNC-GIS_LR\n" +
        "\n" +
        "Отображение результатов выборки на карте\n" +
        "\n" +
        "PRIV-VIEW_SELECTION-GIS_LR\n" +
        "\n" +
        "Формирование полигона по румбам и длинам линий\n" +
        "\n" +
        "PRIV-CREATE_POLYGON_BY_RHUMB-GIS_LR\n" +
        "\n" +
        "Формирование полигона по координатам\n" +
        "\n" +
        "PRIV-CREATE_POLYGON_BY_COORDS-GIS_LR\n" +
        "\n" +
        "Измерение площадей произвольным полигоном и окружностью на карте\n" +
        "\n" +
        "PRIV-CALC_POLYGON_AREA-GIS_LR\n" +
        "\n" +
        "Выдача результатов поиска в виде списка\n" +
        "\n" +
        "PRIV-SEARCH_ATTRIBS-GIS_LR\n" +
        "\n" +
        "Таблица атрибутов (чтение)\n" +
        "\n" +
        "PRIV-VIEW_ATTRIBS-GIS_OBJECT\n" +
        "\n" +
        "Таблица атрибутов (запись)\n" +
        "\n" +
        "PRIV-EDIT_ATTRIBS-GIS_OBJECT\n" +
        "\n" +
        "Привязка файла к пространственным объектам карты (pdf, docx)\n" +
        "\n" +
        "PRIV-LINK_DOCUMENT-GIS_OBJECT\n" +
        "\n" +
        "Привязка к векторным объектам произвольных HTML-объектов для отображения дополнительных сведений\n" +
        "\n" +
        "PRIV-LINK_HTML_PAGE-GIS_OBJECT\n" +
        "\n" +
        "Регистрация изменений обстановки в заданном промежутке времени и с заданным темпом\n" +
        "\n" +
        "PRIV-VIEW-GIS_TIME_LAYER\n" +
        "\n" +
        "Расчёт маршрутов\n" +
        "\n" +
        "PRIV-CALC-GIS_ROUTING\n" +
        "\n" +
        "Адресный поиск для прокладки маршрутов\n" +
        "\n" +
        "PRIV-ADDRESS_SEARCH-GIS_ROUTING\n" +
        "\n" +
        "Создание карты ОР\n" +
        "\n" +
        "PRIV-CREATE-GIS_RR_MAP\n" +
        "\n" +
        "Редактирование состава слоёв карты ОР\n" +
        "\n" +
        "PRIV-EDIT_LAYERS_SET-GIS_RR_MAP\n" +
        "\n" +
        "Расстановка обязательных полей и реквизитов в соответствии с правилами оформления графических документов в ОВД\n" +
        "\n" +
        "PRIV-DESIGN-GIS_RR_MAP\n" +
        "\n" +
        "Удаление карты ОР\n" +
        "\n" +
        "PRIV-DELETE-GIS_RR_MAP\n" +
        "\n" +
        "Экспорт карты ОР в PDF/PNG\n" +
        "\n" +
        "PRIV-EXPORT-GIS_RR_MAP";

    public static void main(String[] args) {
        System.out.println(getSqlQuery());
    }

    public static String getSqlQuery() {
        List<String> split = Arrays.stream(string.split("[\\n\\t]")).filter(str -> str.startsWith("PRIV-")).collect(Collectors.toList());
        StringBuilder base = new StringBuilder("INSERT INTO sc.tb_role_privilege (role_id, privilege_id) VALUES \n");
        for (String str : split) {
            base.append("(9, '").append(str).append("'), \n");
        }
        base.replace(base.length() - 3, base.length(), ";");
        return base.toString();
    }
}