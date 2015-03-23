<div class="1_2_1_columns" id="main-content" role="main">
	#if ($browserSniffer.isIe($request) && $browserSniffer.getMajorVersion($request) < 8)
		<table class="portlet-layout">
		<tr>
			<td class="aui-w100 portlet-column portlet-column-only" id="column-1">
				$processor.processColumn("column-1", "portlet-column-content portlet-column-content-only")
			</td>
		</tr>
		</table>

		<table class="portlet-layout row-fluid">
		<tr>
			<td class="aui-w100 portlet-column portlet-column-only" id="column-2">
				$processor.processColumn("column-2", "portlet-column-content portlet-column-content-only")
			</td>
		</tr>
		</table>
		
		<table class="portlet-layout row-fluid">
		<tr>
			<td class="aui-w100 portlet-column portlet-column-only" id="column-3">
				$processor.processColumn("column-3", "portlet-column-content portlet-column-content-only")
			</td>
		</tr>
		</table>
	#else
		<div class="portlet-layout">
			<div class="aui-w100 portlet-column portlet-column-only" id="column-1">
				$processor.processColumn("column-1", "portlet-column-content portlet-column-content-only")
			</div>
		</div>

		<div class="portlet-layout row-fluid">
			<div class="aui-w100 portlet-column portlet-column-only" id="column-2">
				$processor.processColumn("column-2", "portlet-column-content portlet-column-content-only")
			</div>
		</div>
		
		<div class="portlet-layout row-fluid">
			<div class="aui-w100 portlet-column portlet-column-only" id="column-3">
				$processor.processColumn("column-3", "portlet-column-content portlet-column-content-only")
			</div>
		</div>
	#end
</div>