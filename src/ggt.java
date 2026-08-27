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

public class ggt implements aqc, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<ahg, ahg> b = Map.of(
      ftw.c,
      new ahg("banner_patterns"),
      ftw.b,
      new ahg("beds"),
      ftw.f,
      new ahg("chests"),
      ftw.d,
      new ahg("shield_patterns"),
      ftw.e,
      new ahg("signs"),
      ftw.a,
      new ahg("shulker_boxes"),
      ftw.g,
      new ahg("armor_trims"),
      ftw.h,
      new ahg("decorated_pot"),
      gem.e,
      new ahg("blocks")
   );
   private Map<ahg, ggn> c;
   private final ggm d;
   private final fua e;
   private final ewl f;
   private int g;
   private ggn h;
   private Object2IntMap<djh> i;

   public ggt(geo $$0, ewl $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new fua(this);
      this.d = new ggm(b, $$0);
   }

   public ggn a(ggu $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public ggn a() {
      return this.h;
   }

   public fua b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(aqc.a $$0, aqi $$1, bgs $$2, bgs $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<ahg, fuj>> $$6 = a($$1, $$4);
      CompletableFuture<Map<ahg, List<ggs.c>>> $$7 = b($$1, $$4);
      CompletableFuture<ggs> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new ggs(this.f, $$2, $$1x, $$2x), $$4);
      Map<ahg, CompletableFuture<ggm.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (ggm.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<ahg, fuj>> a(aqi $$0, Executor $$1) {
      return CompletableFuture.<Map<ahg, aqg>>supplyAsync(() -> ggs.p.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<ahg, fuj>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<ahg, aqg> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), fuj.a($$1xx));
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

   private static CompletableFuture<Map<ahg, List<ggs.c>>> b(aqi $$0, Executor $$1) {
      return CompletableFuture.<Map<ahg, List<aqg>>>supplyAsync(() -> ggs.o.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<ahg, List<ggs.c>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<ahg, List<aqg>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<aqg> $$1xx = $$3.getValue();
               List<ggs.c> $$2x = new ArrayList<>($$1xx.size());

               for (aqg $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = aue.a($$4);
                     $$2x.add(new ggs.c($$3x.b(), $$5));
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

   private ggt.a a(bgs $$0, Map<ahg, ggm.b> $$1, ggs $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<ahg, ggq> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         ggm.b $$4x = $$1.get($$3x.a());
         gen $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(ggq.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<ahg, ggn> $$4 = $$2.a();
      ggn $$5 = $$4.get(ggs.n);
      Map<djh, ggn> $$6 = new IdentityHashMap<>();

      for (cwq $$7 : kd.e) {
         $$7.n().a().forEach($$3x -> {
            ahg $$4x = $$3x.b().r().g().a();
            ggn $$5x = $$4.getOrDefault(fua.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(ggm.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new ggt.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(ggt.a $$0, bgs $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(ggm.b::c);
      ggs $$2 = $$0.a;
      this.c = $$2.a();
      this.i = $$2.b();
      this.h = $$0.b;
      $$1.b("cache");
      this.e.a($$0.c);
      $$1.c();
      $$1.b();
   }

   public boolean a(djh $$0, djh $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.i.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.i.getInt($$1);
            if ($$2 == $$3) {
               eer $$4 = $$0.u();
               eer $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public gem a(ahg $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(ggs a, ggn b, Map<djh, ggn> c, Map<ahg, ggm.b> d, CompletableFuture<Void> e) {
   }
}
