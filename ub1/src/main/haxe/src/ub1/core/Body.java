// Generated by Haxe 4.1.5
package ub1.core;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Body extends ub1.core.Element
{
	public Body(haxe.lang.EmptyObject empty)
	{
		//line 5 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Body.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public Body(ub1.core.Element parent, java.lang.Object props)
	{
		//line 10 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Body.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 10 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Body.hx"
		ub1.core.Body.__hx_ctor_ub1_core_Body(this, parent, props);
	}
	
	
	protected static void __hx_ctor_ub1_core_Body(ub1.core.Body __hx_this, ub1.core.Element parent, java.lang.Object props)
	{
		//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Body.hx"
		if (( props == null )) 
		{
			//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Body.hx"
			props = new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{}, new double[]{});
		}
		
		//line 9 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Body.hx"
		if (( haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(props, "name", true)) == null )) 
		{
			//line 9 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Body.hx"
			java.lang.String __temp_expr1 = haxe.lang.Runtime.toString(haxe.lang.Runtime.setField(props, "name", "body"));
		}
		
		//line 10 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Body.hx"
		ub1.core.Element.__hx_ctor_ub1_core_Element(__hx_this, parent, props);
	}
	
	
}

