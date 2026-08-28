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

public class hhg implements auj, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final ako b = ako.a("models");
   private static final Map<akv, akv> c = Map.of(
      gmt.c,
      akv.b("banner_patterns"),
      gmt.b,
      akv.b("beds"),
      gmt.f,
      akv.b("chests"),
      gmt.d,
      akv.b("shield_patterns"),
      gmt.e,
      akv.b("signs"),
      gmt.a,
      akv.b("shulker_boxes"),
      gmt.g,
      akv.b("armor_trims"),
      gmt.h,
      akv.b("decorated_pot"),
      her.d,
      akv.b("blocks")
   );
   private Map<hhh, hgs> d = Map.of();
   private Map<akv, hbl> e = Map.of();
   private Map<akv, hbh.a> f = Map.of();
   private final hgr g;
   private final gnb h;
   private final fml i;
   private gez j = gez.a;
   private gmv k = gmv.a;
   private int l;
   private hgs m;
   private hbl n;
   private Object2IntMap<dwx> o = Object2IntMaps.emptyMap();

   public hhg(heu $$0, fml $$1, int $$2) {
      this.i = $$1;
      this.l = $$2;
      this.h = new gnb(this);
      this.g = new hgr(c, $$0);
   }

   public hgs a(hhh $$0) {
      return this.d.getOrDefault($$0, this.m);
   }

   public hgs a() {
      return this.m;
   }

   public hbl a(akv $$0) {
      return this.e.getOrDefault($$0, this.n);
   }

   public hbh.a b(akv $$0) {
      return this.f.getOrDefault($$0, hbh.a.a);
   }

   public gnb b() {
      return this.h;
   }

   @Override
   public final CompletableFuture<Void> a(auj.a $$0, aup $$1, Executor $$2, Executor $$3) {
      hhn $$4 = hha.a();
      CompletableFuture<gez> $$5 = CompletableFuture.supplyAsync(gez::a, $$2);
      CompletableFuture<gmv> $$6 = $$5.thenApplyAsync(gmv::a, $$2);
      CompletableFuture<Map<akv, hhn>> $$7 = a($$1, $$2);
      CompletableFuture<hgu.c> $$8 = hgu.a($$4, $$1, $$2);
      CompletableFuture<hgv.a> $$9 = hgv.a($$1, $$2);
      CompletableFuture<hhe> $$10 = CompletableFuture.allOf($$7, $$8, $$9).thenApplyAsync($$4x -> a($$4, $$7.join(), $$8.join(), $$9.join()), $$2);
      CompletableFuture<Object2IntMap<dwx>> $$11 = $$8.thenApplyAsync($$0x -> a(this.i, $$0x), $$2);
      Map<akv, CompletableFuture<hgr.b>> $$12 = this.g.a($$1, this.l, $$2);
      return CompletableFuture.allOf(Stream.concat($$12.values().stream(), Stream.of($$10, $$11, $$8, $$9, $$5, $$6)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$8x -> {
               Map<akv, hgr.b> $$9x = $$12.entrySet()
                  .stream()
                  .collect(Collectors.toMap(Entry::getKey, $$0xx -> (hgr.b)((CompletableFuture)$$0xx.getValue()).join()));
               hhe $$10x = $$10.join();
               Object2IntMap<dwx> $$11x = $$11.join();
               Set<akv> $$12x = $$10x.d();
               if (!$$12x.isEmpty()) {
                  a.debug("Unreferenced models: \n{}", $$12x.stream().sorted().map($$0xx -> "\t" + $$0xx + "\n").collect(Collectors.joining()));
               }

               hhc $$13 = new hhc($$5.join(), $$8.join().b(), $$9.join().a(), $$10x.c(), $$4);
               return a(bos.a(), $$9x, $$13, $$11x, $$5.join(), $$6.join());
            },
            $$2
         )
         .thenCompose($$0x -> $$0x.g.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$0x -> this.a($$0x, bos.a()), $$3);
   }

   private static CompletableFuture<Map<akv, hhn>> a(aup $$0, Executor $$1) {
      return CompletableFuture.<Map<akv, aun>>supplyAsync(() -> b.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<akv, gnk>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<akv, aun> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               akv $$1xx = b.b($$3.getKey());

               try {
                  Pair var3;
                  try (Reader $$2x = $$3.getValue().e()) {
                     var3 = Pair.of($$1xx, gnk.a($$2x));
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

   private static hhe a(hhn $$0, Map<akv, hhn> $$1, hgu.c $$2, hgv.a $$3) {
      hhe $$4 = new hhe($$1, $$0);
      $$2.a().forEach($$4::a);
      $$3.a().values().forEach($$1x -> $$4.a($$1x.a()));
      $$4.a();
      $$4.b();
      return $$4;
   }

   private static hhg.a a(bot $$0, final Map<akv, hgr.b> $$1, hhc $$2, Object2IntMap<dwx> $$3, gez $$4, gmv $$5) {
      $$0.a("baking");
      final Multimap<String, hgz> $$6 = HashMultimap.create();
      final Multimap<String, String> $$7 = HashMultimap.create();
      final hes $$8 = $$1.get(her.d).a();
      hhc.b $$9 = $$2.a(new hhc.d() {
         @Override
         public hes a(hhd $$0, hgz $$1x) {
            hgr.b $$2 = $$1.get($$1.a());
            hes $$3 = $$2.a($$1.b());
            if ($$3 != null) {
               return $$3;
            } else {
               $$6.put($$0.get(), $$1);
               return $$2.a();
            }
         }

         @Override
         public hes a(hhd $$0, String $$1x) {
            $$7.put($$0.get(), $$1);
            return $$8;
         }
      });
      $$6.asMap()
         .forEach(
            ($$0x, $$1x) -> a.warn(
                  "Missing textures in model {}:\n{}",
                  $$0x,
                  $$1x.stream().sorted(hgz.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$7.asMap()
         .forEach(
            ($$0x, $$1x) -> a.warn(
                  "Missing texture references in model {}:\n{}", $$0x, $$1x.stream().sorted().map($$0xx -> "    " + $$0xx).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<dwx, hgs> $$10 = a($$9.b(), $$9.a());
      CompletableFuture<Void> $$11 = CompletableFuture.allOf($$1.values().stream().map(hgr.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      return new hhg.a($$9, $$3, $$10, $$1, $$4, $$5, $$11);
   }

   private static Map<dwx, hgs> a(Map<hhh, hgs> $$0, hgs $$1) {
      Map<dwx, hgs> $$2 = new IdentityHashMap<>();

      for (djm $$3 : mb.e) {
         $$3.l().a().forEach($$3x -> {
            akv $$4 = $$3x.b().p().h().a();
            hhh $$5 = gnb.a($$4, $$3x);
            hgs $$6 = $$0.get($$5);
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

   private static Object2IntMap<dwx> a(fml $$0, hgu.c $$1) {
      return hhf.a($$0, $$1);
   }

   private void a(hhg.a $$0, bot $$1) {
      $$1.a("upload");
      $$0.d.values().forEach(hgr.b::c);
      hhc.b $$2 = $$0.a;
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

   public boolean a(dwx $$0, dwx $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.o.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.o.getInt($$1);
            if ($$2 == $$3) {
               esz $$4 = $$0.y();
               esz $$5 = $$1.y();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public her c(akv $$0) {
      return this.g.a($$0);
   }

   @Override
   public void close() {
      this.g.close();
   }

   public void a(int $$0) {
      this.l = $$0;
   }

   public Supplier<gmv> d() {
      return () -> this.k;
   }

   public Supplier<gez> e() {
      return () -> this.j;
   }

   static record a(hhc.b a, Object2IntMap<dwx> b, Map<dwx, hgs> c, Map<akv, hgr.b> d, gez e, gmv f, CompletableFuture<Void> g) {
   }
}
