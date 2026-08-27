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

public class gqc implements atr, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<akn, akn> b = Map.of(
      gcz.c,
      new akn("banner_patterns"),
      gcz.b,
      new akn("beds"),
      gcz.f,
      new akn("chests"),
      gcz.d,
      new akn("shield_patterns"),
      gcz.e,
      new akn("signs"),
      gcz.a,
      new akn("shulker_boxes"),
      gcz.g,
      new akn("armor_trims"),
      gcz.h,
      new akn("decorated_pot"),
      gnu.e,
      new akn("blocks")
   );
   private Map<akn, gpw> c;
   private final gpv d;
   private final gdd e;
   private final ffe f;
   private int g;
   private gpw h;
   private Object2IntMap<drd> i;

   public gqc(gnw $$0, ffe $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new gdd(this);
      this.d = new gpv(b, $$0);
   }

   public gpw a(gqd $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public gpw a() {
      return this.h;
   }

   public gdd b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(atr.a $$0, atx $$1, bmk $$2, bmk $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<akn, gdm>> $$6 = a($$1, $$4);
      CompletableFuture<Map<akn, List<gqb.c>>> $$7 = b($$1, $$4);
      CompletableFuture<gqb> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new gqb(this.f, $$2, $$1x, $$2x), $$4);
      Map<akn, CompletableFuture<gpv.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (gpv.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<akn, gdm>> a(atx $$0, Executor $$1) {
      return CompletableFuture.<Map<akn, atv>>supplyAsync(() -> gqb.p.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<akn, gdm>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<akn, atv> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), gdm.a($$1xx));
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

   private static CompletableFuture<Map<akn, List<gqb.c>>> b(atx $$0, Executor $$1) {
      return CompletableFuture.<Map<akn, List<atv>>>supplyAsync(() -> gqb.o.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<akn, List<gqb.c>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<akn, List<atv>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<atv> $$1xx = $$3.getValue();
               List<gqb.c> $$2x = new ArrayList<>($$1xx.size());

               for (atv $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = axv.a($$4);
                     $$2x.add(new gqb.c($$3x.b(), $$5));
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

   private gqc.a a(bmk $$0, Map<akn, gpv.b> $$1, gqb $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<akn, gpz> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         gpv.b $$4x = $$1.get($$3x.a());
         gnv $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(gpz.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<akn, gpw> $$4 = $$2.a();
      gpw $$5 = $$4.get(gqb.n);
      Map<drd, gpw> $$6 = new IdentityHashMap<>();

      for (dea $$7 : le.e) {
         $$7.l().a().forEach($$3x -> {
            akn $$4x = $$3x.b().q().h().a();
            gpw $$5x = $$4.getOrDefault(gdd.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(gpv.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new gqc.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(gqc.a $$0, bmk $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(gpv.b::c);
      gqb $$2 = $$0.a;
      this.c = $$2.a();
      this.i = $$2.b();
      this.h = $$0.b;
      $$1.b("cache");
      this.e.a($$0.c);
      $$1.c();
      $$1.b();
   }

   public boolean a(drd $$0, drd $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.i.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.i.getInt($$1);
            if ($$2 == $$3) {
               emw $$4 = $$0.u();
               emw $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public gnu a(akn $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(gqb a, gpw b, Map<drd, gpw> c, Map<akn, gpv.b> d, CompletableFuture<Void> e) {
   }
}
