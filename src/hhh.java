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

public class hhh implements auj, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final ako b = ako.a("models");
   private static final Map<akv, akv> c = Map.of(
      gmu.c,
      akv.b("banner_patterns"),
      gmu.b,
      akv.b("beds"),
      gmu.f,
      akv.b("chests"),
      gmu.d,
      akv.b("shield_patterns"),
      gmu.e,
      akv.b("signs"),
      gmu.a,
      akv.b("shulker_boxes"),
      gmu.g,
      akv.b("armor_trims"),
      gmu.h,
      akv.b("decorated_pot"),
      hes.d,
      akv.b("blocks")
   );
   private Map<hhi, hgt> d = Map.of();
   private Map<akv, hbm> e = Map.of();
   private Map<akv, hbi.a> f = Map.of();
   private final hgs g;
   private final gnc h;
   private final fmm i;
   private gfa j = gfa.a;
   private gmw k = gmw.a;
   private int l;
   private hgt m;
   private hbm n;
   private Object2IntMap<dwy> o = Object2IntMaps.emptyMap();

   public hhh(hev $$0, fmm $$1, int $$2) {
      this.i = $$1;
      this.l = $$2;
      this.h = new gnc(this);
      this.g = new hgs(c, $$0);
   }

   public hgt a(hhi $$0) {
      return this.d.getOrDefault($$0, this.m);
   }

   public hgt a() {
      return this.m;
   }

   public hbm a(akv $$0) {
      return this.e.getOrDefault($$0, this.n);
   }

   public hbi.a b(akv $$0) {
      return this.f.getOrDefault($$0, hbi.a.a);
   }

   public gnc b() {
      return this.h;
   }

   @Override
   public final CompletableFuture<Void> a(auj.a $$0, aup $$1, Executor $$2, Executor $$3) {
      hho $$4 = hhb.a();
      CompletableFuture<gfa> $$5 = CompletableFuture.supplyAsync(gfa::a, $$2);
      CompletableFuture<gmw> $$6 = $$5.thenApplyAsync(gmw::a, $$2);
      CompletableFuture<Map<akv, hho>> $$7 = a($$1, $$2);
      CompletableFuture<hgv.c> $$8 = hgv.a($$4, $$1, $$2);
      CompletableFuture<hgw.a> $$9 = hgw.a($$1, $$2);
      CompletableFuture<hhf> $$10 = CompletableFuture.allOf($$7, $$8, $$9).thenApplyAsync($$4x -> a($$4, $$7.join(), $$8.join(), $$9.join()), $$2);
      CompletableFuture<Object2IntMap<dwy>> $$11 = $$8.thenApplyAsync($$0x -> a(this.i, $$0x), $$2);
      Map<akv, CompletableFuture<hgs.b>> $$12 = this.g.a($$1, this.l, $$2);
      return CompletableFuture.allOf(Stream.concat($$12.values().stream(), Stream.of($$10, $$11, $$8, $$9, $$5, $$6)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$8x -> {
               Map<akv, hgs.b> $$9x = $$12.entrySet()
                  .stream()
                  .collect(Collectors.toMap(Entry::getKey, $$0xx -> (hgs.b)((CompletableFuture)$$0xx.getValue()).join()));
               hhf $$10x = $$10.join();
               Object2IntMap<dwy> $$11x = $$11.join();
               Set<akv> $$12x = $$10x.d();
               if (!$$12x.isEmpty()) {
                  a.debug("Unreferenced models: \n{}", $$12x.stream().sorted().map($$0xx -> "\t" + $$0xx + "\n").collect(Collectors.joining()));
               }

               hhd $$13 = new hhd($$5.join(), $$8.join().b(), $$9.join().a(), $$10x.c(), $$4);
               return a(bot.a(), $$9x, $$13, $$11x, $$5.join(), $$6.join());
            },
            $$2
         )
         .thenCompose($$0x -> $$0x.g.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$0x -> this.a($$0x, bot.a()), $$3);
   }

   private static CompletableFuture<Map<akv, hho>> a(aup $$0, Executor $$1) {
      return CompletableFuture.<Map<akv, aun>>supplyAsync(() -> b.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<akv, gnl>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<akv, aun> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               akv $$1xx = b.b($$3.getKey());

               try {
                  Pair var3;
                  try (Reader $$2x = $$3.getValue().e()) {
                     var3 = Pair.of($$1xx, gnl.a($$2x));
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

   private static hhf a(hho $$0, Map<akv, hho> $$1, hgv.c $$2, hgw.a $$3) {
      hhf $$4 = new hhf($$1, $$0);
      $$2.a().forEach($$4::a);
      $$3.a().values().forEach($$1x -> $$4.a($$1x.a()));
      $$4.a();
      $$4.b();
      return $$4;
   }

   private static hhh.a a(bou $$0, final Map<akv, hgs.b> $$1, hhd $$2, Object2IntMap<dwy> $$3, gfa $$4, gmw $$5) {
      $$0.a("baking");
      final Multimap<String, hha> $$6 = HashMultimap.create();
      final Multimap<String, String> $$7 = HashMultimap.create();
      final het $$8 = $$1.get(hes.d).a();
      hhd.b $$9 = $$2.a(new hhd.d() {
         @Override
         public het a(hhe $$0, hha $$1x) {
            hgs.b $$2 = $$1.get($$1.a());
            het $$3 = $$2.a($$1.b());
            if ($$3 != null) {
               return $$3;
            } else {
               $$6.put($$0.get(), $$1);
               return $$2.a();
            }
         }

         @Override
         public het a(hhe $$0, String $$1x) {
            $$7.put($$0.get(), $$1);
            return $$8;
         }
      });
      $$6.asMap()
         .forEach(
            ($$0x, $$1x) -> a.warn(
                  "Missing textures in model {}:\n{}",
                  $$0x,
                  $$1x.stream().sorted(hha.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$7.asMap()
         .forEach(
            ($$0x, $$1x) -> a.warn(
                  "Missing texture references in model {}:\n{}", $$0x, $$1x.stream().sorted().map($$0xx -> "    " + $$0xx).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<dwy, hgt> $$10 = a($$9.b(), $$9.a());
      CompletableFuture<Void> $$11 = CompletableFuture.allOf($$1.values().stream().map(hgs.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      return new hhh.a($$9, $$3, $$10, $$1, $$4, $$5, $$11);
   }

   private static Map<dwy, hgt> a(Map<hhi, hgt> $$0, hgt $$1) {
      Map<dwy, hgt> $$2 = new IdentityHashMap<>();

      for (djn $$3 : mb.e) {
         $$3.l().a().forEach($$3x -> {
            akv $$4 = $$3x.b().p().h().a();
            hhi $$5 = gnc.a($$4, $$3x);
            hgt $$6 = $$0.get($$5);
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

   private static Object2IntMap<dwy> a(fmm $$0, hgv.c $$1) {
      return hhg.a($$0, $$1);
   }

   private void a(hhh.a $$0, bou $$1) {
      $$1.a("upload");
      $$0.d.values().forEach(hgs.b::c);
      hhd.b $$2 = $$0.a;
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

   public boolean a(dwy $$0, dwy $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.o.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.o.getInt($$1);
            if ($$2 == $$3) {
               eta $$4 = $$0.y();
               eta $$5 = $$1.y();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public hes c(akv $$0) {
      return this.g.a($$0);
   }

   @Override
   public void close() {
      this.g.close();
   }

   public void a(int $$0) {
      this.l = $$0;
   }

   public Supplier<gmw> d() {
      return () -> this.k;
   }

   public Supplier<gfa> e() {
      return () -> this.j;
   }

   static record a(hhd.b a, Object2IntMap<dwy> b, Map<dwy, hgt> c, Map<akv, hgs.b> d, gfa e, gmw f, CompletableFuture<Void> g) {
   }
}
