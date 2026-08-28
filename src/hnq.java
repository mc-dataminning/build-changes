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

public class hnq implements avb, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final ald b = ald.a("models");
   private static final Map<alk, alk> c = Map.of(
      gsw.c, hnb.b, gsw.b, hnb.c, gsw.f, hnb.e, gsw.d, hnb.l, gsw.e, hnb.n, gsw.a, hnb.m, gsw.g, hnb.a, gsw.h, hnb.f, hlb.c, hnb.d
   );
   private Map<alk, hhr> d = Map.of();
   private Map<alk, hhn.a> e = Map.of();
   private final hnc f;
   private final gte g;
   private final fsh h;
   private glc i = glc.a;
   private gsy j = gsy.a;
   private int k;
   private hnm.b l;
   private Object2IntMap<ebg> m = Object2IntMaps.emptyMap();

   public hnq(hle $$0, fsh $$1, int $$2) {
      this.h = $$1;
      this.k = $$2;
      this.g = new gte(this);
      this.f = new hnc(c, $$0);
   }

   public gtp a() {
      return this.l.a();
   }

   public hhr a(alk $$0) {
      return this.d.getOrDefault($$0, this.l.b());
   }

   public hhn.a b(alk $$0) {
      return this.e.getOrDefault($$0, hhn.a.a);
   }

   public gte b() {
      return this.g;
   }

   @Override
   public final CompletableFuture<Void> reload(avb.a $$0, avh $$1, Executor $$2, Executor $$3) {
      CompletableFuture<glc> $$4 = CompletableFuture.supplyAsync(glc::a, $$2);
      CompletableFuture<gsy> $$5 = $$4.thenApplyAsync(gsy::a, $$2);
      CompletableFuture<Map<alk, hnx>> $$6 = a($$1, $$2);
      CompletableFuture<hnf.b> $$7 = hnf.a($$1, $$2);
      CompletableFuture<hng.a> $$8 = hng.a($$1, $$2);
      CompletableFuture<hnq.b> $$9 = CompletableFuture.allOf($$6, $$7, $$8).thenApplyAsync($$3x -> a($$6.join(), $$7.join(), $$8.join()), $$2);
      CompletableFuture<Object2IntMap<ebg>> $$10 = $$7.thenApplyAsync($$0x -> a(this.h, $$0x), $$2);
      Map<alk, CompletableFuture<hnc.b>> $$11 = this.f.a($$1, this.k, $$2);
      return CompletableFuture.allOf(Stream.concat($$11.values().stream(), Stream.of($$9, $$10, $$7, $$8, $$4, $$5, $$6)).toArray(CompletableFuture[]::new))
         .thenComposeAsync($$9x -> {
            Map<alk, hnc.b> $$10x = ag.a($$11, CompletableFuture::join);
            hnq.b $$11x = $$9.join();
            Object2IntMap<ebg> $$12 = $$10.join();
            Set<alk> $$13 = Sets.difference($$6.join().keySet(), $$11x.b.keySet());
            if (!$$13.isEmpty()) {
               a.debug("Unreferenced models: \n{}", $$13.stream().sorted().map($$0xx -> "\t" + $$0xx + "\n").collect(Collectors.joining()));
            }

            hnm $$14 = new hnm($$4.join(), $$7.join().a(), $$8.join().a(), $$11x.b(), $$11x.a());
            return a($$10x, $$14, $$12, $$4.join(), $$5.join(), $$2);
         }, $$2)
         .thenCompose($$0x -> $$0x.g.thenApply($$1x -> $$0x))
         .thenCompose($$0::wait)
         .thenAcceptAsync($$0x -> this.a($$0x, brc.a()), $$3);
   }

   private static CompletableFuture<Map<alk, hnx>> a(avh $$0, Executor $$1) {
      return CompletableFuture.<Map<alk, avf>>supplyAsync(() -> b.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<alk, gtm>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<alk, avf> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               alk $$1xx = b.b($$3.getKey());

               try {
                  Pair var3;
                  try (Reader $$2x = $$3.getValue().e()) {
                     var3 = Pair.of($$1xx, gtm.a($$2x));
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

   private static hnq.b a(Map<alk, hnx> $$0, hnf.b $$1, hng.a $$2) {
      hnq.b var5;
      try (bri $$3 = brc.a().d("dependencies")) {
         hno $$4 = new hno($$0, hnk.a());
         $$4.a(gtr.a, new gtr());
         $$1.a().values().forEach($$4::a);
         $$2.a().values().forEach($$1x -> $$4.a($$1x.a()));
         var5 = new hnq.b($$4.a(), $$4.b());
      }

      return var5;
   }

   private static CompletableFuture<hnq.a> a(final Map<alk, hnc.b> $$0, hnm $$1, Object2IntMap<ebg> $$2, glc $$3, gsy $$4, Executor $$5) {
      CompletableFuture<Void> $$6 = CompletableFuture.allOf($$0.values().stream().map(hnc.b::b).toArray(CompletableFuture[]::new));
      final Multimap<String, hnj> $$7 = Multimaps.synchronizedMultimap(HashMultimap.create());
      final Multimap<String, String> $$8 = Multimaps.synchronizedMultimap(HashMultimap.create());
      return $$1.a(new hnv() {
            private final hlc d = $$0.get(hlb.c).a();

            @Override
            public hlc a(hnj $$0x, hnn $$1) {
               hnc.b $$2 = $$0.get($$0.a());
               hlc $$3 = $$2.a($$0.b());
               if ($$3 != null) {
                  return $$3;
               } else {
                  $$7.put($$1.debugName(), $$0);
                  return $$2.a();
               }
            }

            @Override
            public hlc a(String $$0x, hnn $$1) {
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
                           $$1xx.stream().sorted(hnj.a).map($$0xxx -> "    " + $$0xxx.a() + ":" + $$0xxx.b()).collect(Collectors.joining("\n"))
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
               Map<ebg, gtp> $$8x = a($$7x.b(), $$7x.a().a());
               return new hnq.a($$7x, $$2, $$8x, $$0, $$3, $$4, $$6);
            }
         );
   }

   private static Map<ebg, gtp> a(Map<ebg, gtp> $$0, gtp $$1) {
      Object var8;
      try (bri $$2 = brc.a().d("block state dispatch")) {
         Map<ebg, gtp> $$3 = new IdentityHashMap<>($$0);

         for (dne $$4 : mh.e) {
            $$4.l().a().forEach($$2x -> {
               if ($$0.putIfAbsent($$2x, $$1) == null) {
                  a.warn("Missing model for variant: '{}'", $$2x);
               }
            });
         }

         var8 = $$3;
      }

      return (Map<ebg, gtp>)var8;
   }

   private static Object2IntMap<ebg> a(fsh $$0, hnf.b $$1) {
      Object2IntMap var3;
      try (bri $$2 = brc.a().d("block groups")) {
         var3 = hnp.a($$0, $$1);
      }

      return var3;
   }

   private void a(hnq.a $$0, brd $$1) {
      $$1.a("upload");
      $$0.d.values().forEach(hnc.b::c);
      hnm.a $$2 = $$0.a;
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

   public boolean a(ebg $$0, ebg $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.m.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.m.getInt($$1);
            if ($$2 == $$3) {
               exq $$4 = $$0.y();
               exq $$5 = $$1.y();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public hlb c(alk $$0) {
      return this.f.a($$0);
   }

   @Override
   public void close() {
      this.f.close();
   }

   public void a(int $$0) {
      this.k = $$0;
   }

   public Supplier<gsy> c() {
      return () -> this.j;
   }

   public Supplier<glc> d() {
      return () -> this.i;
   }

   static record a(hnm.a a, Object2IntMap<ebg> b, Map<ebg, gtp> c, Map<alk, hnc.b> d, glc e, gsy f, CompletableFuture<Void> g) {
   }

   static record b(hnu a, Map<alk, hnu> b) {
   }
}
