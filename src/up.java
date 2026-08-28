import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.collect.Comparators;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class up {
   private static final Comparator<ug> b = Comparator.<ug>comparingInt($$0 -> $$0.a(1, 0))
      .thenComparingInt($$0 -> $$0.a(0, 0))
      .thenComparingInt($$0 -> $$0.a(2, 0));
   private static final Comparator<ug> c = Comparator.<ug>comparingDouble($$0 -> $$0.a(1, 0.0))
      .thenComparingDouble($$0 -> $$0.a(0, 0.0))
      .thenComparingDouble($$0 -> $$0.a(2, 0.0));
   private static final Codec<alq<dno>> d = alq.a(mi.i);
   public static final String a = "data";
   private static final char e = '{';
   private static final char f = '}';
   private static final String g = ",";
   private static final char h = ':';
   private static final Splitter i = Splitter.on(",");
   private static final Splitter j = Splitter.on(':').limit(2);
   private static final Logger k = LogUtils.getLogger();
   private static final int l = 2;
   private static final int m = -1;

   private up() {
   }

   @VisibleForTesting
   public static boolean a(@Nullable va $$0, @Nullable va $$1, boolean $$2) {
      if ($$0 == $$1) {
         return true;
      } else if ($$0 == null) {
         return true;
      } else if ($$1 == null) {
         return false;
      } else if (!$$0.getClass().equals($$1.getClass())) {
         return false;
      } else if ($$0 instanceof ua $$3) {
         ua $$4 = (ua)$$1;
         if ($$4.i() < $$3.i()) {
            return false;
         } else {
            for (Entry<String, va> $$5 : $$3.g()) {
               va $$6 = $$5.getValue();
               if (!a($$6, $$4.a($$5.getKey()), $$2)) {
                  return false;
               }
            }

            return true;
         }
      } else {
         if ($$0 instanceof ug $$7 && $$2) {
            ug $$8 = (ug)$$1;
            if ($$7.isEmpty()) {
               return $$8.isEmpty();
            }

            if ($$8.size() < $$7.size()) {
               return false;
            }

            for (va $$9 : $$7) {
               boolean $$10 = false;

               for (va $$11 : $$8) {
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

   public static ebq a(jh<dno> $$0, ua $$1) {
      Optional<? extends jg<dno>> $$2 = $$1.<alq<T>>a("Name", d).flatMap($$0::a);
      if ($$2.isEmpty()) {
         return dnq.a.m();
      } else {
         dno $$3 = $$2.get().a();
         ebq $$4 = $$3.m();
         Optional<ua> $$5 = $$1.m("Properties");
         if ($$5.isPresent()) {
            ebr<dno, ebq> $$6 = $$3.l();

            for (String $$7 : $$5.get().e()) {
               ect<?> $$8 = $$6.a($$7);
               if ($$8 != null) {
                  $$4 = a($$4, $$8, $$7, $$5.get(), $$1);
               }
            }
         }

         return $$4;
      }
   }

   private static <S extends ebs<?, S>, T extends Comparable<T>> S a(S $$0, ect<T> $$1, String $$2, ua $$3, ua $$4) {
      Optional<T> $$5 = $$3.i($$2).flatMap($$1::b);
      if ($$5.isPresent()) {
         return $$0.b($$1, $$5.get());
      } else {
         k.warn("Unable to read property: {} with value: {} for blockstate: {}", new Object[]{$$2, $$3.a($$2), $$4});
         return $$0;
      }
   }

   public static ua a(ebq $$0) {
      ua $$1 = new ua();
      $$1.a("Name", mh.e.b($$0.b()).toString());
      Map<ect<?>, Comparable<?>> $$2 = $$0.G();
      if (!$$2.isEmpty()) {
         ua $$3 = new ua();

         for (Entry<ect<?>, Comparable<?>> $$4 : $$2.entrySet()) {
            ect<?> $$5 = $$4.getKey();
            $$3.a($$5.f(), a($$5, $$4.getValue()));
         }

         $$1.a("Properties", $$3);
      }

      return $$1;
   }

   public static ua a(eya $$0) {
      ua $$1 = new ua();
      $$1.a("Name", mh.c.b($$0.a()).toString());
      Map<ect<?>, Comparable<?>> $$2 = $$0.G();
      if (!$$2.isEmpty()) {
         ua $$3 = new ua();

         for (Entry<ect<?>, Comparable<?>> $$4 : $$2.entrySet()) {
            ect<?> $$5 = $$4.getKey();
            $$3.a($$5.f(), a($$5, $$4.getValue()));
         }

         $$1.a("Properties", $$3);
      }

      return $$1;
   }

   private static <T extends Comparable<T>> String a(ect<T> $$0, Comparable<?> $$1) {
      return $$0.b((T)$$1);
   }

   public static String a(va $$0) {
      return a($$0, false);
   }

   public static String a(va $$0, boolean $$1) {
      return a(new StringBuilder(), $$0, 0, $$1).toString();
   }

   public static StringBuilder a(StringBuilder $$0, va $$1, int $$2, boolean $$3) {
      Objects.requireNonNull($$1);

      return switch ($$1) {
         case ur $$4 -> $$0.append($$4);
         case uc $$5 -> $$0;
         case tx $$6 -> {
            byte[] $$7 = $$6.e();
            int $$8 = $$7.length;
            a($$2, $$0).append("byte[").append($$8).append("] {\n");
            if ($$3) {
               a($$2 + 1, $$0);

               for (int $$9 = 0; $$9 < $$7.length; $$9++) {
                  if ($$9 != 0) {
                     $$0.append(',');
                  }

                  if ($$9 % 16 == 0 && $$9 / 16 > 0) {
                     $$0.append('\n');
                     if ($$9 < $$7.length) {
                        a($$2 + 1, $$0);
                     }
                  } else if ($$9 != 0) {
                     $$0.append(' ');
                  }

                  $$0.append(String.format(Locale.ROOT, "0x%02X", $$7[$$9] & 255));
               }
            } else {
               a($$2 + 1, $$0).append(" // Skipped, supply withBinaryBlobs true");
            }

            $$0.append('\n');
            a($$2, $$0).append('}');
            yield $$0;
         }
         case ug $$10 -> {
            int $$11 = $$10.size();
            a($$2, $$0).append("list").append("[").append($$11).append("] [");
            if ($$11 != 0) {
               $$0.append('\n');
            }

            for (int $$12 = 0; $$12 < $$11; $$12++) {
               if ($$12 != 0) {
                  $$0.append(",\n");
               }

               a($$2 + 1, $$0);
               a($$0, $$10.c($$12), $$2 + 1, $$3);
            }

            if ($$11 != 0) {
               $$0.append('\n');
            }

            a($$2, $$0).append(']');
            yield $$0;
         }
         case ue $$13 -> {
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
            yield $$0;
         }
         case ua $$19 -> {
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
            yield $$0;
         }
         case uh $$25 -> {
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
            yield $$0;
         }
         default -> throw new MatchException(null, null);
      };
   }

   private static StringBuilder a(int $$0, StringBuilder $$1) {
      int $$2 = $$1.lastIndexOf("\n") + 1;
      int $$3 = $$1.length() - $$2;

      for (int $$4 = 0; $$4 < 2 * $$0 - $$3; $$4++) {
         $$1.append(' ');
      }

      return $$1;
   }

   public static xg b(va $$0) {
      return new vf("").a($$0);
   }

   public static String a(ua $$0) {
      return new uw().a((va)b($$0));
   }

   public static ua a(String $$0) throws CommandSyntaxException {
      return c(vb.a($$0));
   }

   @VisibleForTesting
   static ua b(ua $$0) {
      Optional<ug> $$1 = $$0.o("palettes");
      ug $$2;
      if ($$1.isPresent()) {
         $$2 = $$1.get().f(0);
      } else {
         $$2 = $$0.p("palette");
      }

      ug $$4 = $$2.j().map(up::d).map(uy::a).collect(Collectors.toCollection(ug::new));
      $$0.a("palette", $$4);
      if ($$1.isPresent()) {
         ug $$5 = new ug();
         $$1.get().stream().flatMap($$0x -> $$0x.t_().stream()).forEach($$2x -> {
            ua $$3x = new ua();

            for (int $$4x = 0; $$4x < $$2x.size(); $$4x++) {
               $$3x.a($$4.m($$4x).orElseThrow(), d($$2x.a($$4x).orElseThrow()));
            }

            $$5.add($$3x);
         });
         $$0.a("palettes", $$5);
      }

      Optional<ug> $$6 = $$0.o("entities");
      if ($$6.isPresent()) {
         ug $$7 = $$6.get().j().sorted(Comparator.comparing($$0x -> $$0x.o("pos"), Comparators.emptiesLast(c))).collect(Collectors.toCollection(ug::new));
         $$0.a("entities", $$7);
      }

      ug $$8 = $$0.o("blocks")
         .stream()
         .flatMap(ug::j)
         .sorted(Comparator.comparing($$0x -> $$0x.o("pos"), Comparators.emptiesLast(b)))
         .peek($$1x -> $$1x.a("state", $$4.m($$1x.b("state", 0)).orElseThrow()))
         .collect(Collectors.toCollection(ug::new));
      $$0.a("data", $$8);
      $$0.r("blocks");
      return $$0;
   }

   @VisibleForTesting
   static ua c(ua $$0) {
      ug $$1 = $$0.p("palette");
      Map<String, va> $$2 = $$1.stream().flatMap($$0x -> $$0x.p_().stream()).collect(ImmutableMap.toImmutableMap(Function.identity(), up::b));
      Optional<ug> $$3 = $$0.o("palettes");
      if ($$3.isPresent()) {
         $$0.a(
            "palettes",
            $$3.get()
               .j()
               .map($$1x -> $$2.keySet().stream().map($$1xx -> $$1x.i($$1xx).orElseThrow()).map(up::b).collect(Collectors.toCollection(ug::new)))
               .collect(Collectors.toCollection(ug::new))
         );
         $$0.r("palette");
      } else {
         $$0.a("palette", $$2.values().stream().collect(Collectors.toCollection(ug::new)));
      }

      Optional<ug> $$4 = $$0.o("data");
      if ($$4.isPresent()) {
         Object2IntMap<String> $$5 = new Object2IntOpenHashMap();
         $$5.defaultReturnValue(-1);

         for (int $$6 = 0; $$6 < $$1.size(); $$6++) {
            $$5.put($$1.m($$6).orElseThrow(), $$6);
         }

         ug $$7 = $$4.get();

         for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
            ua $$9 = $$7.a($$8).orElseThrow();
            String $$10 = $$9.i("state").orElseThrow();
            int $$11 = $$5.getInt($$10);
            if ($$11 == -1) {
               throw new IllegalStateException("Entry " + $$10 + " missing from palette");
            }

            $$9.a("state", $$11);
         }

         $$0.a("blocks", $$7);
         $$0.r("data");
      }

      return $$0;
   }

   @VisibleForTesting
   static String d(ua $$0) {
      StringBuilder $$1 = new StringBuilder($$0.i("Name").orElseThrow());
      $$0.m("Properties")
         .ifPresent(
            $$1x -> {
               String $$2 = $$1x.g()
                  .stream()
                  .sorted(Entry.comparingByKey())
                  .map($$0xx -> (String)$$0xx.getKey() + ":" + ((va)$$0xx.getValue()).p_().orElseThrow())
                  .collect(Collectors.joining(","));
               $$1.append('{').append($$2).append('}');
            }
         );
      return $$1.toString();
   }

   @VisibleForTesting
   static ua b(String $$0) {
      ua $$1 = new ua();
      int $$2 = $$0.indexOf(123);
      String $$3;
      if ($$2 >= 0) {
         $$3 = $$0.substring(0, $$2);
         ua $$4 = new ua();
         if ($$2 + 2 <= $$0.length()) {
            String $$5 = $$0.substring($$2 + 1, $$0.indexOf(125, $$2));
            i.split($$5).forEach($$2x -> {
               List<String> $$3x = j.splitToList($$2x);
               if ($$3x.size() == 2) {
                  $$4.a($$3x.get(0), $$3x.get(1));
               } else {
                  k.error("Something went wrong parsing: '{}' -- incorrect gamedata!", $$0);
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

   public static ua e(ua $$0) {
      int $$1 = ac.b().d().c();
      return a($$0, $$1);
   }

   public static ua a(ua $$0, int $$1) {
      $$0.a("DataVersion", $$1);
      return $$0;
   }

   public static int b(ua $$0, int $$1) {
      return $$0.b("DataVersion", $$1);
   }

   public static int a(Dynamic<?> $$0, int $$1) {
      return $$0.get("DataVersion").asInt($$1);
   }
}
