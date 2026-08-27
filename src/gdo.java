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

public class gdo implements aox, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<agg, agg> b = Map.of(
      fqw.c,
      new agg("banner_patterns"),
      fqw.b,
      new agg("beds"),
      fqw.f,
      new agg("chests"),
      fqw.d,
      new agg("shield_patterns"),
      fqw.e,
      new agg("signs"),
      fqw.a,
      new agg("shulker_boxes"),
      fqw.g,
      new agg("armor_trims"),
      fqw.h,
      new agg("decorated_pot"),
      gbg.e,
      new agg("blocks")
   );
   private Map<agg, gdi> c;
   private final gdh d;
   private final fra e;
   private final ets f;
   private int g;
   private gdi h;
   private Object2IntMap<dgw> i;

   public gdo(gbi $$0, ets $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new fra(this);
      this.d = new gdh(b, $$0);
   }

   public gdi a(gdp $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public gdi a() {
      return this.h;
   }

   public fra b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(aox.a $$0, apd $$1, bfh $$2, bfh $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<agg, frj>> $$6 = a($$1, $$4);
      CompletableFuture<Map<agg, List<gdn.c>>> $$7 = b($$1, $$4);
      CompletableFuture<gdn> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new gdn(this.f, $$2, $$1x, $$2x), $$4);
      Map<agg, CompletableFuture<gdh.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (gdh.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<agg, frj>> a(apd $$0, Executor $$1) {
      return CompletableFuture.<Map<agg, apb>>supplyAsync(() -> gdn.p.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<agg, frj>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<agg, apb> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), frj.a($$1xx));
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

   private static CompletableFuture<Map<agg, List<gdn.c>>> b(apd $$0, Executor $$1) {
      return CompletableFuture.<Map<agg, List<apb>>>supplyAsync(() -> gdn.o.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<agg, List<gdn.c>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<agg, List<apb>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<apb> $$1xx = $$3.getValue();
               List<gdn.c> $$2x = new ArrayList<>($$1xx.size());

               for (apb $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = asy.a($$4);
                     $$2x.add(new gdn.c($$3x.b(), $$5));
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

   private gdo.a a(bfh $$0, Map<agg, gdh.b> $$1, gdn $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<agg, gdl> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         gdh.b $$4x = $$1.get($$3x.a());
         gbh $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(gdl.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<agg, gdi> $$4 = $$2.a();
      gdi $$5 = $$4.get(gdn.n);
      Map<dgw, gdi> $$6 = new IdentityHashMap<>();

      for (cut $$7 : jy.f) {
         $$7.n().a().forEach($$3x -> {
            agg $$4x = $$3x.b().r().g().a();
            gdi $$5x = $$4.getOrDefault(fra.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(gdh.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new gdo.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(gdo.a $$0, bfh $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(gdh.b::c);
      gdn $$2 = $$0.a;
      this.c = $$2.a();
      this.i = $$2.b();
      this.h = $$0.b;
      $$1.b("cache");
      this.e.a($$0.c);
      $$1.c();
      $$1.b();
   }

   public boolean a(dgw $$0, dgw $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.i.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.i.getInt($$1);
            if ($$2 == $$3) {
               ecg $$4 = $$0.u();
               ecg $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public gbg a(agg $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(gdn a, gdi b, Map<dgw, gdi> c, Map<agg, gdh.b> d, CompletableFuture<Void> e) {
   }
}
