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

public class hno implements auz, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final alb b = alb.a("models");
   private static final Map<ali, ali> c = Map.of(
      gsu.c, hmz.b, gsu.b, hmz.c, gsu.f, hmz.e, gsu.d, hmz.l, gsu.e, hmz.n, gsu.a, hmz.m, gsu.g, hmz.a, gsu.h, hmz.f, hkz.c, hmz.d
   );
   private Map<ali, hhp> d = Map.of();
   private Map<ali, hhl.a> e = Map.of();
   private final hna f;
   private final gtc g;
   private final fsf h;
   private gla i = gla.a;
   private gsw j = gsw.a;
   private int k;
   private hnk.b l;
   private Object2IntMap<ebe> m = Object2IntMaps.emptyMap();

   public hno(hlc $$0, fsf $$1, int $$2) {
      this.h = $$1;
      this.k = $$2;
      this.g = new gtc(this);
      this.f = new hna(c, $$0);
   }

   public gtn a() {
      return this.l.a();
   }

   public hhp a(ali $$0) {
      return this.d.getOrDefault($$0, this.l.b());
   }

   public hhl.a b(ali $$0) {
      return this.e.getOrDefault($$0, hhl.a.a);
   }

   public gtc b() {
      return this.g;
   }

   @Override
   public final CompletableFuture<Void> reload(auz.a $$0, avf $$1, Executor $$2, Executor $$3) {
      CompletableFuture<gla> $$4 = CompletableFuture.supplyAsync(gla::a, $$2);
      CompletableFuture<gsw> $$5 = $$4.thenApplyAsync(gsw::a, $$2);
      CompletableFuture<Map<ali, hnv>> $$6 = a($$1, $$2);
      CompletableFuture<hnd.b> $$7 = hnd.a($$1, $$2);
      CompletableFuture<hne.a> $$8 = hne.a($$1, $$2);
      CompletableFuture<hno.b> $$9 = CompletableFuture.allOf($$6, $$7, $$8).thenApplyAsync($$3x -> a($$6.join(), $$7.join(), $$8.join()), $$2);
      CompletableFuture<Object2IntMap<ebe>> $$10 = $$7.thenApplyAsync($$0x -> a(this.h, $$0x), $$2);
      Map<ali, CompletableFuture<hna.b>> $$11 = this.f.a($$1, this.k, $$2);
      return CompletableFuture.allOf(Stream.concat($$11.values().stream(), Stream.of($$9, $$10, $$7, $$8, $$4, $$5, $$6)).toArray(CompletableFuture[]::new))
         .thenComposeAsync($$9x -> {
            Map<ali, hna.b> $$10x = ag.a($$11, CompletableFuture::join);
            hno.b $$11x = $$9.join();
            Object2IntMap<ebe> $$12 = $$10.join();
            Set<ali> $$13 = Sets.difference($$6.join().keySet(), $$11x.b.keySet());
            if (!$$13.isEmpty()) {
               a.debug("Unreferenced models: \n{}", $$13.stream().sorted().map($$0xx -> "\t" + $$0xx + "\n").collect(Collectors.joining()));
            }

            hnk $$14 = new hnk($$4.join(), $$7.join().a(), $$8.join().a(), $$11x.b(), $$11x.a());
            return a($$10x, $$14, $$12, $$4.join(), $$5.join(), $$2);
         }, $$2)
         .thenCompose($$0x -> $$0x.g.thenApply($$1x -> $$0x))
         .thenCompose($$0::wait)
         .thenAcceptAsync($$0x -> this.a($$0x, bra.a()), $$3);
   }

   private static CompletableFuture<Map<ali, hnv>> a(avf $$0, Executor $$1) {
      return CompletableFuture.<Map<ali, avd>>supplyAsync(() -> b.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<ali, gtk>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<ali, avd> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               ali $$1xx = b.b($$3.getKey());

               try {
                  Pair var3;
                  try (Reader $$2x = $$3.getValue().e()) {
                     var3 = Pair.of($$1xx, gtk.a($$2x));
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

   private static hno.b a(Map<ali, hnv> $$0, hnd.b $$1, hne.a $$2) {
      hno.b var5;
      try (brg $$3 = bra.a().d("dependencies")) {
         hnm $$4 = new hnm($$0, hni.a());
         $$4.a(gtp.a, new gtp());
         $$1.a().values().forEach($$4::a);
         $$2.a().values().forEach($$1x -> $$4.a($$1x.a()));
         var5 = new hno.b($$4.a(), $$4.b());
      }

      return var5;
   }

   private static CompletableFuture<hno.a> a(final Map<ali, hna.b> $$0, hnk $$1, Object2IntMap<ebe> $$2, gla $$3, gsw $$4, Executor $$5) {
      CompletableFuture<Void> $$6 = CompletableFuture.allOf($$0.values().stream().map(hna.b::b).toArray(CompletableFuture[]::new));
      final Multimap<String, hnh> $$7 = Multimaps.synchronizedMultimap(HashMultimap.create());
      final Multimap<String, String> $$8 = Multimaps.synchronizedMultimap(HashMultimap.create());
      return $$1.a(new hnt() {
            private final hla d = $$0.get(hkz.c).a();

            @Override
            public hla a(hnh $$0x, hnl $$1) {
               hna.b $$2 = $$0.get($$0.a());
               hla $$3 = $$2.a($$0.b());
               if ($$3 != null) {
                  return $$3;
               } else {
                  $$7.put($$1.debugName(), $$0);
                  return $$2.a();
               }
            }

            @Override
            public hla a(String $$0x, hnl $$1) {
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
                           $$1xx.stream().sorted(hnh.a).map($$0xxx -> "    " + $$0xxx.a() + ":" + $$0xxx.b()).collect(Collectors.joining("\n"))
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
               Map<ebe, gtn> $$8x = a($$7x.b(), $$7x.a().a());
               return new hno.a($$7x, $$2, $$8x, $$0, $$3, $$4, $$6);
            }
         );
   }

   private static Map<ebe, gtn> a(Map<ebe, gtn> $$0, gtn $$1) {
      Object var8;
      try (brg $$2 = bra.a().d("block state dispatch")) {
         Map<ebe, gtn> $$3 = new IdentityHashMap<>($$0);

         for (dnc $$4 : mg.e) {
            $$4.l().a().forEach($$2x -> {
               if ($$0.putIfAbsent($$2x, $$1) == null) {
                  a.warn("Missing model for variant: '{}'", $$2x);
               }
            });
         }

         var8 = $$3;
      }

      return (Map<ebe, gtn>)var8;
   }

   private static Object2IntMap<ebe> a(fsf $$0, hnd.b $$1) {
      Object2IntMap var3;
      try (brg $$2 = bra.a().d("block groups")) {
         var3 = hnn.a($$0, $$1);
      }

      return var3;
   }

   private void a(hno.a $$0, brb $$1) {
      $$1.a("upload");
      $$0.d.values().forEach(hna.b::c);
      hnk.a $$2 = $$0.a;
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

   public boolean a(ebe $$0, ebe $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.m.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.m.getInt($$1);
            if ($$2 == $$3) {
               exo $$4 = $$0.y();
               exo $$5 = $$1.y();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public hkz c(ali $$0) {
      return this.f.a($$0);
   }

   @Override
   public void close() {
      this.f.close();
   }

   public void a(int $$0) {
      this.k = $$0;
   }

   public Supplier<gsw> c() {
      return () -> this.j;
   }

   public Supplier<gla> d() {
      return () -> this.i;
   }

   static record a(hnk.a a, Object2IntMap<ebe> b, Map<ebe, gtn> c, Map<ali, hna.b> d, gla e, gsw f, CompletableFuture<Void> g) {
   }

   static record b(hns a, Map<ali, hns> b) {
   }
}
