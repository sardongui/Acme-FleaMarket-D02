<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form readonly="true">
    <acme:form-textbox code="administrator.dashboard.form.label.numberNews" path="numberNews" />
    <acme:form-textbox code="administrator.dashboard.form.label.numberMaterialSheets" path="numberMaterialSheets" />
    <acme:form-textbox code="administrator.dashboard.form.label.numberToolSheets" path="numberToolSheets" />
    <acme:form-textbox code="administrator.dashboard.form.label.numberSuggestions" path="numberSuggestions" />
    <acme:form-textbox code="administrator.dashboard.form.label.numberFigments" path="numberFigments" />
    
    <acme:form-textbox code="administrator.dashboard.form.label.minDiscountAdvertisements" path="minDiscountAdvertisements" />
    <acme:form-textbox code="administrator.dashboard.form.label.maxDiscountAdvertisements" path="maxDiscountAdvertisements" />
    
    <acme:form-return code="administrator.dashboard.form.button.return" />
</acme:form>