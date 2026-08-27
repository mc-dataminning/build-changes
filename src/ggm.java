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

public class ggm implements apw, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<ahd, ahd> b = Map.of(
      fto.c,
      new ahd("banner_patterns"),
      fto.b,
      new ahd("beds"),
      fto.f,
      new ahd("chests"),
      fto.d,
      new ahd("shield_patterns"),
      fto.e,
      new ahd("signs"),
      fto.a,
      new ahd("shulker_boxes"),
      fto.g,
      new ahd("armor_trims"),
      fto.h,
      new ahd("decorated_pot"),
      gee.e,
      new ahd("blocks")
   );
   private Map<ahd, ggg> c;
   private final ggf d;
   private final fts e;
   private final ewd f;
   private int g;
   private ggg h;
   private Object2IntMap<dja> i;

   public ggm(geg $$0, ewd $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new fts(this);
      this.d = new ggf(b, $$0);
   }

   public ggg a(ggn $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public ggg a() {
      return this.h;
   }

   public fts b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(apw.a $$0, aqc $$1, bgm $$2, bgm $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<ahd, fub>> $$6 = a($$1, $$4);
      CompletableFuture<Map<ahd, List<ggl.c>>> $$7 = b($$1, $$4);
      CompletableFuture<ggl> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new ggl(this.f, $$2, $$1x, $$2x), $$4);
      Map<ahd, CompletableFuture<ggf.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (ggf.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<ahd, fub>> a(aqc $$0, Executor $$1) {
      return CompletableFuture.<Map<ahd, aqa>>supplyAsync(() -> ggl.p.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<ahd, fub>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<ahd, aqa> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), fub.a($$1xx));
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

   private static CompletableFuture<Map<ahd, List<ggl.c>>> b(aqc $$0, Executor $$1) {
      return CompletableFuture.<Map<ahd, List<aqa>>>supplyAsync(() -> ggl.o.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<ahd, List<ggl.c>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<ahd, List<aqa>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<aqa> $$1xx = $$3.getValue();
               List<ggl.c> $$2x = new ArrayList<>($$1xx.size());

               for (aqa $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = aty.a($$4);
                     $$2x.add(new ggl.c($$3x.b(), $$5));
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

   private ggm.a a(bgm $$0, Map<ahd, ggf.b> $$1, ggl $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<ahd, ggj> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         ggf.b $$4x = $$1.get($$3x.a());
         gef $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(ggj.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<ahd, ggg> $$4 = $$2.a();
      ggg $$5 = $$4.get(ggl.n);
      Map<dja, ggg> $$6 = new IdentityHashMap<>();

      for (cwj $$7 : kd.e) {
         $$7.n().a().forEach($$3x -> {
            ahd $$4x = $$3x.b().r().g().a();
            ggg $$5x = $$4.getOrDefault(fts.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(ggf.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new ggm.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(ggm.a $$0, bgm $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(ggf.b::c);
      ggl $$2 = $$0.a;
      this.c = $$2.a();
      this.i = $$2.b();
      this.h = $$0.b;
      $$1.b("cache");
      this.e.a($$0.c);
      $$1.c();
      $$1.b();
   }

   public boolean a(dja $$0, dja $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.i.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.i.getInt($$1);
            if ($$2 == $$3) {
               eek $$4 = $$0.u();
               eek $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public gee a(ahd $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(ggl a, ggg b, Map<dja, ggg> c, Map<ahd, ggf.b> d, CompletableFuture<Void> e) {
   }
}
