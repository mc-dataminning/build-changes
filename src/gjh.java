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

public class gjh implements arv, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<aiy, aiy> b = Map.of(
      fwi.c,
      new aiy("banner_patterns"),
      fwi.b,
      new aiy("beds"),
      fwi.f,
      new aiy("chests"),
      fwi.d,
      new aiy("shield_patterns"),
      fwi.e,
      new aiy("signs"),
      fwi.a,
      new aiy("shulker_boxes"),
      fwi.g,
      new aiy("armor_trims"),
      fwi.h,
      new aiy("decorated_pot"),
      gha.e,
      new aiy("blocks")
   );
   private Map<aiy, gjb> c;
   private final gja d;
   private final fwm e;
   private final eys f;
   private int g;
   private gjb h;
   private Object2IntMap<dlj> i;

   public gjh(ghc $$0, eys $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new fwm(this);
      this.d = new gja(b, $$0);
   }

   public gjb a(gji $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public gjb a() {
      return this.h;
   }

   public fwm b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(arv.a $$0, asb $$1, bin $$2, bin $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<aiy, fwv>> $$6 = a($$1, $$4);
      CompletableFuture<Map<aiy, List<gjg.c>>> $$7 = b($$1, $$4);
      CompletableFuture<gjg> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new gjg(this.f, $$2, $$1x, $$2x), $$4);
      Map<aiy, CompletableFuture<gja.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (gja.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<aiy, fwv>> a(asb $$0, Executor $$1) {
      return CompletableFuture.<Map<aiy, arz>>supplyAsync(() -> gjg.p.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<aiy, fwv>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<aiy, arz> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), fwv.a($$1xx));
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

   private static CompletableFuture<Map<aiy, List<gjg.c>>> b(asb $$0, Executor $$1) {
      return CompletableFuture.<Map<aiy, List<arz>>>supplyAsync(() -> gjg.o.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<aiy, List<gjg.c>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<aiy, List<arz>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<arz> $$1xx = $$3.getValue();
               List<gjg.c> $$2x = new ArrayList<>($$1xx.size());

               for (arz $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = avy.a($$4);
                     $$2x.add(new gjg.c($$3x.b(), $$5));
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

   private gjh.a a(bin $$0, Map<aiy, gja.b> $$1, gjg $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<aiy, gje> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         gja.b $$4x = $$1.get($$3x.a());
         ghb $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(gje.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<aiy, gjb> $$4 = $$2.a();
      gjb $$5 = $$4.get(gjg.n);
      Map<dlj, gjb> $$6 = new IdentityHashMap<>();

      for (cys $$7 : kf.e) {
         $$7.n().a().forEach($$3x -> {
            aiy $$4x = $$3x.b().r().h().a();
            gjb $$5x = $$4.getOrDefault(fwm.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(gja.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new gjh.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(gjh.a $$0, bin $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(gja.b::c);
      gjg $$2 = $$0.a;
      this.c = $$2.a();
      this.i = $$2.b();
      this.h = $$0.b;
      $$1.b("cache");
      this.e.a($$0.c);
      $$1.c();
      $$1.b();
   }

   public boolean a(dlj $$0, dlj $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.i.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.i.getInt($$1);
            if ($$2 == $$3) {
               egw $$4 = $$0.u();
               egw $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public gha a(aiy $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(gjg a, gjb b, Map<dlj, gjb> c, Map<aiy, gja.b> d, CompletableFuture<Void> e) {
   }
}
