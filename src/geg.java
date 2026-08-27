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

public class geg implements apf, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<agm, agm> b = Map.of(
      fro.c,
      new agm("banner_patterns"),
      fro.b,
      new agm("beds"),
      fro.f,
      new agm("chests"),
      fro.d,
      new agm("shield_patterns"),
      fro.e,
      new agm("signs"),
      fro.a,
      new agm("shulker_boxes"),
      fro.g,
      new agm("armor_trims"),
      fro.h,
      new agm("decorated_pot"),
      gby.e,
      new agm("blocks")
   );
   private Map<agm, gea> c;
   private final gdz d;
   private final frs e;
   private final euk f;
   private int g;
   private gea h;
   private Object2IntMap<dhn> i;

   public geg(gca $$0, euk $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new frs(this);
      this.d = new gdz(b, $$0);
   }

   public gea a(geh $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public gea a() {
      return this.h;
   }

   public frs b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(apf.a $$0, apl $$1, bfs $$2, bfs $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<agm, fsb>> $$6 = a($$1, $$4);
      CompletableFuture<Map<agm, List<gef.c>>> $$7 = b($$1, $$4);
      CompletableFuture<gef> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new gef(this.f, $$2, $$1x, $$2x), $$4);
      Map<agm, CompletableFuture<gdz.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (gdz.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<agm, fsb>> a(apl $$0, Executor $$1) {
      return CompletableFuture.<Map<agm, apj>>supplyAsync(() -> gef.p.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<agm, fsb>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<agm, apj> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), fsb.a($$1xx));
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

   private static CompletableFuture<Map<agm, List<gef.c>>> b(apl $$0, Executor $$1) {
      return CompletableFuture.<Map<agm, List<apj>>>supplyAsync(() -> gef.o.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<agm, List<gef.c>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<agm, List<apj>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<apj> $$1xx = $$3.getValue();
               List<gef.c> $$2x = new ArrayList<>($$1xx.size());

               for (apj $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = atg.a($$4);
                     $$2x.add(new gef.c($$3x.b(), $$5));
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

   private geg.a a(bfs $$0, Map<agm, gdz.b> $$1, gef $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<agm, ged> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         gdz.b $$4x = $$1.get($$3x.a());
         gbz $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(ged.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<agm, gea> $$4 = $$2.a();
      gea $$5 = $$4.get(gef.n);
      Map<dhn, gea> $$6 = new IdentityHashMap<>();

      for (cvf $$7 : kc.f) {
         $$7.n().a().forEach($$3x -> {
            agm $$4x = $$3x.b().r().g().a();
            gea $$5x = $$4.getOrDefault(frs.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(gdz.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new geg.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(geg.a $$0, bfs $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(gdz.b::c);
      gef $$2 = $$0.a;
      this.c = $$2.a();
      this.i = $$2.b();
      this.h = $$0.b;
      $$1.b("cache");
      this.e.a($$0.c);
      $$1.c();
      $$1.b();
   }

   public boolean a(dhn $$0, dhn $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.i.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.i.getInt($$1);
            if ($$2 == $$3) {
               ecx $$4 = $$0.u();
               ecx $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public gby a(agm $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(gef a, gea b, Map<dhn, gea> c, Map<agm, gdz.b> d, CompletableFuture<Void> e) {
   }
}
