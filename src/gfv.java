import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.gson.JsonObject;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.io.Reader;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class gfv implements apm, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<agt, agt> b = Map.of(
      fsx.c,
      new agt("banner_patterns"),
      fsx.b,
      new agt("beds"),
      fsx.f,
      new agt("chests"),
      fsx.d,
      new agt("shield_patterns"),
      fsx.e,
      new agt("signs"),
      fsx.a,
      new agt("shulker_boxes"),
      fsx.g,
      new agt("armor_trims"),
      fsx.h,
      new agt("decorated_pot"),
      gdn.e,
      new agt("blocks")
   );
   private Map<agt, gfp> c;
   private final gfo d;
   private final ftb e;
   private final evn f;
   private int g;
   private gfp h;
   private Object2IntMap<dip> i;

   public gfv(gdp $$0, evn $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new ftb(this);
      this.d = new gfo(b, $$0);
   }

   public gfp a(gfw $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public gfp a() {
      return this.h;
   }

   public ftb b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(apm.a $$0, aps $$1, bgc $$2, bgc $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<agt, ftk>> $$6 = a($$1, $$4);
      CompletableFuture<Map<agt, List<gfu.c>>> $$7 = b($$1, $$4);
      CompletableFuture<gfu> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new gfu(this.f, $$2, $$1x, $$2x), $$4);
      Map<agt, CompletableFuture<gfo.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (gfo.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<agt, ftk>> a(aps $$0, Executor $$1) {
      return CompletableFuture.<Map<agt, apq>>supplyAsync(() -> gfu.p.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<agt, ftk>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<agt, apq> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), ftk.a($$1xx));
                  }

                  return var2x;
               } catch (Exception var6) {
                  a.error("Failed to load model {}", $$3.getKey(), var6);
                  return null;
               }
            }, $$1));
         }

         return ac.b($$2).thenApply($$0xx -> $$0xx.stream().filter(Objects::nonNull).collect(Collectors.toUnmodifiableMap(Pair::getFirst, Pair::getSecond)));
      });
   }

   private static CompletableFuture<Map<agt, List<gfu.c>>> b(aps $$0, Executor $$1) {
      return CompletableFuture.<Map<agt, List<apq>>>supplyAsync(() -> gfu.o.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<agt, List<gfu.c>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<agt, List<apq>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<apq> $$1xx = $$3.getValue();
               List<gfu.c> $$2x = new ArrayList<>($$1xx.size());

               for (apq $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = ato.a($$4);
                     $$2x.add(new gfu.c($$3x.b(), $$5));
                  } catch (Exception var10) {
                     a.error("Failed to load blockstate {} from pack {}", new Object[]{$$3.getKey(), $$3x.b(), var10});
                  }
               }

               return Pair.of($$3.getKey(), $$2x);
            }, $$1));
         }

         return ac.b($$2).thenApply($$0xx -> $$0xx.stream().filter(Objects::nonNull).collect(Collectors.toUnmodifiableMap(Pair::getFirst, Pair::getSecond)));
      });
   }

   private gfv.a a(bgc $$0, Map<agt, gfo.b> $$1, gfu $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<agt, gfs> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         gfo.b $$4x = $$1.get($$3x.a());
         gdo $$5x = $$4x.a($$3x.b());
         if ($$5x != null) {
            return $$5x;
         } else {
            $$3.put($$2x, $$3x);
            return $$4x.a();
         }
      });
      $$3.asMap()
         .forEach(
            ($$0x, $$1x) -> a.warn(
                  "Missing textures in model {}:\n{}",
                  $$0x,
                  $$1x.stream().sorted(gfs.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<agt, gfp> $$4 = $$2.a();
      gfp $$5 = $$4.get(gfu.n);
      Map<dip, gfp> $$6 = new IdentityHashMap<>();

      for (cvz $$7 : kb.e) {
         $$7.n().a().forEach($$3x -> {
            agt $$4x = $$3x.b().r().g().a();
            gfp $$5x = $$4.getOrDefault(ftb.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(gfo.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new gfv.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(gfv.a $$0, bgc $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(gfo.b::c);
      gfu $$2 = $$0.a;
      this.c = $$2.a();
      this.i = $$2.b();
      this.h = $$0.b;
      $$1.b("cache");
      this.e.a($$0.c);
      $$1.c();
      $$1.b();
   }

   public boolean a(dip $$0, dip $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.i.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.i.getInt($$1);
            if ($$2 == $$3) {
               edz $$4 = $$0.u();
               edz $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public gdn a(agt $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(gfu a, gfp b, Map<dip, gfp> c, Map<agt, gfo.b> d, CompletableFuture<Void> e) {
   }
}
