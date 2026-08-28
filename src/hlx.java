import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Sets;
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

public class hlx implements auw, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final akz b = akz.a("models");
   private static final Map<alg, alg> c = Map.of(
      grg.c, hli.b, grg.b, hli.c, grg.f, hli.e, grg.d, hli.l, grg.e, hli.n, grg.a, hli.m, grg.g, hli.a, grg.h, hli.f, hjj.c, hli.d
   );
   private Map<alg, hfz> d = Map.of();
   private Map<alg, hfv.a> e = Map.of();
   private final hlj f;
   private final gro g;
   private final fqq h;
   private gjk i = gjk.a;
   private gri j = gri.a;
   private int k;
   private hlt.b l;
   private Object2IntMap<eao> m = Object2IntMaps.emptyMap();

   public hlx(hjm $$0, fqq $$1, int $$2) {
      this.h = $$1;
      this.k = $$2;
      this.g = new gro(this);
      this.f = new hlj(c, $$0);
   }

   public gry a() {
      return this.l.a();
   }

   public hfz a(alg $$0) {
      return this.d.getOrDefault($$0, this.l.b());
   }

   public hfv.a b(alg $$0) {
      return this.e.getOrDefault($$0, hfv.a.a);
   }

   public gro b() {
      return this.g;
   }

   @Override
   public final CompletableFuture<Void> reload(auw.a $$0, avd $$1, Executor $$2, Executor $$3) {
      CompletableFuture<gjk> $$4 = CompletableFuture.supplyAsync(gjk::a, $$2);
      CompletableFuture<gri> $$5 = $$4.thenApplyAsync(gri::a, $$2);
      CompletableFuture<Map<alg, hmf>> $$6 = a($$1, $$2);
      CompletableFuture<hlm.b> $$7 = hlm.a($$1, $$2);
      CompletableFuture<hln.a> $$8 = hln.a($$1, $$2);
      CompletableFuture<hlx.b> $$9 = CompletableFuture.allOf($$6, $$7, $$8).thenApplyAsync($$3x -> a($$6.join(), $$7.join(), $$8.join()), $$2);
      CompletableFuture<Object2IntMap<eao>> $$10 = $$7.thenApplyAsync($$0x -> a(this.h, $$0x), $$2);
      Map<alg, CompletableFuture<hlj.b>> $$11 = this.f.a($$1, this.k, $$2);
      return CompletableFuture.allOf(Stream.concat($$11.values().stream(), Stream.of($$9, $$10, $$7, $$8, $$4, $$5, $$6)).toArray(CompletableFuture[]::new))
         .thenComposeAsync($$9x -> {
            Map<alg, hlj.b> $$10x = ag.a($$11, CompletableFuture::join);
            hlx.b $$11x = $$9.join();
            Object2IntMap<eao> $$12 = $$10.join();
            Set<alg> $$13 = Sets.difference($$6.join().keySet(), $$11x.b.keySet());
            if (!$$13.isEmpty()) {
               a.debug("Unreferenced models: \n{}", $$13.stream().sorted().map($$0xx -> "\t" + $$0xx + "\n").collect(Collectors.joining()));
            }

            hlt $$14 = new hlt($$4.join(), $$7.join().a(), $$8.join().a(), $$11x.b(), $$11x.a());
            return a($$10x, $$14, $$12, $$4.join(), $$5.join(), $$2);
         }, $$2)
         .thenCompose($$0x -> $$0x.g.thenApply($$1x -> $$0x))
         .thenCompose($$0::wait)
         .thenAcceptAsync($$0x -> this.a($$0x, bqp.a()), $$3);
   }

   private static CompletableFuture<Map<alg, hmf>> a(avd $$0, Executor $$1) {
      return CompletableFuture.<Map<alg, avb>>supplyAsync(() -> b.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<alg, grw>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<alg, avb> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               alg $$1xx = b.b($$3.getKey());

               try {
                  Pair var3;
                  try (Reader $$2x = $$3.getValue().e()) {
                     var3 = Pair.of($$1xx, grw.a($$2x));
                  }

                  return var3;
               } catch (Exception var7) {
                  a.error("Failed to load model {}", $$3.getKey(), var7);
                  return null;
               }
            }, $$1));
         }

         return ag.d($$2).thenApply($$0xx -> $$0xx.stream().filter(Objects::nonNull).collect(Collectors.toUnmodifiableMap(Pair::getFirst, Pair::getSecond)));
      });
   }

   private static hlx.b a(Map<alg, hmf> $$0, hlm.b $$1, hln.a $$2) {
      hlx.b var5;
      try (bqv $$3 = bqp.a().d("dependencies")) {
         hlv $$4 = new hlv($$0, hlr.a());
         $$4.a(gsa.a, new gsa());
         $$1.a().values().forEach($$4::a);
         $$2.a().values().forEach($$1x -> $$4.a($$1x.a()));
         var5 = new hlx.b($$4.a(), $$4.b());
      }

      return var5;
   }

   private static CompletableFuture<hlx.a> a(final Map<alg, hlj.b> $$0, hlt $$1, Object2IntMap<eao> $$2, gjk $$3, gri $$4, Executor $$5) {
      CompletableFuture<Void> $$6 = CompletableFuture.allOf($$0.values().stream().map(hlj.b::b).toArray(CompletableFuture[]::new));
      final Multimap<String, hlq> $$7 = Multimaps.synchronizedMultimap(HashMultimap.create());
      final Multimap<String, String> $$8 = Multimaps.synchronizedMultimap(HashMultimap.create());
      return $$1.a(new hmd() {
            private final hjk d = $$0.get(hjj.c).a();

            @Override
            public hjk a(hlq $$0x, hlu $$1) {
               hlj.b $$2 = $$0.get($$0.a());
               hjk $$3 = $$2.a($$0.b());
               if ($$3 != null) {
                  return $$3;
               } else {
                  $$7.put($$1.debugName(), $$0);
                  return $$2.a();
               }
            }

            @Override
            public hjk a(String $$0x, hlu $$1) {
               $$8.put($$1.debugName(), $$0);
               return this.d;
            }
         }, $$5)
         .thenApply(
            $$7x -> {
               $$7.asMap()
                  .forEach(
                     ($$0xx, $$1xx) -> a.warn(
                           "Missing textures in model {}:\n{}",
                           $$0xx,
                           $$1xx.stream().sorted(hlq.a).map($$0xxx -> "    " + $$0xxx.a() + ":" + $$0xxx.b()).collect(Collectors.joining("\n"))
                        )
                  );
               $$8.asMap()
                  .forEach(
                     ($$0xx, $$1xx) -> a.warn(
                           "Missing texture references in model {}:\n{}",
                           $$0xx,
                           $$1xx.stream().sorted().map($$0xxx -> "    " + $$0xxx).collect(Collectors.joining("\n"))
                        )
                  );
               Map<eao, gry> $$8x = a($$7x.b(), $$7x.a().a());
               return new hlx.a($$7x, $$2, $$8x, $$0, $$3, $$4, $$6);
            }
         );
   }

   private static Map<eao, gry> a(Map<eao, gry> $$0, gry $$1) {
      Object var8;
      try (bqv $$2 = bqp.a().d("block state dispatch")) {
         Map<eao, gry> $$3 = new IdentityHashMap<>($$0);

         for (dmm $$4 : mg.e) {
            $$4.l().a().forEach($$2x -> {
               if ($$0.putIfAbsent($$2x, $$1) == null) {
                  a.warn("Missing model for variant: '{}'", $$2x);
               }
            });
         }

         var8 = $$3;
      }

      return (Map<eao, gry>)var8;
   }

   private static Object2IntMap<eao> a(fqq $$0, hlm.b $$1) {
      Object2IntMap var3;
      try (bqv $$2 = bqp.a().d("block groups")) {
         var3 = hlw.a($$0, $$1);
      }

      return var3;
   }

   private void a(hlx.a $$0, bqq $$1) {
      $$1.a("upload");
      $$0.d.values().forEach(hlj.b::c);
      hlt.a $$2 = $$0.a;
      this.d = $$2.c();
      this.e = $$2.d();
      this.m = $$0.b;
      this.l = $$2.a();
      $$1.b("cache");
      this.g.a($$0.c);
      this.j = $$0.f;
      this.i = $$0.e;
      $$1.c();
   }

   public boolean a(eao $$0, eao $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.m.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.m.getInt($$1);
            if ($$2 == $$3) {
               ewv $$4 = $$0.y();
               ewv $$5 = $$1.y();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public hjj c(alg $$0) {
      return this.f.a($$0);
   }

   @Override
   public void close() {
      this.f.close();
   }

   public void a(int $$0) {
      this.k = $$0;
   }

   public Supplier<gri> c() {
      return () -> this.j;
   }

   public Supplier<gjk> d() {
      return () -> this.i;
   }

   static record a(hlt.a a, Object2IntMap<eao> b, Map<eao, gry> c, Map<alg, hlj.b> d, gjk e, gri f, CompletableFuture<Void> g) {
   }

   static record b(hmc a, Map<alg, hmc> b) {
   }
}
