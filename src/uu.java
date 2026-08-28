import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.common.primitives.UnsignedBytes;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JavaOps;
import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import it.unimi.dsi.fastutil.bytes.ByteList;
import it.unimi.dsi.fastutil.chars.CharList;
import java.nio.ByteBuffer;
import java.util.HexFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import javax.annotation.Nullable;

public class uu {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xc.b("snbt.parser.number_parse_failure", $$0));
   static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xc.b("snbt.parser.expected_hex_escape", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xc.b("snbt.parser.invalid_codepoint", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xc.b("snbt.parser.no_such_operation", $$0));
   static final bpw<CommandSyntaxException> e = bpw.a(new SimpleCommandExceptionType(xc.c("snbt.parser.expected_integer_type")));
   private static final bpw<CommandSyntaxException> f = bpw.a(new SimpleCommandExceptionType(xc.c("snbt.parser.expected_float_type")));
   static final bpw<CommandSyntaxException> g = bpw.a(new SimpleCommandExceptionType(xc.c("snbt.parser.expected_non_negative_number")));
   private static final bpw<CommandSyntaxException> h = bpw.a(new SimpleCommandExceptionType(xc.c("snbt.parser.invalid_character_name")));
   static final bpw<CommandSyntaxException> i = bpw.a(new SimpleCommandExceptionType(xc.c("snbt.parser.invalid_array_element_type")));
   private static final bpw<CommandSyntaxException> j = bpw.a(new SimpleCommandExceptionType(xc.c("snbt.parser.invalid_unquoted_start")));
   private static final bpw<CommandSyntaxException> k = bpw.a(new SimpleCommandExceptionType(xc.c("snbt.parser.expected_unquoted_string")));
   private static final bpw<CommandSyntaxException> l = bpw.a(new SimpleCommandExceptionType(xc.c("snbt.parser.invalid_string_contents")));
   private static final bpw<CommandSyntaxException> m = bpw.a(new SimpleCommandExceptionType(xc.c("snbt.parser.expected_binary_numeral")));
   private static final bpw<CommandSyntaxException> n = bpw.a(new SimpleCommandExceptionType(xc.c("snbt.parser.undescore_not_allowed")));
   private static final bpw<CommandSyntaxException> o = bpw.a(new SimpleCommandExceptionType(xc.c("snbt.parser.expected_decimal_numeral")));
   private static final bpw<CommandSyntaxException> p = bpw.a(new SimpleCommandExceptionType(xc.c("snbt.parser.expected_hex_numeral")));
   private static final bpw<CommandSyntaxException> q = bpw.a(new SimpleCommandExceptionType(xc.c("snbt.parser.empty_key")));
   private static final bpw<CommandSyntaxException> r = bpw.a(new SimpleCommandExceptionType(xc.c("snbt.parser.leading_zero_not_allowed")));
   private static final bpw<CommandSyntaxException> s = bpw.a(new SimpleCommandExceptionType(xc.c("snbt.parser.infinity_not_allowed")));
   private static final HexFormat t = HexFormat.of().withUpperCase();
   private static final bqk u = new bqk(m, n) {
      @Override
      protected boolean a(char $$0) {
         return switch ($$0) {
            case '0', '1', '_' -> true;
            default -> false;
         };
      }
   };
   private static final bqk v = new bqk(o, n) {
      @Override
      protected boolean a(char $$0) {
         return switch ($$0) {
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '_' -> true;
            default -> false;
         };
      }
   };
   private static final bqk w = new bqk(p, n) {
      @Override
      protected boolean a(char $$0) {
         return switch ($$0) {
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', '_', 'a', 'b', 'c', 'd', 'e', 'f' -> true;
            default -> false;
         };
      }
   };
   private static final bqj x = new bqj(1, l) {
      @Override
      protected boolean a(char $$0) {
         return switch ($$0) {
            case '"', '\'', '\\' -> false;
            default -> true;
         };
      }
   };
   private static final bqq.a y = new bqq.a(CharList.of()) {
      @Override
      protected boolean a(char $$0) {
         return uu.c($$0);
      }
   };
   private static final Pattern z = Pattern.compile("[-a-zA-Z0-9 ]+");

   static bpw<CommandSyntaxException> a(NumberFormatException $$0) {
      return bpw.a(a, $$0.getMessage());
   }

   @Nullable
   public static String a(char $$0) {
      return switch ($$0) {
         case '\b' -> "b";
         case '\t' -> "t";
         case '\n' -> "n";
         default -> $$0 < ' ' ? "x" + t.toHexDigits((byte)$$0) : null;
         case '\f' -> "f";
         case '\r' -> "r";
      };
   }

   private static boolean b(char $$0) {
      return !c($$0);
   }

   static boolean c(char $$0) {
      return switch ($$0) {
         case '+', '-', '.', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> true;
         default -> false;
      };
   }

   static boolean a(String $$0) {
      return $$0.indexOf(95) != -1;
   }

   private static void a(StringBuilder $$0, String $$1) {
      a($$0, $$1, a($$1));
   }

   static void a(StringBuilder $$0, String $$1, boolean $$2) {
      if ($$2) {
         for (char $$3 : $$1.toCharArray()) {
            if ($$3 != '_') {
               $$0.append($$3);
            }
         }
      } else {
         $$0.append($$1);
      }
   }

   static short a(String $$0, int $$1) {
      int $$2 = Integer.parseInt($$0, $$1);
      if ($$2 >> 16 == 0) {
         return (short)$$2;
      } else {
         throw new NumberFormatException("out of range: " + $$2);
      }
   }

   @Nullable
   private static <T> T a(DynamicOps<T> $$0, uu.e $$1, @Nullable String $$2, @Nullable String $$3, @Nullable uu.f<String> $$4, @Nullable uu.i $$5, bqb<?> $$6) {
      StringBuilder $$7 = new StringBuilder();
      $$1.a($$7);
      if ($$2 != null) {
         a($$7, $$2);
      }

      if ($$3 != null) {
         $$7.append('.');
         a($$7, $$3);
      }

      if ($$4 != null) {
         $$7.append('e');
         $$4.a().a($$7);
         a($$7, $$4.b);
      }

      try {
         String $$8 = $$7.toString();

         return (T)(switch ($$5) {
            case Object var13 -> {
            }
            case Object var12 -> {
            }
            case Object var10000 -> {
            }
            default -> {
               $$6.b().a($$6.g(), f);
               yield null;
            }
         });
      } catch (NumberFormatException var11) {
         $$6.b().a($$6.g(), a(var11));
         return null;
      }
   }

   @Nullable
   private static <T> T a(DynamicOps<T> $$0, bqb<?> $$1, String $$2) {
      float $$3 = Float.parseFloat($$2);
      if (!Float.isFinite($$3)) {
         $$1.b().a($$1.g(), s);
         return null;
      } else {
         return (T)$$0.createFloat($$3);
      }
   }

   @Nullable
   private static <T> T b(DynamicOps<T> $$0, bqb<?> $$1, String $$2) {
      double $$3 = Double.parseDouble($$2);
      if (!Double.isFinite($$3)) {
         $$1.b().a($$1.g(), s);
         return null;
      } else {
         return (T)$$0.createDouble($$3);
      }
   }

   private static String a(List<String> $$0) {
      return switch ($$0.size()) {
         case 0 -> "";
         case 1 -> (String)$$0.getFirst();
         default -> String.join("", $$0);
      };
   }

   public static <T> bqh<T> a(DynamicOps<T> $$0) {
      T $$1 = (T)$$0.createBoolean(true);
      T $$2 = (T)$$0.createBoolean(false);
      T $$3 = (T)$$0.emptyMap();
      T $$4 = (T)$$0.emptyList();
      bpx<StringReader> $$5 = new bpx<>();
      bpt<uu.e> $$6 = bpt.a("sign");
      $$5.a($$6, bqf.b(bqf.a(bqq.a('+'), bqf.a($$6, uu.e.a)), bqf.a(bqq.a('-'), bqf.a($$6, uu.e.b))), $$1x -> $$1x.b($$6));
      bpt<uu.d> $$7 = bpt.a("integer_suffix");
      $$5.a(
         $$7,
         bqf.b(
            bqf.a(
               bqq.a('u', 'U'),
               bqf.b(
                  bqf.a(bqq.a('b', 'B'), bqf.a($$7, new uu.d(uu.g.b, uu.i.c))),
                  bqf.a(bqq.a('s', 'S'), bqf.a($$7, new uu.d(uu.g.b, uu.i.d))),
                  bqf.a(bqq.a('i', 'I'), bqf.a($$7, new uu.d(uu.g.b, uu.i.e))),
                  bqf.a(bqq.a('l', 'L'), bqf.a($$7, new uu.d(uu.g.b, uu.i.f)))
               )
            ),
            bqf.a(
               bqq.a('s', 'S'),
               bqf.b(
                  bqf.a(bqq.a('b', 'B'), bqf.a($$7, new uu.d(uu.g.a, uu.i.c))),
                  bqf.a(bqq.a('s', 'S'), bqf.a($$7, new uu.d(uu.g.a, uu.i.d))),
                  bqf.a(bqq.a('i', 'I'), bqf.a($$7, new uu.d(uu.g.a, uu.i.e))),
                  bqf.a(bqq.a('l', 'L'), bqf.a($$7, new uu.d(uu.g.a, uu.i.f)))
               )
            ),
            bqf.a(bqq.a('b', 'B'), bqf.a($$7, new uu.d(null, uu.i.c))),
            bqf.a(bqq.a('s', 'S'), bqf.a($$7, new uu.d(null, uu.i.d))),
            bqf.a(bqq.a('i', 'I'), bqf.a($$7, new uu.d(null, uu.i.e))),
            bqf.a(bqq.a('l', 'L'), bqf.a($$7, new uu.d(null, uu.i.f)))
         ),
         $$1x -> $$1x.b($$7)
      );
      bpt<String> $$8 = bpt.a("binary_numeral");
      $$5.a($$8, u);
      bpt<String> $$9 = bpt.a("decimal_numeral");
      $$5.a($$9, v);
      bpt<String> $$10 = bpt.a("hex_numeral");
      $$5.a($$10, w);
      bpt<uu.c> $$11 = bpt.a("integer_literal");
      bqa<StringReader, uu.c> $$12 = $$5.a(
         $$11,
         bqf.a(
            bqf.a($$5.c($$6)),
            bqf.b(
               bqf.a(
                  bqq.a('0'),
                  bqf.c(),
                  bqf.b(bqf.a(bqq.a('x', 'X'), bqf.c(), $$5.c($$10)), bqf.a(bqq.a('b', 'B'), $$5.c($$8)), bqf.a($$5.c($$9), bqf.c(), bqf.a(r)), bqf.a($$9, "0"))
               ),
               $$5.c($$9)
            ),
            bqf.a($$5.c($$7))
         ),
         $$5x -> {
            uu.d $$6x = $$5x.b($$7, uu.d.a);
            uu.e $$7x = $$5x.b($$6, uu.e.a);
            String $$8x = $$5x.a($$9);
            if ($$8x != null) {
               return new uu.c($$7x, uu.b.b, $$8x, $$6x);
            } else {
               String $$9x = $$5x.a($$10);
               if ($$9x != null) {
                  return new uu.c($$7x, uu.b.c, $$9x, $$6x);
               } else {
                  String $$10x = $$5x.b($$8);
                  return new uu.c($$7x, uu.b.a, $$10x, $$6x);
               }
            }
         }
      );
      bpt<uu.i> $$13 = bpt.a("float_type_suffix");
      $$5.a($$13, bqf.b(bqf.a(bqq.a('f', 'F'), bqf.a($$13, uu.i.a)), bqf.a(bqq.a('d', 'D'), bqf.a($$13, uu.i.b))), $$1x -> $$1x.b($$13));
      bpt<uu.f<String>> $$14 = bpt.a("float_exponent_part");
      $$5.a($$14, bqf.a(bqq.a('e', 'E'), bqf.a($$5.c($$6)), $$5.c($$9)), $$2x -> new uu.f<>($$2x.b($$6, uu.e.a), $$2x.b($$9)));
      bpt<String> $$15 = bpt.a("float_whole_part");
      bpt<String> $$16 = bpt.a("float_fraction_part");
      bpt<T> $$17 = bpt.a("float_literal");
      $$5.a(
         $$17,
         bqf.a(
            bqf.a($$5.c($$6)),
            bqf.b(
               bqf.a($$5.a($$9, $$15), bqq.a('.'), bqf.c(), bqf.a($$5.a($$9, $$16)), bqf.a($$5.c($$14)), bqf.a($$5.c($$13))),
               bqf.a(bqq.a('.'), bqf.c(), $$5.a($$9, $$16), bqf.a($$5.c($$14)), bqf.a($$5.c($$13))),
               bqf.a($$5.a($$9, $$15), $$5.c($$14), bqf.c(), bqf.a($$5.c($$13))),
               bqf.a($$5.a($$9, $$15), bqf.a($$5.c($$14)), $$5.c($$13))
            )
         ),
         $$6x -> {
            bqd $$7x = $$6x.a();
            uu.e $$8x = $$7x.b($$6, uu.e.a);
            String $$9x = $$7x.a($$15);
            String $$10x = $$7x.a($$16);
            uu.f<String> $$11x = $$7x.a($$14);
            uu.i $$12x = $$7x.a($$13);
            return a($$0, $$8x, $$9x, $$10x, $$11x, $$12x, $$6x);
         }
      );
      bpt<String> $$18 = bpt.a("string_hex_2");
      $$5.a($$18, new uu.h(2));
      bpt<String> $$19 = bpt.a("string_hex_4");
      $$5.a($$19, new uu.h(4));
      bpt<String> $$20 = bpt.a("string_hex_8");
      $$5.a($$20, new uu.h(8));
      bpt<String> $$21 = bpt.a("string_unicode_name");
      $$5.a($$21, new bqi(z, h));
      bpt<String> $$22 = bpt.a("string_escape_sequence");
      $$5.a(
         $$22,
         bqf.b(
            bqf.a(bqq.a('b'), bqf.a($$22, "\b")),
            bqf.a(bqq.a('s'), bqf.a($$22, " ")),
            bqf.a(bqq.a('t'), bqf.a($$22, "\t")),
            bqf.a(bqq.a('n'), bqf.a($$22, "\n")),
            bqf.a(bqq.a('f'), bqf.a($$22, "\f")),
            bqf.a(bqq.a('r'), bqf.a($$22, "\r")),
            bqf.a(bqq.a('\\'), bqf.a($$22, "\\")),
            bqf.a(bqq.a('\''), bqf.a($$22, "'")),
            bqf.a(bqq.a('"'), bqf.a($$22, "\"")),
            bqf.a(bqq.a('x'), $$5.c($$18)),
            bqf.a(bqq.a('u'), $$5.c($$19)),
            bqf.a(bqq.a('U'), $$5.c($$20)),
            bqf.a(bqq.a('N'), bqq.a('{'), $$5.c($$21), bqq.a('}'))
         ),
         $$5x -> {
            bqd $$6x = $$5x.a();
            String $$7x = $$6x.b($$22);
            if ($$7x != null) {
               return $$7x;
            } else {
               String $$8x = $$6x.b($$18, $$19, $$20);
               if ($$8x != null) {
                  int $$9x = HexFormat.fromHexDigits($$8x);
                  if (!Character.isValidCodePoint($$9x)) {
                     $$5x.b().a($$5x.g(), bpw.a(c, String.format(Locale.ROOT, "U+%08X", $$9x)));
                     return null;
                  } else {
                     return Character.toString($$9x);
                  }
               } else {
                  String $$10x = $$6x.b($$21);

                  int $$11x;
                  try {
                     $$11x = Character.codePointOf($$10x);
                  } catch (IllegalArgumentException var12x) {
                     $$5x.b().a($$5x.g(), h);
                     return null;
                  }

                  return Character.toString($$11x);
               }
            }
         }
      );
      bpt<String> $$23 = bpt.a("string_plain_contents");
      $$5.a($$23, x);
      bpt<List<String>> $$24 = bpt.a("string_chunks");
      bpt<String> $$25 = bpt.a("string_contents");
      bpt<String> $$26 = bpt.a("single_quoted_string_chunk");
      bqa<StringReader, String> $$27 = $$5.a(
         $$26, bqf.b($$5.a($$23, $$25), bqf.a(bqq.a('\\'), $$5.a($$22, $$25)), bqf.a(bqq.a('"'), bqf.a($$25, "\""))), $$1x -> $$1x.b($$25)
      );
      bpt<String> $$28 = bpt.a("single_quoted_string_contents");
      $$5.a($$28, bqf.a($$27, $$24), $$1x -> a($$1x.b($$24)));
      bpt<String> $$29 = bpt.a("double_quoted_string_chunk");
      bqa<StringReader, String> $$30 = $$5.a(
         $$29, bqf.b($$5.a($$23, $$25), bqf.a(bqq.a('\\'), $$5.a($$22, $$25)), bqf.a(bqq.a('\''), bqf.a($$25, "'"))), $$1x -> $$1x.b($$25)
      );
      bpt<String> $$31 = bpt.a("double_quoted_string_contents");
      $$5.a($$31, bqf.a($$30, $$24), $$1x -> a($$1x.b($$24)));
      bpt<String> $$32 = bpt.a("quoted_string_literal");
      $$5.a(
         $$32,
         bqf.b(bqf.a(bqq.a('"'), bqf.c(), bqf.a($$5.a($$31, $$25)), bqq.a('"')), bqf.a(bqq.a('\''), bqf.a($$5.a($$28, $$25)), bqq.a('\''))),
         $$1x -> $$1x.b($$25)
      );
      bpt<String> $$33 = bpt.a("unquoted_string");
      $$5.a($$33, new bqs(1, k));
      bpt<T> $$34 = bpt.a("literal");
      bpt<List<T>> $$35 = bpt.a("arguments");
      $$5.a($$35, bqf.a($$5.b($$34), $$35, bqq.a(',')), $$1x -> $$1x.b($$35));
      bpt<T> $$36 = bpt.a("unquoted_string_or_builtin");
      $$5.a($$36, bqf.a($$5.c($$33), bqf.a(bqf.a(bqq.a('('), $$5.c($$35), bqq.a(')')))), $$5x -> {
         bqd $$6x = $$5x.a();
         String $$7x = $$6x.b($$33);
         if (!$$7x.isEmpty() && b($$7x.charAt(0))) {
            List<T> $$8x = $$6x.a($$35);
            if ($$8x != null) {
               uv.a $$9x = new uv.a($$7x, $$8x.size());
               uv.b $$10x = uv.c.get($$9x);
               if ($$10x != null) {
                  return $$10x.a($$0, $$8x, $$5x);
               } else {
                  $$5x.b().a($$5x.g(), bpw.a(d, $$9x.toString()));
                  return null;
               }
            } else if ($$7x.equalsIgnoreCase("true")) {
               return $$1;
            } else {
               return (T)($$7x.equalsIgnoreCase("false") ? $$2 : $$0.createString($$7x));
            }
         } else {
            $$5x.b().a($$5x.g(), uv.d, j);
            return null;
         }
      });
      bpt<String> $$37 = bpt.a("map_key");
      $$5.a($$37, bqf.b($$5.c($$32), $$5.c($$33)), $$2x -> $$2x.c($$32, $$33));
      bpt<Entry<String, T>> $$38 = bpt.a("map_entry");
      bqa<StringReader, Entry<String, T>> $$39 = $$5.a($$38, bqf.a($$5.c($$37), bqq.a(':'), $$5.c($$34)), $$2x -> {
         bqd $$3x = $$2x.a();
         String $$4x = $$3x.b($$37);
         if ($$4x.isEmpty()) {
            $$2x.b().a($$2x.g(), q);
            return null;
         } else {
            T $$5x = $$3x.b($$34);
            return Map.entry($$4x, $$5x);
         }
      });
      bpt<List<Entry<String, T>>> $$40 = bpt.a("map_entries");
      $$5.a($$40, bqf.a($$39, $$40, bqq.a(',')), $$1x -> $$1x.b($$40));
      bpt<T> $$41 = bpt.a("map_literal");
      $$5.a($$41, bqf.a(bqq.a('{'), $$5.c($$40), bqq.a('}')), $$3x -> {
         List<Entry<String, T>> $$4x = $$3x.b($$40);
         if ($$4x.isEmpty()) {
            return $$3;
         } else {
            Builder<T, T> $$5x = ImmutableMap.builderWithExpectedSize($$4x.size());

            for (Entry<String, T> $$6x : $$4x) {
               $$5x.put($$0.createString($$6x.getKey()), $$6x.getValue());
            }

            return (T)$$0.createMap($$5x.buildKeepingLast());
         }
      });
      bpt<List<T>> $$42 = bpt.a("list_entries");
      $$5.a($$42, bqf.a($$5.b($$34), $$42, bqq.a(',')), $$1x -> $$1x.b($$42));
      bpt<uu.a> $$43 = bpt.a("array_prefix");
      $$5.a(
         $$43,
         bqf.b(bqf.a(bqq.a('B'), bqf.a($$43, uu.a.a)), bqf.a(bqq.a('L'), bqf.a($$43, uu.a.c)), bqf.a(bqq.a('I'), bqf.a($$43, uu.a.b))),
         $$1x -> $$1x.b($$43)
      );
      bpt<List<uu.c>> $$44 = bpt.a("int_array_entries");
      $$5.a($$44, bqf.a($$12, $$44, bqq.a(',')), $$1x -> $$1x.b($$44));
      bpt<T> $$45 = bpt.a("list_literal");
      $$5.a($$45, bqf.a(bqq.a('['), bqf.b(bqf.a($$5.c($$43), bqq.a(';'), $$5.c($$44)), $$5.c($$42)), bqq.a(']')), $$5x -> {
         bqd $$6x = $$5x.a();
         uu.a $$7x = $$6x.a($$43);
         if ($$7x != null) {
            List<uu.c> $$8x = $$6x.b($$44);
            return $$8x.isEmpty() ? $$7x.a($$0) : $$7x.a($$0, $$8x, $$5x);
         } else {
            List<T> $$9x = $$6x.b($$42);
            return (T)($$9x.isEmpty() ? $$4 : $$0.createList($$9x.stream()));
         }
      });
      bqa<StringReader, T> $$46 = $$5.a(
         $$34,
         bqf.b(
            bqf.a(bqf.b(y), bqf.b($$5.a($$17, $$34), $$5.c($$11))),
            bqf.a(bqf.b(bqq.a('"', '\'')), bqf.c(), $$5.c($$32)),
            bqf.a(bqf.b(bqq.a('{')), bqf.c(), $$5.a($$41, $$34)),
            bqf.a(bqf.b(bqq.a('[')), bqf.c(), $$5.a($$45, $$34)),
            $$5.a($$36, $$34)
         ),
         $$4x -> {
            bqd $$5x = $$4x.a();
            String $$6x = $$5x.a($$32);
            if ($$6x != null) {
               return (T)$$0.createString($$6x);
            } else {
               uu.c $$7x = $$5x.a($$11);
               return $$7x != null ? $$7x.a($$0, $$4x) : $$5x.b($$34);
            }
         }
      );
      return new bqh<>($$5, $$46);
   }

   static enum a {
      a(uu.i.c) {
         private static final ByteBuffer d = ByteBuffer.wrap(new byte[0]);

         @Override
         public <T> T a(DynamicOps<T> $$0) {
            return (T)$$0.createByteList(d);
         }

         @Nullable
         @Override
         public <T> T a(DynamicOps<T> $$0, List<uu.c> $$1, bqb<?> $$2) {
            ByteList $$3 = new ByteArrayList();

            for (uu.c $$4 : $$1) {
               Number $$5 = this.a($$4, $$2);
               if ($$5 == null) {
                  return null;
               }

               $$3.add($$5.byteValue());
            }

            return (T)$$0.createByteList(ByteBuffer.wrap($$3.toByteArray()));
         }
      },
      b(uu.i.e, uu.i.c, uu.i.d) {
         @Override
         public <T> T a(DynamicOps<T> $$0) {
            return (T)$$0.createIntList(IntStream.empty());
         }

         @Nullable
         @Override
         public <T> T a(DynamicOps<T> $$0, List<uu.c> $$1, bqb<?> $$2) {
            java.util.stream.IntStream.Builder $$3 = IntStream.builder();

            for (uu.c $$4 : $$1) {
               Number $$5 = this.a($$4, $$2);
               if ($$5 == null) {
                  return null;
               }

               $$3.add($$5.intValue());
            }

            return (T)$$0.createIntList($$3.build());
         }
      },
      c(uu.i.f, uu.i.c, uu.i.d, uu.i.e) {
         @Override
         public <T> T a(DynamicOps<T> $$0) {
            return (T)$$0.createLongList(LongStream.empty());
         }

         @Nullable
         @Override
         public <T> T a(DynamicOps<T> $$0, List<uu.c> $$1, bqb<?> $$2) {
            java.util.stream.LongStream.Builder $$3 = LongStream.builder();

            for (uu.c $$4 : $$1) {
               Number $$5 = this.a($$4, $$2);
               if ($$5 == null) {
                  return null;
               }

               $$3.add($$5.longValue());
            }

            return (T)$$0.createLongList($$3.build());
         }
      };

      private final uu.i d;
      private final Set<uu.i> e;

      a(final uu.i $$0, final uu.i... $$1) {
         this.e = Set.of($$1);
         this.d = $$0;
      }

      public boolean a(uu.i $$0) {
         return $$0 == this.d || this.e.contains($$0);
      }

      public abstract <T> T a(DynamicOps<T> var1);

      @Nullable
      public abstract <T> T a(DynamicOps<T> var1, List<uu.c> var2, bqb<?> var3);

      @Nullable
      protected Number a(uu.c $$0, bqb<?> $$1) {
         uu.i $$2 = this.a($$0.d);
         if ($$2 == null) {
            $$1.b().a($$1.g(), uu.i);
            return null;
         } else {
            return $$0.a(JavaOps.INSTANCE, $$2, $$1);
         }
      }

      @Nullable
      private uu.i a(uu.d $$0) {
         uu.i $$1 = $$0.b();
         if ($$1 == null) {
            return this.d;
         } else {
            return !this.a($$1) ? null : $$1;
         }
      }
   }

   static enum b {
      a,
      b,
      c;
   }

   static record c(uu.e a, uu.b b, String c, uu.d d) {

      private uu.g e() {
         if (this.d.b != null) {
            return this.d.b;
         } else {
            return switch (this.b) {
               case a, c -> uu.g.b;
               case b -> uu.g.a;
            };
         }
      }

      private String a(uu.e $$0) {
         boolean $$1 = uu.a(this.c);
         if ($$0 != uu.e.b && !$$1) {
            return this.c;
         } else {
            StringBuilder $$2 = new StringBuilder();
            $$0.a($$2);
            uu.a($$2, this.c, $$1);
            return $$2.toString();
         }
      }

      @Nullable
      public <T> T a(DynamicOps<T> $$0, bqb<?> $$1) {
         return this.a($$0, Objects.requireNonNullElse(this.d.c, uu.i.e), $$1);
      }

      @Nullable
      public <T> T a(DynamicOps<T> $$0, uu.i $$1, bqb<?> $$2) {
         boolean $$3 = this.e() == uu.g.a;
         if (!$$3 && this.a == uu.e.b) {
            $$2.b().a($$2.g(), uu.g);
            return null;
         } else {
            String $$4 = this.a(this.a);

            int $$5 = switch (this.b) {
               case a -> 2;
               case b -> 10;
               case c -> 16;
            };

            try {
               if ($$3) {
                  return (T)(switch ($$1) {
                     case c -> (Object)$$0.createByte(Byte.parseByte($$4, $$5));
                     case d -> (Object)$$0.createShort(Short.parseShort($$4, $$5));
                     case e -> (Object)$$0.createInt(Integer.parseInt($$4, $$5));
                     case f -> (Object)$$0.createLong(Long.parseLong($$4, $$5));
                     default -> {
                        $$2.b().a($$2.g(), uu.e);
                        yield null;
                     }
                  });
               } else {
                  return (T)(switch ($$1) {
                     case c -> (Object)$$0.createByte(UnsignedBytes.parseUnsignedByte($$4, $$5));
                     case d -> (Object)$$0.createShort(uu.a($$4, $$5));
                     case e -> (Object)$$0.createInt(Integer.parseUnsignedInt($$4, $$5));
                     case f -> (Object)$$0.createLong(Long.parseUnsignedLong($$4, $$5));
                     default -> {
                        $$2.b().a($$2.g(), uu.e);
                        yield null;
                     }
                  });
               }
            } catch (NumberFormatException var8) {
               $$2.b().a($$2.g(), uu.a(var8));
               return null;
            }
         }
      }
   }

   static record d(@Nullable uu.g b, @Nullable uu.i c) {
      public static final uu.d a = new uu.d(null, null);

      @Nullable
      public uu.g a() {
         return this.b;
      }

      @Nullable
      public uu.i b() {
         return this.c;
      }
   }

   static enum e {
      a,
      b;

      public void a(StringBuilder $$0) {
         if (this == b) {
            $$0.append("-");
         }
      }
   }

   static record f<T>(uu.e a, T b) {
   }

   static enum g {
      a,
      b;
   }

   static class h extends bqj {
      public h(int $$0) {
         super($$0, $$0, bpw.a(uu.b, String.valueOf($$0)));
      }

      @Override
      protected boolean a(char $$0) {
         return switch ($$0) {
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'a', 'b', 'c', 'd', 'e', 'f' -> true;
            default -> false;
         };
      }
   }

   static enum i {
      a,
      b,
      c,
      d,
      e,
      f;
   }
}
