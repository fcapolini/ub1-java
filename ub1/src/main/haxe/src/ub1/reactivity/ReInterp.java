// Generated by Haxe 4.1.5
package ub1.reactivity;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ReInterp extends hscript.Interp
{
	static
	{
		//line 9 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
		ub1.reactivity.ReInterp.ENABLE_UNKNOWN_VAR_EXCEPTION = false;
	}
	
	public ReInterp(haxe.lang.EmptyObject empty)
	{
		//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public ReInterp()
	{
		//line 53 "/usr/local/lib/haxe/lib/hscript/2,4,0/hscript/Interp.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 53 "/usr/local/lib/haxe/lib/hscript/2,4,0/hscript/Interp.hx"
		ub1.reactivity.ReInterp.__hx_ctor_ub1_reactivity_ReInterp(this);
	}
	
	
	protected static void __hx_ctor_ub1_reactivity_ReInterp(ub1.reactivity.ReInterp __hx_this)
	{
		//line 53 "/usr/local/lib/haxe/lib/hscript/2,4,0/hscript/Interp.hx"
		hscript.Interp.__hx_ctor_hscript_Interp(__hx_this);
	}
	
	
	public static boolean ENABLE_UNKNOWN_VAR_EXCEPTION;
	
	public java.lang.Object run(ub1.reactivity.ReScope scope, java.lang.Object expr)
	{
		//line 13 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
		java.lang.Object ret = null;
		//line 14 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
		java.lang.Object prev = this.variables;
		//line 15 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
		java.lang.Object error = null;
		//line 16 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
		this.variables = scope;
		//line 18 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
		try 
		{
			//line 18 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
			ret = super.execute(expr);
		}
		catch (java.lang.Throwable _g)
		{
			//line 1 "?"
			java.lang.Object ex = ((java.lang.Object) (haxe.Exception.caught(_g).unwrap()) );
			//line 20 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
			error = ex;
		}
		
		
		//line 22 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
		this.variables = prev;
		//line 23 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
		if (( ! (( error == null )) )) 
		{
			//line 23 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(error)) );
		}
		
		//line 24 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
		return ret;
	}
	
	
	public ub1.reactivity.ReScope scope;
	
	@Override public java.lang.Object execute(java.lang.Object expr)
	{
		//line 32 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
		return super.execute(expr);
	}
	
	
	@Override public java.lang.Object expr(java.lang.Object expr)
	{
		//line 34 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
		return super.expr(expr);
	}
	
	
	@Override public java.lang.Object get(java.lang.Object o, java.lang.String f)
	{
		//line 37 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
		if ((  ! (ub1.reactivity.ReInterp.ENABLE_UNKNOWN_VAR_EXCEPTION)  && ( o == null ) )) 
		{
			//line 37 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
			return null;
		}
		
		//line 38 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
		if (haxe.root.Std.isOfType(o, ((java.lang.Object) (ub1.reactivity.ReScope.class) ))) 
		{
			//line 38 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
			return ((java.lang.Object) (haxe.lang.Runtime.callField(o, "get", new java.lang.Object[]{f})) );
		}
		else
		{
			//line 38 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
			return super.get(o, f);
		}
		
	}
	
	
	@Override public java.lang.Object set(java.lang.Object o, java.lang.String f, java.lang.Object v)
	{
		//line 42 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
		if ((  ! (ub1.reactivity.ReInterp.ENABLE_UNKNOWN_VAR_EXCEPTION)  && ( o == null ) )) 
		{
			//line 42 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
			return v;
		}
		
		//line 43 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
		if (haxe.root.Std.isOfType(o, ((java.lang.Object) (ub1.reactivity.ReScope.class) ))) 
		{
			//line 43 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
			java.lang.Object __temp_expr1 = ((java.lang.Object) (haxe.lang.Runtime.callField(o, "set", new java.lang.Object[]{f, v})) );
		}
		else
		{
			//line 43 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
			super.set(o, f, v);
		}
		
		//line 44 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
		return v;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
		{
			//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
			if (( field != null )) 
			{
				//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
				switch (field.hashCode())
				{
					case 109264468:
					{
						//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
						if (field.equals("scope")) 
						{
							//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
							__temp_executeDef1 = false;
							//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
							this.scope = ((ub1.reactivity.ReScope) (value) );
							//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
							return value;
						}
						
						//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
		{
			//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
			if (( field != null )) 
			{
				//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
				switch (field.hashCode())
				{
					case 113762:
					{
						//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
						if (field.equals("set")) 
						{
							//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
							__temp_executeDef1 = false;
							//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set")) );
						}
						
						//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
						break;
					}
					
					
					case 113291:
					{
						//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
						if (field.equals("run")) 
						{
							//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
							__temp_executeDef1 = false;
							//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "run")) );
						}
						
						//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
						break;
					}
					
					
					case 102230:
					{
						//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
						if (field.equals("get")) 
						{
							//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
							__temp_executeDef1 = false;
							//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get")) );
						}
						
						//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
						break;
					}
					
					
					case 109264468:
					{
						//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
						if (field.equals("scope")) 
						{
							//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
							__temp_executeDef1 = false;
							//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
							return this.scope;
						}
						
						//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
						break;
					}
					
					
					case 3127797:
					{
						//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
						if (field.equals("expr")) 
						{
							//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
							__temp_executeDef1 = false;
							//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "expr")) );
						}
						
						//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
						break;
					}
					
					
					case -1319569547:
					{
						//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
						if (field.equals("execute")) 
						{
							//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
							__temp_executeDef1 = false;
							//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "execute")) );
						}
						
						//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
		{
			//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
			int __temp_hash2 = field.hashCode();
			//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
			if (( field != null )) 
			{
				//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
				switch (__temp_hash2)
				{
					case 113762:
					case 102230:
					case 3127797:
					case -1319569547:
					{
						//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
						if (( (( ( __temp_hash2 == 113762 ) && field.equals("set") )) || ( (( ( __temp_hash2 == 102230 ) && field.equals("get") )) || ( (( ( __temp_hash2 == 3127797 ) && field.equals("expr") )) || field.equals("execute") ) ) )) 
						{
							//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
							__temp_executeDef1 = false;
							//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
							return haxe.lang.Runtime.slowCallField(this, field, dynargs);
						}
						
						//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
						break;
					}
					
					
					case 113291:
					{
						//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
						if (field.equals("run")) 
						{
							//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
							__temp_executeDef1 = false;
							//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
							return this.run(((ub1.reactivity.ReScope) (dynargs[0]) ), dynargs[1]);
						}
						
						//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
		baseArr.push("scope");
		//line 8 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/reactivity/ReInterp.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}

