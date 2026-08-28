import com.google.common.base.Splitter;
import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gsm {
   private static final Logger c = LogUtils.getLogger();
   static final int a = -1;
   private static final int d = 0;
   public static final akk b = akk.a("blockstates");
   private static final Splitter e = Splitter.on(',');
   private static final Splitter f = Splitter.on('=').limit(2);
   private static final dtd<dfy, dtc> g = new dtd.a<dfy, dtc>(dga.a).a(dtt.a("map")).a(dfy::o, dtc::new);
   private static final Map<akr, dtd<dfy, dtc>> h = Map.of(akr.b("item_frame"), g, akr.b("glow_item_frame"), g);
   private final Map<akr, List<gsm.b>> i;
   private final bnf j;
   private final fho k;
   private final BiConsumer<gss, gsw> l;
   private int m = 1;
   private final Object2IntMap<dtc> n = ad.a(new Object2IntOpenHashMap(), $$0x -> $$0x.defaultReturnValue(-1));
   private final gsm.c o;
   private final gga.a p = new gga.a();

   public gsm(Map<akr, List<gsm.b>> $$0, bnf $$1, gsw $$2, fho $$3, BiConsumer<gss, gsw> $$4) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$3;
      this.l = $$4;
      gsm.d $$5 = new gsm.d(List.of($$2), List.of());
      this.o = new gsm.c($$2, () -> $$5);
   }

   public void a() {
      this.j.a("static_definitions");
      h.forEach(this::a);
      this.j.b("blocks");

      for (dfy $$0 : lt.e) {
         this.a($$0.s().h().a(), $$0.l());
      }

      this.j.c();
   }

   private void a(akr $$0, dtd<dfy, dtc> $$1) {
      this.p.a($$1);
      List<duf<?>> $$2 = List.copyOf(this.k.a($$1.c()));
      List<dtc> $$3 = $$1.a();
      Map<gss, dtc> $$4 = new HashMap<>();
      $$3.forEach($$2x -> $$4.put(gfq.a($$0, $$2x), $$2x));
      Map<dtc, gsm.c> $$5 = new HashMap<>();
      akr $$6 = b.a($$0);

      try {
         for (gsm.b $$7 : this.i.getOrDefault($$6, List.of())) {
            gga $$8 = $$7.a($$0, this.p);
            Map<dtc, gsm.c> $$9 = new IdentityHashMap<>();
            ggm $$10;
            if ($$8.c()) {
               $$10 = $$8.d();
               $$3.forEach($$3x -> $$9.put($$3x, new gsm.c($$10, () -> gsm.d.a($$3x, $$10, $$2))));
            } else {
               $$10 = null;
            }

            $$8.a()
               .forEach(
                  ($$8x, $$9x) -> {
                     try {
                        $$3.stream()
                           .filter(a($$1, $$8x))
                           .forEach(
                              $$5xx -> {
                                 gsm.c $$6xx = $$9.put($$5xx, new gsm.c($$9x, () -> gsm.d.a($$5xx, $$9x, $$2)));
                                 if ($$6xx != null && $$6xx.a != $$10) {
                                    $$9.put($$5xx, this.o);
                                    throw new RuntimeException(
                                       "Overlapping definition with: "
                                          + $$8.a().entrySet().stream().filter($$1xxx -> $$1xxx.getValue() == $$6xx.a).findFirst().get().getKey()
                                    );
                                 }
                              }
                           );
                     } catch (Exception var12x) {
                        c.warn(
                           "Exception loading blockstate definition: '{}' in resourcepack: '{}' for variant: '{}': {}",
                           new Object[]{$$6, $$7.a, $$8x, var12x.getMessage()}
                        );
                     }
                  }
               );
            $$5.putAll($$9);
         }
      } catch (gsm.a var18) {
         c.warn("{}", var18.getMessage());
      } catch (Exception var19) {
         c.warn("Exception loading blockstate definition: '{}'", $$6, var19);
      } finally {
         Map<gsm.d, Set<dtc>> $$17 = new HashMap<>();
         $$4.forEach(($$3x, $$4x) -> {
            gsm.c $$5x = $$5.get($$4x);
            if ($$5x == null) {
               c.warn("Exception loading blockstate definition: '{}' missing model for variant: '{}'", $$6, $$3x);
               $$5x = this.o;
            }

            this.l.accept($$3x, $$5x.a);

            try {
               gsm.d $$6x = $$5x.b().get();
               $$17.computeIfAbsent($$6x, $$0xx -> Sets.newIdentityHashSet()).add($$4x);
            } catch (Exception var8) {
               c.warn("Exception evaluating model definition: '{}'", $$3x, var8);
            }
         });
         $$17.forEach(($$0x, $$1x) -> {
            Iterator<dtc> $$2x = $$1x.iterator();

            while ($$2x.hasNext()) {
               dtc $$3x = $$2x.next();
               if ($$3x.l() != dmf.c) {
                  $$2x.remove();
                  this.n.put($$3x, 0);
               }
            }

            if ($$1x.size() > 1) {
               this.a($$1x);
            }
         });
      }
   }

   private static Predicate<dtc> a(dtd<dfy, dtc> $$0, String $$1) {
      Map<duf<?>, Comparable<?>> $$2 = new HashMap<>();

      for (String $$3 : e.split($$1)) {
         Iterator<String> $$4 = f.split($$3).iterator();
         if ($$4.hasNext()) {
            String $$5 = $$4.next();
            duf<?> $$6 = $$0.a($$5);
            if ($$6 != null && $$4.hasNext()) {
               String $$7 = $$4.next();
               Comparable<?> $$8 = a((duf<Comparable<?>>)$$6, $$7);
               if ($$8 == null) {
                  throw new RuntimeException("Unknown value: '" + $$7 + "' for blockstate property: '" + $$5 + "' " + $$6.a());
               }

               $$2.put($$6, $$8);
            } else if (!$$5.isEmpty()) {
               throw new RuntimeException("Unknown blockstate property: '" + $$5 + "'");
            }
         }
      }

      dfy $$9 = $$0.c();
      return $$2x -> {
         if ($$2x != null && $$2x.a($$9)) {
            for (Entry<duf<?>, Comparable<?>> $$3x : $$2.entrySet()) {
               if (!Objects.equals($$2x.c($$3x.getKey()), $$3x.getValue())) {
                  return false;
               }
            }

            return true;
         } else {
            return false;
         }
      };
   }

   @Nullable
   static <T extends Comparable<T>> T a(duf<T> $$0, String $$1) {
      return $$0.b($$1).orElse(null);
   }

   private void a(Iterable<dtc> $$0) {
      int $$1 = this.m++;
      $$0.forEach($$1x -> this.n.put($$1x, $$1));
   }

   public Object2IntMap<dtc> b() {
      return this.n;
   }

   static class a extends RuntimeException {
      public a(String $$0) {
         super($$0);
      }
   }

   public static record b(String a, JsonElement b) {

      gga a(akr $$0, gga.a $$1) {
         try {
            return gga.a($$1, this.b);
         } catch (Exception var4) {
            throw new gsm.a(
               String.format(Locale.ROOT, "Exception loading blockstate definition: '%s' in resourcepack: '%s': %s", $$0, this.a, var4.getMessage())
            );
         }
      }
   }

   static record c(gsw a, Supplier<gsm.d> b) {
   }

   static record d(List<gsw> a, List<Object> b) {
      public static gsm.d a(dtc $$0, ggm $$1, Collection<duf<?>> $$2) {
         dtd<dfy, dtc> $$3 = $$0.b().l();
         List<gsw> $$4 = $$1.a().stream().filter($$2x -> $$2x.a($$3).test($$0)).map(ggo::a).collect(Collectors.toUnmodifiableList());
         List<Object> $$5 = a($$0, $$2);
         return new gsm.d($$4, $$5);
      }

      public static gsm.d a(dtc $$0, gsw $$1, Collection<duf<?>> $$2) {
         List<Object> $$3 = a($$0, $$2);
         return new gsm.d(List.of($$1), $$3);
      }

      private static List<Object> a(dtc $$0, Collection<duf<?>> $$1) {
         return $$1.stream().map($$0::c).collect(Collectors.toUnmodifiableList());
      }
   }
}
