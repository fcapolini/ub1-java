// Generated by Haxe 4.1.5
package ub1.core;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Page extends ub1.core.Element
{
	public Page(haxe.lang.EmptyObject empty)
	{
		//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public Page(ub1.server.dom.HtmlDocument doc, java.lang.Object props, haxe.root.Array<java.lang.Object> pageProps)
	{
		//line 20 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 20 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
		ub1.core.Page.__hx_ctor_ub1_core_Page(this, doc, props, pageProps);
	}
	
	
	protected static void __hx_ctor_ub1_core_Page(ub1.core.Page __hx_this, ub1.server.dom.HtmlDocument doc, java.lang.Object props, haxe.root.Array<java.lang.Object> pageProps)
	{
		//line 16 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
		__hx_this.doc = doc;
		//line 17 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
		__hx_this.propsRegistry = ( (( pageProps != null )) ? (pageProps) : (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) );
		//line 18 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
		if (( props == null )) 
		{
			//line 18 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
			props = new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{}, new double[]{});
		}
		
		//line 19 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
		if (( haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(props, "name", true)) == null )) 
		{
			//line 19 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
			java.lang.String __temp_expr1 = haxe.lang.Runtime.toString(haxe.lang.Runtime.setField(props, "name", "page"));
		}
		
		//line 20 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
		ub1.core.Element.__hx_ctor_ub1_core_Element(__hx_this, null, props);
	}
	
	
	public ub1.server.dom.HtmlDocument doc;
	
	public haxe.root.Array<java.lang.Object> propsRegistry;
	
	public int registerElement(java.lang.Object props)
	{
		//line 24 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
		int ret = this.propsRegistry.length;
		//line 25 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
		java.lang.Object __temp_expr1 = ((java.lang.Object) (haxe.lang.Runtime.setField_f(props, "id", ((double) (ret) ))) );
		//line 26 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
		this.propsRegistry.push(props);
		//line 27 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
		return ret;
	}
	
	
	public haxe.root.Array<java.lang.Object> getProps()
	{
		//line 36 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
		{
			//line 36 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
			int _g = 0;
			//line 36 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
			haxe.root.Array<java.lang.Object> _g1 = this.propsRegistry;
			//line 36 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
			while (( _g < _g1.length ))
			{
				//line 36 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
				java.lang.Object p = _g1.__get(_g);
				//line 36 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
				 ++ _g;
				//line 37 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
				ub1.core.Element e = ((ub1.core.Element) (haxe.lang.Runtime.getField(p, "_e", true)) );
				//line 38 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
				{
					//line 38 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
					java.lang.Object k = ((java.lang.Object) (new haxe.ds._StringMap.StringMapKeyIterator<ub1.reactivity.ReValue>(((haxe.ds.StringMap<ub1.reactivity.ReValue>) (((haxe.IMap<java.lang.String, ub1.reactivity.ReValue>) (e.values) )) ))) );
					//line 38 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
					while (haxe.lang.Runtime.toBool(((java.lang.Boolean) (haxe.lang.Runtime.callField(k, "hasNext", null)) )))
					{
						//line 38 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
						java.lang.String k1 = haxe.lang.Runtime.toString(haxe.lang.Runtime.callField(k, "next", null));
						//line 39 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
						ub1.reactivity.ReValue v = ((ub1.reactivity.ReValue) (((haxe.ds.StringMap<ub1.reactivity.ReValue>) (((haxe.IMap<java.lang.String, ub1.reactivity.ReValue>) (e.values) )) ).get(k1)) );
						//line 40 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
						if (( (  ! (((java.lang.String) (((java.lang.Object) (k1) )) ).startsWith(haxe.lang.Runtime.toString("-")))  &&  ! (haxe.root.Std.isOfType(v, ub1.reactivity.ReConst.class))  ) &&  ! (v.isFunction)  )) 
						{
							//line 43 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
							if (( haxe.lang.Runtime.getField(p, "_v", true) == null )) 
							{
								//line 43 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
								haxe.lang.Runtime.setField(p, "_v", new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{}, new double[]{}));
							}
							
							//line 44 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
							ub1.lib.PropertyTools.set2(haxe.lang.Runtime.getField(p, "_v", true), k1, v.v);
						}
						
					}
					
				}
				
				//line 47 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
				ub1.lib.PropertyTools.set(p, "id", null);
				//line 48 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
				ub1.lib.PropertyTools.set(p, "_e", null);
			}
			
		}
		
		//line 50 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
		return this.propsRegistry;
	}
	
	
	public ub1.core.Element load(ub1.core.Element parent, ub1.server.dom.HtmlElement dom, java.lang.Object cloneIndex)
	{
		//line 53 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
		ub1.core.Page _gthis = this;
		//line 54 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
		java.lang.Object id = haxe.root.Std.parseInt(ub1.lib.DomTools.domGet(dom, "data-id"));
		//line 55 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
		java.lang.Object props = this.propsRegistry.__get(((int) (haxe.lang.Runtime.toInt(id)) ));
		//line 56 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
		ub1.server.dom.HtmlElement __temp_expr1 = ((ub1.server.dom.HtmlElement) (haxe.lang.Runtime.setField(props, "dom", dom)) );
		//line 57 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
		if (( ! (haxe.lang.Runtime.eq(cloneIndex, null)) )) 
		{
			//line 57 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
			haxe.lang.Runtime.setField(props, "clone", new haxe.lang.DynamicObject(new java.lang.String[]{"index", "source"}, new java.lang.Object[]{cloneIndex, id}, new java.lang.String[]{}, new double[]{}));
		}
		
		//line 58 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
		ub1.core.Element ret = new ub1.core.Element(parent, props);
		//line 59 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
		haxe.lang.Function f = null;
		//line 60 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
		f = new ub1.core.Page_load_60__Fun(ret, _gthis);
		//line 69 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
		f.__hx_invoke1_o(0.0, dom);
		//line 70 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
		return ret;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
		{
			//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
			if (( field != null )) 
			{
				//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
				switch (field.hashCode())
				{
					case -1423053363:
					{
						//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
						if (field.equals("propsRegistry")) 
						{
							//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
							__temp_executeDef1 = false;
							//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
							this.propsRegistry = ((haxe.root.Array<java.lang.Object>) (value) );
							//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
							return value;
						}
						
						//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
						break;
					}
					
					
					case 99640:
					{
						//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
						if (field.equals("doc")) 
						{
							//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
							__temp_executeDef1 = false;
							//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
							this.doc = ((ub1.server.dom.HtmlDocument) (value) );
							//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
							return value;
						}
						
						//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
		{
			//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
			if (( field != null )) 
			{
				//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
				switch (field.hashCode())
				{
					case 3327206:
					{
						//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
						if (field.equals("load")) 
						{
							//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
							__temp_executeDef1 = false;
							//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "load")) );
						}
						
						//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
						break;
					}
					
					
					case 99640:
					{
						//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
						if (field.equals("doc")) 
						{
							//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
							__temp_executeDef1 = false;
							//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
							return this.doc;
						}
						
						//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
						break;
					}
					
					
					case 1962766266:
					{
						//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
						if (field.equals("getProps")) 
						{
							//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
							__temp_executeDef1 = false;
							//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getProps")) );
						}
						
						//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
						break;
					}
					
					
					case -1423053363:
					{
						//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
						if (field.equals("propsRegistry")) 
						{
							//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
							__temp_executeDef1 = false;
							//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
							return this.propsRegistry;
						}
						
						//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
						break;
					}
					
					
					case -1808835879:
					{
						//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
						if (field.equals("registerElement")) 
						{
							//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
							__temp_executeDef1 = false;
							//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "registerElement")) );
						}
						
						//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
		{
			//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
			if (( field != null )) 
			{
				//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
				switch (field.hashCode())
				{
					case 3327206:
					{
						//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
						if (field.equals("load")) 
						{
							//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
							__temp_executeDef1 = false;
							//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
							return this.load(((ub1.core.Element) (dynargs[0]) ), ((ub1.server.dom.HtmlElement) (dynargs[1]) ), ( (( dynargs.length > 2 )) ? (dynargs[2]) : (null) ));
						}
						
						//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
						break;
					}
					
					
					case -1808835879:
					{
						//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
						if (field.equals("registerElement")) 
						{
							//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
							__temp_executeDef1 = false;
							//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
							return this.registerElement(dynargs[0]);
						}
						
						//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
						break;
					}
					
					
					case 1962766266:
					{
						//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
						if (field.equals("getProps")) 
						{
							//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
							__temp_executeDef1 = false;
							//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
							return this.getProps();
						}
						
						//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
		baseArr.push("propsRegistry");
		//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
		baseArr.push("doc");
		//line 11 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/core/Page.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}

