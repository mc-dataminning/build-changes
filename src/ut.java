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
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import javax.annotation.Nullable;

public class ut {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xa.b("snbt.parser.number_parse_failure", $$0));
   static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xa.b("snbt.parser.expected_hex_escape", $$0));
   static final bpu<CommandSyntaxException> c = bpu.a(new SimpleCommandExceptionType(xa.c("snbt.parser.expected_integer_type")));
   private static final bpu<CommandSyntaxException> d = bpu.a(new SimpleCommandExceptionType(xa.c("snbt.parser.expected_float_type")));
   static final bpu<CommandSyntaxException> e = bpu.a(new SimpleCommandExceptionType(xa.c("snbt.parser.expected_non_negative_number")));
   private static final bpu<CommandSyntaxException> f = bpu.a(new SimpleCommandExceptionType(xa.c("snbt.parser.invalid_character_name")));
   static final bpu<CommandSyntaxException> g = bpu.a(new SimpleCommandExceptionType(xa.c("snbt.parser.invalid_array_element_type")));
   private static final bpu<CommandSyntaxException> h = bpu.a(new SimpleCommandExceptionType(xa.c("snbt.parser.invalid_unquoted_start")));
   private static final bpu<CommandSyntaxException> i = bpu.a(new SimpleCommandExceptionType(xa.c("snbt.parser.expected_unquoted_string")));
   private static final bpu<CommandSyntaxException> j = bpu.a(new SimpleCommandExceptionType(xa.c("snbt.parser.invalid_string_contents")));
   private static final bpu<CommandSyntaxException> k = bpu.a(new SimpleCommandExceptionType(xa.c("snbt.parser.expected_binary_numeral")));
   private static final bpu<CommandSyntaxException> l = bpu.a(new SimpleCommandExceptionType(xa.c("snbt.parser.undescore_not_allowed")));
   private static final bpu<CommandSyntaxException> m = bpu.a(new SimpleCommandExceptionType(xa.c("snbt.parser.expected_decimal_numeral")));
   private static final bpu<CommandSyntaxException> n = bpu.a(new SimpleCommandExceptionType(xa.c("snbt.parser.expected_hex_numeral")));
   private static final bpu<CommandSyntaxException> o = bpu.a(new SimpleCommandExceptionType(xa.c("snbt.parser.empty_key")));
   private static final bpu<CommandSyntaxException> p = bpu.a(new SimpleCommandExceptionType(xa.c("snbt.parser.leading_zero_not_allowed")));
   private static final HexFormat q = HexFormat.of().withUpperCase();
   private static final bqi r = new bqi(k, l) {
      @Override
      protected boolean a(char $$0) {
         return switch ($$0) {
            case '0', '1', '_' -> true;
            default -> false;
         };
      }
   };
   private static final bqi s = new bqi(m, l) {
      @Override
      protected boolean a(char $$0) {
         return switch ($$0) {
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '_' -> true;
            default -> false;
         };
      }
   };
   private static final bqi t = new bqi(n, l) {
      @Override
      protected boolean a(char $$0) {
         return switch ($$0) {
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', '_', 'a', 'b', 'c', 'd', 'e', 'f' -> true;
            default -> false;
         };
      }
   };
   private static final bqh u = new bqh(1, j) {
      @Override
      protected boolean a(char $$0) {
         return switch ($$0) {
            case '"', '\'', '\\' -> false;
            default -> true;
         };
      }
   };
   private static final bqo.a v = new bqo.a(CharList.of()) {
      @Override
      protected boolean a(char $$0) {
         return ut.c($$0);
      }
   };
   private static final Pattern w = Pattern.compile("[-a-zA-Z0-9 ]+");

   static bpu<CommandSyntaxException> a(NumberFormatException $$0) {
      return bpu.a(a, $$0.getMessage());
   }

   @Nullable
   public static String a(char $$0) {
      return switch ($$0) {
         case '\b' -> "b";
         case '\t' -> "t";
         case '\n' -> "n";
         default -> $$0 < ' ' ? "x" + q.toHexDigits((byte)$$0) : null;
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
   private static <T> T a(DynamicOps<T> $$0, ut.e $$1, @Nullable String $$2, @Nullable String $$3, @Nullable ut.f<String> $$4, @Nullable ut.i $$5, bpz<?> $$6) {
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
               $$6.b().a($$6.g(), d);
               yield null;
            }
         });
      } catch (NumberFormatException var11) {
         $$6.b().a($$6.g(), a(var11));
         return null;
      }
   }

   private static String a(List<String> $$0) {
      return switch ($$0.size()) {
         case 0 -> "";
         case 1 -> (String)$$0.getFirst();
         default -> String.join("", $$0);
      };
   }

   public static <T> bqf<T> a(DynamicOps<T> $$0) {
      T $$1 = (T)$$0.createBoolean(true);
      T $$2 = (T)$$0.createBoolean(false);
      T $$3 = (T)$$0.emptyMap();
      T $$4 = (T)$$0.emptyList();
      bpv<StringReader> $$5 = new bpv<>();
      bpr<ut.e> $$6 = bpr.a("sign");
      $$5.a($$6, bqd.b(bqd.a(bqo.a('+'), bqd.a($$6, ut.e.a)), bqd.a(bqo.a('-'), bqd.a($$6, ut.e.b))), $$1x -> $$1x.b($$6));
      bpr<ut.d> $$7 = bpr.a("integer_suffix");
      $$5.a(
         $$7,
         bqd.b(
            bqd.a(
               bqo.a('u', 'U'),
               bqd.b(
                  bqd.a(bqo.a('b', 'B'), bqd.a($$7, new ut.d(ut.g.b, ut.i.c))),
                  bqd.a(bqo.a('s', 'S'), bqd.a($$7, new ut.d(ut.g.b, ut.i.d))),
                  bqd.a(bqo.a('i', 'I'), bqd.a($$7, new ut.d(ut.g.b, ut.i.e))),
                  bqd.a(bqo.a('l', 'L'), bqd.a($$7, new ut.d(ut.g.b, ut.i.f)))
               )
            ),
            bqd.a(
               bqo.a('s', 'S'),
               bqd.b(
                  bqd.a(bqo.a('b', 'B'), bqd.a($$7, new ut.d(ut.g.a, ut.i.c))),
                  bqd.a(bqo.a('s', 'S'), bqd.a($$7, new ut.d(ut.g.a, ut.i.d))),
                  bqd.a(bqo.a('i', 'I'), bqd.a($$7, new ut.d(ut.g.a, ut.i.e))),
                  bqd.a(bqo.a('l', 'L'), bqd.a($$7, new ut.d(ut.g.a, ut.i.f)))
               )
            ),
            bqd.a(bqo.a('b', 'B'), bqd.a($$7, new ut.d(null, ut.i.c))),
            bqd.a(bqo.a('s', 'S'), bqd.a($$7, new ut.d(null, ut.i.d))),
            bqd.a(bqo.a('i', 'I'), bqd.a($$7, new ut.d(null, ut.i.e))),
            bqd.a(bqo.a('l', 'L'), bqd.a($$7, new ut.d(null, ut.i.f)))
         ),
         $$1x -> $$1x.b($$7)
      );
      bpr<String> $$8 = bpr.a("binary_numeral");
      $$5.a($$8, r);
      bpr<String> $$9 = bpr.a("decimal_numeral");
      $$5.a($$9, s);
      bpr<String> $$10 = bpr.a("hex_numeral");
      $$5.a($$10, t);
      bpr<ut.c> $$11 = bpr.a("integer_literal");
      bpy<StringReader, ut.c> $$12 = $$5.a(
         $$11,
         bqd.a(
            bqd.a($$5.c($$6)),
            bqd.b(
               bqd.a(
                  bqo.a('0'),
                  bqd.c(),
                  bqd.b(bqd.a(bqo.a('x', 'X'), bqd.c(), $$5.c($$10)), bqd.a(bqo.a('b', 'B'), $$5.c($$8)), bqd.a($$5.c($$9), bqd.c(), bqd.a(p)), bqd.a($$9, "0"))
               ),
               $$5.c($$9)
            ),
            bqd.a($$5.c($$7))
         ),
         $$5x -> {
            ut.d $$6x = $$5x.b($$7, ut.d.a);
            ut.e $$7x = $$5x.b($$6, ut.e.a);
            String $$8x = $$5x.a($$9);
            if ($$8x != null) {
               return new ut.c($$7x, ut.b.b, $$8x, $$6x);
            } else {
               String $$9x = $$5x.a($$10);
               if ($$9x != null) {
                  return new ut.c($$7x, ut.b.c, $$9x, $$6x);
               } else {
                  String $$10x = $$5x.b($$8);
                  return new ut.c($$7x, ut.b.a, $$10x, $$6x);
               }
            }
         }
      );
      bpr<ut.i> $$13 = bpr.a("float_type_suffix");
      $$5.a($$13, bqd.b(bqd.a(bqo.a('f', 'F'), bqd.a($$13, ut.i.a)), bqd.a(bqo.a('d', 'D'), bqd.a($$13, ut.i.b))), $$1x -> $$1x.b($$13));
      bpr<ut.f<String>> $$14 = bpr.a("float_exponent_part");
      $$5.a($$14, bqd.a(bqo.a('e', 'E'), bqd.a($$5.c($$6)), $$5.c($$9)), $$2x -> new ut.f<>($$2x.b($$6, ut.e.a), $$2x.b($$9)));
      bpr<String> $$15 = bpr.a("float_whole_part");
      bpr<String> $$16 = bpr.a("float_fraction_part");
      bpr<T> $$17 = bpr.a("float_literal");
      $$5.a(
         $$17,
         bqd.a(
            bqd.a($$5.c($$6)),
            bqd.b(
               bqd.a($$5.a($$9, $$15), bqo.a('.'), bqd.c(), bqd.a($$5.a($$9, $$16)), bqd.a($$5.c($$14)), bqd.a($$5.c($$13))),
               bqd.a(bqo.a('.'), bqd.c(), $$5.a($$9, $$16), bqd.a($$5.c($$14)), bqd.a($$5.c($$13))),
               bqd.a($$5.a($$9, $$15), $$5.c($$14), bqd.c(), bqd.a($$5.c($$13))),
               bqd.a($$5.a($$9, $$15), bqd.a($$5.c($$14)), $$5.c($$13))
            )
         ),
         $$6x -> {
            bqb $$7x = $$6x.a();
            ut.e $$8x = $$7x.b($$6, ut.e.a);
            String $$9x = $$7x.a($$15);
            String $$10x = $$7x.a($$16);
            ut.f<String> $$11x = $$7x.a($$14);
            ut.i $$12x = $$7x.a($$13);
            return a($$0, $$8x, $$9x, $$10x, $$11x, $$12x, $$6x);
         }
      );
      bpr<String> $$18 = bpr.a("string_hex_2");
      $$5.a($$18, new ut.h(2));
      bpr<String> $$19 = bpr.a("string_hex_4");
      $$5.a($$19, new ut.h(4));
      bpr<String> $$20 = bpr.a("string_hex_8");
      $$5.a($$20, new ut.h(8));
      bpr<String> $$21 = bpr.a("string_unicode_name");
      $$5.a($$21, new bqg(w, f));
      bpr<String> $$22 = bpr.a("string_escape_sequence");
      $$5.a(
         $$22,
         bqd.b(
            bqd.a(bqo.a('b'), bqd.a($$22, "\b")),
            bqd.a(bqo.a('s'), bqd.a($$22, " ")),
            bqd.a(bqo.a('t'), bqd.a($$22, "\t")),
            bqd.a(bqo.a('n'), bqd.a($$22, "\n")),
            bqd.a(bqo.a('f'), bqd.a($$22, "\f")),
            bqd.a(bqo.a('r'), bqd.a($$22, "\r")),
            bqd.a(bqo.a('\\'), bqd.a($$22, "\\")),
            bqd.a(bqo.a('\''), bqd.a($$22, "'")),
            bqd.a(bqo.a('"'), bqd.a($$22, "\"")),
            bqd.a(bqo.a('x'), $$5.c($$18)),
            bqd.a(bqo.a('u'), $$5.c($$19)),
            bqd.a(bqo.a('U'), $$5.c($$20)),
            bqd.a(bqo.a('N'), bqo.a('{'), $$5.c($$21), bqo.a('}'))
         ),
         $$5x -> {
            bqb $$6x = $$5x.a();
            String $$7x = $$6x.b($$22);
            if ($$7x != null) {
               return $$7x;
            } else {
               String $$8x = $$6x.b($$18, $$19, $$20);
               if ($$8x != null) {
                  return Character.toString(HexFormat.fromHexDigits($$8x));
               } else {
                  String $$9x = $$6x.b($$21);

                  int $$10x;
                  try {
                     $$10x = Character.codePointOf($$9x);
                  } catch (IllegalArgumentException var12x) {
                     $$5x.b().a($$5x.g(), f);
                     return null;
                  }

                  return Character.toString($$10x);
               }
            }
         }
      );
      bpr<String> $$23 = bpr.a("string_plain_contents");
      $$5.a($$23, u);
      bpr<List<String>> $$24 = bpr.a("string_chunks");
      bpr<String> $$25 = bpr.a("string_contents");
      bpr<String> $$26 = bpr.a("single_quoted_string_chunk");
      bpy<StringReader, String> $$27 = $$5.a(
         $$26, bqd.b($$5.a($$23, $$25), bqd.a(bqo.a('\\'), $$5.a($$22, $$25)), bqd.a(bqo.a('"'), bqd.a($$25, "\""))), $$1x -> $$1x.b($$25)
      );
      bpr<String> $$28 = bpr.a("single_quoted_string_contents");
      $$5.a($$28, bqd.a($$27, $$24), $$1x -> a($$1x.b($$24)));
      bpr<String> $$29 = bpr.a("double_quoted_string_chunk");
      bpy<StringReader, String> $$30 = $$5.a(
         $$29, bqd.b($$5.a($$23, $$25), bqd.a(bqo.a('\\'), $$5.a($$22, $$25)), bqd.a(bqo.a('\''), bqd.a($$25, "'"))), $$1x -> $$1x.b($$25)
      );
      bpr<String> $$31 = bpr.a("double_quoted_string_contents");
      $$5.a($$31, bqd.a($$30, $$24), $$1x -> a($$1x.b($$24)));
      bpr<String> $$32 = bpr.a("quoted_string_literal");
      $$5.a(
         $$32,
         bqd.b(bqd.a(bqo.a('"'), bqd.c(), bqd.a($$5.a($$31, $$25)), bqo.a('"')), bqd.a(bqo.a('\''), bqd.a($$5.a($$28, $$25)), bqo.a('\''))),
         $$1x -> $$1x.b($$25)
      );
      bpr<String> $$33 = bpr.a("unquoted_string");
      $$5.a($$33, new bqq(1, i));
      bpr<T> $$34 = bpr.a("unquoted_string_or_builtin");
      $$5.a($$34, $$5.c($$33), $$4x -> {
         bqb $$5x = $$4x.a();
         String $$6x = $$5x.b($$33);
         if (!$$6x.isEmpty() && !b($$6x.charAt(0))) {
            $$4x.b().a($$4x.g(), h);
            return null;
         } else if ($$6x.equalsIgnoreCase("true")) {
            return $$1;
         } else {
            return (T)($$6x.equalsIgnoreCase("false") ? $$2 : $$0.createString($$6x));
         }
      });
      bpr<T> $$35 = bpr.a("literal");
      bpr<String> $$36 = bpr.a("map_key");
      $$5.a($$36, bqd.b($$5.c($$32), $$5.c($$33)), $$2x -> $$2x.c($$32, $$33));
      bpr<Entry<String, T>> $$37 = bpr.a("map_entry");
      bpy<StringReader, Entry<String, T>> $$38 = $$5.a($$37, bqd.a($$5.c($$36), bqo.a(':'), $$5.c($$35)), $$2x -> {
         bqb $$3x = $$2x.a();
         String $$4x = $$3x.b($$36);
         if ($$4x.isEmpty()) {
            $$2x.b().a($$2x.g(), o);
            return null;
         } else {
            T $$5x = $$3x.b($$35);
            return Map.entry($$4x, $$5x);
         }
      });
      bpr<List<Entry<String, T>>> $$39 = bpr.a("map_entries");
      $$5.a($$39, bqd.a($$38, $$39, bqo.a(',')), $$1x -> $$1x.b($$39));
      bpr<T> $$40 = bpr.a("map_literal");
      $$5.a($$40, bqd.a(bqo.a('{'), $$5.c($$39), bqo.a('}')), $$3x -> {
         List<Entry<String, T>> $$4x = $$3x.b($$39);
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
      bpr<List<T>> $$41 = bpr.a("list_entries");
      $$5.a($$41, bqd.a($$5.b($$35), $$41, bqo.a(',')), $$1x -> $$1x.b($$41));
      bpr<ut.a> $$42 = bpr.a("array_prefix");
      $$5.a(
         $$42,
         bqd.b(bqd.a(bqo.a('B'), bqd.a($$42, ut.a.a)), bqd.a(bqo.a('L'), bqd.a($$42, ut.a.c)), bqd.a(bqo.a('I'), bqd.a($$42, ut.a.b))),
         $$1x -> $$1x.b($$42)
      );
      bpr<List<ut.c>> $$43 = bpr.a("int_array_entries");
      $$5.a($$43, bqd.a($$12, $$43, bqo.a(',')), $$1x -> $$1x.b($$43));
      bpr<T> $$44 = bpr.a("list_literal");
      $$5.a($$44, bqd.a(bqo.a('['), bqd.b(bqd.a($$5.c($$42), bqo.a(';'), $$5.c($$43)), $$5.c($$41)), bqo.a(']')), $$5x -> {
         bqb $$6x = $$5x.a();
         ut.a $$7x = $$6x.a($$42);
         if ($$7x != null) {
            List<ut.c> $$8x = $$6x.b($$43);
            return $$8x.isEmpty() ? $$7x.a($$0) : $$7x.a($$0, $$8x, $$5x);
         } else {
            List<T> $$9x = $$6x.b($$41);
            return (T)($$9x.isEmpty() ? $$4 : $$0.createList($$9x.stream()));
         }
      });
      bpy<StringReader, T> $$45 = $$5.a(
         $$35,
         bqd.b(
            bqd.a(bqd.b(v), bqd.b($$5.a($$17, $$35), $$5.c($$11))),
            bqd.a(bqd.b(bqo.a('"', '\'')), bqd.c(), $$5.c($$32)),
            bqd.a(bqd.b(bqo.a('{')), bqd.c(), $$5.a($$40, $$35)),
            bqd.a(bqd.b(bqo.a('[')), bqd.c(), $$5.a($$44, $$35)),
            $$5.a($$34, $$35)
         ),
         $$4x -> {
            bqb $$5x = $$4x.a();
            String $$6x = $$5x.a($$32);
            if ($$6x != null) {
               return (T)$$0.createString($$6x);
            } else {
               ut.c $$7x = $$5x.a($$11);
               return $$7x != null ? $$7x.a($$0, $$4x) : $$5x.b($$35);
            }
         }
      );
      return new bqf<>($$5, $$45);
   }

   static enum a {
      a(ut.i.c) {
         private static final ByteBuffer d = ByteBuffer.wrap(new byte[0]);

         @Override
         public <T> T a(DynamicOps<T> $$0) {
            return (T)$$0.createByteList(d);
         }

         @Nullable
         @Override
         public <T> T a(DynamicOps<T> $$0, List<ut.c> $$1, bpz<?> $$2) {
            ByteList $$3 = new ByteArrayList();

            for (ut.c $$4 : $$1) {
               Number $$5 = this.a($$4, $$2);
               if ($$5 == null) {
                  return null;
               }

               $$3.add($$5.byteValue());
            }

            return (T)$$0.createByteList(ByteBuffer.wrap($$3.toByteArray()));
         }
      },
      b(ut.i.e, ut.i.c, ut.i.d) {
         @Override
         public <T> T a(DynamicOps<T> $$0) {
            return (T)$$0.createIntList(IntStream.empty());
         }

         @Nullable
         @Override
         public <T> T a(DynamicOps<T> $$0, List<ut.c> $$1, bpz<?> $$2) {
            java.util.stream.IntStream.Builder $$3 = IntStream.builder();

            for (ut.c $$4 : $$1) {
               Number $$5 = this.a($$4, $$2);
               if ($$5 == null) {
                  return null;
               }

               $$3.add($$5.intValue());
            }

            return (T)$$0.createIntList($$3.build());
         }
      },
      c(ut.i.f, ut.i.c, ut.i.d, ut.i.e) {
         @Override
         public <T> T a(DynamicOps<T> $$0) {
            return (T)$$0.createLongList(LongStream.empty());
         }

         @Nullable
         @Override
         public <T> T a(DynamicOps<T> $$0, List<ut.c> $$1, bpz<?> $$2) {
            java.util.stream.LongStream.Builder $$3 = LongStream.builder();

            for (ut.c $$4 : $$1) {
               Number $$5 = this.a($$4, $$2);
               if ($$5 == null) {
                  return null;
               }

               $$3.add($$5.longValue());
            }

            return (T)$$0.createLongList($$3.build());
         }
      };

      private final ut.i d;
      private final Set<ut.i> e;

      a(final ut.i $$0, final ut.i... $$1) {
         this.e = Set.of($$1);
         this.d = $$0;
      }

      public boolean a(ut.i $$0) {
         return $$0 == this.d || this.e.contains($$0);
      }

      public abstract <T> T a(DynamicOps<T> var1);

      @Nullable
      public abstract <T> T a(DynamicOps<T> var1, List<ut.c> var2, bpz<?> var3);

      @Nullable
      protected Number a(ut.c $$0, bpz<?> $$1) {
         ut.i $$2 = this.a($$0.d);
         if ($$2 == null) {
            $$1.b().a($$1.g(), ut.g);
            return null;
         } else {
            return $$0.a(JavaOps.INSTANCE, $$2, $$1);
         }
      }

      @Nullable
      private ut.i a(ut.d $$0) {
         ut.i $$1 = $$0.b();
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

   static record c(ut.e a, ut.b b, String c, ut.d d) {

      private ut.g e() {
         if (this.d.b != null) {
            return this.d.b;
         } else {
            return switch (this.b) {
               case a, c -> ut.g.b;
               case b -> ut.g.a;
            };
         }
      }

      private String a(ut.e $$0) {
         boolean $$1 = ut.a(this.c);
         if ($$0 != ut.e.b && !$$1) {
            return this.c;
         } else {
            StringBuilder $$2 = new StringBuilder();
            $$0.a($$2);
            ut.a($$2, this.c, $$1);
            return $$2.toString();
         }
      }

      @Nullable
      public <T> T a(DynamicOps<T> $$0, bpz<?> $$1) {
         return this.a($$0, Objects.requireNonNullElse(this.d.c, ut.i.e), $$1);
      }

      @Nullable
      public <T> T a(DynamicOps<T> $$0, ut.i $$1, bpz<?> $$2) {
         boolean $$3 = this.e() == ut.g.a;
         if (!$$3 && this.a == ut.e.b) {
            $$2.b().a($$2.g(), ut.e);
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
                        $$2.b().a($$2.g(), ut.c);
                        yield null;
                     }
                  });
               } else {
                  return (T)(switch ($$1) {
                     case c -> (Object)$$0.createByte(UnsignedBytes.parseUnsignedByte($$4, $$5));
                     case d -> (Object)$$0.createShort(ut.a($$4, $$5));
                     case e -> (Object)$$0.createInt(Integer.parseUnsignedInt($$4, $$5));
                     case f -> (Object)$$0.createLong(Long.parseUnsignedLong($$4, $$5));
                     default -> {
                        $$2.b().a($$2.g(), ut.c);
                        yield null;
                     }
                  });
               }
            } catch (NumberFormatException var8) {
               $$2.b().a($$2.g(), ut.a(var8));
               return null;
            }
         }
      }
   }

   static record d(@Nullable ut.g b, @Nullable ut.i c) {
      public static final ut.d a = new ut.d(null, null);

      @Nullable
      public ut.g a() {
         return this.b;
      }

      @Nullable
      public ut.i b() {
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

   static record f<T>(ut.e a, T b) {
   }

   static enum g {
      a,
      b;
   }

   static class h extends bqh {
      public h(int $$0) {
         super($$0, bpu.a(ut.b, String.valueOf($$0)));
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
