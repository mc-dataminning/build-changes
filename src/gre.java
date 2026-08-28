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

public class gre implements aui, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<ale, ale> b = Map.of(
      geb.c,
      new ale("banner_patterns"),
      geb.b,
      new ale("beds"),
      geb.f,
      new ale("chests"),
      geb.d,
      new ale("shield_patterns"),
      geb.e,
      new ale("signs"),
      geb.a,
      new ale("shulker_boxes"),
      geb.g,
      new ale("armor_trims"),
      geb.h,
      new ale("decorated_pot"),
      gow.e,
      new ale("blocks")
   );
   private Map<ale, gqy> c;
   private final gqx d;
   private final gef e;
   private final fgg f;
   private int g;
   private gqy h;
   private Object2IntMap<dsa> i;

   public gre(goy $$0, fgg $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new gef(this);
      this.d = new gqx(b, $$0);
   }

   public gqy a(grf $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public gqy a() {
      return this.h;
   }

   public gef b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(aui.a $$0, auo $$1, bng $$2, bng $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<ale, geo>> $$6 = a($$1, $$4);
      CompletableFuture<Map<ale, List<grd.c>>> $$7 = b($$1, $$4);
      CompletableFuture<grd> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new grd(this.f, $$2, $$1x, $$2x), $$4);
      Map<ale, CompletableFuture<gqx.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (gqx.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<ale, geo>> a(auo $$0, Executor $$1) {
      return CompletableFuture.<Map<ale, aum>>supplyAsync(() -> grd.p.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<ale, geo>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<ale, aum> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), geo.a($$1xx));
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

   private static CompletableFuture<Map<ale, List<grd.c>>> b(auo $$0, Executor $$1) {
      return CompletableFuture.<Map<ale, List<aum>>>supplyAsync(() -> grd.o.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<ale, List<grd.c>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<ale, List<aum>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<aum> $$1xx = $$3.getValue();
               List<grd.c> $$2x = new ArrayList<>($$1xx.size());

               for (aum $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = ayn.a($$4);
                     $$2x.add(new grd.c($$3x.b(), $$5));
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

   private gre.a a(bng $$0, Map<ale, gqx.b> $$1, grd $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<ale, grb> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         gqx.b $$4x = $$1.get($$3x.a());
         gox $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(grb.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<ale, gqy> $$4 = $$2.a();
      gqy $$5 = $$4.get(grd.n);
      Map<dsa, gqy> $$6 = new IdentityHashMap<>();

      for (dex $$7 : lp.e) {
         $$7.l().a().forEach($$3x -> {
            ale $$4x = $$3x.b().s().h().a();
            gqy $$5x = $$4.getOrDefault(gef.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(gqx.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new gre.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(gre.a $$0, bng $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(gqx.b::c);
      grd $$2 = $$0.a;
      this.c = $$2.a();
      this.i = $$2.b();
      this.h = $$0.b;
      $$1.b("cache");
      this.e.a($$0.c);
      $$1.c();
      $$1.b();
   }

   public boolean a(dsa $$0, dsa $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.i.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.i.getInt($$1);
            if ($$2 == $$3) {
               ent $$4 = $$0.u();
               ent $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public gow a(ale $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(grd a, gqy b, Map<dsa, gqy> c, Map<ale, gqx.b> d, CompletableFuture<Void> e) {
   }
}
