<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="scripts.jsp"></jsp:include>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	//example 1
	/*Ext.onReady(function() {
		Ext.Msg.alert('Hi', 'Hello World Example');
	})*/;
	//example 2
	/*Ext.onReady(function() {

		Ext.Msg.show({
			title : 'Milton',
			msg : 'Have you seen my stapler?',
			buttons : {
				yes : true,
				no : true,
				cancel : true
			},
			fn : function(btn) {
				//Ext.Msg.alert('Prateek', 'you clicked '+btn);

				switch (btn) {
				case 'yes':
					var text = '';
					Ext.Msg.prompt('check', 'Where are you', function(btn,text) {
						if (text.toLowerCase() == 'office') {
							text = 'Dull brown';
						} else {
							text = 'enjoy!!!';
						}
						Ext.get('myId').dom.innerHTML = text;
						Ext.DomHelper.applyStyles('myId', {
							'font-style' : 'bold',
							'font-size' : '10px'
						});
					});
				}

			}
		});
	});*/
	Ext.onReady(function() {
		new Ext.Panel({
			renderTo : Ext.getBody(),
			title : 'Panel with pre-existing content',
			height : 400,
			width : 600,
			cls : 'my-panel-class',
			layout : 'fit',
			items : new Ext.BoxComponent({
				el : 'main-content'
			})
		});
	});
</script>
</head>

<body>
	testing in progress.
	<div style="width: 200:height:200" id="myId">test</div>
	<div id="main-content">
		<h1>This is some pre-existing content.</h1>
		This element is "imported" and used as the body of a Panel
	</div>
</body>
</html>