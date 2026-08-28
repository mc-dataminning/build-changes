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

public class gsm implements atx, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<akq, akq> b = Map.of(
      gfi.c,
      akq.b("banner_patterns"),
      gfi.b,
      akq.b("beds"),
      gfi.f,
      akq.b("chests"),
      gfi.d,
      akq.b("shield_patterns"),
      gfi.e,
      akq.b("signs"),
      gfi.a,
      akq.b("shulker_boxes"),
      gfi.g,
      akq.b("armor_trims"),
      gfi.h,
      akq.b("decorated_pot"),
      gqe.e,
      akq.b("blocks")
   );
   private Map<akq, gsg> c;
   private final gsf d;
   private final gfm e;
   private final fhk f;
   private int g;
   private gsg h;
   private Object2IntMap<dta> i;

   public gsm(gqg $$0, fhk $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new gfm(this);
      this.d = new gsf(b, $$0);
   }

   public gsg a(gsn $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public gsg a() {
      return this.h;
   }

   public gfm b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(atx.a $$0, aud $$1, bne $$2, bne $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<akq, gfv>> $$6 = a($$1, $$4);
      CompletableFuture<Map<akq, List<gsl.c>>> $$7 = b($$1, $$4);
      CompletableFuture<gsl> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new gsl(this.f, $$2, $$1x, $$2x), $$4);
      Map<akq, CompletableFuture<gsf.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (gsf.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<akq, gfv>> a(aud $$0, Executor $$1) {
      return CompletableFuture.<Map<akq, aub>>supplyAsync(() -> gsl.p.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<akq, gfv>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<akq, aub> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), gfv.a($$1xx));
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

   private static CompletableFuture<Map<akq, List<gsl.c>>> b(aud $$0, Executor $$1) {
      return CompletableFuture.<Map<akq, List<aub>>>supplyAsync(() -> gsl.o.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<akq, List<gsl.c>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<akq, List<aub>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<aub> $$1xx = $$3.getValue();
               List<gsl.c> $$2x = new ArrayList<>($$1xx.size());

               for (aub $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = ayd.a($$4);
                     $$2x.add(new gsl.c($$3x.b(), $$5));
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

   private gsm.a a(bne $$0, Map<akq, gsf.b> $$1, gsl $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<akq, gsj> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         gsf.b $$4x = $$1.get($$3x.a());
         gqf $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(gsj.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<akq, gsg> $$4 = $$2.a();
      gsg $$5 = $$4.get(gsl.n);
      Map<dta, gsg> $$6 = new IdentityHashMap<>();

      for (dfw $$7 : lt.e) {
         $$7.l().a().forEach($$3x -> {
            akq $$4x = $$3x.b().s().h().a();
            gsg $$5x = $$4.getOrDefault(gfm.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(gsf.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new gsm.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(gsm.a $$0, bne $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(gsf.b::c);
      gsl $$2 = $$0.a;
      this.c = $$2.a();
      this.i = $$2.b();
      this.h = $$0.b;
      $$1.b("cache");
      this.e.a($$0.c);
      $$1.c();
      $$1.b();
   }

   public boolean a(dta $$0, dta $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.i.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.i.getInt($$1);
            if ($$2 == $$3) {
               eoy $$4 = $$0.u();
               eoy $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public gqe a(akq $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(gsl a, gsg b, Map<dta, gsg> c, Map<akq, gsf.b> d, CompletableFuture<Void> e) {
   }
}
