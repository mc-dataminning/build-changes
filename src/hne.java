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

public class hne implements avi, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final alk b = alk.a("models");
   private static final Map<alr, alr> c = Map.of(
      gsh.c, hmp.b, gsh.b, hmp.c, gsh.f, hmp.e, gsh.d, hmp.l, gsh.e, hmp.n, gsh.a, hmp.m, gsh.g, hmp.a, gsh.h, hmp.f, hkp.c, hmp.d
   );
   private Map<alr, hhf> d = Map.of();
   private Map<alr, hhb.a> e = Map.of();
   private final hmq f;
   private final gsp g;
   private final frs h;
   private gkn i = gkn.a;
   private gsj j = gsj.a;
   private int k;
   private hna.b l;
   private Object2IntMap<ebq> m = Object2IntMaps.emptyMap();

   public hne(hks $$0, frs $$1, int $$2) {
      this.h = $$1;
      this.k = $$2;
      this.g = new gsp(this);
      this.f = new hmq(c, $$0);
   }

   public gta a() {
      return this.l.a();
   }

   public hhf a(alr $$0) {
      return this.d.getOrDefault($$0, this.l.b());
   }

   public hhb.a b(alr $$0) {
      return this.e.getOrDefault($$0, hhb.a.a);
   }

   public gsp b() {
      return this.g;
   }

   @Override
   public final CompletableFuture<Void> reload(avi.a $$0, avo $$1, Executor $$2, Executor $$3) {
      CompletableFuture<gkn> $$4 = CompletableFuture.supplyAsync(gkn::a, $$2);
      CompletableFuture<gsj> $$5 = $$4.thenApplyAsync(gsj::a, $$2);
      CompletableFuture<Map<alr, hnl>> $$6 = a($$1, $$2);
      CompletableFuture<hmt.b> $$7 = hmt.a($$1, $$2);
      CompletableFuture<hmu.a> $$8 = hmu.a($$1, $$2);
      CompletableFuture<hne.b> $$9 = CompletableFuture.allOf($$6, $$7, $$8).thenApplyAsync($$3x -> a($$6.join(), $$7.join(), $$8.join()), $$2);
      CompletableFuture<Object2IntMap<ebq>> $$10 = $$7.thenApplyAsync($$0x -> a(this.h, $$0x), $$2);
      Map<alr, CompletableFuture<hmq.b>> $$11 = this.f.a($$1, this.k, $$2);
      return CompletableFuture.allOf(Stream.concat($$11.values().stream(), Stream.of($$9, $$10, $$7, $$8, $$4, $$5, $$6)).toArray(CompletableFuture[]::new))
         .thenComposeAsync($$9x -> {
            Map<alr, hmq.b> $$10x = ag.a($$11, CompletableFuture::join);
            hne.b $$11x = $$9.join();
            Object2IntMap<ebq> $$12 = $$10.join();
            Set<alr> $$13 = Sets.difference($$6.join().keySet(), $$11x.b.keySet());
            if (!$$13.isEmpty()) {
               a.debug("Unreferenced models: \n{}", $$13.stream().sorted().map($$0xx -> "\t" + $$0xx + "\n").collect(Collectors.joining()));
            }

            hna $$14 = new hna($$4.join(), $$7.join().a(), $$8.join().a(), $$11x.b(), $$11x.a());
            return a($$10x, $$14, $$12, $$4.join(), $$5.join(), $$2);
         }, $$2)
         .thenCompose($$0x -> $$0x.g.thenApply($$1x -> $$0x))
         .thenCompose($$0::wait)
         .thenAcceptAsync($$0x -> this.a($$0x, brl.a()), $$3);
   }

   private static CompletableFuture<Map<alr, hnl>> a(avo $$0, Executor $$1) {
      return CompletableFuture.<Map<alr, avm>>supplyAsync(() -> b.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<alr, gsx>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<alr, avm> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               alr $$1xx = b.b($$3.getKey());

               try {
                  Pair var3;
                  try (Reader $$2x = $$3.getValue().e()) {
                     var3 = Pair.of($$1xx, gsx.a($$2x));
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

   private static hne.b a(Map<alr, hnl> $$0, hmt.b $$1, hmu.a $$2) {
      hne.b var5;
      try (brr $$3 = brl.a().d("dependencies")) {
         hnc $$4 = new hnc($$0, hmy.a());
         $$4.a(gtc.a, new gtc());
         $$1.a().values().forEach($$4::a);
         $$2.a().values().forEach($$1x -> $$4.a($$1x.a()));
         var5 = new hne.b($$4.a(), $$4.b());
      }

      return var5;
   }

   private static CompletableFuture<hne.a> a(final Map<alr, hmq.b> $$0, hna $$1, Object2IntMap<ebq> $$2, gkn $$3, gsj $$4, Executor $$5) {
      CompletableFuture<Void> $$6 = CompletableFuture.allOf($$0.values().stream().map(hmq.b::b).toArray(CompletableFuture[]::new));
      final Multimap<String, hmx> $$7 = Multimaps.synchronizedMultimap(HashMultimap.create());
      final Multimap<String, String> $$8 = Multimaps.synchronizedMultimap(HashMultimap.create());
      return $$1.a(new hnj() {
            private final hkq d = $$0.get(hkp.c).a();

            @Override
            public hkq a(hmx $$0x, hnb $$1) {
               hmq.b $$2 = $$0.get($$0.a());
               hkq $$3 = $$2.a($$0.b());
               if ($$3 != null) {
                  return $$3;
               } else {
                  $$7.put($$1.debugName(), $$0);
                  return $$2.a();
               }
            }

            @Override
            public hkq a(String $$0x, hnb $$1) {
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
                           $$1xx.stream().sorted(hmx.a).map($$0xxx -> "    " + $$0xxx.a() + ":" + $$0xxx.b()).collect(Collectors.joining("\n"))
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
               Map<ebq, gta> $$8x = a($$7x.b(), $$7x.a().a());
               return new hne.a($$7x, $$2, $$8x, $$0, $$3, $$4, $$6);
            }
         );
   }

   private static Map<ebq, gta> a(Map<ebq, gta> $$0, gta $$1) {
      Object var8;
      try (brr $$2 = brl.a().d("block state dispatch")) {
         Map<ebq, gta> $$3 = new IdentityHashMap<>($$0);

         for (dno $$4 : mh.e) {
            $$4.l().a().forEach($$2x -> {
               if ($$0.putIfAbsent($$2x, $$1) == null) {
                  a.warn("Missing model for variant: '{}'", $$2x);
               }
            });
         }

         var8 = $$3;
      }

      return (Map<ebq, gta>)var8;
   }

   private static Object2IntMap<ebq> a(frs $$0, hmt.b $$1) {
      Object2IntMap var3;
      try (brr $$2 = brl.a().d("block groups")) {
         var3 = hnd.a($$0, $$1);
      }

      return var3;
   }

   private void a(hne.a $$0, brm $$1) {
      $$1.a("upload");
      $$0.d.values().forEach(hmq.b::c);
      hna.a $$2 = $$0.a;
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

   public boolean a(ebq $$0, ebq $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.m.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.m.getInt($$1);
            if ($$2 == $$3) {
               eya $$4 = $$0.y();
               eya $$5 = $$1.y();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public hkp c(alr $$0) {
      return this.f.a($$0);
   }

   @Override
   public void close() {
      this.f.close();
   }

   public void a(int $$0) {
      this.k = $$0;
   }

   public Supplier<gsj> c() {
      return () -> this.j;
   }

   public Supplier<gkn> d() {
      return () -> this.i;
   }

   static record a(hna.a a, Object2IntMap<ebq> b, Map<ebq, gta> c, Map<alr, hmq.b> d, gkn e, gsj f, CompletableFuture<Void> g) {
   }

   static record b(hni a, Map<alr, hni> b) {
   }
}
