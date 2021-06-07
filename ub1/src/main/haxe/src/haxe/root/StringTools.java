// Generated by Haxe 4.1.5
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class StringTools extends haxe.lang.HxObject
{
	public StringTools(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public StringTools()
	{
		//line 38 "/usr/local/lib/haxe/std/StringTools.hx"
		haxe.root.StringTools.__hx_ctor__StringTools(this);
	}
	
	
	protected static void __hx_ctor__StringTools(haxe.root.StringTools __hx_this)
	{
	}
	
	
	public static java.lang.String urlEncode(java.lang.String s)
	{
		//line 52 "/usr/local/lib/haxe/std/StringTools.hx"
		try 
		{
			//line 52 "/usr/local/lib/haxe/std/StringTools.hx"
			return haxe.root.StringTools.postProcessUrlEncode(java.net.URLEncoder.encode(haxe.lang.Runtime.toString(s), haxe.lang.Runtime.toString("UTF-8")));
		}
		catch (java.lang.Throwable typedException)
		{
			//line 42 "/usr/local/lib/haxe/std/StringTools.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(typedException)) );
		}
		
		
	}
	
	
	public static java.lang.String postProcessUrlEncode(java.lang.String s)
	{
		//line 75 "/usr/local/lib/haxe/std/StringTools.hx"
		haxe.root.StringBuf ret = new haxe.root.StringBuf();
		//line 76 "/usr/local/lib/haxe/std/StringTools.hx"
		int i = 0;
		//line 76 "/usr/local/lib/haxe/std/StringTools.hx"
		int len = s.length();
		//line 77 "/usr/local/lib/haxe/std/StringTools.hx"
		while (( i < len ))
		{
			//line 78 "/usr/local/lib/haxe/std/StringTools.hx"
			char _g = ((java.lang.String) (((java.lang.Object) (s) )) ).charAt(i++);
			//line 78 "/usr/local/lib/haxe/std/StringTools.hx"
			{
				//line 78 "/usr/local/lib/haxe/std/StringTools.hx"
				char __temp_switch1 = (_g);
				//line 81 "/usr/local/lib/haxe/std/StringTools.hx"
				if (( __temp_switch1 == 37 )) 
				{
					//line 81 "/usr/local/lib/haxe/std/StringTools.hx"
					if (( i <= ( len - 2 ) )) 
					{
						//line 82 "/usr/local/lib/haxe/std/StringTools.hx"
						char c1 = ((java.lang.String) (((java.lang.Object) (s) )) ).charAt(i++);
						//line 82 "/usr/local/lib/haxe/std/StringTools.hx"
						char c2 = ((java.lang.String) (((java.lang.Object) (s) )) ).charAt(i++);
						//line 83 "/usr/local/lib/haxe/std/StringTools.hx"
						{
							//line 83 "/usr/local/lib/haxe/std/StringTools.hx"
							char __temp_switch2 = (c1);
							//line 83 "/usr/local/lib/haxe/std/StringTools.hx"
							if (( __temp_switch2 == 50 )) 
							{
								//line 83 "/usr/local/lib/haxe/std/StringTools.hx"
								{
									//line 83 "/usr/local/lib/haxe/std/StringTools.hx"
									char __temp_switch4 = (c2);
									//line 85 "/usr/local/lib/haxe/std/StringTools.hx"
									if (( __temp_switch4 == 49 )) 
									{
										//line 85 "/usr/local/lib/haxe/std/StringTools.hx"
										ret.addChar(33);
									}
									else
									{
										//line 87 "/usr/local/lib/haxe/std/StringTools.hx"
										if (( __temp_switch4 == 55 )) 
										{
											//line 87 "/usr/local/lib/haxe/std/StringTools.hx"
											ret.addChar(39);
										}
										else
										{
											//line 89 "/usr/local/lib/haxe/std/StringTools.hx"
											if (( __temp_switch4 == 56 )) 
											{
												//line 89 "/usr/local/lib/haxe/std/StringTools.hx"
												ret.addChar(40);
											}
											else
											{
												//line 91 "/usr/local/lib/haxe/std/StringTools.hx"
												if (( __temp_switch4 == 57 )) 
												{
													//line 91 "/usr/local/lib/haxe/std/StringTools.hx"
													ret.addChar(41);
												}
												else
												{
													//line 95 "/usr/local/lib/haxe/std/StringTools.hx"
													ret.addChar(37);
													//line 96 "/usr/local/lib/haxe/std/StringTools.hx"
													ret.addChar(((int) (c1) ));
													//line 97 "/usr/local/lib/haxe/std/StringTools.hx"
													ret.addChar(((int) (c2) ));
												}
												
											}
											
										}
										
									}
									
								}
								
							}
							else
							{
								//line 83 "/usr/local/lib/haxe/std/StringTools.hx"
								if (( __temp_switch2 == 55 )) 
								{
									//line 83 "/usr/local/lib/haxe/std/StringTools.hx"
									{
										//line 83 "/usr/local/lib/haxe/std/StringTools.hx"
										char __temp_switch3 = (c2);
										//line 93 "/usr/local/lib/haxe/std/StringTools.hx"
										if (( ( __temp_switch3 == 69 ) || ( __temp_switch3 == 101 ) )) 
										{
											//line 93 "/usr/local/lib/haxe/std/StringTools.hx"
											ret.addChar(126);
										}
										else
										{
											//line 95 "/usr/local/lib/haxe/std/StringTools.hx"
											ret.addChar(37);
											//line 96 "/usr/local/lib/haxe/std/StringTools.hx"
											ret.addChar(((int) (c1) ));
											//line 97 "/usr/local/lib/haxe/std/StringTools.hx"
											ret.addChar(((int) (c2) ));
										}
										
									}
									
								}
								else
								{
									//line 95 "/usr/local/lib/haxe/std/StringTools.hx"
									ret.addChar(37);
									//line 96 "/usr/local/lib/haxe/std/StringTools.hx"
									ret.addChar(((int) (c1) ));
									//line 97 "/usr/local/lib/haxe/std/StringTools.hx"
									ret.addChar(((int) (c2) ));
								}
								
							}
							
						}
						
					}
					else
					{
						//line 99 "/usr/local/lib/haxe/std/StringTools.hx"
						char chr = _g;
						//line 100 "/usr/local/lib/haxe/std/StringTools.hx"
						ret.addChar(((int) (chr) ));
					}
					
				}
				else
				{
					//line 80 "/usr/local/lib/haxe/std/StringTools.hx"
					if (( __temp_switch1 == 43 )) 
					{
						//line 80 "/usr/local/lib/haxe/std/StringTools.hx"
						ret.add(haxe.lang.Runtime.toString("%20"));
						//line 80 "/usr/local/lib/haxe/std/StringTools.hx"
						java.lang.Object __temp_expr5 = ((java.lang.Object) (null) );
					}
					else
					{
						//line 99 "/usr/local/lib/haxe/std/StringTools.hx"
						char chr1 = _g;
						//line 100 "/usr/local/lib/haxe/std/StringTools.hx"
						ret.addChar(((int) (chr1) ));
					}
					
				}
				
			}
			
		}
		
		//line 103 "/usr/local/lib/haxe/std/StringTools.hx"
		return ret.toString();
	}
	
	
	public static java.lang.String urlDecode(java.lang.String s)
	{
		//line 121 "/usr/local/lib/haxe/std/StringTools.hx"
		try 
		{
			//line 121 "/usr/local/lib/haxe/std/StringTools.hx"
			return java.net.URLDecoder.decode(haxe.lang.Runtime.toString(s), haxe.lang.Runtime.toString("UTF-8"));
		}
		catch (java.lang.Throwable _g)
		{
			//line 1 "?"
			java.lang.Object e = ((java.lang.Object) (haxe.Exception.caught(_g).unwrap()) );
			//line 123 "/usr/local/lib/haxe/std/StringTools.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(e)) );
		}
		
		
	}
	
	
	public static java.lang.String htmlEscape(java.lang.String s, java.lang.Object quotes)
	{
		//line 159 "/usr/local/lib/haxe/std/StringTools.hx"
		haxe.root.StringBuf buf = new haxe.root.StringBuf();
		//line 160 "/usr/local/lib/haxe/std/StringTools.hx"
		{
			//line 160 "/usr/local/lib/haxe/std/StringTools.hx"
			int _g_offset = 0;
			//line 160 "/usr/local/lib/haxe/std/StringTools.hx"
			java.lang.String _g_s = s;
			//line 160 "/usr/local/lib/haxe/std/StringTools.hx"
			while (( _g_offset < _g_s.length() ))
			{
				//line 160 "/usr/local/lib/haxe/std/StringTools.hx"
				java.lang.String s1 = _g_s;
				//line 160 "/usr/local/lib/haxe/std/StringTools.hx"
				int index = _g_offset++;
				//line 160 "/usr/local/lib/haxe/std/StringTools.hx"
				int c = ( (( index < s1.length() )) ? (((int) (((java.lang.String) (((java.lang.Object) (s1) )) ).charAt(index)) )) : (-1) );
				//line 160 "/usr/local/lib/haxe/std/StringTools.hx"
				if (( ( c >= 55296 ) && ( c <= 56319 ) )) 
				{
					//line 160 "/usr/local/lib/haxe/std/StringTools.hx"
					int index1 = ( index + 1 );
					//line 597 "/usr/local/lib/haxe/std/StringTools.hx"
					c = ( ( ( c - 55232 ) << 10 ) | ( (( (( index1 < s1.length() )) ? (((int) (((java.lang.String) (((java.lang.Object) (s1) )) ).charAt(index1)) )) : (-1) )) & 1023 ) );
				}
				
				//line 160 "/usr/local/lib/haxe/std/StringTools.hx"
				int c1 = c;
				//line 160 "/usr/local/lib/haxe/std/StringTools.hx"
				if (( c1 >= 65536 )) 
				{
					//line 160 "/usr/local/lib/haxe/std/StringTools.hx"
					 ++ _g_offset;
				}
				
				//line 160 "/usr/local/lib/haxe/std/StringTools.hx"
				int code = c1;
				//line 161 "/usr/local/lib/haxe/std/StringTools.hx"
				switch (code)
				{
					case 34:
					{
						//line 168 "/usr/local/lib/haxe/std/StringTools.hx"
						if (haxe.lang.Runtime.toBool(((java.lang.Boolean) ((quotes)) ))) 
						{
							//line 169 "/usr/local/lib/haxe/std/StringTools.hx"
							buf.add(haxe.lang.Runtime.toString("&quot;"));
							//line 169 "/usr/local/lib/haxe/std/StringTools.hx"
							java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
						}
						else
						{
							//line 173 "/usr/local/lib/haxe/std/StringTools.hx"
							buf.addChar(code);
						}
						
						//line 168 "/usr/local/lib/haxe/std/StringTools.hx"
						break;
					}
					
					
					case 38:
					{
						//line 163 "/usr/local/lib/haxe/std/StringTools.hx"
						buf.add(haxe.lang.Runtime.toString("&amp;"));
						//line 163 "/usr/local/lib/haxe/std/StringTools.hx"
						java.lang.Object __temp_expr2 = ((java.lang.Object) (null) );
						//line 163 "/usr/local/lib/haxe/std/StringTools.hx"
						break;
					}
					
					
					case 39:
					{
						//line 170 "/usr/local/lib/haxe/std/StringTools.hx"
						if (haxe.lang.Runtime.toBool(((java.lang.Boolean) ((quotes)) ))) 
						{
							//line 171 "/usr/local/lib/haxe/std/StringTools.hx"
							buf.add(haxe.lang.Runtime.toString("&#039;"));
							//line 171 "/usr/local/lib/haxe/std/StringTools.hx"
							java.lang.Object __temp_expr3 = ((java.lang.Object) (null) );
						}
						else
						{
							//line 173 "/usr/local/lib/haxe/std/StringTools.hx"
							buf.addChar(code);
						}
						
						//line 170 "/usr/local/lib/haxe/std/StringTools.hx"
						break;
					}
					
					
					case 60:
					{
						//line 165 "/usr/local/lib/haxe/std/StringTools.hx"
						buf.add(haxe.lang.Runtime.toString("&lt;"));
						//line 165 "/usr/local/lib/haxe/std/StringTools.hx"
						java.lang.Object __temp_expr4 = ((java.lang.Object) (null) );
						//line 165 "/usr/local/lib/haxe/std/StringTools.hx"
						break;
					}
					
					
					case 62:
					{
						//line 167 "/usr/local/lib/haxe/std/StringTools.hx"
						buf.add(haxe.lang.Runtime.toString("&gt;"));
						//line 167 "/usr/local/lib/haxe/std/StringTools.hx"
						java.lang.Object __temp_expr5 = ((java.lang.Object) (null) );
						//line 167 "/usr/local/lib/haxe/std/StringTools.hx"
						break;
					}
					
					
					default:
					{
						//line 173 "/usr/local/lib/haxe/std/StringTools.hx"
						buf.addChar(code);
						//line 173 "/usr/local/lib/haxe/std/StringTools.hx"
						break;
					}
					
				}
				
			}
			
		}
		
		//line 176 "/usr/local/lib/haxe/std/StringTools.hx"
		return buf.toString();
	}
	
	
	public static java.lang.String htmlUnescape(java.lang.String s)
	{
		//line 194 "/usr/local/lib/haxe/std/StringTools.hx"
		return haxe.lang.StringExt.split(haxe.lang.StringExt.split(haxe.lang.StringExt.split(haxe.lang.StringExt.split(haxe.lang.StringExt.split(s, "&gt;").join(">"), "&lt;").join("<"), "&quot;").join("\""), "&#039;").join("\'"), "&amp;").join("&");
	}
	
	
	public static boolean isSpace(java.lang.String s, int pos)
	{
		//line 284 "/usr/local/lib/haxe/std/StringTools.hx"
		java.lang.Object c = haxe.lang.StringExt.charCodeAt(s, pos);
		//line 285 "/usr/local/lib/haxe/std/StringTools.hx"
		if ( ! ((( ( ((int) (haxe.lang.Runtime.toInt(c)) ) > 8 ) && ( ((int) (haxe.lang.Runtime.toInt(c)) ) < 14 ) ))) ) 
		{
			//line 285 "/usr/local/lib/haxe/std/StringTools.hx"
			return haxe.lang.Runtime.eq(c, 32);
		}
		else
		{
			//line 285 "/usr/local/lib/haxe/std/StringTools.hx"
			return true;
		}
		
	}
	
	
	public static java.lang.String ltrim(java.lang.String s)
	{
		//line 301 "/usr/local/lib/haxe/std/StringTools.hx"
		int l = s.length();
		//line 302 "/usr/local/lib/haxe/std/StringTools.hx"
		int r = 0;
		//line 303 "/usr/local/lib/haxe/std/StringTools.hx"
		while (( ( r < l ) && haxe.root.StringTools.isSpace(s, r) ))
		{
			//line 304 "/usr/local/lib/haxe/std/StringTools.hx"
			 ++ r;
		}
		
		//line 306 "/usr/local/lib/haxe/std/StringTools.hx"
		if (( r > 0 )) 
		{
			//line 307 "/usr/local/lib/haxe/std/StringTools.hx"
			return haxe.lang.StringExt.substr(s, r, ( l - r ));
		}
		else
		{
			//line 309 "/usr/local/lib/haxe/std/StringTools.hx"
			return s;
		}
		
	}
	
	
	public static java.lang.String lpad(java.lang.String s, java.lang.String c, int l)
	{
		//line 367 "/usr/local/lib/haxe/std/StringTools.hx"
		if (( c.length() <= 0 )) 
		{
			//line 368 "/usr/local/lib/haxe/std/StringTools.hx"
			return s;
		}
		
		//line 370 "/usr/local/lib/haxe/std/StringTools.hx"
		haxe.root.StringBuf buf = new haxe.root.StringBuf();
		//line 371 "/usr/local/lib/haxe/std/StringTools.hx"
		l -= s.length();
		//line 372 "/usr/local/lib/haxe/std/StringTools.hx"
		while (( buf.b.length() < l ))
		{
			//line 373 "/usr/local/lib/haxe/std/StringTools.hx"
			buf.add(haxe.lang.Runtime.toString(c));
			//line 373 "/usr/local/lib/haxe/std/StringTools.hx"
			java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
		}
		
		//line 375 "/usr/local/lib/haxe/std/StringTools.hx"
		buf.add(haxe.lang.Runtime.toString(s));
		//line 375 "/usr/local/lib/haxe/std/StringTools.hx"
		java.lang.Object __temp_expr2 = ((java.lang.Object) (null) );
		//line 376 "/usr/local/lib/haxe/std/StringTools.hx"
		return buf.toString();
	}
	
	
	public static java.lang.String replace(java.lang.String s, java.lang.String sub, java.lang.String by)
	{
		//line 415 "/usr/local/lib/haxe/std/StringTools.hx"
		if (( sub.length() == 0 )) 
		{
			//line 416 "/usr/local/lib/haxe/std/StringTools.hx"
			return haxe.lang.StringExt.split(s, sub).join(by);
		}
		else
		{
			//line 418 "/usr/local/lib/haxe/std/StringTools.hx"
			return ((java.lang.String) (((java.lang.Object) (s) )) ).replace(((java.lang.CharSequence) (sub) ), ((java.lang.CharSequence) (by) ));
		}
		
	}
	
	
}

