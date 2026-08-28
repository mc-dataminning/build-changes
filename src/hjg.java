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

public class hjg implements aut, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final akw b = akw.a("models");
   private static final Map<ald, ald> c = Map.of(
      got.c,
      ald.b("banner_patterns"),
      got.b,
      ald.b("beds"),
      got.f,
      ald.b("chests"),
      got.d,
      ald.b("shield_patterns"),
      got.e,
      ald.b("signs"),
      got.a,
      ald.b("shulker_boxes"),
      got.g,
      ald.b("armor_trims"),
      got.h,
      ald.b("decorated_pot"),
      hgr.d,
      ald.b("blocks")
   );
   private Map<hjh, his> d = Map.of();
   private Map<ald, hdk> e = Map.of();
   private Map<ald, hdg.a> f = Map.of();
   private final hir g;
   private final gpb h;
   private final fof i;
   private ggz j = ggz.a;
   private gov k = gov.a;
   private int l;
   private his m;
   private hdk n;
   private Object2IntMap<dym> o = Object2IntMaps.emptyMap();

   public hjg(hgu $$0, fof $$1, int $$2) {
      this.i = $$1;
      this.l = $$2;
      this.h = new gpb(this);
      this.g = new hir(c, $$0);
   }

   public his a(hjh $$0) {
      return this.d.getOrDefault($$0, this.m);
   }

   public his a() {
      return this.m;
   }

   public hdk a(ald $$0) {
      return this.e.getOrDefault($$0, this.n);
   }

   public hdg.a b(ald $$0) {
      return this.f.getOrDefault($$0, hdg.a.a);
   }

   public gpb b() {
      return this.h;
   }

   @Override
   public final CompletableFuture<Void> a(aut.a $$0, ava $$1, Executor $$2, Executor $$3) {
      hjn $$4 = hja.a();
      CompletableFuture<ggz> $$5 = CompletableFuture.supplyAsync(ggz::a, $$2);
      CompletableFuture<gov> $$6 = $$5.thenApplyAsync(gov::a, $$2);
      CompletableFuture<Map<ald, hjn>> $$7 = a($$1, $$2);
      CompletableFuture<hiu.c> $$8 = hiu.a($$4, $$1, $$2);
      CompletableFuture<hiv.a> $$9 = hiv.a($$1, $$2);
      CompletableFuture<hje> $$10 = CompletableFuture.allOf($$7, $$8, $$9).thenApplyAsync($$4x -> a($$4, $$7.join(), $$8.join(), $$9.join()), $$2);
      CompletableFuture<Object2IntMap<dym>> $$11 = $$8.thenApplyAsync($$0x -> a(this.i, $$0x), $$2);
      Map<ald, CompletableFuture<hir.b>> $$12 = this.g.a($$1, this.l, $$2);
      return CompletableFuture.allOf(Stream.concat($$12.values().stream(), Stream.of($$10, $$11, $$8, $$9, $$5, $$6)).toArray(CompletableFuture[]::new))
         .thenApplyAsync($$8x -> {
            Map<ald, hir.b> $$9x = af.a($$12, CompletableFuture::join);
            hje $$10x = $$10.join();
            Object2IntMap<dym> $$11x = $$11.join();
            Set<ald> $$12x = $$10x.d();
            if (!$$12x.isEmpty()) {
               a.debug("Unreferenced models: \n{}", $$12x.stream().sorted().map($$0xx -> "\t" + $$0xx + "\n").collect(Collectors.joining()));
            }

            hjc $$13 = new hjc($$5.join(), $$8.join().b(), $$9.join().a(), $$10x.c(), $$4);
            return a(bqa.a(), $$9x, $$13, $$11x, $$5.join(), $$6.join());
         }, $$2)
         .thenCompose($$0x -> $$0x.g.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$0x -> this.a($$0x, bqa.a()), $$3);
   }

   private static CompletableFuture<Map<ald, hjn>> a(ava $$0, Executor $$1) {
      return CompletableFuture.<Map<ald, auy>>supplyAsync(() -> b.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<ald, gpk>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<ald, auy> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               ald $$1xx = b.b($$3.getKey());

               try {
                  Pair var3;
                  try (Reader $$2x = $$3.getValue().e()) {
                     var3 = Pair.of($$1xx, gpk.a($$2x));
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

   private static hje a(hjn $$0, Map<ald, hjn> $$1, hiu.c $$2, hiv.a $$3) {
      hje $$4 = new hje($$1, $$0);
      $$2.a().forEach($$4::a);
      $$3.a().values().forEach($$1x -> $$4.a($$1x.a()));
      $$4.a();
      $$4.b();
      return $$4;
   }

   private static hjg.a a(bqb $$0, final Map<ald, hir.b> $$1, hjc $$2, Object2IntMap<dym> $$3, ggz $$4, gov $$5) {
      $$0.a("baking");
      final Multimap<String, hiz> $$6 = HashMultimap.create();
      final Multimap<String, String> $$7 = HashMultimap.create();
      final hgs $$8 = $$1.get(hgr.d).a();
      hjc.b $$9 = $$2.a(new hjc.d() {
         @Override
         public hgs a(hjd $$0, hiz $$1x) {
            hir.b $$2 = $$1.get($$1.a());
            hgs $$3 = $$2.a($$1.b());
            if ($$3 != null) {
               return $$3;
            } else {
               $$6.put($$0.get(), $$1);
               return $$2.a();
            }
         }

         @Override
         public hgs a(hjd $$0, String $$1x) {
            $$7.put($$0.get(), $$1);
            return $$8;
         }
      });
      $$6.asMap()
         .forEach(
            ($$0x, $$1x) -> a.warn(
                  "Missing textures in model {}:\n{}",
                  $$0x,
                  $$1x.stream().sorted(hiz.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$7.asMap()
         .forEach(
            ($$0x, $$1x) -> a.warn(
                  "Missing texture references in model {}:\n{}", $$0x, $$1x.stream().sorted().map($$0xx -> "    " + $$0xx).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<dym, his> $$10 = a($$9.b(), $$9.a());
      CompletableFuture<Void> $$11 = CompletableFuture.allOf($$1.values().stream().map(hir.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      return new hjg.a($$9, $$3, $$10, $$1, $$4, $$5, $$11);
   }

   private static Map<dym, his> a(Map<hjh, his> $$0, his $$1) {
      Map<dym, his> $$2 = new IdentityHashMap<>();

      for (dku $$3 : md.e) {
         $$3.l().a().forEach($$3x -> {
            ald $$4 = $$3x.b().p().h().a();
            hjh $$5 = gpb.a($$4, $$3x);
            his $$6 = $$0.get($$5);
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

   private static Object2IntMap<dym> a(fof $$0, hiu.c $$1) {
      return hjf.a($$0, $$1);
   }

   private void a(hjg.a $$0, bqb $$1) {
      $$1.a("upload");
      $$0.d.values().forEach(hir.b::c);
      hjc.b $$2 = $$0.a;
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

   public boolean a(dym $$0, dym $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.o.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.o.getInt($$1);
            if ($$2 == $$3) {
               eut $$4 = $$0.y();
               eut $$5 = $$1.y();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public hgr c(ald $$0) {
      return this.g.a($$0);
   }

   @Override
   public void close() {
      this.g.close();
   }

   public void a(int $$0) {
      this.l = $$0;
   }

   public Supplier<gov> d() {
      return () -> this.k;
   }

   public Supplier<ggz> e() {
      return () -> this.j;
   }

   static record a(hjc.b a, Object2IntMap<dym> b, Map<dym, his> c, Map<ald, hir.b> d, ggz e, gov f, CompletableFuture<Void> g) {
   }
}
