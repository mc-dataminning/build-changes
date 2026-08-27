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

public class ghh implements aqd, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<ahh, ahh> b = Map.of(
      fui.c,
      new ahh("banner_patterns"),
      fui.b,
      new ahh("beds"),
      fui.f,
      new ahh("chests"),
      fui.d,
      new ahh("shield_patterns"),
      fui.e,
      new ahh("signs"),
      fui.a,
      new ahh("shulker_boxes"),
      fui.g,
      new ahh("armor_trims"),
      fui.h,
      new ahh("decorated_pot"),
      gfa.e,
      new ahh("blocks")
   );
   private Map<ahh, ghb> c;
   private final gha d;
   private final fum e;
   private final ewv f;
   private int g;
   private ghb h;
   private Object2IntMap<djp> i;

   public ghh(gfc $$0, ewv $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new fum(this);
      this.d = new gha(b, $$0);
   }

   public ghb a(ghi $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public ghb a() {
      return this.h;
   }

   public fum b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(aqd.a $$0, aqj $$1, bgt $$2, bgt $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<ahh, fuv>> $$6 = a($$1, $$4);
      CompletableFuture<Map<ahh, List<ghg.c>>> $$7 = b($$1, $$4);
      CompletableFuture<ghg> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new ghg(this.f, $$2, $$1x, $$2x), $$4);
      Map<ahh, CompletableFuture<gha.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (gha.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<ahh, fuv>> a(aqj $$0, Executor $$1) {
      return CompletableFuture.<Map<ahh, aqh>>supplyAsync(() -> ghg.p.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<ahh, fuv>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<ahh, aqh> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), fuv.a($$1xx));
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

   private static CompletableFuture<Map<ahh, List<ghg.c>>> b(aqj $$0, Executor $$1) {
      return CompletableFuture.<Map<ahh, List<aqh>>>supplyAsync(() -> ghg.o.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<ahh, List<ghg.c>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<ahh, List<aqh>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<aqh> $$1xx = $$3.getValue();
               List<ghg.c> $$2x = new ArrayList<>($$1xx.size());

               for (aqh $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = auf.a($$4);
                     $$2x.add(new ghg.c($$3x.b(), $$5));
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

   private ghh.a a(bgt $$0, Map<ahh, gha.b> $$1, ghg $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<ahh, ghe> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         gha.b $$4x = $$1.get($$3x.a());
         gfb $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(ghe.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<ahh, ghb> $$4 = $$2.a();
      ghb $$5 = $$4.get(ghg.n);
      Map<djp, ghb> $$6 = new IdentityHashMap<>();

      for (cwy $$7 : kd.e) {
         $$7.n().a().forEach($$3x -> {
            ahh $$4x = $$3x.b().r().h().a();
            ghb $$5x = $$4.getOrDefault(fum.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(gha.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new ghh.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(ghh.a $$0, bgt $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(gha.b::c);
      ghg $$2 = $$0.a;
      this.c = $$2.a();
      this.i = $$2.b();
      this.h = $$0.b;
      $$1.b("cache");
      this.e.a($$0.c);
      $$1.c();
      $$1.b();
   }

   public boolean a(djp $$0, djp $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.i.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.i.getInt($$1);
            if ($$2 == $$3) {
               eez $$4 = $$0.u();
               eez $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public gfa a(ahh $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(ghg a, ghb b, Map<djp, ghb> c, Map<ahh, gha.b> d, CompletableFuture<Void> e) {
   }
}
