import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class uo {
   private static final Comparator<uf> b = Comparator.<uf>comparingInt($$0 -> $$0.e(1)).thenComparingInt($$0 -> $$0.e(0)).thenComparingInt($$0 -> $$0.e(2));
   private static final Comparator<uf> c = Comparator.<uf>comparingDouble($$0 -> $$0.h(1))
      .thenComparingDouble($$0 -> $$0.h(0))
      .thenComparingDouble($$0 -> $$0.h(2));
   public static final String a = "data";
   private static final char d = '{';
   private static final char e = '}';
   private static final String f = ",";
   private static final char g = ':';
   private static final Splitter h = Splitter.on(",");
   private static final Splitter i = Splitter.on(':').limit(2);
   private static final Logger j = LogUtils.getLogger();
   private static final int k = 2;
   private static final int l = -1;

   private uo() {
   }

   @VisibleForTesting
   public static boolean a(@Nullable uw $$0, @Nullable uw $$1, boolean $$2) {
      if ($$0 == $$1) {
         return true;
      } else if ($$0 == null) {
         return true;
      } else if ($$1 == null) {
         return false;
      } else if (!$$0.getClass().equals($$1.getClass())) {
         return false;
      } else if ($$0 instanceof tz $$3) {
         tz $$4 = (tz)$$1;
         if ($$4.f() < $$3.f()) {
            return false;
         } else {
            for (String $$5 : $$3.e()) {
               uw $$6 = $$3.a($$5);
               if (!a($$6, $$4.a($$5), $$2)) {
                  return false;
               }
            }

            return true;
         }
      } else {
         if ($$0 instanceof uf $$7 && $$2) {
            uf $$8 = (uf)$$1;
            if ($$7.isEmpty()) {
               return $$8.isEmpty();
            }

            if ($$8.size() < $$7.size()) {
               return false;
            }

            for (uw $$9 : $$7) {
               boolean $$10 = false;

               for (uw $$11 : $$8) {
                  if (a($$9, $$11, $$2)) {
                     $$10 = true;
                     break;
                  }
               }

               if (!$$10) {
                  return false;
               }
            }

            return true;
         }

         return $$0.equals($$1);
      }
   }

   public static eat a(jg<dmr> $$0, tz $$1) {
      if (!$$1.b("Name", 8)) {
         return dmt.a.m();
      } else {
         alg $$2 = alg.a($$1.j("Name"));
         Optional<? extends jf<dmr>> $$3 = $$0.a(alf.a(mh.i, $$2));
         if ($$3.isEmpty()) {
            return dmt.a.m();
         } else {
            dmr $$4 = $$3.get().a();
            eat $$5 = $$4.m();
            if ($$1.b("Properties", 10)) {
               tz $$6 = $$1.n("Properties");
               eau<dmr, eat> $$7 = $$4.l();

               for (String $$8 : $$6.e()) {
                  ebw<?> $$9 = $$7.a($$8);
                  if ($$9 != null) {
                     $$5 = a($$5, $$9, $$8, $$6, $$1);
                  }
               }
            }

            return $$5;
         }
      }
   }

   private static <S extends eav<?, S>, T extends Comparable<T>> S a(S $$0, ebw<T> $$1, String $$2, tz $$3, tz $$4) {
      Optional<T> $$5 = $$1.b($$3.j($$2));
      if ($$5.isPresent()) {
         return $$0.b($$1, $$5.get());
      } else {
         j.warn("Unable to read property: {} with value: {} for blockstate: {}", new Object[]{$$2, $$3.j($$2), $$4});
         return $$0;
      }
   }

   public static tz a(eat $$0) {
      tz $$1 = new tz();
      $$1.a("Name", mg.e.b($$0.b()).toString());
      Map<ebw<?>, Comparable<?>> $$2 = $$0.G();
      if (!$$2.isEmpty()) {
         tz $$3 = new tz();

         for (Entry<ebw<?>, Comparable<?>> $$4 : $$2.entrySet()) {
            ebw<?> $$5 = $$4.getKey();
            $$3.a($$5.f(), a($$5, $$4.getValue()));
         }

         $$1.a("Properties", $$3);
      }

      return $$1;
   }

   public static tz a(exa $$0) {
      tz $$1 = new tz();
      $$1.a("Name", mg.c.b($$0.a()).toString());
      Map<ebw<?>, Comparable<?>> $$2 = $$0.G();
      if (!$$2.isEmpty()) {
         tz $$3 = new tz();

         for (Entry<ebw<?>, Comparable<?>> $$4 : $$2.entrySet()) {
            ebw<?> $$5 = $$4.getKey();
            $$3.a($$5.f(), a($$5, $$4.getValue()));
         }

         $$1.a("Properties", $$3);
      }

      return $$1;
   }

   private static <T extends Comparable<T>> String a(ebw<T> $$0, Comparable<?> $$1) {
      return $$0.b((T)$$1);
   }

   public static String a(uw $$0) {
      return a($$0, false);
   }

   public static String a(uw $$0, boolean $$1) {
      return a(new StringBuilder(), $$0, 0, $$1).toString();
   }

   public static StringBuilder a(StringBuilder $$0, uw $$1, int $$2, boolean $$3) {
      switch ($$1.b()) {
         case 0:
            break;
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 8:
            $$0.append($$1);
            break;
         case 7:
            tw $$4 = (tw)$$1;
            byte[] $$5 = $$4.e();
            int $$6 = $$5.length;
            a($$2, $$0).append("byte[").append($$6).append("] {\n");
            if ($$3) {
               a($$2 + 1, $$0);

               for (int $$7 = 0; $$7 < $$5.length; $$7++) {
                  if ($$7 != 0) {
                     $$0.append(',');
                  }

                  if ($$7 % 16 == 0 && $$7 / 16 > 0) {
                     $$0.append('\n');
                     if ($$7 < $$5.length) {
                        a($$2 + 1, $$0);
                     }
                  } else if ($$7 != 0) {
                     $$0.append(' ');
                  }

                  $$0.append(String.format(Locale.ROOT, "0x%02X", $$5[$$7] & 255));
               }
            } else {
               a($$2 + 1, $$0).append(" // Skipped, supply withBinaryBlobs true");
            }

            $$0.append('\n');
            a($$2, $$0).append('}');
            break;
         case 9:
            uf $$8 = (uf)$$1;
            int $$9 = $$8.size();
            int $$10 = $$8.f();
            String $$11 = $$10 == 0 ? "undefined" : uz.a($$10).b();
            a($$2, $$0).append("list<").append($$11).append(">[").append($$9).append("] [");
            if ($$9 != 0) {
               $$0.append('\n');
            }

            for (int $$12 = 0; $$12 < $$9; $$12++) {
               if ($$12 != 0) {
                  $$0.append(",\n");
               }

               a($$2 + 1, $$0);
               a($$0, $$8.k($$12), $$2 + 1, $$3);
            }

            if ($$9 != 0) {
               $$0.append('\n');
            }

            a($$2, $$0).append(']');
            break;
         case 10:
            tz $$19 = (tz)$$1;
            List<String> $$20 = Lists.newArrayList($$19.e());
            Collections.sort($$20);
            a($$2, $$0).append('{');
            if ($$0.length() - $$0.lastIndexOf("\n") > 2 * ($$2 + 1)) {
               $$0.append('\n');
               a($$2 + 1, $$0);
            }

            int $$21 = $$20.stream().mapToInt(String::length).max().orElse(0);
            String $$22 = Strings.repeat(" ", $$21);

            for (int $$23 = 0; $$23 < $$20.size(); $$23++) {
               if ($$23 != 0) {
                  $$0.append(",\n");
               }

               String $$24 = $$20.get($$23);
               a($$2 + 1, $$0).append('"').append($$24).append('"').append($$22, 0, $$22.length() - $$24.length()).append(": ");
               a($$0, $$19.a($$24), $$2 + 1, $$3);
            }

            if (!$$20.isEmpty()) {
               $$0.append('\n');
            }

            a($$2, $$0).append('}');
            break;
         case 11:
            ud $$13 = (ud)$$1;
            int[] $$14 = $$13.g();
            int $$15 = 0;

            for (int $$16 : $$14) {
               $$15 = Math.max($$15, String.format(Locale.ROOT, "%X", $$16).length());
            }

            int $$17 = $$14.length;
            a($$2, $$0).append("int[").append($$17).append("] {\n");
            if ($$3) {
               a($$2 + 1, $$0);

               for (int $$18 = 0; $$18 < $$14.length; $$18++) {
                  if ($$18 != 0) {
                     $$0.append(',');
                  }

                  if ($$18 % 16 == 0 && $$18 / 16 > 0) {
                     $$0.append('\n');
                     if ($$18 < $$14.length) {
                        a($$2 + 1, $$0);
                     }
                  } else if ($$18 != 0) {
                     $$0.append(' ');
                  }

                  $$0.append(String.format(Locale.ROOT, "0x%0" + $$15 + "X", $$14[$$18]));
               }
            } else {
               a($$2 + 1, $$0).append(" // Skipped, supply withBinaryBlobs true");
            }

            $$0.append('\n');
            a($$2, $$0).append('}');
            break;
         case 12:
            ug $$25 = (ug)$$1;
            long[] $$26 = $$25.g();
            long $$27 = 0L;

            for (long $$28 : $$26) {
               $$27 = Math.max($$27, (long)String.format(Locale.ROOT, "%X", $$28).length());
            }

            long $$29 = (long)$$26.length;
            a($$2, $$0).append("long[").append($$29).append("] {\n");
            if ($$3) {
               a($$2 + 1, $$0);

               for (int $$30 = 0; $$30 < $$26.length; $$30++) {
                  if ($$30 != 0) {
                     $$0.append(',');
                  }

                  if ($$30 % 16 == 0 && $$30 / 16 > 0) {
                     $$0.append('\n');
                     if ($$30 < $$26.length) {
                        a($$2 + 1, $$0);
                     }
                  } else if ($$30 != 0) {
                     $$0.append(' ');
                  }

                  $$0.append(String.format(Locale.ROOT, "0x%0" + $$27 + "X", $$26[$$30]));
               }
            } else {
               a($$2 + 1, $$0).append(" // Skipped, supply withBinaryBlobs true");
            }

            $$0.append('\n');
            a($$2, $$0).append('}');
            break;
         default:
            $$0.append("<UNKNOWN :(>");
      }

      return $$0;
   }

   private static StringBuilder a(int $$0, StringBuilder $$1) {
      int $$2 = $$1.lastIndexOf("\n") + 1;
      int $$3 = $$1.length() - $$2;

      for (int $$4 = 0; $$4 < 2 * $$0 - $$3; $$4++) {
         $$1.append(' ');
      }

      return $$1;
   }

   public static wy b(uw $$0) {
      return new vb("").a($$0);
   }

   public static String a(tz $$0) {
      return new us().a((uw)b($$0));
   }

   public static tz a(String $$0) throws CommandSyntaxException {
      return c(ux.a($$0));
   }

   @VisibleForTesting
   static tz b(tz $$0) {
      boolean $$1 = $$0.b("palettes", 9);
      uf $$2;
      if ($$1) {
         $$2 = $$0.d("palettes", 9).b(0);
      } else {
         $$2 = $$0.d("palette", 10);
      }

      uf $$4 = $$2.stream().map(tz.class::cast).map(uo::d).map(uu::a).collect(Collectors.toCollection(uf::new));
      $$0.a("palette", $$4);
      if ($$1) {
         uf $$5 = new uf();
         uf $$6 = $$0.d("palettes", 9);
         $$6.stream().map(uf.class::cast).forEach($$2x -> {
            tz $$3x = new tz();

            for (int $$4x = 0; $$4x < $$2x.size(); $$4x++) {
               $$3x.a($$4.j($$4x), d($$2x.a($$4x)));
            }

            $$5.add($$3x);
         });
         $$0.a("palettes", $$5);
      }

      if ($$0.b("entities", 9)) {
         uf $$7 = $$0.d("entities", 10);
         uf $$8 = $$7.stream().map(tz.class::cast).sorted(Comparator.comparing($$0x -> $$0x.d("pos", 6), c)).collect(Collectors.toCollection(uf::new));
         $$0.a("entities", $$8);
      }

      uf $$9 = $$0.d("blocks", 10)
         .stream()
         .map(tz.class::cast)
         .sorted(Comparator.comparing($$0x -> $$0x.d("pos", 3), b))
         .peek($$1x -> $$1x.a("state", $$4.j($$1x.f("state"))))
         .collect(Collectors.toCollection(uf::new));
      $$0.a("data", $$9);
      $$0.p("blocks");
      return $$0;
   }

   @VisibleForTesting
   static tz c(tz $$0) {
      uf $$1 = $$0.d("palette", 8);
      Map<String, uw> $$2 = $$1.stream().map(uu.class::cast).map(uu::p_).collect(ImmutableMap.toImmutableMap(Function.identity(), uo::b));
      if ($$0.b("palettes", 9)) {
         $$0.a(
            "palettes",
            $$0.d("palettes", 10)
               .stream()
               .map(tz.class::cast)
               .map($$1x -> $$2.keySet().stream().map($$1x::j).map(uo::b).collect(Collectors.toCollection(uf::new)))
               .collect(Collectors.toCollection(uf::new))
         );
         $$0.p("palette");
      } else {
         $$0.a("palette", $$2.values().stream().collect(Collectors.toCollection(uf::new)));
      }

      if ($$0.b("data", 9)) {
         Object2IntMap<String> $$3 = new Object2IntOpenHashMap();
         $$3.defaultReturnValue(-1);

         for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
            $$3.put($$1.j($$4), $$4);
         }

         uf $$5 = $$0.d("data", 10);

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            tz $$7 = $$5.a($$6);
            String $$8 = $$7.j("state");
            int $$9 = $$3.getInt($$8);
            if ($$9 == -1) {
               throw new IllegalStateException("Entry " + $$8 + " missing from palette");
            }

            $$7.a("state", $$9);
         }

         $$0.a("blocks", $$5);
         $$0.p("data");
      }

      return $$0;
   }

   @VisibleForTesting
   static String d(tz $$0) {
      StringBuilder $$1 = new StringBuilder($$0.j("Name"));
      if ($$0.b("Properties", 10)) {
         tz $$2 = $$0.n("Properties");
         String $$3 = $$2.e().stream().sorted().map($$1x -> $$1x + ":" + $$2.a($$1x).p_()).collect(Collectors.joining(","));
         $$1.append('{').append($$3).append('}');
      }

      return $$1.toString();
   }

   @VisibleForTesting
   static tz b(String $$0) {
      tz $$1 = new tz();
      int $$2 = $$0.indexOf(123);
      String $$3;
      if ($$2 >= 0) {
         $$3 = $$0.substring(0, $$2);
         tz $$4 = new tz();
         if ($$2 + 2 <= $$0.length()) {
            String $$5 = $$0.substring($$2 + 1, $$0.indexOf(125, $$2));
            h.split($$5).forEach($$2x -> {
               List<String> $$3x = i.splitToList($$2x);
               if ($$3x.size() == 2) {
                  $$4.a($$3x.get(0), $$3x.get(1));
               } else {
                  j.error("Something went wrong parsing: '{}' -- incorrect gamedata!", $$0);
               }
            });
            $$1.a("Properties", $$4);
         }
      } else {
         $$3 = $$0;
      }

      $$1.a("Name", $$3);
      return $$1;
   }

   public static tz e(tz $$0) {
      int $$1 = ac.b().d().c();
      return a($$0, $$1);
   }

   public static tz a(tz $$0, int $$1) {
      $$0.a("DataVersion", $$1);
      return $$0;
   }

   public static int b(tz $$0, int $$1) {
      return $$0.b("DataVersion", 99) ? $$0.f("DataVersion") : $$1;
   }

   public static int a(Dynamic<?> $$0, int $$1) {
      return $$0.get("DataVersion").asInt($$1);
   }
}
