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

public class hkn implements auu, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final akx b = akx.a("models");
   private static final Map<ale, ale> c = Map.of(
      gpy.c, hjx.b, gpy.b, hjx.c, gpy.f, hjx.e, gpy.d, hjx.l, gpy.e, hjx.n, gpy.a, hjx.m, gpy.g, hjx.a, gpy.h, hjx.f, hhy.d, hjx.d
   );
   private Map<hko, hjz> d = Map.of();
   private Map<ale, hep> e = Map.of();
   private Map<ale, hel.a> f = Map.of();
   private final hjy g;
   private final gqg h;
   private final fpi i;
   private gic j = gic.a;
   private gqa k = gqa.a;
   private int l;
   private hjz m;
   private hep n;
   private Object2IntMap<dzo> o = Object2IntMaps.emptyMap();

   public hkn(hib $$0, fpi $$1, int $$2) {
      this.i = $$1;
      this.l = $$2;
      this.h = new gqg(this);
      this.g = new hjy(c, $$0);
   }

   public hjz a(hko $$0) {
      return this.d.getOrDefault($$0, this.m);
   }

   public hjz a() {
      return this.m;
   }

   public hep a(ale $$0) {
      return this.e.getOrDefault($$0, this.n);
   }

   public hel.a b(ale $$0) {
      return this.f.getOrDefault($$0, hel.a.a);
   }

   public gqg b() {
      return this.h;
   }

   @Override
   public final CompletableFuture<Void> a(auu.a $$0, avb $$1, Executor $$2, Executor $$3) {
      hku $$4 = hkh.a();
      CompletableFuture<gic> $$5 = CompletableFuture.supplyAsync(gic::a, $$2);
      CompletableFuture<gqa> $$6 = $$5.thenApplyAsync(gqa::a, $$2);
      CompletableFuture<Map<ale, hku>> $$7 = a($$1, $$2);
      CompletableFuture<hkb.c> $$8 = hkb.a($$4, $$1, $$2);
      CompletableFuture<hkc.a> $$9 = hkc.a($$1, $$2);
      CompletableFuture<hkl> $$10 = CompletableFuture.allOf($$7, $$8, $$9).thenApplyAsync($$4x -> a($$4, $$7.join(), $$8.join(), $$9.join()), $$2);
      CompletableFuture<Object2IntMap<dzo>> $$11 = $$8.thenApplyAsync($$0x -> a(this.i, $$0x), $$2);
      Map<ale, CompletableFuture<hjy.b>> $$12 = this.g.a($$1, this.l, $$2);
      return CompletableFuture.allOf(Stream.concat($$12.values().stream(), Stream.of($$10, $$11, $$8, $$9, $$5, $$6)).toArray(CompletableFuture[]::new))
         .thenApplyAsync($$8x -> {
            Map<ale, hjy.b> $$9x = af.a($$12, CompletableFuture::join);
            hkl $$10x = $$10.join();
            Object2IntMap<dzo> $$11x = $$11.join();
            Set<ale> $$12x = $$10x.d();
            if (!$$12x.isEmpty()) {
               a.debug("Unreferenced models: \n{}", $$12x.stream().sorted().map($$0xx -> "\t" + $$0xx + "\n").collect(Collectors.joining()));
            }

            hkj $$13 = new hkj($$5.join(), $$8.join().b(), $$9.join().a(), $$10x.c(), $$4);
            return a(bqi.a(), $$9x, $$13, $$11x, $$5.join(), $$6.join());
         }, $$2)
         .thenCompose($$0x -> $$0x.g.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$0x -> this.a($$0x, bqi.a()), $$3);
   }

   private static CompletableFuture<Map<ale, hku>> a(avb $$0, Executor $$1) {
      return CompletableFuture.<Map<ale, auz>>supplyAsync(() -> b.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<ale, gqp>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<ale, auz> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               ale $$1xx = b.b($$3.getKey());

               try {
                  Pair var3;
                  try (Reader $$2x = $$3.getValue().e()) {
                     var3 = Pair.of($$1xx, gqp.a($$2x));
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

   private static hkl a(hku $$0, Map<ale, hku> $$1, hkb.c $$2, hkc.a $$3) {
      hkl $$4 = new hkl($$1, $$0);
      $$2.a().forEach($$4::a);
      $$3.a().values().forEach($$1x -> $$4.a($$1x.a()));
      $$4.a();
      $$4.b();
      return $$4;
   }

   private static hkn.a a(bqj $$0, final Map<ale, hjy.b> $$1, hkj $$2, Object2IntMap<dzo> $$3, gic $$4, gqa $$5) {
      $$0.a("baking");
      final Multimap<String, hkg> $$6 = HashMultimap.create();
      final Multimap<String, String> $$7 = HashMultimap.create();
      final hhz $$8 = $$1.get(hhy.d).a();
      hkj.b $$9 = $$2.a(new hkj.d() {
         @Override
         public hhz a(hkk $$0, hkg $$1x) {
            hjy.b $$2 = $$1.get($$1.a());
            hhz $$3 = $$2.a($$1.b());
            if ($$3 != null) {
               return $$3;
            } else {
               $$6.put($$0.get(), $$1);
               return $$2.a();
            }
         }

         @Override
         public hhz a(hkk $$0, String $$1x) {
            $$7.put($$0.get(), $$1);
            return $$8;
         }
      });
      $$6.asMap()
         .forEach(
            ($$0x, $$1x) -> a.warn(
                  "Missing textures in model {}:\n{}",
                  $$0x,
                  $$1x.stream().sorted(hkg.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$7.asMap()
         .forEach(
            ($$0x, $$1x) -> a.warn(
                  "Missing texture references in model {}:\n{}", $$0x, $$1x.stream().sorted().map($$0xx -> "    " + $$0xx).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<dzo, hjz> $$10 = a($$9.b(), $$9.a());
      CompletableFuture<Void> $$11 = CompletableFuture.allOf($$1.values().stream().map(hjy.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      return new hkn.a($$9, $$3, $$10, $$1, $$4, $$5, $$11);
   }

   private static Map<dzo, hjz> a(Map<hko, hjz> $$0, hjz $$1) {
      Map<dzo, hjz> $$2 = new IdentityHashMap<>();

      for (dlu $$3 : mf.e) {
         $$3.l().a().forEach($$3x -> {
            ale $$4 = $$3x.b().p().h().a();
            hko $$5 = gqg.a($$4, $$3x);
            hjz $$6 = $$0.get($$5);
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

   private static Object2IntMap<dzo> a(fpi $$0, hkb.c $$1) {
      return hkm.a($$0, $$1);
   }

   private void a(hkn.a $$0, bqj $$1) {
      $$1.a("upload");
      $$0.d.values().forEach(hjy.b::c);
      hkj.b $$2 = $$0.a;
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

   public boolean a(dzo $$0, dzo $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.o.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.o.getInt($$1);
            if ($$2 == $$3) {
               evv $$4 = $$0.y();
               evv $$5 = $$1.y();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public hhy c(ale $$0) {
      return this.g.a($$0);
   }

   @Override
   public void close() {
      this.g.close();
   }

   public void a(int $$0) {
      this.l = $$0;
   }

   public Supplier<gqa> d() {
      return () -> this.k;
   }

   public Supplier<gic> e() {
      return () -> this.j;
   }

   static record a(hkj.b a, Object2IntMap<dzo> b, Map<dzo, hjz> c, Map<ale, hjy.b> d, gic e, gqa f, CompletableFuture<Void> g) {
   }
}
