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

public class hme implements auw, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final akz b = akz.a("models");
   private static final Map<alg, alg> c = Map.of(
      grl.c, hlp.b, grl.b, hlp.c, grl.f, hlp.e, grl.d, hlp.l, grl.e, hlp.n, grl.a, hlp.m, grl.g, hlp.a, grl.h, hlp.f, hjp.c, hlp.d
   );
   private Map<alg, hgf> d = Map.of();
   private Map<alg, hgb.a> e = Map.of();
   private final hlq f;
   private final grt g;
   private final fqv h;
   private gjp i = gjp.a;
   private grn j = grn.a;
   private int k;
   private hma.b l;
   private Object2IntMap<eat> m = Object2IntMaps.emptyMap();

   public hme(hjs $$0, fqv $$1, int $$2) {
      this.h = $$1;
      this.k = $$2;
      this.g = new grt(this);
      this.f = new hlq(c, $$0);
   }

   public gsd a() {
      return this.l.a();
   }

   public hgf a(alg $$0) {
      return this.d.getOrDefault($$0, this.l.b());
   }

   public hgb.a b(alg $$0) {
      return this.e.getOrDefault($$0, hgb.a.a);
   }

   public grt b() {
      return this.g;
   }

   @Override
   public final CompletableFuture<Void> reload(auw.a $$0, avd $$1, Executor $$2, Executor $$3) {
      CompletableFuture<gjp> $$4 = CompletableFuture.supplyAsync(gjp::a, $$2);
      CompletableFuture<grn> $$5 = $$4.thenApplyAsync(grn::a, $$2);
      CompletableFuture<Map<alg, hmm>> $$6 = a($$1, $$2);
      CompletableFuture<hlt.b> $$7 = hlt.a($$1, $$2);
      CompletableFuture<hlu.a> $$8 = hlu.a($$1, $$2);
      CompletableFuture<hme.b> $$9 = CompletableFuture.allOf($$6, $$7, $$8).thenApplyAsync($$3x -> a($$6.join(), $$7.join(), $$8.join()), $$2);
      CompletableFuture<Object2IntMap<eat>> $$10 = $$7.thenApplyAsync($$0x -> a(this.h, $$0x), $$2);
      Map<alg, CompletableFuture<hlq.b>> $$11 = this.f.a($$1, this.k, $$2);
      return CompletableFuture.allOf(Stream.concat($$11.values().stream(), Stream.of($$9, $$10, $$7, $$8, $$4, $$5, $$6)).toArray(CompletableFuture[]::new))
         .thenComposeAsync($$9x -> {
            Map<alg, hlq.b> $$10x = ag.a($$11, CompletableFuture::join);
            hme.b $$11x = $$9.join();
            Object2IntMap<eat> $$12 = $$10.join();
            Set<alg> $$13 = Sets.difference($$6.join().keySet(), $$11x.b.keySet());
            if (!$$13.isEmpty()) {
               a.debug("Unreferenced models: \n{}", $$13.stream().sorted().map($$0xx -> "\t" + $$0xx + "\n").collect(Collectors.joining()));
            }

            hma $$14 = new hma($$4.join(), $$7.join().a(), $$8.join().a(), $$11x.b(), $$11x.a());
            return a($$10x, $$14, $$12, $$4.join(), $$5.join(), $$2);
         }, $$2)
         .thenCompose($$0x -> $$0x.g.thenApply($$1x -> $$0x))
         .thenCompose($$0::wait)
         .thenAcceptAsync($$0x -> this.a($$0x, bqp.a()), $$3);
   }

   private static CompletableFuture<Map<alg, hmm>> a(avd $$0, Executor $$1) {
      return CompletableFuture.<Map<alg, avb>>supplyAsync(() -> b.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<alg, gsb>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<alg, avb> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               alg $$1xx = b.b($$3.getKey());

               try {
                  Pair var3;
                  try (Reader $$2x = $$3.getValue().e()) {
                     var3 = Pair.of($$1xx, gsb.a($$2x));
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

   private static hme.b a(Map<alg, hmm> $$0, hlt.b $$1, hlu.a $$2) {
      hme.b var5;
      try (bqv $$3 = bqp.a().d("dependencies")) {
         hmc $$4 = new hmc($$0, hly.a());
         $$4.a(gsf.a, new gsf());
         $$1.a().values().forEach($$4::a);
         $$2.a().values().forEach($$1x -> $$4.a($$1x.a()));
         var5 = new hme.b($$4.a(), $$4.b());
      }

      return var5;
   }

   private static CompletableFuture<hme.a> a(final Map<alg, hlq.b> $$0, hma $$1, Object2IntMap<eat> $$2, gjp $$3, grn $$4, Executor $$5) {
      CompletableFuture<Void> $$6 = CompletableFuture.allOf($$0.values().stream().map(hlq.b::b).toArray(CompletableFuture[]::new));
      final Multimap<String, hlx> $$7 = Multimaps.synchronizedMultimap(HashMultimap.create());
      final Multimap<String, String> $$8 = Multimaps.synchronizedMultimap(HashMultimap.create());
      return $$1.a(new hmk() {
            private final hjq d = $$0.get(hjp.c).a();

            @Override
            public hjq a(hlx $$0x, hmb $$1) {
               hlq.b $$2 = $$0.get($$0.a());
               hjq $$3 = $$2.a($$0.b());
               if ($$3 != null) {
                  return $$3;
               } else {
                  $$7.put($$1.debugName(), $$0);
                  return $$2.a();
               }
            }

            @Override
            public hjq a(String $$0x, hmb $$1) {
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
                           $$1xx.stream().sorted(hlx.a).map($$0xxx -> "    " + $$0xxx.a() + ":" + $$0xxx.b()).collect(Collectors.joining("\n"))
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
               Map<eat, gsd> $$8x = a($$7x.b(), $$7x.a().a());
               return new hme.a($$7x, $$2, $$8x, $$0, $$3, $$4, $$6);
            }
         );
   }

   private static Map<eat, gsd> a(Map<eat, gsd> $$0, gsd $$1) {
      Object var8;
      try (bqv $$2 = bqp.a().d("block state dispatch")) {
         Map<eat, gsd> $$3 = new IdentityHashMap<>($$0);

         for (dmr $$4 : mg.e) {
            $$4.l().a().forEach($$2x -> {
               if ($$0.putIfAbsent($$2x, $$1) == null) {
                  a.warn("Missing model for variant: '{}'", $$2x);
               }
            });
         }

         var8 = $$3;
      }

      return (Map<eat, gsd>)var8;
   }

   private static Object2IntMap<eat> a(fqv $$0, hlt.b $$1) {
      Object2IntMap var3;
      try (bqv $$2 = bqp.a().d("block groups")) {
         var3 = hmd.a($$0, $$1);
      }

      return var3;
   }

   private void a(hme.a $$0, bqq $$1) {
      $$1.a("upload");
      $$0.d.values().forEach(hlq.b::c);
      hma.a $$2 = $$0.a;
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

   public boolean a(eat $$0, eat $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.m.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.m.getInt($$1);
            if ($$2 == $$3) {
               exa $$4 = $$0.y();
               exa $$5 = $$1.y();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public hjp c(alg $$0) {
      return this.f.a($$0);
   }

   @Override
   public void close() {
      this.f.close();
   }

   public void a(int $$0) {
      this.k = $$0;
   }

   public Supplier<grn> c() {
      return () -> this.j;
   }

   public Supplier<gjp> d() {
      return () -> this.i;
   }

   static record a(hma.a a, Object2IntMap<eat> b, Map<eat, gsd> c, Map<alg, hlq.b> d, gjp e, grn f, CompletableFuture<Void> g) {
   }

   static record b(hmj a, Map<alg, hmj> b) {
   }
}
