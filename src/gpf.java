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

public class gpf implements atl, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<akh, akh> b = Map.of(
      gcd.c,
      new akh("banner_patterns"),
      gcd.b,
      new akh("beds"),
      gcd.f,
      new akh("chests"),
      gcd.d,
      new akh("shield_patterns"),
      gcd.e,
      new akh("signs"),
      gcd.a,
      new akh("shulker_boxes"),
      gcd.g,
      new akh("armor_trims"),
      gcd.h,
      new akh("decorated_pot"),
      gmx.e,
      new akh("blocks")
   );
   private Map<akh, goz> c;
   private final goy d;
   private final gch e;
   private final fei f;
   private int g;
   private goz h;
   private Object2IntMap<dqh> i;

   public gpf(gmz $$0, fei $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new gch(this);
      this.d = new goy(b, $$0);
   }

   public goz a(gpg $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public goz a() {
      return this.h;
   }

   public gch b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(atl.a $$0, atr $$1, bma $$2, bma $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<akh, gcq>> $$6 = a($$1, $$4);
      CompletableFuture<Map<akh, List<gpe.c>>> $$7 = b($$1, $$4);
      CompletableFuture<gpe> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new gpe(this.f, $$2, $$1x, $$2x), $$4);
      Map<akh, CompletableFuture<goy.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (goy.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<akh, gcq>> a(atr $$0, Executor $$1) {
      return CompletableFuture.<Map<akh, atp>>supplyAsync(() -> gpe.p.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<akh, gcq>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<akh, atp> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), gcq.a($$1xx));
                  }

                  return var2x;
               } catch (Exception var6) {
                  a.error("Failed to load model {}", $$3.getKey(), var6);
                  return null;
               }
            }, $$1));
         }

         return ac.d($$2).thenApply($$0xx -> $$0xx.stream().filter(Objects::nonNull).collect(Collectors.toUnmodifiableMap(Pair::getFirst, Pair::getSecond)));
      });
   }

   private static CompletableFuture<Map<akh, List<gpe.c>>> b(atr $$0, Executor $$1) {
      return CompletableFuture.<Map<akh, List<atp>>>supplyAsync(() -> gpe.o.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<akh, List<gpe.c>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<akh, List<atp>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<atp> $$1xx = $$3.getValue();
               List<gpe.c> $$2x = new ArrayList<>($$1xx.size());

               for (atp $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = axp.a($$4);
                     $$2x.add(new gpe.c($$3x.b(), $$5));
                  } catch (Exception var10) {
                     a.error("Failed to load blockstate {} from pack {}", new Object[]{$$3.getKey(), $$3x.b(), var10});
                  }
               }

               return Pair.of($$3.getKey(), $$2x);
            }, $$1));
         }

         return ac.d($$2).thenApply($$0xx -> $$0xx.stream().filter(Objects::nonNull).collect(Collectors.toUnmodifiableMap(Pair::getFirst, Pair::getSecond)));
      });
   }

   private gpf.a a(bma $$0, Map<akh, goy.b> $$1, gpe $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<akh, gpc> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         goy.b $$4x = $$1.get($$3x.a());
         gmy $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(gpc.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<akh, goz> $$4 = $$2.a();
      goz $$5 = $$4.get(gpe.n);
      Map<dqh, goz> $$6 = new IdentityHashMap<>();

      for (dde $$7 : ld.e) {
         $$7.l().a().forEach($$3x -> {
            akh $$4x = $$3x.b().r().h().a();
            goz $$5x = $$4.getOrDefault(gch.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(goy.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new gpf.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(gpf.a $$0, bma $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(goy.b::c);
      gpe $$2 = $$0.a;
      this.c = $$2.a();
      this.i = $$2.b();
      this.h = $$0.b;
      $$1.b("cache");
      this.e.a($$0.c);
      $$1.c();
      $$1.b();
   }

   public boolean a(dqh $$0, dqh $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.i.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.i.getInt($$1);
            if ($$2 == $$3) {
               ema $$4 = $$0.u();
               ema $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public gmx a(akh $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(gpe a, goz b, Map<dqh, goz> c, Map<akh, goy.b> d, CompletableFuture<Void> e) {
   }
}
