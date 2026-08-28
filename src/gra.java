import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gra {
   public static final gqy a = new gqy(got.e, new alb("block/fire_0"));
   public static final gqy b = new gqy(got.e, new alb("block/fire_1"));
   public static final gqy c = new gqy(got.e, new alb("block/lava_flow"));
   public static final gqy d = new gqy(got.e, new alb("block/water_flow"));
   public static final gqy e = new gqy(got.e, new alb("block/water_overlay"));
   public static final gqy f = new gqy(gdy.c, new alb("entity/banner_base"));
   public static final gqy g = new gqy(gdy.d, new alb("entity/shield_base"));
   public static final gqy h = new gqy(gdy.d, new alb("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<alb> j = IntStream.range(0, 10).mapToObj($$0 -> new alb("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<alb> k = j.stream().map($$0 -> new alb("textures/" + $$0.a() + ".png")).collect(Collectors.toList());
   public static final List<gdr> l = k.stream().map(gdr::s).collect(Collectors.toList());
   static final int m = -1;
   private static final int t = 0;
   private static final Logger u = LogUtils.getLogger();
   private static final String v = "builtin/";
   private static final String w = "builtin/generated";
   private static final String x = "builtin/entity";
   private static final String y = "missing";
   public static final grc n = grc.c("builtin/missing", "missing");
   public static final aku o = aku.a("blockstates");
   public static final aku p = aku.a("models");
   @VisibleForTesting
   public static final String q = ("{    'textures': {       'particle': '"
         + gok.b().a()
         + "',       'missingno': '"
         + gok.b().a()
         + "'    },    'elements': [         {  'from': [ 0, 0, 0 ],            'to': [ 16, 16, 16 ],            'faces': {                'down':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'down',  'texture': '#missingno' },                'up':    { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'up',    'texture': '#missingno' },                'north': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'north', 'texture': '#missingno' },                'south': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'south', 'texture': '#missingno' },                'west':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'west',  'texture': '#missingno' },                'east':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'east',  'texture': '#missingno' }            }        }    ]}")
      .replace('\'', '"');
   private static final Map<String, String> z = Maps.newHashMap(ImmutableMap.of("missing", q));
   private static final Splitter A = Splitter.on(',');
   private static final Splitter B = Splitter.on('=').limit(2);
   public static final gel r = ac.a(gel.a("{\"gui_light\": \"front\"}"), $$0 -> $$0.c = "generation marker");
   public static final gel s = ac.a(gel.a("{\"gui_light\": \"side\"}"), $$0 -> $$0.c = "block entity marker");
   private static final dry<deu, drx> C = new dry.a<deu, drx>(dew.a).a(dso.a("map")).a(deu::n, drx::new);
   static final geo D = new geo();
   private static final Map<alb, dry<deu, drx>> E = ImmutableMap.of(new alb("item_frame"), C, new alb("glow_item_frame"), C);
   private final fgd F;
   private final Map<alb, gel> G;
   private final Map<alb, List<gra.c>> H;
   private final Set<alb> I = Sets.newHashSet();
   private final gem.a J = new gem.a();
   private final Map<alb, grg> K = Maps.newHashMap();
   final Map<gra.a, gqv> L = Maps.newHashMap();
   private final Map<alb, grg> M = Maps.newHashMap();
   private final Map<alb, gqv> N = Maps.newHashMap();
   private int O = 1;
   private final Object2IntMap<drx> P = ac.a(new Object2IntOpenHashMap(), $$0x -> $$0x.defaultReturnValue(-1));

   public gra(fgd $$0, bnd $$1, Map<alb, gel> $$2, Map<alb, List<gra.c>> $$3) {
      this.F = $$0;
      this.G = $$2;
      this.H = $$3;
      $$1.a("missing_model");

      try {
         this.K.put(n, this.c(n));
         this.a(n);
      } catch (IOException var7) {
         u.error("Error loading missing model, should never happen :(", var7);
         throw new RuntimeException(var7);
      }

      $$1.b("static_definitions");
      E.forEach(($$0x, $$1x) -> $$1x.a().forEach($$1xx -> this.a(gec.a($$0x, $$1xx))));
      $$1.b("blocks");

      for (deu $$5 : lp.e) {
         $$5.l().a().forEach($$0x -> this.a(gec.c($$0x)));
      }

      $$1.b("items");

      for (alb $$6 : lp.h.e()) {
         this.a(new grc($$6, "inventory"));
      }

      $$1.b("special");
      this.a(gjq.i);
      this.a(gjq.j);
      this.M.values().forEach($$0x -> $$0x.a(this::a));
      $$1.c();
   }

   public void a(BiFunction<alb, gqy, gou> $$0) {
      this.M.keySet().forEach($$1 -> {
         gqv $$2 = null;

         try {
            $$2 = new gra.d($$0, $$1).a($$1, gqw.a);
         } catch (Exception var5) {
            u.warn("Unable to bake model: '{}': {}", $$1, var5);
         }

         if ($$2 != null) {
            this.N.put($$1, $$2);
         }
      });
   }

   private static Predicate<drx> a(dry<deu, drx> $$0, String $$1) {
      Map<dta<?>, Comparable<?>> $$2 = Maps.newHashMap();

      for (String $$3 : A.split($$1)) {
         Iterator<String> $$4 = B.split($$3).iterator();
         if ($$4.hasNext()) {
            String $$5 = $$4.next();
            dta<?> $$6 = $$0.a($$5);
            if ($$6 != null && $$4.hasNext()) {
               String $$7 = $$4.next();
               Comparable<?> $$8 = a((dta<Comparable<?>>)$$6, $$7);
               if ($$8 == null) {
                  throw new RuntimeException("Unknown value: '" + $$7 + "' for blockstate property: '" + $$5 + "' " + $$6.a());
               }

               $$2.put($$6, $$8);
            } else if (!$$5.isEmpty()) {
               throw new RuntimeException("Unknown blockstate property: '" + $$5 + "'");
            }
         }
      }

      deu $$9 = $$0.c();
      return $$2x -> {
         if ($$2x != null && $$2x.a($$9)) {
            for (Entry<dta<?>, Comparable<?>> $$3x : $$2.entrySet()) {
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
   static <T extends Comparable<T>> T a(dta<T> $$0, String $$1) {
      return $$0.b($$1).orElse(null);
   }

   public grg a(alb $$0) {
      if (this.K.containsKey($$0)) {
         return this.K.get($$0);
      } else if (this.I.contains($$0)) {
         throw new IllegalStateException("Circular reference while loading " + $$0);
      } else {
         this.I.add($$0);
         grg $$1 = this.K.get(n);

         while (!this.I.isEmpty()) {
            alb $$2 = this.I.iterator().next();

            try {
               if (!this.K.containsKey($$2)) {
                  this.b($$2);
               }
            } catch (gra.b var9) {
               u.warn(var9.getMessage());
               this.K.put($$2, $$1);
            } catch (Exception var10) {
               u.warn("Unable to load model: '{}' referenced from: {}: {}", new Object[]{$$2, $$0, var10});
               this.K.put($$2, $$1);
            } finally {
               this.I.remove($$2);
            }
         }

         return this.K.getOrDefault($$0, $$1);
      }
   }

   private void b(alb $$0) throws Exception {
      if (!($$0 instanceof grc $$1)) {
         this.a($$0, this.c($$0));
      } else {
         if (Objects.equals($$1.f(), "inventory")) {
            alb $$2 = $$0.d("item/");
            gel $$3 = this.c($$2);
            this.a($$1, $$3);
            this.K.put($$2, $$3);
         } else {
            alb $$4 = new alb($$0.b(), $$0.a());
            dry<deu, drx> $$5 = Optional.ofNullable(E.get($$4)).orElseGet(() -> lp.e.a($$4).l());
            this.J.a($$5);
            List<dta<?>> $$6 = ImmutableList.copyOf(this.F.a($$5.c()));
            ImmutableList<drx> $$7 = $$5.a();
            Map<grc, drx> $$8 = Maps.newHashMap();
            $$7.forEach($$2 -> $$8.put(gec.a($$4, $$2), $$2));
            Map<drx, Pair<grg, Supplier<gra.e>>> $$9 = Maps.newHashMap();
            alb $$10 = o.a($$0);
            grg $$11 = this.K.get(n);
            gra.e $$12 = new gra.e(ImmutableList.of($$11), ImmutableList.of());
            Pair<grg, Supplier<gra.e>> $$13 = Pair.of($$11, (Supplier<gra.e>)() -> $$12);

            try {
               for (Pair<String, gem> $$15 : this.H
                  .getOrDefault($$10, List.of())
                  .stream()
                  .map(
                     $$1x -> {
                        try {
                           return Pair.of($$1x.a, gem.a(this.J, $$1x.b));
                        } catch (Exception var4x) {
                           throw new gra.b(
                              String.format(
                                 Locale.ROOT, "Exception loading blockstate definition: '%s' in resourcepack: '%s': %s", $$10, $$1x.a, var4x.getMessage()
                              )
                           );
                        }
                     }
                  )
                  .toList()) {
                  gem $$16 = (gem)$$15.getSecond();
                  Map<drx, Pair<grg, Supplier<gra.e>>> $$17 = Maps.newIdentityHashMap();
                  gey $$18;
                  if ($$16.c()) {
                     $$18 = $$16.d();
                     $$7.forEach($$3 -> $$17.put($$3, Pair.of($$18, (Supplier<gra.e>)() -> gra.e.a($$3, $$18, $$6))));
                  } else {
                     $$18 = null;
                  }

                  $$16.a()
                     .forEach(
                        ($$9x, $$10x) -> {
                           try {
                              $$7.stream()
                                 .filter(a($$5, $$9x))
                                 .forEach(
                                    $$6xx -> {
                                       Pair<grg, Supplier<gra.e>> $$7xx = $$17.put($$6xx, Pair.of($$10x, (Supplier<gra.e>)() -> gra.e.a($$6xx, $$10x, $$6)));
                                       if ($$7xx != null && $$7xx.getFirst() != $$18) {
                                          $$17.put($$6xx, $$13);
                                          throw new RuntimeException(
                                             "Overlapping definition with: "
                                                + $$16.a()
                                                   .entrySet()
                                                   .stream()
                                                   .filter($$1xxx -> $$1xxx.getValue() == $$7xx.getFirst())
                                                   .findFirst()
                                                   .get()
                                                   .getKey()
                                          );
                                       }
                                    }
                                 );
                           } catch (Exception var12x) {
                              u.warn(
                                 "Exception loading blockstate definition: '{}' in resourcepack: '{}' for variant: '{}': {}",
                                 new Object[]{$$10, $$15.getFirst(), $$9x, var12x.getMessage()}
                              );
                           }
                        }
                     );
                  $$9.putAll($$17);
               }
            } catch (gra.b var24) {
               throw var24;
            } catch (Exception var25) {
               throw new gra.b(String.format(Locale.ROOT, "Exception loading blockstate definition: '%s': %s", $$10, var25));
            } finally {
               Map<gra.e, Set<drx>> $$23 = Maps.newHashMap();
               $$8.forEach(($$4x, $$5x) -> {
                  Pair<grg, Supplier<gra.e>> $$6x = $$9.get($$5x);
                  if ($$6x == null) {
                     u.warn("Exception loading blockstate definition: '{}' missing model for variant: '{}'", $$10, $$4x);
                     $$6x = $$13;
                  }

                  this.a($$4x, (grg)$$6x.getFirst());

                  try {
                     gra.e $$7x = (gra.e)((Supplier)$$6x.getSecond()).get();
                     $$23.computeIfAbsent($$7x, $$0xx -> Sets.newIdentityHashSet()).add($$5x);
                  } catch (Exception var9x) {
                     u.warn("Exception evaluating model definition: '{}'", $$4x, var9x);
                  }
               });
               $$23.forEach(($$0x, $$1x) -> {
                  Iterator<drx> $$2 = $$1x.iterator();

                  while ($$2.hasNext()) {
                     drx $$3 = $$2.next();
                     if ($$3.l() != dla.c) {
                        $$2.remove();
                        this.P.put($$3, 0);
                     }
                  }

                  if ($$1x.size() > 1) {
                     this.a($$1x);
                  }
               });
            }
         }
      }
   }

   private void a(alb $$0, grg $$1) {
      this.K.put($$0, $$1);
      this.I.addAll($$1.f());
   }

   private void a(grc $$0) {
      grg $$1 = this.a((alb)$$0);
      this.K.put($$0, $$1);
      this.M.put($$0, $$1);
   }

   private void a(Iterable<drx> $$0) {
      int $$1 = this.O++;
      $$0.forEach($$1x -> this.P.put($$1x, $$1));
   }

   private gel c(alb $$0) throws IOException {
      String $$1 = $$0.a();
      if ("builtin/generated".equals($$1)) {
         return r;
      } else if ("builtin/entity".equals($$1)) {
         return s;
      } else if ($$1.startsWith("builtin/")) {
         String $$2 = $$1.substring("builtin/".length());
         String $$3 = z.get($$2);
         if ($$3 == null) {
            throw new FileNotFoundException($$0.toString());
         } else {
            Reader $$4 = new StringReader($$3);
            gel $$5 = gel.a($$4);
            $$5.c = $$0.toString();
            return $$5;
         }
      } else {
         alb $$6 = p.a($$0);
         gel $$7 = this.G.get($$6);
         if ($$7 == null) {
            throw new FileNotFoundException($$6.toString());
         } else {
            $$7.c = $$0.toString();
            return $$7;
         }
      }
   }

   public Map<alb, gqv> a() {
      return this.N;
   }

   public Object2IntMap<drx> b() {
      return this.P;
   }

   static record a(alb a, j b, boolean c) {
   }

   static class b extends RuntimeException {
      public b(String $$0) {
         super($$0);
      }
   }

   public static record c(String a, JsonElement b) {
   }

   class d implements gqz {
      private final Function<gqy, gou> b;

      d(final BiFunction<alb, gqy, gou> $$0, final alb $$1) {
         this.b = $$2 -> $$0.apply($$1, $$2);
      }

      @Override
      public grg a(alb $$0) {
         return gra.this.a($$0);
      }

      @Override
      public gqv a(alb $$0, grd $$1) {
         gra.a $$2 = new gra.a($$0, $$1.b(), $$1.c());
         gqv $$3 = gra.this.L.get($$2);
         if ($$3 != null) {
            return $$3;
         } else {
            grg $$4 = this.a($$0);
            if ($$4 instanceof gel $$5 && $$5.g() == gra.r) {
               return gra.D.a(this.b, $$5).a(this, $$5, this.b, $$1, $$0, false);
            }

            gqv $$6 = $$4.a(this, this.b, $$1, $$0);
            gra.this.L.put($$2, $$6);
            return $$6;
         }
      }
   }

   static class e {
      private final List<grg> a;
      private final List<Object> b;

      public e(List<grg> $$0, List<Object> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof gra.e $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
         }
      }

      @Override
      public int hashCode() {
         return 31 * this.a.hashCode() + this.b.hashCode();
      }

      public static gra.e a(drx $$0, gey $$1, Collection<dta<?>> $$2) {
         dry<deu, drx> $$3 = $$0.b().l();
         List<grg> $$4 = $$1.a().stream().filter($$2x -> $$2x.a($$3).test($$0)).map(gfa::a).collect(ImmutableList.toImmutableList());
         List<Object> $$5 = a($$0, $$2);
         return new gra.e($$4, $$5);
      }

      public static gra.e a(drx $$0, grg $$1, Collection<dta<?>> $$2) {
         List<Object> $$3 = a($$0, $$2);
         return new gra.e(ImmutableList.of($$1), $$3);
      }

      private static List<Object> a(drx $$0, Collection<dta<?>> $$1) {
         return $$1.stream().map($$0::c).collect(ImmutableList.toImmutableList());
      }
   }
}
