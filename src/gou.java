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

public class gou implements ati, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<akf, akf> b = Map.of(
      gbt.c,
      new akf("banner_patterns"),
      gbt.b,
      new akf("beds"),
      gbt.f,
      new akf("chests"),
      gbt.d,
      new akf("shield_patterns"),
      gbt.e,
      new akf("signs"),
      gbt.a,
      new akf("shulker_boxes"),
      gbt.g,
      new akf("armor_trims"),
      gbt.h,
      new akf("decorated_pot"),
      gmn.e,
      new akf("blocks")
   );
   private Map<akf, goo> c;
   private final gon d;
   private final gbx e;
   private final fdy f;
   private int g;
   private goo h;
   private Object2IntMap<dpy> i;

   public gou(gmp $$0, fdy $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new gbx(this);
      this.d = new gon(b, $$0);
   }

   public goo a(gov $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public goo a() {
      return this.h;
   }

   public gbx b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(ati.a $$0, ato $$1, ble $$2, ble $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<akf, gcg>> $$6 = a($$1, $$4);
      CompletableFuture<Map<akf, List<got.c>>> $$7 = b($$1, $$4);
      CompletableFuture<got> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new got(this.f, $$2, $$1x, $$2x), $$4);
      Map<akf, CompletableFuture<gon.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (gon.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<akf, gcg>> a(ato $$0, Executor $$1) {
      return CompletableFuture.<Map<akf, atm>>supplyAsync(() -> got.p.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<akf, gcg>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<akf, atm> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), gcg.a($$1xx));
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

   private static CompletableFuture<Map<akf, List<got.c>>> b(ato $$0, Executor $$1) {
      return CompletableFuture.<Map<akf, List<atm>>>supplyAsync(() -> got.o.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<akf, List<got.c>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<akf, List<atm>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<atm> $$1xx = $$3.getValue();
               List<got.c> $$2x = new ArrayList<>($$1xx.size());

               for (atm $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = axm.a($$4);
                     $$2x.add(new got.c($$3x.b(), $$5));
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

   private gou.a a(ble $$0, Map<akf, gon.b> $$1, got $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<akf, gor> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         gon.b $$4x = $$1.get($$3x.a());
         gmo $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(gor.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<akf, goo> $$4 = $$2.a();
      goo $$5 = $$4.get(got.n);
      Map<dpy, goo> $$6 = new IdentityHashMap<>();

      for (dcv $$7 : lc.e) {
         $$7.l().a().forEach($$3x -> {
            akf $$4x = $$3x.b().r().h().a();
            goo $$5x = $$4.getOrDefault(gbx.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(gon.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new gou.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(gou.a $$0, ble $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(gon.b::c);
      got $$2 = $$0.a;
      this.c = $$2.a();
      this.i = $$2.b();
      this.h = $$0.b;
      $$1.b("cache");
      this.e.a($$0.c);
      $$1.c();
      $$1.b();
   }

   public boolean a(dpy $$0, dpy $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.i.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.i.getInt($$1);
            if ($$2 == $$3) {
               elr $$4 = $$0.u();
               elr $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public gmn a(akf $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(got a, goo b, Map<dpy, goo> c, Map<akf, gon.b> d, CompletableFuture<Void> e) {
   }
}
