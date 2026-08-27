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

public class gan implements ane, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<aep, aep> b = Map.of(
      fnu.c,
      new aep("banner_patterns"),
      fnu.b,
      new aep("beds"),
      fnu.f,
      new aep("chests"),
      fnu.d,
      new aep("shield_patterns"),
      fnu.e,
      new aep("signs"),
      fnu.a,
      new aep("shulker_boxes"),
      fnu.g,
      new aep("armor_trims"),
      fnu.h,
      new aep("decorated_pot"),
      fyf.e,
      new aep("blocks")
   );
   private Map<aep, gah> c;
   private final gag d;
   private final fny e;
   private final ero f;
   private int g;
   private gah h;
   private Object2IntMap<dey> i;

   public gan(fyh $$0, ero $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new fny(this);
      this.d = new gag(b, $$0);
   }

   public gah a(gao $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public gah a() {
      return this.h;
   }

   public fny b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(ane.a $$0, ank $$1, bde $$2, bde $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<aep, foh>> $$6 = a($$1, $$4);
      CompletableFuture<Map<aep, List<gam.c>>> $$7 = b($$1, $$4);
      CompletableFuture<gam> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new gam(this.f, $$2, $$1x, $$2x), $$4);
      Map<aep, CompletableFuture<gag.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (gag.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<aep, foh>> a(ank $$0, Executor $$1) {
      return CompletableFuture.<Map<aep, ani>>supplyAsync(() -> gam.p.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<aep, foh>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<aep, ani> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), foh.a($$1xx));
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

   private static CompletableFuture<Map<aep, List<gam.c>>> b(ank $$0, Executor $$1) {
      return CompletableFuture.<Map<aep, List<ani>>>supplyAsync(() -> gam.o.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<aep, List<gam.c>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<aep, List<ani>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<ani> $$1xx = $$3.getValue();
               List<gam.c> $$2x = new ArrayList<>($$1xx.size());

               for (ani $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = arf.a($$4);
                     $$2x.add(new gam.c($$3x.b(), $$5));
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

   private gan.a a(bde $$0, Map<aep, gag.b> $$1, gam $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<aep, gak> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         gag.b $$4x = $$1.get($$3x.a());
         fyg $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(gak.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<aep, gah> $$4 = $$2.a();
      gah $$5 = $$4.get(gam.n);
      Map<dey, gah> $$6 = new IdentityHashMap<>();

      for (csk $$7 : jc.f) {
         $$7.l().a().forEach($$3x -> {
            aep $$4x = $$3x.b().q().g().a();
            gah $$5x = $$4.getOrDefault(fny.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(gag.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new gan.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(gan.a $$0, bde $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(gag.b::c);
      gam $$2 = $$0.a;
      this.c = $$2.a();
      this.i = $$2.b();
      this.h = $$0.b;
      $$1.b("cache");
      this.e.a($$0.c);
      $$1.c();
      $$1.b();
   }

   public boolean a(dey $$0, dey $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.i.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.i.getInt($$1);
            if ($$2 == $$3) {
               eab $$4 = $$0.u();
               eab $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public fyf a(aep $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(gam a, gah b, Map<dey, gah> c, Map<aep, gag.b> d, CompletableFuture<Void> e) {
   }
}
