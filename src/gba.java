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

public class gba {
   public static final gay a = new gay(fyt.e, new aer("block/fire_0"));
   public static final gay b = new gay(fyt.e, new aer("block/fire_1"));
   public static final gay c = new gay(fyt.e, new aer("block/lava_flow"));
   public static final gay d = new gay(fyt.e, new aer("block/water_flow"));
   public static final gay e = new gay(fyt.e, new aer("block/water_overlay"));
   public static final gay f = new gay(foi.c, new aer("entity/banner_base"));
   public static final gay g = new gay(foi.d, new aer("entity/shield_base"));
   public static final gay h = new gay(foi.d, new aer("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<aer> j = IntStream.range(0, 10).mapToObj($$0 -> new aer("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<aer> k = j.stream().map($$0 -> new aer("textures/" + $$0.a() + ".png")).collect(Collectors.toList());
   public static final List<foc> l = k.stream().map(foc::r).collect(Collectors.toList());
   static final int m = -1;
   private static final int t = 0;
   private static final Logger u = LogUtils.getLogger();
   private static final String v = "builtin/";
   private static final String w = "builtin/generated";
   private static final String x = "builtin/entity";
   private static final String y = "missing";
   public static final gbc n = gbc.c("builtin/missing", "missing");
   public static final aek o = aek.a("blockstates");
   public static final aek p = aek.a("models");
   @VisibleForTesting
   public static final String q = ("{    'textures': {       'particle': '"
         + fyk.b().a()
         + "',       'missingno': '"
         + fyk.b().a()
         + "'    },    'elements': [         {  'from': [ 0, 0, 0 ],            'to': [ 16, 16, 16 ],            'faces': {                'down':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'down',  'texture': '#missingno' },                'up':    { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'up',    'texture': '#missingno' },                'north': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'north', 'texture': '#missingno' },                'south': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'south', 'texture': '#missingno' },                'west':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'west',  'texture': '#missingno' },                'east':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'east',  'texture': '#missingno' }            }        }    ]}")
      .replace('\'', '"');
   private static final Map<String, String> z = Maps.newHashMap(ImmutableMap.of("missing", q));
   private static final Splitter A = Splitter.on(',');
   private static final Splitter B = Splitter.on('=').limit(2);
   public static final fow r = ac.a(fow.a("{\"gui_light\": \"front\"}"), $$0 -> $$0.c = "generation marker");
   public static final fow s = ac.a(fow.a("{\"gui_light\": \"side\"}"), $$0 -> $$0.c = "block entity marker");
   private static final dfa<csl, dez> C = new dfa.a<csl, dez>(csm.a).a(dfq.a("map")).a(csl::n, dez::new);
   static final foz D = new foz();
   private static final Map<aer, dfa<csl, dez>> E = ImmutableMap.of(new aer("item_frame"), C, new aer("glow_item_frame"), C);
   private final erm F;
   private final Map<aer, fow> G;
   private final Map<aer, List<gba.c>> H;
   private final Set<aer> I = Sets.newHashSet();
   private final fox.a J = new fox.a();
   private final Map<aer, gbg> K = Maps.newHashMap();
   final Map<gba.a, gav> L = Maps.newHashMap();
   private final Map<aer, gbg> M = Maps.newHashMap();
   private final Map<aer, gav> N = Maps.newHashMap();
   private int O = 1;
   private final Object2IntMap<dez> P = ac.a(new Object2IntOpenHashMap(), $$0x -> $$0x.defaultReturnValue(-1));

   public gba(erm $$0, bdh $$1, Map<aer, fow> $$2, Map<aer, List<gba.c>> $$3) {
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
      E.forEach(($$0x, $$1x) -> $$1x.a().forEach($$1xx -> this.a(fom.a($$0x, $$1xx))));
      $$1.b("blocks");

      for (csl $$5 : jb.f) {
         $$5.l().a().forEach($$0x -> this.a(fom.c($$0x)));
      }

      $$1.b("items");

      for (aer $$6 : jb.i.e()) {
         this.a(new gbc($$6, "inventory"));
      }

      $$1.b("special");
      this.a(ftv.i);
      this.a(ftv.j);
      this.M.values().forEach($$0x -> $$0x.a(this::a));
      $$1.c();
   }

   public void a(BiFunction<aer, gay, fyu> $$0) {
      this.M.keySet().forEach($$1 -> {
         gav $$2 = null;

         try {
            $$2 = new gba.d($$0, $$1).a($$1, gaw.a);
         } catch (Exception var5) {
            u.warn("Unable to bake model: '{}': {}", $$1, var5);
         }

         if ($$2 != null) {
            this.N.put($$1, $$2);
         }
      });
   }

   private static Predicate<dez> a(dfa<csl, dez> $$0, String $$1) {
      Map<dgc<?>, Comparable<?>> $$2 = Maps.newHashMap();

      for (String $$3 : A.split($$1)) {
         Iterator<String> $$4 = B.split($$3).iterator();
         if ($$4.hasNext()) {
            String $$5 = $$4.next();
            dgc<?> $$6 = $$0.a($$5);
            if ($$6 != null && $$4.hasNext()) {
               String $$7 = $$4.next();
               Comparable<?> $$8 = a((dgc<Comparable<?>>)$$6, $$7);
               if ($$8 == null) {
                  throw new RuntimeException("Unknown value: '" + $$7 + "' for blockstate property: '" + $$5 + "' " + $$6.a());
               }

               $$2.put($$6, $$8);
            } else if (!$$5.isEmpty()) {
               throw new RuntimeException("Unknown blockstate property: '" + $$5 + "'");
            }
         }
      }

      csl $$9 = $$0.c();
      return $$2x -> {
         if ($$2x != null && $$2x.a($$9)) {
            for (Entry<dgc<?>, Comparable<?>> $$3x : $$2.entrySet()) {
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
   static <T extends Comparable<T>> T a(dgc<T> $$0, String $$1) {
      return $$0.b($$1).orElse(null);
   }

   public gbg a(aer $$0) {
      if (this.K.containsKey($$0)) {
         return this.K.get($$0);
      } else if (this.I.contains($$0)) {
         throw new IllegalStateException("Circular reference while loading " + $$0);
      } else {
         this.I.add($$0);
         gbg $$1 = this.K.get(n);

         while (!this.I.isEmpty()) {
            aer $$2 = this.I.iterator().next();

            try {
               if (!this.K.containsKey($$2)) {
                  this.b($$2);
               }
            } catch (gba.b var9) {
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

   private void b(aer $$0) throws Exception {
      if (!($$0 instanceof gbc $$1)) {
         this.a($$0, this.c($$0));
      } else {
         if (Objects.equals($$1.f(), "inventory")) {
            aer $$2 = $$0.d("item/");
            fow $$3 = this.c($$2);
            this.a($$1, $$3);
            this.K.put($$2, $$3);
         } else {
            aer $$4 = new aer($$0.b(), $$0.a());
            dfa<csl, dez> $$5 = Optional.ofNullable(E.get($$4)).orElseGet(() -> jb.f.a($$4).l());
            this.J.a($$5);
            List<dgc<?>> $$6 = ImmutableList.copyOf(this.F.a($$5.c()));
            ImmutableList<dez> $$7 = $$5.a();
            Map<gbc, dez> $$8 = Maps.newHashMap();
            $$7.forEach($$2 -> $$8.put(fom.a($$4, $$2), $$2));
            Map<dez, Pair<gbg, Supplier<gba.e>>> $$9 = Maps.newHashMap();
            aer $$10 = o.a($$0);
            gbg $$11 = this.K.get(n);
            gba.e $$12 = new gba.e(ImmutableList.of($$11), ImmutableList.of());
            Pair<gbg, Supplier<gba.e>> $$13 = Pair.of($$11, (Supplier<gba.e>)() -> $$12);

            try {
               for (Pair<String, fox> $$15 : this.H
                  .getOrDefault($$10, List.of())
                  .stream()
                  .map(
                     $$1x -> {
                        try {
                           return Pair.of($$1x.a, fox.a(this.J, $$1x.b));
                        } catch (Exception var4x) {
                           throw new gba.b(
                              String.format(
                                 Locale.ROOT, "Exception loading blockstate definition: '%s' in resourcepack: '%s': %s", $$10, $$1x.a, var4x.getMessage()
                              )
                           );
                        }
                     }
                  )
                  .toList()) {
                  fox $$16 = (fox)$$15.getSecond();
                  Map<dez, Pair<gbg, Supplier<gba.e>>> $$17 = Maps.newIdentityHashMap();
                  fpj $$18;
                  if ($$16.c()) {
                     $$18 = $$16.d();
                     $$7.forEach($$3 -> $$17.put($$3, Pair.of($$18, (Supplier<gba.e>)() -> gba.e.a($$3, $$18, $$6))));
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
                                       Pair<gbg, Supplier<gba.e>> $$7xx = $$17.put($$6xx, Pair.of($$10x, (Supplier<gba.e>)() -> gba.e.a($$6xx, $$10x, $$6)));
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
            } catch (gba.b var24) {
               throw var24;
            } catch (Exception var25) {
               throw new gba.b(String.format(Locale.ROOT, "Exception loading blockstate definition: '%s': %s", $$10, var25));
            } finally {
               Map<gba.e, Set<dez>> $$23 = Maps.newHashMap();
               $$8.forEach(($$4x, $$5x) -> {
                  Pair<gbg, Supplier<gba.e>> $$6x = $$9.get($$5x);
                  if ($$6x == null) {
                     u.warn("Exception loading blockstate definition: '{}' missing model for variant: '{}'", $$10, $$4x);
                     $$6x = $$13;
                  }

                  this.a($$4x, (gbg)$$6x.getFirst());

                  try {
                     gba.e $$7x = (gba.e)((Supplier)$$6x.getSecond()).get();
                     $$23.computeIfAbsent($$7x, $$0xx -> Sets.newIdentityHashSet()).add($$5x);
                  } catch (Exception var9x) {
                     u.warn("Exception evaluating model definition: '{}'", $$4x, var9x);
                  }
               });
               $$23.forEach(($$0x, $$1x) -> {
                  Iterator<dez> $$2 = $$1x.iterator();

                  while ($$2.hasNext()) {
                     dez $$3 = $$2.next();
                     if ($$3.l() != cyq.c) {
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

   private void a(aer $$0, gbg $$1) {
      this.K.put($$0, $$1);
      this.I.addAll($$1.f());
   }

   private void a(gbc $$0) {
      gbg $$1 = this.a((aer)$$0);
      this.K.put($$0, $$1);
      this.M.put($$0, $$1);
   }

   private void a(Iterable<dez> $$0) {
      int $$1 = this.O++;
      $$0.forEach($$1x -> this.P.put($$1x, $$1));
   }

   private fow c(aer $$0) throws IOException {
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
            fow $$5 = fow.a($$4);
            $$5.c = $$0.toString();
            return $$5;
         }
      } else {
         aer $$6 = p.a($$0);
         fow $$7 = this.G.get($$6);
         if ($$7 == null) {
            throw new FileNotFoundException($$6.toString());
         } else {
            $$7.c = $$0.toString();
            return $$7;
         }
      }
   }

   public Map<aer, gav> a() {
      return this.N;
   }

   public Object2IntMap<dez> b() {
      return this.P;
   }

   static record a(aer a, j b, boolean c) {
   }

   static class b extends RuntimeException {
      public b(String $$0) {
         super($$0);
      }
   }

   public static record c(String a, JsonElement b) {
   }

   class d implements gaz {
      private final Function<gay, fyu> b;

      d(BiFunction<aer, gay, fyu> $$0, aer $$1) {
         this.b = $$2 -> $$0.apply($$1, $$2);
      }

      @Override
      public gbg a(aer $$0) {
         return gba.this.a($$0);
      }

      @Override
      public gav a(aer $$0, gbd $$1) {
         gba.a $$2 = new gba.a($$0, $$1.b(), $$1.c());
         gav $$3 = gba.this.L.get($$2);
         if ($$3 != null) {
            return $$3;
         } else {
            gbg $$4 = this.a($$0);
            if ($$4 instanceof fow $$5 && $$5.g() == gba.r) {
               return gba.D.a(this.b, $$5).a(this, $$5, this.b, $$1, $$0, false);
            }

            gav $$6 = $$4.a(this, this.b, $$1, $$0);
            gba.this.L.put($$2, $$6);
            return $$6;
         }
      }
   }

   static class e {
      private final List<gbg> a;
      private final List<Object> b;

      public e(List<gbg> $$0, List<Object> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof gba.e $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
         }
      }

      @Override
      public int hashCode() {
         return 31 * this.a.hashCode() + this.b.hashCode();
      }

      public static gba.e a(dez $$0, fpj $$1, Collection<dgc<?>> $$2) {
         dfa<csl, dez> $$3 = $$0.b().l();
         List<gbg> $$4 = $$1.a().stream().filter($$2x -> $$2x.a($$3).test($$0)).map(fpl::a).collect(ImmutableList.toImmutableList());
         List<Object> $$5 = a($$0, $$2);
         return new gba.e($$4, $$5);
      }

      public static gba.e a(dez $$0, gbg $$1, Collection<dgc<?>> $$2) {
         List<Object> $$3 = a($$0, $$2);
         return new gba.e(ImmutableList.of($$1), $$3);
      }

      private static List<Object> a(dez $$0, Collection<dgc<?>> $$1) {
         return $$1.stream().map($$0::c).collect(ImmutableList.toImmutableList());
      }
   }
}
