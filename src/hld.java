import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import java.io.Reader;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class hld implements auw, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final akz b = akz.a("models");
   private static final Map<alg, alg> c = Map.of(
      gqn.c, hkn.b, gqn.b, hkn.c, gqn.f, hkn.e, gqn.d, hkn.l, gqn.e, hkn.n, gqn.a, hkn.m, gqn.g, hkn.a, gqn.h, hkn.f, hio.d, hkn.d
   );
   private Map<hle, hkp> d = Map.of();
   private Map<alg, hff> e = Map.of();
   private Map<alg, hfb.a> f = Map.of();
   private final hko g;
   private final gqv h;
   private final fpu i;
   private giq j = giq.a;
   private gqp k = gqp.a;
   private int l;
   private hkp m;
   private hff n;
   private Object2IntMap<dzz> o = Object2IntMaps.emptyMap();

   public hld(hir $$0, fpu $$1, int $$2) {
      this.i = $$1;
      this.l = $$2;
      this.h = new gqv(this);
      this.g = new hko(c, $$0);
   }

   public hkp a(hle $$0) {
      return this.d.getOrDefault($$0, this.m);
   }

   public hkp a() {
      return this.m;
   }

   public hff a(alg $$0) {
      return this.e.getOrDefault($$0, this.n);
   }

   public hfb.a b(alg $$0) {
      return this.f.getOrDefault($$0, hfb.a.a);
   }

   public gqv b() {
      return this.h;
   }

   @Override
   public final CompletableFuture<Void> a(auw.a $$0, avd $$1, Executor $$2, Executor $$3) {
      hlk $$4 = hkx.a();
      CompletableFuture<giq> $$5 = CompletableFuture.supplyAsync(giq::a, $$2);
      CompletableFuture<gqp> $$6 = $$5.thenApplyAsync(gqp::a, $$2);
      CompletableFuture<Map<alg, hlk>> $$7 = a($$1, $$2);
      CompletableFuture<hkr.c> $$8 = hkr.a($$4, $$1, $$2);
      CompletableFuture<hks.a> $$9 = hks.a($$1, $$2);
      CompletableFuture<hlb> $$10 = CompletableFuture.allOf($$7, $$8, $$9).thenApplyAsync($$4x -> a($$4, $$7.join(), $$8.join(), $$9.join()), $$2);
      CompletableFuture<Object2IntMap<dzz>> $$11 = $$8.thenApplyAsync($$0x -> a(this.i, $$0x), $$2);
      Map<alg, CompletableFuture<hko.b>> $$12 = this.g.a($$1, this.l, $$2);
      return CompletableFuture.allOf(Stream.concat($$12.values().stream(), Stream.of($$10, $$11, $$8, $$9, $$5, $$6)).toArray(CompletableFuture[]::new))
         .thenApplyAsync($$8x -> {
            Map<alg, hko.b> $$9x = af.a($$12, CompletableFuture::join);
            hlb $$10x = $$10.join();
            Object2IntMap<dzz> $$11x = $$11.join();
            Set<alg> $$12x = $$10x.d();
            if (!$$12x.isEmpty()) {
               a.debug("Unreferenced models: \n{}", $$12x.stream().sorted().map($$0xx -> "\t" + $$0xx + "\n").collect(Collectors.joining()));
            }

            hkz $$13 = new hkz($$5.join(), $$8.join().b(), $$9.join().a(), $$10x.c(), $$4);
            return a(bql.a(), $$9x, $$13, $$11x, $$5.join(), $$6.join());
         }, $$2)
         .thenCompose($$0x -> $$0x.g.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$0x -> this.a($$0x, bql.a()), $$3);
   }

   private static CompletableFuture<Map<alg, hlk>> a(avd $$0, Executor $$1) {
      return CompletableFuture.<Map<alg, avb>>supplyAsync(() -> b.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<alg, gre>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<alg, avb> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               alg $$1xx = b.b($$3.getKey());

               try {
                  Pair var3;
                  try (Reader $$2x = $$3.getValue().e()) {
                     var3 = Pair.of($$1xx, gre.a($$2x));
                  }

                  return var3;
               } catch (Exception var7) {
                  a.error("Failed to load model {}", $$3.getKey(), var7);
                  return null;
               }
            }, $$1));
         }

         return af.d($$2).thenApply($$0xx -> $$0xx.stream().filter(Objects::nonNull).collect(Collectors.toUnmodifiableMap(Pair::getFirst, Pair::getSecond)));
      });
   }

   private static hlb a(hlk $$0, Map<alg, hlk> $$1, hkr.c $$2, hks.a $$3) {
      hlb $$4 = new hlb($$1, $$0);
      $$2.a().forEach($$4::a);
      $$3.a().values().forEach($$1x -> $$4.a($$1x.a()));
      $$4.a();
      $$4.b();
      return $$4;
   }

   private static hld.a a(bqm $$0, final Map<alg, hko.b> $$1, hkz $$2, Object2IntMap<dzz> $$3, giq $$4, gqp $$5) {
      $$0.a("baking");
      final Multimap<String, hkw> $$6 = HashMultimap.create();
      final Multimap<String, String> $$7 = HashMultimap.create();
      final hip $$8 = $$1.get(hio.d).a();
      hkz.b $$9 = $$2.a(new hkz.d() {
         @Override
         public hip a(hla $$0, hkw $$1x) {
            hko.b $$2 = $$1.get($$1.a());
            hip $$3 = $$2.a($$1.b());
            if ($$3 != null) {
               return $$3;
            } else {
               $$6.put($$0.get(), $$1);
               return $$2.a();
            }
         }

         @Override
         public hip a(hla $$0, String $$1x) {
            $$7.put($$0.get(), $$1);
            return $$8;
         }
      });
      $$6.asMap()
         .forEach(
            ($$0x, $$1x) -> a.warn(
                  "Missing textures in model {}:\n{}",
                  $$0x,
                  $$1x.stream().sorted(hkw.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$7.asMap()
         .forEach(
            ($$0x, $$1x) -> a.warn(
                  "Missing texture references in model {}:\n{}", $$0x, $$1x.stream().sorted().map($$0xx -> "    " + $$0xx).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<dzz, hkp> $$10 = a($$9.b(), $$9.a());
      CompletableFuture<Void> $$11 = CompletableFuture.allOf($$1.values().stream().map(hko.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      return new hld.a($$9, $$3, $$10, $$1, $$4, $$5, $$11);
   }

   private static Map<dzz, hkp> a(Map<hle, hkp> $$0, hkp $$1) {
      Map<dzz, hkp> $$2 = new IdentityHashMap<>();

      for (dma $$3 : mf.e) {
         $$3.l().a().forEach($$3x -> {
            alg $$4 = $$3x.b().p().h().a();
            hle $$5 = gqv.a($$4, $$3x);
            hkp $$6 = $$0.get($$5);
            if ($$6 == null) {
               a.warn("Missing model for variant: '{}'", $$5);
               $$2.putIfAbsent($$3x, $$1);
            } else {
               $$2.put($$3x, $$6);
            }
         });
      }

      return $$2;
   }

   private static Object2IntMap<dzz> a(fpu $$0, hkr.c $$1) {
      return hlc.a($$0, $$1);
   }

   private void a(hld.a $$0, bqm $$1) {
      $$1.a("upload");
      $$0.d.values().forEach(hko.b::c);
      hkz.b $$2 = $$0.a;
      this.d = $$2.b();
      this.e = $$2.d();
      this.f = $$2.e();
      this.o = $$0.b;
      this.m = $$2.a();
      this.n = $$2.c();
      $$1.b("cache");
      this.h.a($$0.c);
      this.k = $$0.f;
      this.j = $$0.e;
      $$1.c();
   }

   public boolean a(dzz $$0, dzz $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.o.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.o.getInt($$1);
            if ($$2 == $$3) {
               ewg $$4 = $$0.y();
               ewg $$5 = $$1.y();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public hio c(alg $$0) {
      return this.g.a($$0);
   }

   @Override
   public void close() {
      this.g.close();
   }

   public void a(int $$0) {
      this.l = $$0;
   }

   public Supplier<gqp> d() {
      return () -> this.k;
   }

   public Supplier<giq> e() {
      return () -> this.j;
   }

   static record a(hkz.b a, Object2IntMap<dzz> b, Map<dzz, hkp> c, Map<alg, hko.b> d, giq e, gqp f, CompletableFuture<Void> g) {
   }
}
