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
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xg.b("snbt.parser.number_parse_failure", $$0));
   static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xg.b("snbt.parser.expected_hex_escape", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xg.b("snbt.parser.invalid_codepoint", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xg.b("snbt.parser.no_such_operation", $$0));
   static final bqf<CommandSyntaxException> e = bqf.a(new SimpleCommandExceptionType(xg.c("snbt.parser.expected_integer_type")));
   private static final bqf<CommandSyntaxException> f = bqf.a(new SimpleCommandExceptionType(xg.c("snbt.parser.expected_float_type")));
   static final bqf<CommandSyntaxException> g = bqf.a(new SimpleCommandExceptionType(xg.c("snbt.parser.expected_non_negative_number")));
   private static final bqf<CommandSyntaxException> h = bqf.a(new SimpleCommandExceptionType(xg.c("snbt.parser.invalid_character_name")));
   static final bqf<CommandSyntaxException> i = bqf.a(new SimpleCommandExceptionType(xg.c("snbt.parser.invalid_array_element_type")));
   private static final bqf<CommandSyntaxException> j = bqf.a(new SimpleCommandExceptionType(xg.c("snbt.parser.invalid_unquoted_start")));
   private static final bqf<CommandSyntaxException> k = bqf.a(new SimpleCommandExceptionType(xg.c("snbt.parser.expected_unquoted_string")));
   private static final bqf<CommandSyntaxException> l = bqf.a(new SimpleCommandExceptionType(xg.c("snbt.parser.invalid_string_contents")));
   private static final bqf<CommandSyntaxException> m = bqf.a(new SimpleCommandExceptionType(xg.c("snbt.parser.expected_binary_numeral")));
   private static final bqf<CommandSyntaxException> n = bqf.a(new SimpleCommandExceptionType(xg.c("snbt.parser.undescore_not_allowed")));
   private static final bqf<CommandSyntaxException> o = bqf.a(new SimpleCommandExceptionType(xg.c("snbt.parser.expected_decimal_numeral")));
   private static final bqf<CommandSyntaxException> p = bqf.a(new SimpleCommandExceptionType(xg.c("snbt.parser.expected_hex_numeral")));
   private static final bqf<CommandSyntaxException> q = bqf.a(new SimpleCommandExceptionType(xg.c("snbt.parser.empty_key")));
   private static final bqf<CommandSyntaxException> r = bqf.a(new SimpleCommandExceptionType(xg.c("snbt.parser.leading_zero_not_allowed")));
   private static final bqf<CommandSyntaxException> s = bqf.a(new SimpleCommandExceptionType(xg.c("snbt.parser.infinity_not_allowed")));
   private static final HexFormat t = HexFormat.of().withUpperCase();
   private static final bqt u = new bqt(m, n) {
      @Override
      protected boolean a(char $$0) {
         return switch ($$0) {
            case '0', '1', '_' -> true;
            default -> false;
         };
      }
   };
   private static final bqt v = new bqt(o, n) {
      @Override
      protected boolean a(char $$0) {
         return switch ($$0) {
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '_' -> true;
            default -> false;
         };
      }
   };
   private static final bqt w = new bqt(p, n) {
      @Override
      protected boolean a(char $$0) {
         return switch ($$0) {
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', '_', 'a', 'b', 'c', 'd', 'e', 'f' -> true;
            default -> false;
         };
      }
   };
   private static final bqs x = new bqs(1, l) {
      @Override
      protected boolean a(char $$0) {
         return switch ($$0) {
            case '"', '\'', '\\' -> false;
            default -> true;
         };
      }
   };
   private static final bqz.a y = new bqz.a(CharList.of()) {
      @Override
      protected boolean a(char $$0) {
         return uu.c($$0);
      }
   };
   private static final Pattern z = Pattern.compile("[-a-zA-Z0-9 ]+");

   static bqf<CommandSyntaxException> a(NumberFormatException $$0) {
      return bqf.a(a, $$0.getMessage());
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
   private static <T> T a(DynamicOps<T> $$0, uu.e $$1, @Nullable String $$2, @Nullable String $$3, @Nullable uu.f<String> $$4, @Nullable uu.i $$5, bqk<?> $$6) {
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
   private static <T> T a(DynamicOps<T> $$0, bqk<?> $$1, String $$2) {
      float $$3 = Float.parseFloat($$2);
      if (!Float.isFinite($$3)) {
         $$1.b().a($$1.g(), s);
         return null;
      } else {
         return (T)$$0.createFloat($$3);
      }
   }

   @Nullable
   private static <T> T b(DynamicOps<T> $$0, bqk<?> $$1, String $$2) {
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

   public static <T> bqq<T> a(DynamicOps<T> $$0) {
      T $$1 = (T)$$0.createBoolean(true);
      T $$2 = (T)$$0.createBoolean(false);
      T $$3 = (T)$$0.emptyMap();
      T $$4 = (T)$$0.emptyList();
      bqg<StringReader> $$5 = new bqg<>();
      bqc<uu.e> $$6 = bqc.a("sign");
      $$5.a($$6, bqo.b(bqo.a(bqz.a('+'), bqo.a($$6, uu.e.a)), bqo.a(bqz.a('-'), bqo.a($$6, uu.e.b))), $$1x -> $$1x.b($$6));
      bqc<uu.d> $$7 = bqc.a("integer_suffix");
      $$5.a(
         $$7,
         bqo.b(
            bqo.a(
               bqz.a('u', 'U'),
               bqo.b(
                  bqo.a(bqz.a('b', 'B'), bqo.a($$7, new uu.d(uu.g.b, uu.i.c))),
                  bqo.a(bqz.a('s', 'S'), bqo.a($$7, new uu.d(uu.g.b, uu.i.d))),
                  bqo.a(bqz.a('i', 'I'), bqo.a($$7, new uu.d(uu.g.b, uu.i.e))),
                  bqo.a(bqz.a('l', 'L'), bqo.a($$7, new uu.d(uu.g.b, uu.i.f)))
               )
            ),
            bqo.a(
               bqz.a('s', 'S'),
               bqo.b(
                  bqo.a(bqz.a('b', 'B'), bqo.a($$7, new uu.d(uu.g.a, uu.i.c))),
                  bqo.a(bqz.a('s', 'S'), bqo.a($$7, new uu.d(uu.g.a, uu.i.d))),
                  bqo.a(bqz.a('i', 'I'), bqo.a($$7, new uu.d(uu.g.a, uu.i.e))),
                  bqo.a(bqz.a('l', 'L'), bqo.a($$7, new uu.d(uu.g.a, uu.i.f)))
               )
            ),
            bqo.a(bqz.a('b', 'B'), bqo.a($$7, new uu.d(null, uu.i.c))),
            bqo.a(bqz.a('s', 'S'), bqo.a($$7, new uu.d(null, uu.i.d))),
            bqo.a(bqz.a('i', 'I'), bqo.a($$7, new uu.d(null, uu.i.e))),
            bqo.a(bqz.a('l', 'L'), bqo.a($$7, new uu.d(null, uu.i.f)))
         ),
         $$1x -> $$1x.b($$7)
      );
      bqc<String> $$8 = bqc.a("binary_numeral");
      $$5.a($$8, u);
      bqc<String> $$9 = bqc.a("decimal_numeral");
      $$5.a($$9, v);
      bqc<String> $$10 = bqc.a("hex_numeral");
      $$5.a($$10, w);
      bqc<uu.c> $$11 = bqc.a("integer_literal");
      bqj<StringReader, uu.c> $$12 = $$5.a(
         $$11,
         bqo.a(
            bqo.a($$5.c($$6)),
            bqo.b(
               bqo.a(
                  bqz.a('0'),
                  bqo.c(),
                  bqo.b(bqo.a(bqz.a('x', 'X'), bqo.c(), $$5.c($$10)), bqo.a(bqz.a('b', 'B'), $$5.c($$8)), bqo.a($$5.c($$9), bqo.c(), bqo.a(r)), bqo.a($$9, "0"))
               ),
               $$5.c($$9)
            ),
            bqo.a($$5.c($$7))
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
      bqc<uu.i> $$13 = bqc.a("float_type_suffix");
      $$5.a($$13, bqo.b(bqo.a(bqz.a('f', 'F'), bqo.a($$13, uu.i.a)), bqo.a(bqz.a('d', 'D'), bqo.a($$13, uu.i.b))), $$1x -> $$1x.b($$13));
      bqc<uu.f<String>> $$14 = bqc.a("float_exponent_part");
      $$5.a($$14, bqo.a(bqz.a('e', 'E'), bqo.a($$5.c($$6)), $$5.c($$9)), $$2x -> new uu.f<>($$2x.b($$6, uu.e.a), $$2x.b($$9)));
      bqc<String> $$15 = bqc.a("float_whole_part");
      bqc<String> $$16 = bqc.a("float_fraction_part");
      bqc<T> $$17 = bqc.a("float_literal");
      $$5.a(
         $$17,
         bqo.a(
            bqo.a($$5.c($$6)),
            bqo.b(
               bqo.a($$5.a($$9, $$15), bqz.a('.'), bqo.c(), bqo.a($$5.a($$9, $$16)), bqo.a($$5.c($$14)), bqo.a($$5.c($$13))),
               bqo.a(bqz.a('.'), bqo.c(), $$5.a($$9, $$16), bqo.a($$5.c($$14)), bqo.a($$5.c($$13))),
               bqo.a($$5.a($$9, $$15), $$5.c($$14), bqo.c(), bqo.a($$5.c($$13))),
               bqo.a($$5.a($$9, $$15), bqo.a($$5.c($$14)), $$5.c($$13))
            )
         ),
         $$6x -> {
            bqm $$7x = $$6x.a();
            uu.e $$8x = $$7x.b($$6, uu.e.a);
            String $$9x = $$7x.a($$15);
            String $$10x = $$7x.a($$16);
            uu.f<String> $$11x = $$7x.a($$14);
            uu.i $$12x = $$7x.a($$13);
            return a($$0, $$8x, $$9x, $$10x, $$11x, $$12x, $$6x);
         }
      );
      bqc<String> $$18 = bqc.a("string_hex_2");
      $$5.a($$18, new uu.h(2));
      bqc<String> $$19 = bqc.a("string_hex_4");
      $$5.a($$19, new uu.h(4));
      bqc<String> $$20 = bqc.a("string_hex_8");
      $$5.a($$20, new uu.h(8));
      bqc<String> $$21 = bqc.a("string_unicode_name");
      $$5.a($$21, new bqr(z, h));
      bqc<String> $$22 = bqc.a("string_escape_sequence");
      $$5.a(
         $$22,
         bqo.b(
            bqo.a(bqz.a('b'), bqo.a($$22, "\b")),
            bqo.a(bqz.a('s'), bqo.a($$22, " ")),
            bqo.a(bqz.a('t'), bqo.a($$22, "\t")),
            bqo.a(bqz.a('n'), bqo.a($$22, "\n")),
            bqo.a(bqz.a('f'), bqo.a($$22, "\f")),
            bqo.a(bqz.a('r'), bqo.a($$22, "\r")),
            bqo.a(bqz.a('\\'), bqo.a($$22, "\\")),
            bqo.a(bqz.a('\''), bqo.a($$22, "'")),
            bqo.a(bqz.a('"'), bqo.a($$22, "\"")),
            bqo.a(bqz.a('x'), $$5.c($$18)),
            bqo.a(bqz.a('u'), $$5.c($$19)),
            bqo.a(bqz.a('U'), $$5.c($$20)),
            bqo.a(bqz.a('N'), bqz.a('{'), $$5.c($$21), bqz.a('}'))
         ),
         $$5x -> {
            bqm $$6x = $$5x.a();
            String $$7x = $$6x.b($$22);
            if ($$7x != null) {
               return $$7x;
            } else {
               String $$8x = $$6x.b($$18, $$19, $$20);
               if ($$8x != null) {
                  int $$9x = HexFormat.fromHexDigits($$8x);
                  if (!Character.isValidCodePoint($$9x)) {
                     $$5x.b().a($$5x.g(), bqf.a(c, String.format(Locale.ROOT, "U+%08X", $$9x)));
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
      bqc<String> $$23 = bqc.a("string_plain_contents");
      $$5.a($$23, x);
      bqc<List<String>> $$24 = bqc.a("string_chunks");
      bqc<String> $$25 = bqc.a("string_contents");
      bqc<String> $$26 = bqc.a("single_quoted_string_chunk");
      bqj<StringReader, String> $$27 = $$5.a(
         $$26, bqo.b($$5.a($$23, $$25), bqo.a(bqz.a('\\'), $$5.a($$22, $$25)), bqo.a(bqz.a('"'), bqo.a($$25, "\""))), $$1x -> $$1x.b($$25)
      );
      bqc<String> $$28 = bqc.a("single_quoted_string_contents");
      $$5.a($$28, bqo.a($$27, $$24), $$1x -> a($$1x.b($$24)));
      bqc<String> $$29 = bqc.a("double_quoted_string_chunk");
      bqj<StringReader, String> $$30 = $$5.a(
         $$29, bqo.b($$5.a($$23, $$25), bqo.a(bqz.a('\\'), $$5.a($$22, $$25)), bqo.a(bqz.a('\''), bqo.a($$25, "'"))), $$1x -> $$1x.b($$25)
      );
      bqc<String> $$31 = bqc.a("double_quoted_string_contents");
      $$5.a($$31, bqo.a($$30, $$24), $$1x -> a($$1x.b($$24)));
      bqc<String> $$32 = bqc.a("quoted_string_literal");
      $$5.a(
         $$32,
         bqo.b(bqo.a(bqz.a('"'), bqo.c(), bqo.a($$5.a($$31, $$25)), bqz.a('"')), bqo.a(bqz.a('\''), bqo.a($$5.a($$28, $$25)), bqz.a('\''))),
         $$1x -> $$1x.b($$25)
      );
      bqc<String> $$33 = bqc.a("unquoted_string");
      $$5.a($$33, new brb(1, k));
      bqc<T> $$34 = bqc.a("literal");
      bqc<List<T>> $$35 = bqc.a("arguments");
      $$5.a($$35, bqo.a($$5.b($$34), $$35, bqz.a(',')), $$1x -> $$1x.b($$35));
      bqc<T> $$36 = bqc.a("unquoted_string_or_builtin");
      $$5.a($$36, bqo.a($$5.c($$33), bqo.a(bqo.a(bqz.a('('), $$5.c($$35), bqz.a(')')))), $$5x -> {
         bqm $$6x = $$5x.a();
         String $$7x = $$6x.b($$33);
         if (!$$7x.isEmpty() && b($$7x.charAt(0))) {
            List<T> $$8x = $$6x.a($$35);
            if ($$8x != null) {
               uv.a $$9x = new uv.a($$7x, $$8x.size());
               uv.b $$10x = uv.c.get($$9x);
               if ($$10x != null) {
                  return $$10x.a($$0, $$8x, $$5x);
               } else {
                  $$5x.b().a($$5x.g(), bqf.a(d, $$9x.toString()));
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
      bqc<String> $$37 = bqc.a("map_key");
      $$5.a($$37, bqo.b($$5.c($$32), $$5.c($$33)), $$2x -> $$2x.c($$32, $$33));
      bqc<Entry<String, T>> $$38 = bqc.a("map_entry");
      bqj<StringReader, Entry<String, T>> $$39 = $$5.a($$38, bqo.a($$5.c($$37), bqz.a(':'), $$5.c($$34)), $$2x -> {
         bqm $$3x = $$2x.a();
         String $$4x = $$3x.b($$37);
         if ($$4x.isEmpty()) {
            $$2x.b().a($$2x.g(), q);
            return null;
         } else {
            T $$5x = $$3x.b($$34);
            return Map.entry($$4x, $$5x);
         }
      });
      bqc<List<Entry<String, T>>> $$40 = bqc.a("map_entries");
      $$5.a($$40, bqo.a($$39, $$40, bqz.a(',')), $$1x -> $$1x.b($$40));
      bqc<T> $$41 = bqc.a("map_literal");
      $$5.a($$41, bqo.a(bqz.a('{'), $$5.c($$40), bqz.a('}')), $$3x -> {
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
      bqc<List<T>> $$42 = bqc.a("list_entries");
      $$5.a($$42, bqo.a($$5.b($$34), $$42, bqz.a(',')), $$1x -> $$1x.b($$42));
      bqc<uu.a> $$43 = bqc.a("array_prefix");
      $$5.a(
         $$43,
         bqo.b(bqo.a(bqz.a('B'), bqo.a($$43, uu.a.a)), bqo.a(bqz.a('L'), bqo.a($$43, uu.a.c)), bqo.a(bqz.a('I'), bqo.a($$43, uu.a.b))),
         $$1x -> $$1x.b($$43)
      );
      bqc<List<uu.c>> $$44 = bqc.a("int_array_entries");
      $$5.a($$44, bqo.a($$12, $$44, bqz.a(',')), $$1x -> $$1x.b($$44));
      bqc<T> $$45 = bqc.a("list_literal");
      $$5.a($$45, bqo.a(bqz.a('['), bqo.b(bqo.a($$5.c($$43), bqz.a(';'), $$5.c($$44)), $$5.c($$42)), bqz.a(']')), $$5x -> {
         bqm $$6x = $$5x.a();
         uu.a $$7x = $$6x.a($$43);
         if ($$7x != null) {
            List<uu.c> $$8x = $$6x.b($$44);
            return $$8x.isEmpty() ? $$7x.a($$0) : $$7x.a($$0, $$8x, $$5x);
         } else {
            List<T> $$9x = $$6x.b($$42);
            return (T)($$9x.isEmpty() ? $$4 : $$0.createList($$9x.stream()));
         }
      });
      bqj<StringReader, T> $$46 = $$5.a(
         $$34,
         bqo.b(
            bqo.a(bqo.b(y), bqo.b($$5.a($$17, $$34), $$5.c($$11))),
            bqo.a(bqo.b(bqz.a('"', '\'')), bqo.c(), $$5.c($$32)),
            bqo.a(bqo.b(bqz.a('{')), bqo.c(), $$5.a($$41, $$34)),
            bqo.a(bqo.b(bqz.a('[')), bqo.c(), $$5.a($$45, $$34)),
            $$5.a($$36, $$34)
         ),
         $$4x -> {
            bqm $$5x = $$4x.a();
            String $$6x = $$5x.a($$32);
            if ($$6x != null) {
               return (T)$$0.createString($$6x);
            } else {
               uu.c $$7x = $$5x.a($$11);
               return $$7x != null ? $$7x.a($$0, $$4x) : $$5x.b($$34);
            }
         }
      );
      return new bqq<>($$5, $$46);
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
         public <T> T a(DynamicOps<T> $$0, List<uu.c> $$1, bqk<?> $$2) {
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
         public <T> T a(DynamicOps<T> $$0, List<uu.c> $$1, bqk<?> $$2) {
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
         public <T> T a(DynamicOps<T> $$0, List<uu.c> $$1, bqk<?> $$2) {
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
      public abstract <T> T a(DynamicOps<T> var1, List<uu.c> var2, bqk<?> var3);

      @Nullable
      protected Number a(uu.c $$0, bqk<?> $$1) {
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
      public <T> T a(DynamicOps<T> $$0, bqk<?> $$1) {
         return this.a($$0, Objects.requireNonNullElse(this.d.c, uu.i.e), $$1);
      }

      @Nullable
      public <T> T a(DynamicOps<T> $$0, uu.i $$1, bqk<?> $$2) {
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

   static class h extends bqs {
      public h(int $$0) {
         super($$0, $$0, bqf.a(uu.b, String.valueOf($$0)));
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
