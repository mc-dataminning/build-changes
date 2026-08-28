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

public class hhf implements auj, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final ako b = ako.a("models");
   private static final Map<akv, akv> c = Map.of(
      gms.c,
      akv.b("banner_patterns"),
      gms.b,
      akv.b("beds"),
      gms.f,
      akv.b("chests"),
      gms.d,
      akv.b("shield_patterns"),
      gms.e,
      akv.b("signs"),
      gms.a,
      akv.b("shulker_boxes"),
      gms.g,
      akv.b("armor_trims"),
      gms.h,
      akv.b("decorated_pot"),
      heq.d,
      akv.b("blocks")
   );
   private Map<hhg, hgr> d = Map.of();
   private Map<akv, hbk> e = Map.of();
   private Map<akv, hbg.a> f = Map.of();
   private final hgq g;
   private final gna h;
   private final fmk i;
   private gey j = gey.a;
   private gmu k = gmu.a;
   private int l;
   private hgr m;
   private hbk n;
   private Object2IntMap<dww> o = Object2IntMaps.emptyMap();

   public hhf(het $$0, fmk $$1, int $$2) {
      this.i = $$1;
      this.l = $$2;
      this.h = new gna(this);
      this.g = new hgq(c, $$0);
   }

   public hgr a(hhg $$0) {
      return this.d.getOrDefault($$0, this.m);
   }

   public hgr a() {
      return this.m;
   }

   public hbk a(akv $$0) {
      return this.e.getOrDefault($$0, this.n);
   }

   public hbg.a b(akv $$0) {
      return this.f.getOrDefault($$0, hbg.a.a);
   }

   public gna b() {
      return this.h;
   }

   @Override
   public final CompletableFuture<Void> a(auj.a $$0, aup $$1, Executor $$2, Executor $$3) {
      hhm $$4 = hgz.a();
      CompletableFuture<gey> $$5 = CompletableFuture.supplyAsync(gey::a, $$2);
      CompletableFuture<gmu> $$6 = $$5.thenApplyAsync(gmu::a, $$2);
      CompletableFuture<Map<akv, hhm>> $$7 = a($$1, $$2);
      CompletableFuture<hgt.c> $$8 = hgt.a($$4, $$1, $$2);
      CompletableFuture<hgu.a> $$9 = hgu.a($$1, $$2);
      CompletableFuture<hhd> $$10 = CompletableFuture.allOf($$7, $$8, $$9).thenApplyAsync($$4x -> a($$4, $$7.join(), $$8.join(), $$9.join()), $$2);
      CompletableFuture<Object2IntMap<dww>> $$11 = $$8.thenApplyAsync($$0x -> a(this.i, $$0x), $$2);
      Map<akv, CompletableFuture<hgq.b>> $$12 = this.g.a($$1, this.l, $$2);
      return CompletableFuture.allOf(Stream.concat($$12.values().stream(), Stream.of($$10, $$11, $$8, $$9, $$5, $$6)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$8x -> {
               Map<akv, hgq.b> $$9x = $$12.entrySet()
                  .stream()
                  .collect(Collectors.toMap(Entry::getKey, $$0xx -> (hgq.b)((CompletableFuture)$$0xx.getValue()).join()));
               hhd $$10x = $$10.join();
               Object2IntMap<dww> $$11x = $$11.join();
               Set<akv> $$12x = $$10x.d();
               if (!$$12x.isEmpty()) {
                  a.debug("Unreferenced models: \n{}", $$12x.stream().sorted().map($$0xx -> "\t" + $$0xx + "\n").collect(Collectors.joining()));
               }

               hhb $$13 = new hhb($$5.join(), $$8.join().b(), $$9.join().a(), $$10x.c(), $$4);
               return a(bor.a(), $$9x, $$13, $$11x, $$5.join(), $$6.join());
            },
            $$2
         )
         .thenCompose($$0x -> $$0x.g.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$0x -> this.a($$0x, bor.a()), $$3);
   }

   private static CompletableFuture<Map<akv, hhm>> a(aup $$0, Executor $$1) {
      return CompletableFuture.<Map<akv, aun>>supplyAsync(() -> b.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<akv, gnj>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<akv, aun> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               akv $$1xx = b.b($$3.getKey());

               try {
                  Pair var3;
                  try (Reader $$2x = $$3.getValue().e()) {
                     var3 = Pair.of($$1xx, gnj.a($$2x));
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

   private static hhd a(hhm $$0, Map<akv, hhm> $$1, hgt.c $$2, hgu.a $$3) {
      hhd $$4 = new hhd($$1, $$0);
      $$2.a().forEach($$4::a);
      $$3.a().values().forEach($$1x -> $$4.a($$1x.a()));
      $$4.a();
      $$4.b();
      return $$4;
   }

   private static hhf.a a(bos $$0, final Map<akv, hgq.b> $$1, hhb $$2, Object2IntMap<dww> $$3, gey $$4, gmu $$5) {
      $$0.a("baking");
      final Multimap<String, hgy> $$6 = HashMultimap.create();
      final Multimap<String, String> $$7 = HashMultimap.create();
      final her $$8 = $$1.get(heq.d).a();
      hhb.b $$9 = $$2.a(new hhb.d() {
         @Override
         public her a(hhc $$0, hgy $$1x) {
            hgq.b $$2 = $$1.get($$1.a());
            her $$3 = $$2.a($$1.b());
            if ($$3 != null) {
               return $$3;
            } else {
               $$6.put($$0.get(), $$1);
               return $$2.a();
            }
         }

         @Override
         public her a(hhc $$0, String $$1x) {
            $$7.put($$0.get(), $$1);
            return $$8;
         }
      });
      $$6.asMap()
         .forEach(
            ($$0x, $$1x) -> a.warn(
                  "Missing textures in model {}:\n{}",
                  $$0x,
                  $$1x.stream().sorted(hgy.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$7.asMap()
         .forEach(
            ($$0x, $$1x) -> a.warn(
                  "Missing texture references in model {}:\n{}", $$0x, $$1x.stream().sorted().map($$0xx -> "    " + $$0xx).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<dww, hgr> $$10 = a($$9.b(), $$9.a());
      CompletableFuture<Void> $$11 = CompletableFuture.allOf($$1.values().stream().map(hgq.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      return new hhf.a($$9, $$3, $$10, $$1, $$4, $$5, $$11);
   }

   private static Map<dww, hgr> a(Map<hhg, hgr> $$0, hgr $$1) {
      Map<dww, hgr> $$2 = new IdentityHashMap<>();

      for (djl $$3 : mb.e) {
         $$3.l().a().forEach($$3x -> {
            akv $$4 = $$3x.b().p().h().a();
            hhg $$5 = gna.a($$4, $$3x);
            hgr $$6 = $$0.get($$5);
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

   private static Object2IntMap<dww> a(fmk $$0, hgt.c $$1) {
      return hhe.a($$0, $$1);
   }

   private void a(hhf.a $$0, bos $$1) {
      $$1.a("upload");
      $$0.d.values().forEach(hgq.b::c);
      hhb.b $$2 = $$0.a;
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

   public boolean a(dww $$0, dww $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.o.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.o.getInt($$1);
            if ($$2 == $$3) {
               esy $$4 = $$0.y();
               esy $$5 = $$1.y();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public heq c(akv $$0) {
      return this.g.a($$0);
   }

   @Override
   public void close() {
      this.g.close();
   }

   public void a(int $$0) {
      this.l = $$0;
   }

   public Supplier<gmu> d() {
      return () -> this.k;
   }

   public Supplier<gey> e() {
      return () -> this.j;
   }

   static record a(hhb.b a, Object2IntMap<dww> b, Map<dww, hgr> c, Map<akv, hgq.b> d, gey e, gmu f, CompletableFuture<Void> g) {
   }
}
