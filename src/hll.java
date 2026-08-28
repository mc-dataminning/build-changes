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

public class hll implements auw, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final akz b = akz.a("models");
   private static final Map<alg, alg> c = Map.of(
      gqv.c, hkv.b, gqv.b, hkv.c, gqv.f, hkv.e, gqv.d, hkv.l, gqv.e, hkv.n, gqv.a, hkv.m, gqv.g, hkv.a, gqv.h, hkv.f, hiw.d, hkv.d
   );
   private Map<hlm, hkx> d = Map.of();
   private Map<alg, hfn> e = Map.of();
   private Map<alg, hfj.a> f = Map.of();
   private final hkw g;
   private final grd h;
   private final fqb i;
   private giy j = giy.a;
   private gqx k = gqx.a;
   private int l;
   private hkx m;
   private hfn n;
   private Object2IntMap<eah> o = Object2IntMaps.emptyMap();

   public hll(hiz $$0, fqb $$1, int $$2) {
      this.i = $$1;
      this.l = $$2;
      this.h = new grd(this);
      this.g = new hkw(c, $$0);
   }

   public hkx a(hlm $$0) {
      return this.d.getOrDefault($$0, this.m);
   }

   public hkx a() {
      return this.m;
   }

   public hfn a(alg $$0) {
      return this.e.getOrDefault($$0, this.n);
   }

   public hfj.a b(alg $$0) {
      return this.f.getOrDefault($$0, hfj.a.a);
   }

   public grd b() {
      return this.h;
   }

   @Override
   public final CompletableFuture<Void> a(auw.a $$0, avd $$1, Executor $$2, Executor $$3) {
      hls $$4 = hlf.a();
      CompletableFuture<giy> $$5 = CompletableFuture.supplyAsync(giy::a, $$2);
      CompletableFuture<gqx> $$6 = $$5.thenApplyAsync(gqx::a, $$2);
      CompletableFuture<Map<alg, hls>> $$7 = a($$1, $$2);
      CompletableFuture<hkz.c> $$8 = hkz.a($$4, $$1, $$2);
      CompletableFuture<hla.a> $$9 = hla.a($$1, $$2);
      CompletableFuture<hlj> $$10 = CompletableFuture.allOf($$7, $$8, $$9).thenApplyAsync($$4x -> a($$4, $$7.join(), $$8.join(), $$9.join()), $$2);
      CompletableFuture<Object2IntMap<eah>> $$11 = $$8.thenApplyAsync($$0x -> a(this.i, $$0x), $$2);
      Map<alg, CompletableFuture<hkw.b>> $$12 = this.g.a($$1, this.l, $$2);
      return CompletableFuture.allOf(Stream.concat($$12.values().stream(), Stream.of($$10, $$11, $$8, $$9, $$5, $$6)).toArray(CompletableFuture[]::new))
         .thenApplyAsync($$8x -> {
            Map<alg, hkw.b> $$9x = af.a($$12, CompletableFuture::join);
            hlj $$10x = $$10.join();
            Object2IntMap<eah> $$11x = $$11.join();
            Set<alg> $$12x = $$10x.d();
            if (!$$12x.isEmpty()) {
               a.debug("Unreferenced models: \n{}", $$12x.stream().sorted().map($$0xx -> "\t" + $$0xx + "\n").collect(Collectors.joining()));
            }

            hlh $$13 = new hlh($$5.join(), $$8.join().b(), $$9.join().a(), $$10x.c(), $$4);
            return a(bqn.a(), $$9x, $$13, $$11x, $$5.join(), $$6.join());
         }, $$2)
         .thenCompose($$0x -> $$0x.g.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$0x -> this.a($$0x, bqn.a()), $$3);
   }

   private static CompletableFuture<Map<alg, hls>> a(avd $$0, Executor $$1) {
      return CompletableFuture.<Map<alg, avb>>supplyAsync(() -> b.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<alg, grm>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<alg, avb> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               alg $$1xx = b.b($$3.getKey());

               try {
                  Pair var3;
                  try (Reader $$2x = $$3.getValue().e()) {
                     var3 = Pair.of($$1xx, grm.a($$2x));
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

   private static hlj a(hls $$0, Map<alg, hls> $$1, hkz.c $$2, hla.a $$3) {
      hlj $$4 = new hlj($$1, $$0);
      $$2.a().forEach($$4::a);
      $$3.a().values().forEach($$1x -> $$4.a($$1x.a()));
      $$4.a();
      $$4.b();
      return $$4;
   }

   private static hll.a a(bqo $$0, final Map<alg, hkw.b> $$1, hlh $$2, Object2IntMap<eah> $$3, giy $$4, gqx $$5) {
      $$0.a("baking");
      final Multimap<String, hle> $$6 = HashMultimap.create();
      final Multimap<String, String> $$7 = HashMultimap.create();
      final hix $$8 = $$1.get(hiw.d).a();
      hlh.b $$9 = $$2.a(new hlh.d() {
         @Override
         public hix a(hli $$0, hle $$1x) {
            hkw.b $$2 = $$1.get($$1.a());
            hix $$3 = $$2.a($$1.b());
            if ($$3 != null) {
               return $$3;
            } else {
               $$6.put($$0.get(), $$1);
               return $$2.a();
            }
         }

         @Override
         public hix a(hli $$0, String $$1x) {
            $$7.put($$0.get(), $$1);
            return $$8;
         }
      });
      $$6.asMap()
         .forEach(
            ($$0x, $$1x) -> a.warn(
                  "Missing textures in model {}:\n{}",
                  $$0x,
                  $$1x.stream().sorted(hle.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$7.asMap()
         .forEach(
            ($$0x, $$1x) -> a.warn(
                  "Missing texture references in model {}:\n{}", $$0x, $$1x.stream().sorted().map($$0xx -> "    " + $$0xx).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<eah, hkx> $$10 = a($$9.b(), $$9.a());
      CompletableFuture<Void> $$11 = CompletableFuture.allOf($$1.values().stream().map(hkw.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      return new hll.a($$9, $$3, $$10, $$1, $$4, $$5, $$11);
   }

   private static Map<eah, hkx> a(Map<hlm, hkx> $$0, hkx $$1) {
      Map<eah, hkx> $$2 = new IdentityHashMap<>();

      for (dmf $$3 : mf.e) {
         $$3.l().a().forEach($$3x -> {
            alg $$4 = $$3x.b().p().h().a();
            hlm $$5 = grd.a($$4, $$3x);
            hkx $$6 = $$0.get($$5);
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

   private static Object2IntMap<eah> a(fqb $$0, hkz.c $$1) {
      return hlk.a($$0, $$1);
   }

   private void a(hll.a $$0, bqo $$1) {
      $$1.a("upload");
      $$0.d.values().forEach(hkw.b::c);
      hlh.b $$2 = $$0.a;
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

   public boolean a(eah $$0, eah $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.o.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.o.getInt($$1);
            if ($$2 == $$3) {
               ewo $$4 = $$0.y();
               ewo $$5 = $$1.y();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public hiw c(alg $$0) {
      return this.g.a($$0);
   }

   @Override
   public void close() {
      this.g.close();
   }

   public void a(int $$0) {
      this.l = $$0;
   }

   public Supplier<gqx> d() {
      return () -> this.k;
   }

   public Supplier<giy> e() {
      return () -> this.j;
   }

   static record a(hlh.b a, Object2IntMap<eah> b, Map<eah, hkx> c, Map<alg, hkw.b> d, giy e, gqx f, CompletableFuture<Void> g) {
   }
}
