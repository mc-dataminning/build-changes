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

public class got {
   public static final gor a = new gor(gmn.e, new akf("block/fire_0"));
   public static final gor b = new gor(gmn.e, new akf("block/fire_1"));
   public static final gor c = new gor(gmn.e, new akf("block/lava_flow"));
   public static final gor d = new gor(gmn.e, new akf("block/water_flow"));
   public static final gor e = new gor(gmn.e, new akf("block/water_overlay"));
   public static final gor f = new gor(gbt.c, new akf("entity/banner_base"));
   public static final gor g = new gor(gbt.d, new akf("entity/shield_base"));
   public static final gor h = new gor(gbt.d, new akf("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<akf> j = IntStream.range(0, 10).mapToObj($$0 -> new akf("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<akf> k = j.stream().map($$0 -> new akf("textures/" + $$0.a() + ".png")).collect(Collectors.toList());
   public static final List<gbm> l = k.stream().map(gbm::s).collect(Collectors.toList());
   static final int m = -1;
   private static final int t = 0;
   private static final Logger u = LogUtils.getLogger();
   private static final String v = "builtin/";
   private static final String w = "builtin/generated";
   private static final String x = "builtin/entity";
   private static final String y = "missing";
   public static final gov n = gov.c("builtin/missing", "missing");
   public static final ajy o = ajy.a("blockstates");
   public static final ajy p = ajy.a("models");
   @VisibleForTesting
   public static final String q = ("{    'textures': {       'particle': '"
         + gme.b().a()
         + "',       'missingno': '"
         + gme.b().a()
         + "'    },    'elements': [         {  'from': [ 0, 0, 0 ],            'to': [ 16, 16, 16 ],            'faces': {                'down':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'down',  'texture': '#missingno' },                'up':    { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'up',    'texture': '#missingno' },                'north': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'north', 'texture': '#missingno' },                'south': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'south', 'texture': '#missingno' },                'west':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'west',  'texture': '#missingno' },                'east':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'east',  'texture': '#missingno' }            }        }    ]}")
      .replace('\'', '"');
   private static final Map<String, String> z = Maps.newHashMap(ImmutableMap.of("missing", q));
   private static final Splitter A = Splitter.on(',');
   private static final Splitter B = Splitter.on('=').limit(2);
   public static final gcg r = ac.a(gcg.a("{\"gui_light\": \"front\"}"), $$0 -> $$0.c = "generation marker");
   public static final gcg s = ac.a(gcg.a("{\"gui_light\": \"side\"}"), $$0 -> $$0.c = "block entity marker");
   private static final dpz<dcv, dpy> C = new dpz.a<dcv, dpy>(dcx.a).a(dqp.a("map")).a(dcv::n, dpy::new);
   static final gcj D = new gcj();
   private static final Map<akf, dpz<dcv, dpy>> E = ImmutableMap.of(new akf("item_frame"), C, new akf("glow_item_frame"), C);
   private final fdy F;
   private final Map<akf, gcg> G;
   private final Map<akf, List<got.c>> H;
   private final Set<akf> I = Sets.newHashSet();
   private final gch.a J = new gch.a();
   private final Map<akf, goz> K = Maps.newHashMap();
   final Map<got.a, goo> L = Maps.newHashMap();
   private final Map<akf, goz> M = Maps.newHashMap();
   private final Map<akf, goo> N = Maps.newHashMap();
   private int O = 1;
   private final Object2IntMap<dpy> P = ac.a(new Object2IntOpenHashMap(), $$0x -> $$0x.defaultReturnValue(-1));

   public got(fdy $$0, ble $$1, Map<akf, gcg> $$2, Map<akf, List<got.c>> $$3) {
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
      E.forEach(($$0x, $$1x) -> $$1x.a().forEach($$1xx -> this.a(gbx.a($$0x, $$1xx))));
      $$1.b("blocks");

      for (dcv $$5 : lc.e) {
         $$5.l().a().forEach($$0x -> this.a(gbx.c($$0x)));
      }

      $$1.b("items");

      for (akf $$6 : lc.h.e()) {
         this.a(new gov($$6, "inventory"));
      }

      $$1.b("special");
      this.a(ghl.i);
      this.a(ghl.j);
      this.M.values().forEach($$0x -> $$0x.a(this::a));
      $$1.c();
   }

   public void a(BiFunction<akf, gor, gmo> $$0) {
      this.M.keySet().forEach($$1 -> {
         goo $$2 = null;

         try {
            $$2 = new got.d($$0, $$1).a($$1, gop.a);
         } catch (Exception var5) {
            u.warn("Unable to bake model: '{}': {}", $$1, var5);
         }

         if ($$2 != null) {
            this.N.put($$1, $$2);
         }
      });
   }

   private static Predicate<dpy> a(dpz<dcv, dpy> $$0, String $$1) {
      Map<drb<?>, Comparable<?>> $$2 = Maps.newHashMap();

      for (String $$3 : A.split($$1)) {
         Iterator<String> $$4 = B.split($$3).iterator();
         if ($$4.hasNext()) {
            String $$5 = $$4.next();
            drb<?> $$6 = $$0.a($$5);
            if ($$6 != null && $$4.hasNext()) {
               String $$7 = $$4.next();
               Comparable<?> $$8 = a((drb<Comparable<?>>)$$6, $$7);
               if ($$8 == null) {
                  throw new RuntimeException("Unknown value: '" + $$7 + "' for blockstate property: '" + $$5 + "' " + $$6.a());
               }

               $$2.put($$6, $$8);
            } else if (!$$5.isEmpty()) {
               throw new RuntimeException("Unknown blockstate property: '" + $$5 + "'");
            }
         }
      }

      dcv $$9 = $$0.c();
      return $$2x -> {
         if ($$2x != null && $$2x.a($$9)) {
            for (Entry<drb<?>, Comparable<?>> $$3x : $$2.entrySet()) {
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
   static <T extends Comparable<T>> T a(drb<T> $$0, String $$1) {
      return $$0.b($$1).orElse(null);
   }

   public goz a(akf $$0) {
      if (this.K.containsKey($$0)) {
         return this.K.get($$0);
      } else if (this.I.contains($$0)) {
         throw new IllegalStateException("Circular reference while loading " + $$0);
      } else {
         this.I.add($$0);
         goz $$1 = this.K.get(n);

         while (!this.I.isEmpty()) {
            akf $$2 = this.I.iterator().next();

            try {
               if (!this.K.containsKey($$2)) {
                  this.b($$2);
               }
            } catch (got.b var9) {
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

   private void b(akf $$0) throws Exception {
      if (!($$0 instanceof gov $$1)) {
         this.a($$0, this.c($$0));
      } else {
         if (Objects.equals($$1.f(), "inventory")) {
            akf $$2 = $$0.d("item/");
            gcg $$3 = this.c($$2);
            this.a($$1, $$3);
            this.K.put($$2, $$3);
         } else {
            akf $$4 = new akf($$0.b(), $$0.a());
            dpz<dcv, dpy> $$5 = Optional.ofNullable(E.get($$4)).orElseGet(() -> lc.e.a($$4).l());
            this.J.a($$5);
            List<drb<?>> $$6 = ImmutableList.copyOf(this.F.a($$5.c()));
            ImmutableList<dpy> $$7 = $$5.a();
            Map<gov, dpy> $$8 = Maps.newHashMap();
            $$7.forEach($$2 -> $$8.put(gbx.a($$4, $$2), $$2));
            Map<dpy, Pair<goz, Supplier<got.e>>> $$9 = Maps.newHashMap();
            akf $$10 = o.a($$0);
            goz $$11 = this.K.get(n);
            got.e $$12 = new got.e(ImmutableList.of($$11), ImmutableList.of());
            Pair<goz, Supplier<got.e>> $$13 = Pair.of($$11, (Supplier<got.e>)() -> $$12);

            try {
               for (Pair<String, gch> $$15 : this.H
                  .getOrDefault($$10, List.of())
                  .stream()
                  .map(
                     $$1x -> {
                        try {
                           return Pair.of($$1x.a, gch.a(this.J, $$1x.b));
                        } catch (Exception var4x) {
                           throw new got.b(
                              String.format(
                                 Locale.ROOT, "Exception loading blockstate definition: '%s' in resourcepack: '%s': %s", $$10, $$1x.a, var4x.getMessage()
                              )
                           );
                        }
                     }
                  )
                  .toList()) {
                  gch $$16 = (gch)$$15.getSecond();
                  Map<dpy, Pair<goz, Supplier<got.e>>> $$17 = Maps.newIdentityHashMap();
                  gct $$18;
                  if ($$16.c()) {
                     $$18 = $$16.d();
                     $$7.forEach($$3 -> $$17.put($$3, Pair.of($$18, (Supplier<got.e>)() -> got.e.a($$3, $$18, $$6))));
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
                                       Pair<goz, Supplier<got.e>> $$7xx = $$17.put($$6xx, Pair.of($$10x, (Supplier<got.e>)() -> got.e.a($$6xx, $$10x, $$6)));
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
            } catch (got.b var24) {
               throw var24;
            } catch (Exception var25) {
               throw new got.b(String.format(Locale.ROOT, "Exception loading blockstate definition: '%s': %s", $$10, var25));
            } finally {
               Map<got.e, Set<dpy>> $$23 = Maps.newHashMap();
               $$8.forEach(($$4x, $$5x) -> {
                  Pair<goz, Supplier<got.e>> $$6x = $$9.get($$5x);
                  if ($$6x == null) {
                     u.warn("Exception loading blockstate definition: '{}' missing model for variant: '{}'", $$10, $$4x);
                     $$6x = $$13;
                  }

                  this.a($$4x, (goz)$$6x.getFirst());

                  try {
                     got.e $$7x = (got.e)((Supplier)$$6x.getSecond()).get();
                     $$23.computeIfAbsent($$7x, $$0xx -> Sets.newIdentityHashSet()).add($$5x);
                  } catch (Exception var9x) {
                     u.warn("Exception evaluating model definition: '{}'", $$4x, var9x);
                  }
               });
               $$23.forEach(($$0x, $$1x) -> {
                  Iterator<dpy> $$2 = $$1x.iterator();

                  while ($$2.hasNext()) {
                     dpy $$3 = $$2.next();
                     if ($$3.l() != djb.c) {
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

   private void a(akf $$0, goz $$1) {
      this.K.put($$0, $$1);
      this.I.addAll($$1.f());
   }

   private void a(gov $$0) {
      goz $$1 = this.a((akf)$$0);
      this.K.put($$0, $$1);
      this.M.put($$0, $$1);
   }

   private void a(Iterable<dpy> $$0) {
      int $$1 = this.O++;
      $$0.forEach($$1x -> this.P.put($$1x, $$1));
   }

   private gcg c(akf $$0) throws IOException {
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
            gcg $$5 = gcg.a($$4);
            $$5.c = $$0.toString();
            return $$5;
         }
      } else {
         akf $$6 = p.a($$0);
         gcg $$7 = this.G.get($$6);
         if ($$7 == null) {
            throw new FileNotFoundException($$6.toString());
         } else {
            $$7.c = $$0.toString();
            return $$7;
         }
      }
   }

   public Map<akf, goo> a() {
      return this.N;
   }

   public Object2IntMap<dpy> b() {
      return this.P;
   }

   static record a(akf a, j b, boolean c) {
   }

   static class b extends RuntimeException {
      public b(String $$0) {
         super($$0);
      }
   }

   public static record c(String a, JsonElement b) {
   }

   class d implements gos {
      private final Function<gor, gmo> b;

      d(BiFunction<akf, gor, gmo> $$0, akf $$1) {
         this.b = $$2 -> $$0.apply($$1, $$2);
      }

      @Override
      public goz a(akf $$0) {
         return got.this.a($$0);
      }

      @Override
      public goo a(akf $$0, gow $$1) {
         got.a $$2 = new got.a($$0, $$1.b(), $$1.c());
         goo $$3 = got.this.L.get($$2);
         if ($$3 != null) {
            return $$3;
         } else {
            goz $$4 = this.a($$0);
            if ($$4 instanceof gcg $$5 && $$5.g() == got.r) {
               return got.D.a(this.b, $$5).a(this, $$5, this.b, $$1, $$0, false);
            }

            goo $$6 = $$4.a(this, this.b, $$1, $$0);
            got.this.L.put($$2, $$6);
            return $$6;
         }
      }
   }

   static class e {
      private final List<goz> a;
      private final List<Object> b;

      public e(List<goz> $$0, List<Object> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof got.e $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
         }
      }

      @Override
      public int hashCode() {
         return 31 * this.a.hashCode() + this.b.hashCode();
      }

      public static got.e a(dpy $$0, gct $$1, Collection<drb<?>> $$2) {
         dpz<dcv, dpy> $$3 = $$0.b().l();
         List<goz> $$4 = $$1.a().stream().filter($$2x -> $$2x.a($$3).test($$0)).map(gcv::a).collect(ImmutableList.toImmutableList());
         List<Object> $$5 = a($$0, $$2);
         return new got.e($$4, $$5);
      }

      public static got.e a(dpy $$0, goz $$1, Collection<drb<?>> $$2) {
         List<Object> $$3 = a($$0, $$2);
         return new got.e(ImmutableList.of($$1), $$3);
      }

      private static List<Object> a(dpy $$0, Collection<drb<?>> $$1) {
         return $$1.stream().map($$0::c).collect(ImmutableList.toImmutableList());
      }
   }
}
