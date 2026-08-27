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

public class gtf implements atx, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<akt, akt> b = Map.of(
      gfv.c,
      new akt("banner_patterns"),
      gfv.b,
      new akt("beds"),
      gfv.f,
      new akt("chests"),
      gfv.d,
      new akt("shield_patterns"),
      gfv.e,
      new akt("signs"),
      gfv.a,
      new akt("shulker_boxes"),
      gfv.g,
      new akt("armor_trims"),
      gfv.h,
      new akt("decorated_pot"),
      gqx.e,
      new akt("blocks")
   );
   private Map<akt, gsz> c;
   private final gsy d;
   private final gfz e;
   private final fhn f;
   private int g;
   private gsz h;
   private Object2IntMap<dtc> i;

   public gtf(gqz $$0, fhn $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new gfz(this);
      this.d = new gsy(b, $$0);
   }

   public gsz a(gtg $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public gsz a() {
      return this.h;
   }

   public gfz b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(atx.a $$0, aud $$1, bmo $$2, bmo $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<akt, ggi>> $$6 = a($$1, $$4);
      CompletableFuture<Map<akt, List<gte.c>>> $$7 = b($$1, $$4);
      CompletableFuture<gte> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new gte(this.f, $$2, $$1x, $$2x), $$4);
      Map<akt, CompletableFuture<gsy.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (gsy.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<akt, ggi>> a(aud $$0, Executor $$1) {
      return CompletableFuture.<Map<akt, aub>>supplyAsync(() -> gte.p.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<akt, ggi>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<akt, aub> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), ggi.a($$1xx));
                  }

                  return var2x;
               } catch (Exception var6) {
                  a.error("Failed to load model {}", $$3.getKey(), var6);
                  return null;
               }
            }, $$1));
         }

         return ad.d($$2).thenApply($$0xx -> $$0xx.stream().filter(Objects::nonNull).collect(Collectors.toUnmodifiableMap(Pair::getFirst, Pair::getSecond)));
      });
   }

   private static CompletableFuture<Map<akt, List<gte.c>>> b(aud $$0, Executor $$1) {
      return CompletableFuture.<Map<akt, List<aub>>>supplyAsync(() -> gte.o.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<akt, List<gte.c>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<akt, List<aub>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<aub> $$1xx = $$3.getValue();
               List<gte.c> $$2x = new ArrayList<>($$1xx.size());

               for (aub $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = ayc.a($$4);
                     $$2x.add(new gte.c($$3x.b(), $$5));
                  } catch (Exception var10) {
                     a.error("Failed to load blockstate {} from pack {}", new Object[]{$$3.getKey(), $$3x.b(), var10});
                  }
               }

               return Pair.of($$3.getKey(), $$2x);
            }, $$1));
         }

         return ad.d($$2).thenApply($$0xx -> $$0xx.stream().filter(Objects::nonNull).collect(Collectors.toUnmodifiableMap(Pair::getFirst, Pair::getSecond)));
      });
   }

   private gtf.a a(bmo $$0, Map<akt, gsy.b> $$1, gte $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<akt, gtc> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         gsy.b $$4x = $$1.get($$3x.a());
         gqy $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(gtc.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<akt, gsz> $$4 = $$2.a();
      gsz $$5 = $$4.get(gte.n);
      Map<dtc, gsz> $$6 = new IdentityHashMap<>();

      for (dfc $$7 : lh.e) {
         $$7.l().a().forEach($$3x -> {
            akt $$4x = $$3x.b().r().h().a();
            gsz $$5x = $$4.getOrDefault(gfz.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(gsy.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new gtf.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(gtf.a $$0, bmo $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(gsy.b::c);
      gte $$2 = $$0.a;
      this.c = $$2.a();
      this.i = $$2.b();
      this.h = $$0.b;
      $$1.b("cache");
      this.e.a($$0.c);
      $$1.c();
      $$1.b();
   }

   public boolean a(dtc $$0, dtc $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.i.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.i.getInt($$1);
            if ($$2 == $$3) {
               epe $$4 = $$0.u();
               epe $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public gqx a(akt $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(gte a, gsz b, Map<dtc, gsz> c, Map<akt, gsy.b> d, CompletableFuture<Void> e) {
   }
}
