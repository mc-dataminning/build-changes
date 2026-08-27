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

public class gny implements asy, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<ajv, ajv> b = Map.of(
      gax.c,
      new ajv("banner_patterns"),
      gax.b,
      new ajv("beds"),
      gax.f,
      new ajv("chests"),
      gax.d,
      new ajv("shield_patterns"),
      gax.e,
      new ajv("signs"),
      gax.a,
      new ajv("shulker_boxes"),
      gax.g,
      new ajv("armor_trims"),
      gax.h,
      new ajv("decorated_pot"),
      glr.e,
      new ajv("blocks")
   );
   private Map<ajv, gns> c;
   private final gnr d;
   private final gbb e;
   private final fdc f;
   private int g;
   private gns h;
   private Object2IntMap<dpi> i;

   public gny(glt $$0, fdc $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new gbb(this);
      this.d = new gnr(b, $$0);
   }

   public gns a(gnz $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public gns a() {
      return this.h;
   }

   public gbb b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(asy.a $$0, ate $$1, bkt $$2, bkt $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<ajv, gbk>> $$6 = a($$1, $$4);
      CompletableFuture<Map<ajv, List<gnx.c>>> $$7 = b($$1, $$4);
      CompletableFuture<gnx> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new gnx(this.f, $$2, $$1x, $$2x), $$4);
      Map<ajv, CompletableFuture<gnr.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (gnr.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<ajv, gbk>> a(ate $$0, Executor $$1) {
      return CompletableFuture.<Map<ajv, atc>>supplyAsync(() -> gnx.p.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<ajv, gbk>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<ajv, atc> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), gbk.a($$1xx));
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

   private static CompletableFuture<Map<ajv, List<gnx.c>>> b(ate $$0, Executor $$1) {
      return CompletableFuture.<Map<ajv, List<atc>>>supplyAsync(() -> gnx.o.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<ajv, List<gnx.c>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<ajv, List<atc>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<atc> $$1xx = $$3.getValue();
               List<gnx.c> $$2x = new ArrayList<>($$1xx.size());

               for (atc $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = axc.a($$4);
                     $$2x.add(new gnx.c($$3x.b(), $$5));
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

   private gny.a a(bkt $$0, Map<ajv, gnr.b> $$1, gnx $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<ajv, gnv> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         gnr.b $$4x = $$1.get($$3x.a());
         gls $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(gnv.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<ajv, gns> $$4 = $$2.a();
      gns $$5 = $$4.get(gnx.n);
      Map<dpi, gns> $$6 = new IdentityHashMap<>();

      for (dch $$7 : kt.e) {
         $$7.l().a().forEach($$3x -> {
            ajv $$4x = $$3x.b().r().h().a();
            gns $$5x = $$4.getOrDefault(gbb.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(gnr.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new gny.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(gny.a $$0, bkt $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(gnr.b::c);
      gnx $$2 = $$0.a;
      this.c = $$2.a();
      this.i = $$2.b();
      this.h = $$0.b;
      $$1.b("cache");
      this.e.a($$0.c);
      $$1.c();
      $$1.b();
   }

   public boolean a(dpi $$0, dpi $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.i.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.i.getInt($$1);
            if ($$2 == $$3) {
               elb $$4 = $$0.u();
               elb $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public glr a(ajv $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(gnx a, gns b, Map<dpi, gns> c, Map<ajv, gnr.b> d, CompletableFuture<Void> e) {
   }
}
