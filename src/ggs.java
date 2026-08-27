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

public class ggs implements aqb, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<ahg, ahg> b = Map.of(
      ftv.c,
      new ahg("banner_patterns"),
      ftv.b,
      new ahg("beds"),
      ftv.f,
      new ahg("chests"),
      ftv.d,
      new ahg("shield_patterns"),
      ftv.e,
      new ahg("signs"),
      ftv.a,
      new ahg("shulker_boxes"),
      ftv.g,
      new ahg("armor_trims"),
      ftv.h,
      new ahg("decorated_pot"),
      gel.e,
      new ahg("blocks")
   );
   private Map<ahg, ggm> c;
   private final ggl d;
   private final ftz e;
   private final ewk f;
   private int g;
   private ggm h;
   private Object2IntMap<djg> i;

   public ggs(gen $$0, ewk $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new ftz(this);
      this.d = new ggl(b, $$0);
   }

   public ggm a(ggt $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public ggm a() {
      return this.h;
   }

   public ftz b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(aqb.a $$0, aqh $$1, bgr $$2, bgr $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<ahg, fui>> $$6 = a($$1, $$4);
      CompletableFuture<Map<ahg, List<ggr.c>>> $$7 = b($$1, $$4);
      CompletableFuture<ggr> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new ggr(this.f, $$2, $$1x, $$2x), $$4);
      Map<ahg, CompletableFuture<ggl.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (ggl.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<ahg, fui>> a(aqh $$0, Executor $$1) {
      return CompletableFuture.<Map<ahg, aqf>>supplyAsync(() -> ggr.p.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<ahg, fui>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<ahg, aqf> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), fui.a($$1xx));
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

   private static CompletableFuture<Map<ahg, List<ggr.c>>> b(aqh $$0, Executor $$1) {
      return CompletableFuture.<Map<ahg, List<aqf>>>supplyAsync(() -> ggr.o.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<ahg, List<ggr.c>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<ahg, List<aqf>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<aqf> $$1xx = $$3.getValue();
               List<ggr.c> $$2x = new ArrayList<>($$1xx.size());

               for (aqf $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = aud.a($$4);
                     $$2x.add(new ggr.c($$3x.b(), $$5));
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

   private ggs.a a(bgr $$0, Map<ahg, ggl.b> $$1, ggr $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<ahg, ggp> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         ggl.b $$4x = $$1.get($$3x.a());
         gem $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(ggp.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<ahg, ggm> $$4 = $$2.a();
      ggm $$5 = $$4.get(ggr.n);
      Map<djg, ggm> $$6 = new IdentityHashMap<>();

      for (cwp $$7 : kd.e) {
         $$7.n().a().forEach($$3x -> {
            ahg $$4x = $$3x.b().r().g().a();
            ggm $$5x = $$4.getOrDefault(ftz.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(ggl.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new ggs.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(ggs.a $$0, bgr $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(ggl.b::c);
      ggr $$2 = $$0.a;
      this.c = $$2.a();
      this.i = $$2.b();
      this.h = $$0.b;
      $$1.b("cache");
      this.e.a($$0.c);
      $$1.c();
      $$1.b();
   }

   public boolean a(djg $$0, djg $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.i.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.i.getInt($$1);
            if ($$2 == $$3) {
               eeq $$4 = $$0.u();
               eeq $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public gel a(ahg $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(ggr a, ggm b, Map<djg, ggm> c, Map<ahg, ggl.b> d, CompletableFuture<Void> e) {
   }
}
