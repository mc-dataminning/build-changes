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

public class gke {
   public static final gkc a = new gkc(ghy.e, new ajc("block/fire_0"));
   public static final gkc b = new gkc(ghy.e, new ajc("block/fire_1"));
   public static final gkc c = new gkc(ghy.e, new ajc("block/lava_flow"));
   public static final gkc d = new gkc(ghy.e, new ajc("block/water_flow"));
   public static final gkc e = new gkc(ghy.e, new ajc("block/water_overlay"));
   public static final gkc f = new gkc(fxf.c, new ajc("entity/banner_base"));
   public static final gkc g = new gkc(fxf.d, new ajc("entity/shield_base"));
   public static final gkc h = new gkc(fxf.d, new ajc("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<ajc> j = IntStream.range(0, 10).mapToObj($$0 -> new ajc("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<ajc> k = j.stream().map($$0 -> new ajc("textures/" + $$0.a() + ".png")).collect(Collectors.toList());
   public static final List<fwy> l = k.stream().map(fwy::s).collect(Collectors.toList());
   static final int m = -1;
   private static final int t = 0;
   private static final Logger u = LogUtils.getLogger();
   private static final String v = "builtin/";
   private static final String w = "builtin/generated";
   private static final String x = "builtin/entity";
   private static final String y = "missing";
   public static final gkg n = gkg.c("builtin/missing", "missing");
   public static final aiv o = aiv.a("blockstates");
   public static final aiv p = aiv.a("models");
   @VisibleForTesting
   public static final String q = ("{    'textures': {       'particle': '"
         + ghp.b().a()
         + "',       'missingno': '"
         + ghp.b().a()
         + "'    },    'elements': [         {  'from': [ 0, 0, 0 ],            'to': [ 16, 16, 16 ],            'faces': {                'down':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'down',  'texture': '#missingno' },                'up':    { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'up',    'texture': '#missingno' },                'north': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'north', 'texture': '#missingno' },                'south': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'south', 'texture': '#missingno' },                'west':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'west',  'texture': '#missingno' },                'east':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'east',  'texture': '#missingno' }            }        }    ]}")
      .replace('\'', '"');
   private static final Map<String, String> z = Maps.newHashMap(ImmutableMap.of("missing", q));
   private static final Splitter A = Splitter.on(',');
   private static final Splitter B = Splitter.on('=').limit(2);
   public static final fxs r = ac.a(fxs.a("{\"gui_light\": \"front\"}"), $$0 -> $$0.c = "generation marker");
   public static final fxs s = ac.a(fxs.a("{\"gui_light\": \"side\"}"), $$0 -> $$0.c = "block entity marker");
   private static final dmf<czf, dme> C = new dmf.a<czf, dme>(czh.a).a(dmv.a("map")).a(czf::o, dme::new);
   static final fxv D = new fxv();
   private static final Map<ajc, dmf<czf, dme>> E = ImmutableMap.of(new ajc("item_frame"), C, new ajc("glow_item_frame"), C);
   private final ezo F;
   private final Map<ajc, fxs> G;
   private final Map<ajc, List<gke.c>> H;
   private final Set<ajc> I = Sets.newHashSet();
   private final fxt.a J = new fxt.a();
   private final Map<ajc, gkk> K = Maps.newHashMap();
   final Map<gke.a, gjz> L = Maps.newHashMap();
   private final Map<ajc, gkk> M = Maps.newHashMap();
   private final Map<ajc, gjz> N = Maps.newHashMap();
   private int O = 1;
   private final Object2IntMap<dme> P = ac.a(new Object2IntOpenHashMap(), $$0x -> $$0x.defaultReturnValue(-1));

   public gke(ezo $$0, bjc $$1, Map<ajc, fxs> $$2, Map<ajc, List<gke.c>> $$3) {
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
      E.forEach(($$0x, $$1x) -> $$1x.a().forEach($$1xx -> this.a(fxj.a($$0x, $$1xx))));
      $$1.b("blocks");

      for (czf $$5 : kh.e) {
         $$5.n().a().forEach($$0x -> this.a(fxj.c($$0x)));
      }

      $$1.b("items");

      for (ajc $$6 : kh.h.e()) {
         this.a(new gkg($$6, "inventory"));
      }

      $$1.b("special");
      this.a(gcw.i);
      this.a(gcw.j);
      this.M.values().forEach($$0x -> $$0x.a(this::a));
      $$1.c();
   }

   public void a(BiFunction<ajc, gkc, ghz> $$0) {
      this.M.keySet().forEach($$1 -> {
         gjz $$2 = null;

         try {
            $$2 = new gke.d($$0, $$1).a($$1, gka.a);
         } catch (Exception var5) {
            u.warn("Unable to bake model: '{}': {}", $$1, var5);
         }

         if ($$2 != null) {
            this.N.put($$1, $$2);
         }
      });
   }

   private static Predicate<dme> a(dmf<czf, dme> $$0, String $$1) {
      Map<dnh<?>, Comparable<?>> $$2 = Maps.newHashMap();

      for (String $$3 : A.split($$1)) {
         Iterator<String> $$4 = B.split($$3).iterator();
         if ($$4.hasNext()) {
            String $$5 = $$4.next();
            dnh<?> $$6 = $$0.a($$5);
            if ($$6 != null && $$4.hasNext()) {
               String $$7 = $$4.next();
               Comparable<?> $$8 = a((dnh<Comparable<?>>)$$6, $$7);
               if ($$8 == null) {
                  throw new RuntimeException("Unknown value: '" + $$7 + "' for blockstate property: '" + $$5 + "' " + $$6.a());
               }

               $$2.put($$6, $$8);
            } else if (!$$5.isEmpty()) {
               throw new RuntimeException("Unknown blockstate property: '" + $$5 + "'");
            }
         }
      }

      czf $$9 = $$0.c();
      return $$2x -> {
         if ($$2x != null && $$2x.a($$9)) {
            for (Entry<dnh<?>, Comparable<?>> $$3x : $$2.entrySet()) {
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
   static <T extends Comparable<T>> T a(dnh<T> $$0, String $$1) {
      return $$0.b($$1).orElse(null);
   }

   public gkk a(ajc $$0) {
      if (this.K.containsKey($$0)) {
         return this.K.get($$0);
      } else if (this.I.contains($$0)) {
         throw new IllegalStateException("Circular reference while loading " + $$0);
      } else {
         this.I.add($$0);
         gkk $$1 = this.K.get(n);

         while (!this.I.isEmpty()) {
            ajc $$2 = this.I.iterator().next();

            try {
               if (!this.K.containsKey($$2)) {
                  this.b($$2);
               }
            } catch (gke.b var9) {
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

   private void b(ajc $$0) throws Exception {
      if (!($$0 instanceof gkg $$1)) {
         this.a($$0, this.c($$0));
      } else {
         if (Objects.equals($$1.f(), "inventory")) {
            ajc $$2 = $$0.d("item/");
            fxs $$3 = this.c($$2);
            this.a($$1, $$3);
            this.K.put($$2, $$3);
         } else {
            ajc $$4 = new ajc($$0.b(), $$0.a());
            dmf<czf, dme> $$5 = Optional.ofNullable(E.get($$4)).orElseGet(() -> kh.e.a($$4).n());
            this.J.a($$5);
            List<dnh<?>> $$6 = ImmutableList.copyOf(this.F.a($$5.c()));
            ImmutableList<dme> $$7 = $$5.a();
            Map<gkg, dme> $$8 = Maps.newHashMap();
            $$7.forEach($$2 -> $$8.put(fxj.a($$4, $$2), $$2));
            Map<dme, Pair<gkk, Supplier<gke.e>>> $$9 = Maps.newHashMap();
            ajc $$10 = o.a($$0);
            gkk $$11 = this.K.get(n);
            gke.e $$12 = new gke.e(ImmutableList.of($$11), ImmutableList.of());
            Pair<gkk, Supplier<gke.e>> $$13 = Pair.of($$11, (Supplier<gke.e>)() -> $$12);

            try {
               for (Pair<String, fxt> $$15 : this.H
                  .getOrDefault($$10, List.of())
                  .stream()
                  .map(
                     $$1x -> {
                        try {
                           return Pair.of($$1x.a, fxt.a(this.J, $$1x.b));
                        } catch (Exception var4x) {
                           throw new gke.b(
                              String.format(
                                 Locale.ROOT, "Exception loading blockstate definition: '%s' in resourcepack: '%s': %s", $$10, $$1x.a, var4x.getMessage()
                              )
                           );
                        }
                     }
                  )
                  .toList()) {
                  fxt $$16 = (fxt)$$15.getSecond();
                  Map<dme, Pair<gkk, Supplier<gke.e>>> $$17 = Maps.newIdentityHashMap();
                  fyf $$18;
                  if ($$16.c()) {
                     $$18 = $$16.d();
                     $$7.forEach($$3 -> $$17.put($$3, Pair.of($$18, (Supplier<gke.e>)() -> gke.e.a($$3, $$18, $$6))));
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
                                       Pair<gkk, Supplier<gke.e>> $$7xx = $$17.put($$6xx, Pair.of($$10x, (Supplier<gke.e>)() -> gke.e.a($$6xx, $$10x, $$6)));
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
            } catch (gke.b var24) {
               throw var24;
            } catch (Exception var25) {
               throw new gke.b(String.format(Locale.ROOT, "Exception loading blockstate definition: '%s': %s", $$10, var25));
            } finally {
               Map<gke.e, Set<dme>> $$23 = Maps.newHashMap();
               $$8.forEach(($$4x, $$5x) -> {
                  Pair<gkk, Supplier<gke.e>> $$6x = $$9.get($$5x);
                  if ($$6x == null) {
                     u.warn("Exception loading blockstate definition: '{}' missing model for variant: '{}'", $$10, $$4x);
                     $$6x = $$13;
                  }

                  this.a($$4x, (gkk)$$6x.getFirst());

                  try {
                     gke.e $$7x = (gke.e)((Supplier)$$6x.getSecond()).get();
                     $$23.computeIfAbsent($$7x, $$0xx -> Sets.newIdentityHashSet()).add($$5x);
                  } catch (Exception var9x) {
                     u.warn("Exception evaluating model definition: '{}'", $$4x, var9x);
                  }
               });
               $$23.forEach(($$0x, $$1x) -> {
                  Iterator<dme> $$2 = $$1x.iterator();

                  while ($$2.hasNext()) {
                     dme $$3 = $$2.next();
                     if ($$3.l() != dfk.c) {
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

   private void a(ajc $$0, gkk $$1) {
      this.K.put($$0, $$1);
      this.I.addAll($$1.f());
   }

   private void a(gkg $$0) {
      gkk $$1 = this.a((ajc)$$0);
      this.K.put($$0, $$1);
      this.M.put($$0, $$1);
   }

   private void a(Iterable<dme> $$0) {
      int $$1 = this.O++;
      $$0.forEach($$1x -> this.P.put($$1x, $$1));
   }

   private fxs c(ajc $$0) throws IOException {
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
            fxs $$5 = fxs.a($$4);
            $$5.c = $$0.toString();
            return $$5;
         }
      } else {
         ajc $$6 = p.a($$0);
         fxs $$7 = this.G.get($$6);
         if ($$7 == null) {
            throw new FileNotFoundException($$6.toString());
         } else {
            $$7.c = $$0.toString();
            return $$7;
         }
      }
   }

   public Map<ajc, gjz> a() {
      return this.N;
   }

   public Object2IntMap<dme> b() {
      return this.P;
   }

   static record a(ajc a, j b, boolean c) {
   }

   static class b extends RuntimeException {
      public b(String $$0) {
         super($$0);
      }
   }

   public static record c(String a, JsonElement b) {
   }

   class d implements gkd {
      private final Function<gkc, ghz> b;

      d(BiFunction<ajc, gkc, ghz> $$0, ajc $$1) {
         this.b = $$2 -> $$0.apply($$1, $$2);
      }

      @Override
      public gkk a(ajc $$0) {
         return gke.this.a($$0);
      }

      @Override
      public gjz a(ajc $$0, gkh $$1) {
         gke.a $$2 = new gke.a($$0, $$1.b(), $$1.c());
         gjz $$3 = gke.this.L.get($$2);
         if ($$3 != null) {
            return $$3;
         } else {
            gkk $$4 = this.a($$0);
            if ($$4 instanceof fxs $$5 && $$5.g() == gke.r) {
               return gke.D.a(this.b, $$5).a(this, $$5, this.b, $$1, $$0, false);
            }

            gjz $$6 = $$4.a(this, this.b, $$1, $$0);
            gke.this.L.put($$2, $$6);
            return $$6;
         }
      }
   }

   static class e {
      private final List<gkk> a;
      private final List<Object> b;

      public e(List<gkk> $$0, List<Object> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof gke.e $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
         }
      }

      @Override
      public int hashCode() {
         return 31 * this.a.hashCode() + this.b.hashCode();
      }

      public static gke.e a(dme $$0, fyf $$1, Collection<dnh<?>> $$2) {
         dmf<czf, dme> $$3 = $$0.b().n();
         List<gkk> $$4 = $$1.a().stream().filter($$2x -> $$2x.a($$3).test($$0)).map(fyh::a).collect(ImmutableList.toImmutableList());
         List<Object> $$5 = a($$0, $$2);
         return new gke.e($$4, $$5);
      }

      public static gke.e a(dme $$0, gkk $$1, Collection<dnh<?>> $$2) {
         List<Object> $$3 = a($$0, $$2);
         return new gke.e(ImmutableList.of($$1), $$3);
      }

      private static List<Object> a(dme $$0, Collection<dnh<?>> $$1) {
         return $$1.stream().map($$0::c).collect(ImmutableList.toImmutableList());
      }
   }
}
