<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
<s:head/>
</head>
<body>
	 
	 
	 
	 <h1> Non - Form Tags </h1>
		<s:actionerror />
	    <s:form  >
	       ....
	    </s:form>
	    
	    <s:actionmessage />
    <s:form >
       ....
    </s:form>
    
    
<%-- <s:component template="/my/custom/component.vm"/> --%>
<%-- <s:component template="/my/custom/component.vm">
    <s:param name="key1" value="value1"/>
    <s:param name="key2" value="value2"/>
</s:component> --%>


    <!-- example 1 -->
    <s:fielderror />

    <!-- example 2 -->
    <s:fielderror>
         <s:param>field1</s:param>
         <s:param>field2</s:param>
    </s:fielderror>
    <s:form  >
       ....
    </s:form>

    OR

    <s:fielderror>
          <s:param value="%{'field1'}" />
          <s:param value="%{'field2'}" />
    </s:fielderror>
    <s:form  >
       ....
    </s:form>

    OR

    <s:fielderror fieldName="field1" />


	 <h1> Form Tags </h1>
	 <h3> Simple UI Tags </h3>

      <s:text name = "Please fill in the form below:" />
      
      <s:form action = "hello" method = "post" enctype = "multipart/form-data">
         <s:hidden name = "secret" value = "abracadabra"/>
         <s:textfield key = "email.from" name = "from" />
         <s:password key = "email.password" name = "password" />
         <s:textfield key = "email.to" name = "to" />
         <s:textfield key = "email.subject" name = "subject" />
         <s:textarea key = "email.body" name = "email.body" />
         <s:label for = "attachment" value = "Attachment"/>
         <s:file name = "attachment" accept = "text/html,text/plain" />
         <s:token />
         <s:submit key = "submit" />
         <s:reset value="Reset" />
         <s:reset type="button" key="reset" value="reset"/>
         
      <s:datetextfield format="dd-MM-yyyy" theme="simple" />
      
         
      </s:form>
	 
	 
	 <h3> Group UI Tags </h3>
	 
	  <s:form action = "hello.action">
         <s:radio label = "Gender" name = "gender" list="{'male','female'}" />
         <s:checkboxlist label = "Hobbies" name = "hobbies" 
         list = "{'sports','tv','shopping'}" />
         
         <s:checkbox label="checkbox test" name="checkboxField1" value="true" fieldValue="true"/>
      </s:form>
	 
	 
	 <h3> Select UI Tags </h3>
	 
	 
	 <s:form action = "login.action" name="f3">
         <s:select name = "username" label = "Username" list = "{'Mike','John','Smith'}" />

         <s:select label = "Company Office" name = "mySelection"
            value = "%{'America'}" list="%{#{'America':'America'}}">
            <s:optgroup label = "Asia" 
               list = "%{#{'India':'India','China':'China'}}" />
            <s:optgroup label = "Europe"
               list="%{#{'UK':'UK','Sweden':'Sweden','Italy':'Italy'}}" />
         </s:select>

         <s:combobox label = "My Sign" name = "mySign"
            list = "#{'aries':'aries','capricorn':'capricorn'}" headerKey = "-1" 
            headerValue = "--- Please Select ---" emptyOption = "true" value = "capricorn" 
            />
         
         <s:doubleselect label = "Occupation" name = "occupation"
            list = "{'Technical','Other'}" doubleName = "occupations2"
            doubleList="top == 'Technical' ? 
            {'I.T', 'Hardware'} : {'Accounting', 'H.R'}" formName="f3" />
            
            
            <s:inputtransferselect
                    key="cartoonCharacters"
                    addLabel="Add element"
                    removeLabel="Remove element"
                    removeAllLabel="Remove all elements"
                    upLabel="Move up"
                    downLabel="Move down"
                    leftTitle="Add Character"
                    rightTitle="Existing Characters"
                    list="cartoonCharacters"
             />
            
            <!-- minimum configuration -->
 <s:optiontransferselect
      label="Favourite Cartoons Characters"
      name="leftSideCartoonCharacters1"
      list="{'Popeye', 'He-Man', 'Spiderman'}"
      doubleName="rightSideCartoonCharacters1"
      doubleList="{'Superman', 'Mickey Mouse', 'Donald Duck'}"
  />

  <!-- possible configuration -->
  <s:optiontransferselect
      label="Favourite Cartoons Characters"
      name="leftSideCartoonCharacters2"
      leftTitle="Left Title"
      rightTitle="Right Title"
      list="{'Popeye', 'He-Man', 'Spiderman'}"
      multiple="true"
      headerKey="headerKey"
      headerValue="--- Please Select ---"
      emptyOption="true"
      doubleList="{'Superman', 'Mickey Mouse', 'Donald Duck'}"
      doubleName="rightSideCartoonCharacters2"
      doubleHeaderKey="doubleHeaderKey"
      doubleHeaderValue="--- Please Select ---"
      doubleEmptyOption="true"
      doubleMultiple="true"
  />
  
  
  <!-- Example 1: simple example -->
 <s:updownselect
 list="#{'england':'England', 'america':'America', 'germany':'Germany'}"
 name="prioritisedFavouriteCountries1"
 headerKey="-1"
 headerValue="--- Please Order Them Accordingly ---"
 emptyOption="true" />

 <!-- Example 2: more complex example -->
 <s:updownselect
 list="#{'england':'England', 'america':'America', 'germany':'Germany'}"
 name="prioritisedFavouriteCartoonCharacters2"
 headerKey="-1"
 headerValue="--- Please Order ---"
 emptyOption="true"
 allowMoveUp="true"
 allowMoveDown="true"
 allowSelectAll="true"
 moveUpLabel="Move Up"
 moveDownLabel="Move Down"
 selectAllLabel="Select All" />
 
      </s:form>
</body>
</html>