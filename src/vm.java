import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class vm {
   private static final Comparator<vd> b = Comparator.<vd>comparingInt($$0 -> $$0.e(1)).thenComparingInt($$0 -> $$0.e(0)).thenComparingInt($$0 -> $$0.e(2));
   private static final Comparator<vd> c = Comparator.<vd>comparingDouble($$0 -> $$0.h(1))
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

   private vm() {
   }

   @VisibleForTesting
   public static boolean a(@Nullable vu $$0, @Nullable vu $$1, boolean $$2) {
      if ($$0 == $$1) {
         return true;
      } else if ($$0 == null) {
         return true;
      } else if ($$1 == null) {
         return false;
      } else if (!$$0.getClass().equals($$1.getClass())) {
         return false;
      } else if ($$0 instanceof ux $$3) {
         ux $$4 = (ux)$$1;
         if ($$4.f() < $$3.f()) {
            return false;
         } else {
            for (String $$5 : $$3.e()) {
               vu $$6 = $$3.c($$5);
               if (!a($$6, $$4.c($$5), $$2)) {
                  return false;
               }
            }

            return true;
         }
      } else {
         if ($$0 instanceof vd $$7 && $$2) {
            vd $$8 = (vd)$$1;
            if ($$7.isEmpty()) {
               return $$8.isEmpty();
            }

            if ($$8.size() < $$7.size()) {
               return false;
            }

            for (vu $$9 : $$7) {
               boolean $$10 = false;

               for (vu $$11 : $$8) {
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

   public static vb a(UUID $$0) {
      return new vb(kk.a($$0));
   }

   public static UUID a(vu $$0) {
      if ($$0.c() != vb.a) {
         throw new IllegalArgumentException("Expected UUID-Tag to be of type " + vb.a.a() + ", but found " + $$0.c().a() + ".");
      } else {
         int[] $$1 = ((vb)$$0).g();
         if ($$1.length != 4) {
            throw new IllegalArgumentException("Expected UUID-Array to be of length 4, but found " + $$1.length + ".");
         } else {
            return kk.a($$1);
         }
      }
   }

   public static Optional<jh> a(ux $$0, String $$1) {
      int[] $$2 = $$0.n($$1);
      return $$2.length == 3 ? Optional.of(new jh($$2[0], $$2[1], $$2[2])) : Optional.empty();
   }

   public static vu a(jh $$0) {
      return new vb(new int[]{$$0.u(), $$0.v(), $$0.w()});
   }

   public static dxu a(jr<dkl> $$0, ux $$1) {
      if (!$$1.b("Name", 8)) {
         return dkn.a.m();
      } else {
         alz $$2 = alz.a($$1.l("Name"));
         Optional<? extends jq<dkl>> $$3 = $$0.a(aly.a(mb.f, $$2));
         if ($$3.isEmpty()) {
            return dkn.a.m();
         } else {
            dkl $$4 = $$3.get().a();
            dxu $$5 = $$4.m();
            if ($$1.b("Properties", 10)) {
               ux $$6 = $$1.p("Properties");
               dxv<dkl, dxu> $$7 = $$4.l();

               for (String $$8 : $$6.e()) {
                  dyw<?> $$9 = $$7.a($$8);
                  if ($$9 != null) {
                     $$5 = a($$5, $$9, $$8, $$6, $$1);
                  }
               }
            }

            return $$5;
         }
      }
   }

   private static <S extends dxw<?, S>, T extends Comparable<T>> S a(S $$0, dyw<T> $$1, String $$2, ux $$3, ux $$4) {
      Optional<T> $$5 = $$1.b($$3.l($$2));
      if ($$5.isPresent()) {
         return $$0.b($$1, $$5.get());
      } else {
         j.warn("Unable to read property: {} with value: {} for blockstate: {}", new Object[]{$$2, $$3.l($$2), $$4});
         return $$0;
      }
   }

   public static ux a(dxu $$0) {
      ux $$1 = new ux();
      $$1.a("Name", ma.e.b($$0.b()).toString());
      Map<dyw<?>, Comparable<?>> $$2 = $$0.G();
      if (!$$2.isEmpty()) {
         ux $$3 = new ux();

         for (Entry<dyw<?>, Comparable<?>> $$4 : $$2.entrySet()) {
            dyw<?> $$5 = $$4.getKey();
            $$3.a($$5.f(), a($$5, $$4.getValue()));
         }

         $$1.a("Properties", $$3);
      }

      return $$1;
   }

   public static ux a(etw $$0) {
      ux $$1 = new ux();
      $$1.a("Name", ma.c.b($$0.a()).toString());
      Map<dyw<?>, Comparable<?>> $$2 = $$0.G();
      if (!$$2.isEmpty()) {
         ux $$3 = new ux();

         for (Entry<dyw<?>, Comparable<?>> $$4 : $$2.entrySet()) {
            dyw<?> $$5 = $$4.getKey();
            $$3.a($$5.f(), a($$5, $$4.getValue()));
         }

         $$1.a("Properties", $$3);
      }

      return $$1;
   }

   private static <T extends Comparable<T>> String a(dyw<T> $$0, Comparable<?> $$1) {
      return $$0.b((T)$$1);
   }

   public static String b(vu $$0) {
      return a($$0, false);
   }

   public static String a(vu $$0, boolean $$1) {
      return a(new StringBuilder(), $$0, 0, $$1).toString();
   }

   public static StringBuilder a(StringBuilder $$0, vu $$1, int $$2, boolean $$3) {
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
            uu $$4 = (uu)$$1;
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
            vd $$8 = (vd)$$1;
            int $$9 = $$8.size();
            int $$10 = $$8.f();
            String $$11 = $$10 == 0 ? "undefined" : vx.a($$10).b();
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
            ux $$19 = (ux)$$1;
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
               a($$0, $$19.c($$24), $$2 + 1, $$3);
            }

            if (!$$20.isEmpty()) {
               $$0.append('\n');
            }

            a($$2, $$0).append('}');
            break;
         case 11:
            vb $$13 = (vb)$$1;
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
            ve $$25 = (ve)$$1;
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

   public static xv c(vu $$0) {
      return new vz("").a($$0);
   }

   public static String a(ux $$0) {
      return new vq().a((vu)b($$0));
   }

   public static ux a(String $$0) throws CommandSyntaxException {
      return c(vv.a($$0));
   }

   @VisibleForTesting
   static ux b(ux $$0) {
      boolean $$1 = $$0.b("palettes", 9);
      vd $$2;
      if ($$1) {
         $$2 = $$0.c("palettes", 9).b(0);
      } else {
         $$2 = $$0.c("palette", 10);
      }

      vd $$4 = $$2.stream().map(ux.class::cast).map(vm::d).map(vs::a).collect(Collectors.toCollection(vd::new));
      $$0.a("palette", $$4);
      if ($$1) {
         vd $$5 = new vd();
         vd $$6 = $$0.c("palettes", 9);
         $$6.stream().map(vd.class::cast).forEach($$2x -> {
            ux $$3x = new ux();

            for (int $$4x = 0; $$4x < $$2x.size(); $$4x++) {
               $$3x.a($$4.j($$4x), d($$2x.a($$4x)));
            }

            $$5.add($$3x);
         });
         $$0.a("palettes", $$5);
      }

      if ($$0.b("entities", 9)) {
         vd $$7 = $$0.c("entities", 10);
         vd $$8 = $$7.stream().map(ux.class::cast).sorted(Comparator.comparing($$0x -> $$0x.c("pos", 6), c)).collect(Collectors.toCollection(vd::new));
         $$0.a("entities", $$8);
      }

      vd $$9 = $$0.c("blocks", 10)
         .stream()
         .map(ux.class::cast)
         .sorted(Comparator.comparing($$0x -> $$0x.c("pos", 3), b))
         .peek($$1x -> $$1x.a("state", $$4.j($$1x.h("state"))))
         .collect(Collectors.toCollection(vd::new));
      $$0.a("data", $$9);
      $$0.r("blocks");
      return $$0;
   }

   @VisibleForTesting
   static ux c(ux $$0) {
      vd $$1 = $$0.c("palette", 8);
      Map<String, vu> $$2 = $$1.stream().map(vs.class::cast).map(vs::u_).collect(ImmutableMap.toImmutableMap(Function.identity(), vm::b));
      if ($$0.b("palettes", 9)) {
         $$0.a(
            "palettes",
            $$0.c("palettes", 10)
               .stream()
               .map(ux.class::cast)
               .map($$1x -> $$2.keySet().stream().map($$1x::l).map(vm::b).collect(Collectors.toCollection(vd::new)))
               .collect(Collectors.toCollection(vd::new))
         );
         $$0.r("palette");
      } else {
         $$0.a("palette", $$2.values().stream().collect(Collectors.toCollection(vd::new)));
      }

      if ($$0.b("data", 9)) {
         Object2IntMap<String> $$3 = new Object2IntOpenHashMap();
         $$3.defaultReturnValue(-1);

         for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
            $$3.put($$1.j($$4), $$4);
         }

         vd $$5 = $$0.c("data", 10);

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            ux $$7 = $$5.a($$6);
            String $$8 = $$7.l("state");
            int $$9 = $$3.getInt($$8);
            if ($$9 == -1) {
               throw new IllegalStateException("Entry " + $$8 + " missing from palette");
            }

            $$7.a("state", $$9);
         }

         $$0.a("blocks", $$5);
         $$0.r("data");
      }

      return $$0;
   }

   @VisibleForTesting
   static String d(ux $$0) {
      StringBuilder $$1 = new StringBuilder($$0.l("Name"));
      if ($$0.b("Properties", 10)) {
         ux $$2 = $$0.p("Properties");
         String $$3 = $$2.e().stream().sorted().map($$1x -> $$1x + ":" + $$2.c($$1x).u_()).collect(Collectors.joining(","));
         $$1.append('{').append($$3).append('}');
      }

      return $$1.toString();
   }

   @VisibleForTesting
   static ux b(String $$0) {
      ux $$1 = new ux();
      int $$2 = $$0.indexOf(123);
      String $$3;
      if ($$2 >= 0) {
         $$3 = $$0.substring(0, $$2);
         ux $$4 = new ux();
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

   public static ux e(ux $$0) {
      int $$1 = ab.b().d().c();
      return a($$0, $$1);
   }

   public static ux a(ux $$0, int $$1) {
      $$0.a("DataVersion", $$1);
      return $$0;
   }

   public static int b(ux $$0, int $$1) {
      return $$0.b("DataVersion", 99) ? $$0.h("DataVersion") : $$1;
   }
}
