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

public class hgz implements auj, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final akn b = akn.a("models");
   private static final Map<aku, aku> c = Map.of(
      gms.c,
      aku.b("banner_patterns"),
      gms.b,
      aku.b("beds"),
      gms.f,
      aku.b("chests"),
      gms.d,
      aku.b("shield_patterns"),
      gms.e,
      aku.b("signs"),
      gms.a,
      aku.b("shulker_boxes"),
      gms.g,
      aku.b("armor_trims"),
      gms.h,
      aku.b("decorated_pot"),
      hei.d,
      aku.b("blocks")
   );
   private Map<hha, hgl> d = Map.of();
   private Map<aku, hbi> e = Map.of();
   private final hgk f;
   private final gna g;
   private final fml h;
   private gey i = gey.a;
   private gmu j = gmu.a;
   private int k;
   private hgl l;
   private hbi m;
   private Object2IntMap<dwx> n = Object2IntMaps.emptyMap();

   public hgz(hek $$0, fml $$1, int $$2) {
      this.h = $$1;
      this.k = $$2;
      this.g = new gna(this);
      this.f = new hgk(c, $$0);
   }

   public hgl a(hha $$0) {
      return this.d.getOrDefault($$0, this.l);
   }

   public hgl a() {
      return this.l;
   }

   public hbi a(aku $$0) {
      return this.e.getOrDefault($$0, this.m);
   }

   public gna b() {
      return this.g;
   }

   @Override
   public final CompletableFuture<Void> a(auj.a $$0, aup $$1, Executor $$2, Executor $$3) {
      hhg $$4 = hgt.a();
      CompletableFuture<gey> $$5 = CompletableFuture.supplyAsync(gey::a, $$2);
      CompletableFuture<gmu> $$6 = $$5.thenApplyAsync(gmu::a, $$2);
      CompletableFuture<Map<aku, hhg>> $$7 = a($$1, $$2);
      CompletableFuture<hgn.c> $$8 = hgn.a($$4, $$1, $$2);
      CompletableFuture<hgr.a> $$9 = hgr.a($$1, $$2);
      CompletableFuture<hgx> $$10 = CompletableFuture.allOf($$7, $$8, $$9).thenApplyAsync($$4x -> a($$4, $$7.join(), $$8.join(), $$9.join()), $$2);
      CompletableFuture<Object2IntMap<dwx>> $$11 = $$8.thenApplyAsync($$0x -> a(this.h, $$0x), $$2);
      Map<aku, CompletableFuture<hgk.b>> $$12 = this.f.a($$1, this.k, $$2);
      return CompletableFuture.allOf(Stream.concat($$12.values().stream(), Stream.of($$10, $$11, $$8, $$9, $$5, $$6)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$8x -> {
               Map<aku, hgk.b> $$9x = $$12.entrySet()
                  .stream()
                  .collect(Collectors.toMap(Entry::getKey, $$0xx -> (hgk.b)((CompletableFuture)$$0xx.getValue()).join()));
               hgx $$10x = $$10.join();
               Object2IntMap<dwx> $$11x = $$11.join();
               Set<aku> $$12x = $$10x.d();
               if (!$$12x.isEmpty()) {
                  a.debug("Unreferenced models: \n{}", $$12x.stream().sorted().map($$0xx -> "\t" + $$0xx + "\n").collect(Collectors.joining()));
               }

               hgv $$13 = new hgv($$5.join(), $$8.join().b(), $$9.join().a(), $$10x.c(), $$4);
               return a(bor.a(), $$9x, $$13, $$11x, $$5.join(), $$6.join());
            },
            $$2
         )
         .thenCompose($$0x -> $$0x.g.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$0x -> this.a($$0x, bor.a()), $$3);
   }

   private static CompletableFuture<Map<aku, hhg>> a(aup $$0, Executor $$1) {
      return CompletableFuture.<Map<aku, aun>>supplyAsync(() -> b.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<aku, gnj>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<aku, aun> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               aku $$1xx = b.b($$3.getKey());

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

   private static hgx a(hhg $$0, Map<aku, hhg> $$1, hgn.c $$2, hgr.a $$3) {
      hgx $$4 = new hgx($$1, $$0);
      $$2.a().forEach($$4::a);
      $$3.a().values().forEach($$4::a);
      $$4.a();
      $$4.b();
      return $$4;
   }

   private static hgz.a a(bos $$0, final Map<aku, hgk.b> $$1, hgv $$2, Object2IntMap<dwx> $$3, gey $$4, gmu $$5) {
      $$0.a("baking");
      final Multimap<String, hgs> $$6 = HashMultimap.create();
      final Multimap<String, String> $$7 = HashMultimap.create();
      final hej $$8 = $$1.get(hei.d).a();
      hgv.b $$9 = $$2.a(new hgv.d() {
         @Override
         public hej a(hgw $$0, hgs $$1x) {
            hgk.b $$2 = $$1.get($$1.a());
            hej $$3 = $$2.a($$1.b());
            if ($$3 != null) {
               return $$3;
            } else {
               $$6.put($$0.get(), $$1);
               return $$2.a();
            }
         }

         @Override
         public hej a(hgw $$0, String $$1x) {
            $$7.put($$0.get(), $$1);
            return $$8;
         }
      });
      $$6.asMap()
         .forEach(
            ($$0x, $$1x) -> a.warn(
                  "Missing textures in model {}:\n{}",
                  $$0x,
                  $$1x.stream().sorted(hgs.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$7.asMap()
         .forEach(
            ($$0x, $$1x) -> a.warn(
                  "Missing texture references in model {}:\n{}", $$0x, $$1x.stream().sorted().map($$0xx -> "    " + $$0xx).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<dwx, hgl> $$10 = a($$9.b(), $$9.a());
      CompletableFuture<Void> $$11 = CompletableFuture.allOf($$1.values().stream().map(hgk.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      return new hgz.a($$9, $$3, $$10, $$1, $$4, $$5, $$11);
   }

   private static Map<dwx, hgl> a(Map<hha, hgl> $$0, hgl $$1) {
      Map<dwx, hgl> $$2 = new IdentityHashMap<>();

      for (djm $$3 : mb.e) {
         $$3.l().a().forEach($$3x -> {
            aku $$4 = $$3x.b().p().h().a();
            hha $$5 = gna.a($$4, $$3x);
            hgl $$6 = $$0.get($$5);
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

   private static Object2IntMap<dwx> a(fml $$0, hgn.c $$1) {
      return hgy.a($$0, $$1);
   }

   private void a(hgz.a $$0, bos $$1) {
      $$1.a("upload");
      $$0.d.values().forEach(hgk.b::c);
      hgv.b $$2 = $$0.a;
      this.d = $$2.b();
      this.e = $$2.d();
      this.n = $$0.b;
      this.l = $$2.a();
      this.m = $$2.c();
      $$1.b("cache");
      this.g.a($$0.c);
      this.j = $$0.f;
      this.i = $$0.e;
      $$1.c();
   }

   public boolean a(dwx $$0, dwx $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.n.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.n.getInt($$1);
            if ($$2 == $$3) {
               esz $$4 = $$0.y();
               esz $$5 = $$1.y();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public hei b(aku $$0) {
      return this.f.a($$0);
   }

   @Override
   public void close() {
      this.f.close();
   }

   public void a(int $$0) {
      this.k = $$0;
   }

   public Supplier<gmu> d() {
      return () -> this.j;
   }

   public Supplier<gey> e() {
      return () -> this.i;
   }

   static record a(hgv.b a, Object2IntMap<dwx> b, Map<dwx, hgl> c, Map<aku, hgk.b> d, gey e, gmu f, CompletableFuture<Void> g) {
   }
}
