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

public class gbn implements anp, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<aey, aey> b = Map.of(
      fov.c,
      new aey("banner_patterns"),
      fov.b,
      new aey("beds"),
      fov.f,
      new aey("chests"),
      fov.d,
      new aey("shield_patterns"),
      fov.e,
      new aey("signs"),
      fov.a,
      new aey("shulker_boxes"),
      fov.g,
      new aey("armor_trims"),
      fov.h,
      new aey("decorated_pot"),
      fzf.e,
      new aey("blocks")
   );
   private Map<aey, gbh> c;
   private final gbg d;
   private final foz e;
   private final ery f;
   private int g;
   private gbh h;
   private Object2IntMap<dfl> i;

   public gbn(fzh $$0, ery $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new foz(this);
      this.d = new gbg(b, $$0);
   }

   public gbh a(gbo $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public gbh a() {
      return this.h;
   }

   public foz b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(anp.a $$0, anv $$1, bdr $$2, bdr $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<aey, fpi>> $$6 = a($$1, $$4);
      CompletableFuture<Map<aey, List<gbm.c>>> $$7 = b($$1, $$4);
      CompletableFuture<gbm> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new gbm(this.f, $$2, $$1x, $$2x), $$4);
      Map<aey, CompletableFuture<gbg.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (gbg.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<aey, fpi>> a(anv $$0, Executor $$1) {
      return CompletableFuture.<Map<aey, ant>>supplyAsync(() -> gbm.p.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<aey, fpi>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<aey, ant> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), fpi.a($$1xx));
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

   private static CompletableFuture<Map<aey, List<gbm.c>>> b(anv $$0, Executor $$1) {
      return CompletableFuture.<Map<aey, List<ant>>>supplyAsync(() -> gbm.o.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<aey, List<gbm.c>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<aey, List<ant>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<ant> $$1xx = $$3.getValue();
               List<gbm.c> $$2x = new ArrayList<>($$1xx.size());

               for (ant $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = arp.a($$4);
                     $$2x.add(new gbm.c($$3x.b(), $$5));
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

   private gbn.a a(bdr $$0, Map<aey, gbg.b> $$1, gbm $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<aey, gbk> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         gbg.b $$4x = $$1.get($$3x.a());
         fzg $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(gbk.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<aey, gbh> $$4 = $$2.a();
      gbh $$5 = $$4.get(gbm.n);
      Map<dfl, gbh> $$6 = new IdentityHashMap<>();

      for (csx $$7 : jd.f) {
         $$7.l().a().forEach($$3x -> {
            aey $$4x = $$3x.b().q().g().a();
            gbh $$5x = $$4.getOrDefault(foz.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(gbg.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new gbn.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(gbn.a $$0, bdr $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(gbg.b::c);
      gbm $$2 = $$0.a;
      this.c = $$2.a();
      this.i = $$2.b();
      this.h = $$0.b;
      $$1.b("cache");
      this.e.a($$0.c);
      $$1.c();
      $$1.b();
   }

   public boolean a(dfl $$0, dfl $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.i.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.i.getInt($$1);
            if ($$2 == $$3) {
               eao $$4 = $$0.u();
               eao $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public fzf a(aey $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(gbm a, gbh b, Map<dfl, gbh> c, Map<aey, gbg.b> d, CompletableFuture<Void> e) {
   }
}
