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

public class ggr {
   public static final ggp a = new ggp(gel.e, new ahg("block/fire_0"));
   public static final ggp b = new ggp(gel.e, new ahg("block/fire_1"));
   public static final ggp c = new ggp(gel.e, new ahg("block/lava_flow"));
   public static final ggp d = new ggp(gel.e, new ahg("block/water_flow"));
   public static final ggp e = new ggp(gel.e, new ahg("block/water_overlay"));
   public static final ggp f = new ggp(ftv.c, new ahg("entity/banner_base"));
   public static final ggp g = new ggp(ftv.d, new ahg("entity/shield_base"));
   public static final ggp h = new ggp(ftv.d, new ahg("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<ahg> j = IntStream.range(0, 10).mapToObj($$0 -> new ahg("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<ahg> k = j.stream().map($$0 -> new ahg("textures/" + $$0.a() + ".png")).collect(Collectors.toList());
   public static final List<fto> l = k.stream().map(fto::s).collect(Collectors.toList());
   static final int m = -1;
   private static final int t = 0;
   private static final Logger u = LogUtils.getLogger();
   private static final String v = "builtin/";
   private static final String w = "builtin/generated";
   private static final String x = "builtin/entity";
   private static final String y = "missing";
   public static final ggt n = ggt.c("builtin/missing", "missing");
   public static final agz o = agz.a("blockstates");
   public static final agz p = agz.a("models");
   @VisibleForTesting
   public static final String q = ("{    'textures': {       'particle': '"
         + gec.b().a()
         + "',       'missingno': '"
         + gec.b().a()
         + "'    },    'elements': [         {  'from': [ 0, 0, 0 ],            'to': [ 16, 16, 16 ],            'faces': {                'down':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'down',  'texture': '#missingno' },                'up':    { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'up',    'texture': '#missingno' },                'north': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'north', 'texture': '#missingno' },                'south': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'south', 'texture': '#missingno' },                'west':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'west',  'texture': '#missingno' },                'east':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'east',  'texture': '#missingno' }            }        }    ]}")
      .replace('\'', '"');
   private static final Map<String, String> z = Maps.newHashMap(ImmutableMap.of("missing", q));
   private static final Splitter A = Splitter.on(',');
   private static final Splitter B = Splitter.on('=').limit(2);
   public static final fui r = ac.a(fui.a("{\"gui_light\": \"front\"}"), $$0 -> $$0.c = "generation marker");
   public static final fui s = ac.a(fui.a("{\"gui_light\": \"side\"}"), $$0 -> $$0.c = "block entity marker");
   private static final djh<cwp, djg> C = new djh.a<cwp, djg>(cwr.a).a(djx.a("map")).a(cwp::o, djg::new);
   static final ful D = new ful();
   private static final Map<ahg, djh<cwp, djg>> E = ImmutableMap.of(new ahg("item_frame"), C, new ahg("glow_item_frame"), C);
   private final ewk F;
   private final Map<ahg, fui> G;
   private final Map<ahg, List<ggr.c>> H;
   private final Set<ahg> I = Sets.newHashSet();
   private final fuj.a J = new fuj.a();
   private final Map<ahg, ggx> K = Maps.newHashMap();
   final Map<ggr.a, ggm> L = Maps.newHashMap();
   private final Map<ahg, ggx> M = Maps.newHashMap();
   private final Map<ahg, ggm> N = Maps.newHashMap();
   private int O = 1;
   private final Object2IntMap<djg> P = ac.a(new Object2IntOpenHashMap(), $$0x -> $$0x.defaultReturnValue(-1));

   public ggr(ewk $$0, bgr $$1, Map<ahg, fui> $$2, Map<ahg, List<ggr.c>> $$3) {
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
      E.forEach(($$0x, $$1x) -> $$1x.a().forEach($$1xx -> this.a(ftz.a($$0x, $$1xx))));
      $$1.b("blocks");

      for (cwp $$5 : kd.e) {
         $$5.n().a().forEach($$0x -> this.a(ftz.c($$0x)));
      }

      $$1.b("items");

      for (ahg $$6 : kd.h.e()) {
         this.a(new ggt($$6, "inventory"));
      }

      $$1.b("special");
      this.a(fzk.i);
      this.a(fzk.j);
      this.M.values().forEach($$0x -> $$0x.a(this::a));
      $$1.c();
   }

   public void a(BiFunction<ahg, ggp, gem> $$0) {
      this.M.keySet().forEach($$1 -> {
         ggm $$2 = null;

         try {
            $$2 = new ggr.d($$0, $$1).a($$1, ggn.a);
         } catch (Exception var5) {
            u.warn("Unable to bake model: '{}': {}", $$1, var5);
         }

         if ($$2 != null) {
            this.N.put($$1, $$2);
         }
      });
   }

   private static Predicate<djg> a(djh<cwp, djg> $$0, String $$1) {
      Map<dkj<?>, Comparable<?>> $$2 = Maps.newHashMap();

      for (String $$3 : A.split($$1)) {
         Iterator<String> $$4 = B.split($$3).iterator();
         if ($$4.hasNext()) {
            String $$5 = $$4.next();
            dkj<?> $$6 = $$0.a($$5);
            if ($$6 != null && $$4.hasNext()) {
               String $$7 = $$4.next();
               Comparable<?> $$8 = a((dkj<Comparable<?>>)$$6, $$7);
               if ($$8 == null) {
                  throw new RuntimeException("Unknown value: '" + $$7 + "' for blockstate property: '" + $$5 + "' " + $$6.a());
               }

               $$2.put($$6, $$8);
            } else if (!$$5.isEmpty()) {
               throw new RuntimeException("Unknown blockstate property: '" + $$5 + "'");
            }
         }
      }

      cwp $$9 = $$0.c();
      return $$2x -> {
         if ($$2x != null && $$2x.a($$9)) {
            for (Entry<dkj<?>, Comparable<?>> $$3x : $$2.entrySet()) {
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
   static <T extends Comparable<T>> T a(dkj<T> $$0, String $$1) {
      return $$0.b($$1).orElse(null);
   }

   public ggx a(ahg $$0) {
      if (this.K.containsKey($$0)) {
         return this.K.get($$0);
      } else if (this.I.contains($$0)) {
         throw new IllegalStateException("Circular reference while loading " + $$0);
      } else {
         this.I.add($$0);
         ggx $$1 = this.K.get(n);

         while (!this.I.isEmpty()) {
            ahg $$2 = this.I.iterator().next();

            try {
               if (!this.K.containsKey($$2)) {
                  this.b($$2);
               }
            } catch (ggr.b var9) {
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

   private void b(ahg $$0) throws Exception {
      if (!($$0 instanceof ggt $$1)) {
         this.a($$0, this.c($$0));
      } else {
         if (Objects.equals($$1.f(), "inventory")) {
            ahg $$2 = $$0.d("item/");
            fui $$3 = this.c($$2);
            this.a($$1, $$3);
            this.K.put($$2, $$3);
         } else {
            ahg $$4 = new ahg($$0.b(), $$0.a());
            djh<cwp, djg> $$5 = Optional.ofNullable(E.get($$4)).orElseGet(() -> kd.e.a($$4).n());
            this.J.a($$5);
            List<dkj<?>> $$6 = ImmutableList.copyOf(this.F.a($$5.c()));
            ImmutableList<djg> $$7 = $$5.a();
            Map<ggt, djg> $$8 = Maps.newHashMap();
            $$7.forEach($$2 -> $$8.put(ftz.a($$4, $$2), $$2));
            Map<djg, Pair<ggx, Supplier<ggr.e>>> $$9 = Maps.newHashMap();
            ahg $$10 = o.a($$0);
            ggx $$11 = this.K.get(n);
            ggr.e $$12 = new ggr.e(ImmutableList.of($$11), ImmutableList.of());
            Pair<ggx, Supplier<ggr.e>> $$13 = Pair.of($$11, (Supplier<ggr.e>)() -> $$12);

            try {
               for (Pair<String, fuj> $$15 : this.H
                  .getOrDefault($$10, List.of())
                  .stream()
                  .map(
                     $$1x -> {
                        try {
                           return Pair.of($$1x.a, fuj.a(this.J, $$1x.b));
                        } catch (Exception var4x) {
                           throw new ggr.b(
                              String.format(
                                 Locale.ROOT, "Exception loading blockstate definition: '%s' in resourcepack: '%s': %s", $$10, $$1x.a, var4x.getMessage()
                              )
                           );
                        }
                     }
                  )
                  .toList()) {
                  fuj $$16 = (fuj)$$15.getSecond();
                  Map<djg, Pair<ggx, Supplier<ggr.e>>> $$17 = Maps.newIdentityHashMap();
                  fuv $$18;
                  if ($$16.c()) {
                     $$18 = $$16.d();
                     $$7.forEach($$3 -> $$17.put($$3, Pair.of($$18, (Supplier<ggr.e>)() -> ggr.e.a($$3, $$18, $$6))));
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
                                       Pair<ggx, Supplier<ggr.e>> $$7xx = $$17.put($$6xx, Pair.of($$10x, (Supplier<ggr.e>)() -> ggr.e.a($$6xx, $$10x, $$6)));
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
            } catch (ggr.b var24) {
               throw var24;
            } catch (Exception var25) {
               throw new ggr.b(String.format(Locale.ROOT, "Exception loading blockstate definition: '%s': %s", $$10, var25));
            } finally {
               Map<ggr.e, Set<djg>> $$23 = Maps.newHashMap();
               $$8.forEach(($$4x, $$5x) -> {
                  Pair<ggx, Supplier<ggr.e>> $$6x = $$9.get($$5x);
                  if ($$6x == null) {
                     u.warn("Exception loading blockstate definition: '{}' missing model for variant: '{}'", $$10, $$4x);
                     $$6x = $$13;
                  }

                  this.a($$4x, (ggx)$$6x.getFirst());

                  try {
                     ggr.e $$7x = (ggr.e)((Supplier)$$6x.getSecond()).get();
                     $$23.computeIfAbsent($$7x, $$0xx -> Sets.newIdentityHashSet()).add($$5x);
                  } catch (Exception var9x) {
                     u.warn("Exception evaluating model definition: '{}'", $$4x, var9x);
                  }
               });
               $$23.forEach(($$0x, $$1x) -> {
                  Iterator<djg> $$2 = $$1x.iterator();

                  while ($$2.hasNext()) {
                     djg $$3 = $$2.next();
                     if ($$3.l() != dcu.c) {
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

   private void a(ahg $$0, ggx $$1) {
      this.K.put($$0, $$1);
      this.I.addAll($$1.f());
   }

   private void a(ggt $$0) {
      ggx $$1 = this.a((ahg)$$0);
      this.K.put($$0, $$1);
      this.M.put($$0, $$1);
   }

   private void a(Iterable<djg> $$0) {
      int $$1 = this.O++;
      $$0.forEach($$1x -> this.P.put($$1x, $$1));
   }

   private fui c(ahg $$0) throws IOException {
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
            fui $$5 = fui.a($$4);
            $$5.c = $$0.toString();
            return $$5;
         }
      } else {
         ahg $$6 = p.a($$0);
         fui $$7 = this.G.get($$6);
         if ($$7 == null) {
            throw new FileNotFoundException($$6.toString());
         } else {
            $$7.c = $$0.toString();
            return $$7;
         }
      }
   }

   public Map<ahg, ggm> a() {
      return this.N;
   }

   public Object2IntMap<djg> b() {
      return this.P;
   }

   static record a(ahg a, j b, boolean c) {
   }

   static class b extends RuntimeException {
      public b(String $$0) {
         super($$0);
      }
   }

   public static record c(String a, JsonElement b) {
   }

   class d implements ggq {
      private final Function<ggp, gem> b;

      d(BiFunction<ahg, ggp, gem> $$0, ahg $$1) {
         this.b = $$2 -> $$0.apply($$1, $$2);
      }

      @Override
      public ggx a(ahg $$0) {
         return ggr.this.a($$0);
      }

      @Override
      public ggm a(ahg $$0, ggu $$1) {
         ggr.a $$2 = new ggr.a($$0, $$1.b(), $$1.c());
         ggm $$3 = ggr.this.L.get($$2);
         if ($$3 != null) {
            return $$3;
         } else {
            ggx $$4 = this.a($$0);
            if ($$4 instanceof fui $$5 && $$5.g() == ggr.r) {
               return ggr.D.a(this.b, $$5).a(this, $$5, this.b, $$1, $$0, false);
            }

            ggm $$6 = $$4.a(this, this.b, $$1, $$0);
            ggr.this.L.put($$2, $$6);
            return $$6;
         }
      }
   }

   static class e {
      private final List<ggx> a;
      private final List<Object> b;

      public e(List<ggx> $$0, List<Object> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof ggr.e $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
         }
      }

      @Override
      public int hashCode() {
         return 31 * this.a.hashCode() + this.b.hashCode();
      }

      public static ggr.e a(djg $$0, fuv $$1, Collection<dkj<?>> $$2) {
         djh<cwp, djg> $$3 = $$0.b().n();
         List<ggx> $$4 = $$1.a().stream().filter($$2x -> $$2x.a($$3).test($$0)).map(fux::a).collect(ImmutableList.toImmutableList());
         List<Object> $$5 = a($$0, $$2);
         return new ggr.e($$4, $$5);
      }

      public static ggr.e a(djg $$0, ggx $$1, Collection<dkj<?>> $$2) {
         List<Object> $$3 = a($$0, $$2);
         return new ggr.e(ImmutableList.of($$1), $$3);
      }

      private static List<Object> a(djg $$0, Collection<dkj<?>> $$1) {
         return $$1.stream().map($$0::c).collect(ImmutableList.toImmutableList());
      }
   }
}
