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

public class hif implements auj, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final akn b = akn.a("models");
   private static final Map<aku, aku> c = Map.of(
      gns.c,
      aku.b("banner_patterns"),
      gns.b,
      aku.b("beds"),
      gns.f,
      aku.b("chests"),
      gns.d,
      aku.b("shield_patterns"),
      gns.e,
      aku.b("signs"),
      gns.a,
      aku.b("shulker_boxes"),
      gns.g,
      aku.b("armor_trims"),
      gns.h,
      aku.b("decorated_pot"),
      hfq.d,
      aku.b("blocks")
   );
   private Map<hig, hhr> d = Map.of();
   private Map<aku, hck> e = Map.of();
   private Map<aku, hcg.a> f = Map.of();
   private final hhq g;
   private final goa h;
   private final fni i;
   private gfy j = gfy.a;
   private gnu k = gnu.a;
   private int l;
   private hhr m;
   private hck n;
   private Object2IntMap<dxq> o = Object2IntMaps.emptyMap();

   public hif(hft $$0, fni $$1, int $$2) {
      this.i = $$1;
      this.l = $$2;
      this.h = new goa(this);
      this.g = new hhq(c, $$0);
   }

   public hhr a(hig $$0) {
      return this.d.getOrDefault($$0, this.m);
   }

   public hhr a() {
      return this.m;
   }

   public hck a(aku $$0) {
      return this.e.getOrDefault($$0, this.n);
   }

   public hcg.a b(aku $$0) {
      return this.f.getOrDefault($$0, hcg.a.a);
   }

   public goa b() {
      return this.h;
   }

   @Override
   public final CompletableFuture<Void> a(auj.a $$0, aup $$1, Executor $$2, Executor $$3) {
      him $$4 = hhz.a();
      CompletableFuture<gfy> $$5 = CompletableFuture.supplyAsync(gfy::a, $$2);
      CompletableFuture<gnu> $$6 = $$5.thenApplyAsync(gnu::a, $$2);
      CompletableFuture<Map<aku, him>> $$7 = a($$1, $$2);
      CompletableFuture<hht.c> $$8 = hht.a($$4, $$1, $$2);
      CompletableFuture<hhu.a> $$9 = hhu.a($$1, $$2);
      CompletableFuture<hid> $$10 = CompletableFuture.allOf($$7, $$8, $$9).thenApplyAsync($$4x -> a($$4, $$7.join(), $$8.join(), $$9.join()), $$2);
      CompletableFuture<Object2IntMap<dxq>> $$11 = $$8.thenApplyAsync($$0x -> a(this.i, $$0x), $$2);
      Map<aku, CompletableFuture<hhq.b>> $$12 = this.g.a($$1, this.l, $$2);
      return CompletableFuture.allOf(Stream.concat($$12.values().stream(), Stream.of($$10, $$11, $$8, $$9, $$5, $$6)).toArray(CompletableFuture[]::new))
         .thenApplyAsync($$8x -> {
            Map<aku, hhq.b> $$9x = af.a($$12, CompletableFuture::join);
            hid $$10x = $$10.join();
            Object2IntMap<dxq> $$11x = $$11.join();
            Set<aku> $$12x = $$10x.d();
            if (!$$12x.isEmpty()) {
               a.debug("Unreferenced models: \n{}", $$12x.stream().sorted().map($$0xx -> "\t" + $$0xx + "\n").collect(Collectors.joining()));
            }

            hib $$13 = new hib($$5.join(), $$8.join().b(), $$9.join().a(), $$10x.c(), $$4);
            return a(bpi.a(), $$9x, $$13, $$11x, $$5.join(), $$6.join());
         }, $$2)
         .thenCompose($$0x -> $$0x.g.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$0x -> this.a($$0x, bpi.a()), $$3);
   }

   private static CompletableFuture<Map<aku, him>> a(aup $$0, Executor $$1) {
      return CompletableFuture.<Map<aku, aun>>supplyAsync(() -> b.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<aku, goj>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<aku, aun> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               aku $$1xx = b.b($$3.getKey());

               try {
                  Pair var3;
                  try (Reader $$2x = $$3.getValue().e()) {
                     var3 = Pair.of($$1xx, goj.a($$2x));
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

   private static hid a(him $$0, Map<aku, him> $$1, hht.c $$2, hhu.a $$3) {
      hid $$4 = new hid($$1, $$0);
      $$2.a().forEach($$4::a);
      $$3.a().values().forEach($$1x -> $$4.a($$1x.a()));
      $$4.a();
      $$4.b();
      return $$4;
   }

   private static hif.a a(bpj $$0, final Map<aku, hhq.b> $$1, hib $$2, Object2IntMap<dxq> $$3, gfy $$4, gnu $$5) {
      $$0.a("baking");
      final Multimap<String, hhy> $$6 = HashMultimap.create();
      final Multimap<String, String> $$7 = HashMultimap.create();
      final hfr $$8 = $$1.get(hfq.d).a();
      hib.b $$9 = $$2.a(new hib.d() {
         @Override
         public hfr a(hic $$0, hhy $$1x) {
            hhq.b $$2 = $$1.get($$1.a());
            hfr $$3 = $$2.a($$1.b());
            if ($$3 != null) {
               return $$3;
            } else {
               $$6.put($$0.get(), $$1);
               return $$2.a();
            }
         }

         @Override
         public hfr a(hic $$0, String $$1x) {
            $$7.put($$0.get(), $$1);
            return $$8;
         }
      });
      $$6.asMap()
         .forEach(
            ($$0x, $$1x) -> a.warn(
                  "Missing textures in model {}:\n{}",
                  $$0x,
                  $$1x.stream().sorted(hhy.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$7.asMap()
         .forEach(
            ($$0x, $$1x) -> a.warn(
                  "Missing texture references in model {}:\n{}", $$0x, $$1x.stream().sorted().map($$0xx -> "    " + $$0xx).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<dxq, hhr> $$10 = a($$9.b(), $$9.a());
      CompletableFuture<Void> $$11 = CompletableFuture.allOf($$1.values().stream().map(hhq.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      return new hif.a($$9, $$3, $$10, $$1, $$4, $$5, $$11);
   }

   private static Map<dxq, hhr> a(Map<hig, hhr> $$0, hhr $$1) {
      Map<dxq, hhr> $$2 = new IdentityHashMap<>();

      for (dke $$3 : mb.e) {
         $$3.l().a().forEach($$3x -> {
            aku $$4 = $$3x.b().p().h().a();
            hig $$5 = goa.a($$4, $$3x);
            hhr $$6 = $$0.get($$5);
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

   private static Object2IntMap<dxq> a(fni $$0, hht.c $$1) {
      return hie.a($$0, $$1);
   }

   private void a(hif.a $$0, bpj $$1) {
      $$1.a("upload");
      $$0.d.values().forEach(hhq.b::c);
      hib.b $$2 = $$0.a;
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

   public boolean a(dxq $$0, dxq $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.o.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.o.getInt($$1);
            if ($$2 == $$3) {
               etw $$4 = $$0.y();
               etw $$5 = $$1.y();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public hfq c(aku $$0) {
      return this.g.a($$0);
   }

   @Override
   public void close() {
      this.g.close();
   }

   public void a(int $$0) {
      this.l = $$0;
   }

   public Supplier<gnu> d() {
      return () -> this.k;
   }

   public Supplier<gfy> e() {
      return () -> this.j;
   }

   static record a(hib.b a, Object2IntMap<dxq> b, Map<dxq, hhr> c, Map<aku, hhq.b> d, gfy e, gnu f, CompletableFuture<Void> g) {
   }
}
