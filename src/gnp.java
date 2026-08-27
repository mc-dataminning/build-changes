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

public class gnp implements asw, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<ajt, ajt> b = Map.of(
      gao.c,
      new ajt("banner_patterns"),
      gao.b,
      new ajt("beds"),
      gao.f,
      new ajt("chests"),
      gao.d,
      new ajt("shield_patterns"),
      gao.e,
      new ajt("signs"),
      gao.a,
      new ajt("shulker_boxes"),
      gao.g,
      new ajt("armor_trims"),
      gao.h,
      new ajt("decorated_pot"),
      gli.e,
      new ajt("blocks")
   );
   private Map<ajt, gnj> c;
   private final gni d;
   private final gas e;
   private final fct f;
   private int g;
   private gnj h;
   private Object2IntMap<doz> i;

   public gnp(glk $$0, fct $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new gas(this);
      this.d = new gni(b, $$0);
   }

   public gnj a(gnq $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public gnj a() {
      return this.h;
   }

   public gas b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(asw.a $$0, atc $$1, bko $$2, bko $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<ajt, gbb>> $$6 = a($$1, $$4);
      CompletableFuture<Map<ajt, List<gno.c>>> $$7 = b($$1, $$4);
      CompletableFuture<gno> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new gno(this.f, $$2, $$1x, $$2x), $$4);
      Map<ajt, CompletableFuture<gni.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (gni.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<ajt, gbb>> a(atc $$0, Executor $$1) {
      return CompletableFuture.<Map<ajt, ata>>supplyAsync(() -> gno.p.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<ajt, gbb>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<ajt, ata> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), gbb.a($$1xx));
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

   private static CompletableFuture<Map<ajt, List<gno.c>>> b(atc $$0, Executor $$1) {
      return CompletableFuture.<Map<ajt, List<ata>>>supplyAsync(() -> gno.o.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<ajt, List<gno.c>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<ajt, List<ata>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<ata> $$1xx = $$3.getValue();
               List<gno.c> $$2x = new ArrayList<>($$1xx.size());

               for (ata $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = axa.a($$4);
                     $$2x.add(new gno.c($$3x.b(), $$5));
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

   private gnp.a a(bko $$0, Map<ajt, gni.b> $$1, gno $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<ajt, gnm> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         gni.b $$4x = $$1.get($$3x.a());
         glj $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(gnm.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<ajt, gnj> $$4 = $$2.a();
      gnj $$5 = $$4.get(gno.n);
      Map<doz, gnj> $$6 = new IdentityHashMap<>();

      for (dby $$7 : kr.e) {
         $$7.l().a().forEach($$3x -> {
            ajt $$4x = $$3x.b().r().h().a();
            gnj $$5x = $$4.getOrDefault(gas.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(gni.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new gnp.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(gnp.a $$0, bko $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(gni.b::c);
      gno $$2 = $$0.a;
      this.c = $$2.a();
      this.i = $$2.b();
      this.h = $$0.b;
      $$1.b("cache");
      this.e.a($$0.c);
      $$1.c();
      $$1.b();
   }

   public boolean a(doz $$0, doz $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.i.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.i.getInt($$1);
            if ($$2 == $$3) {
               eks $$4 = $$0.u();
               eks $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public gli a(ajt $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(gno a, gnj b, Map<doz, gnj> c, Map<ajt, gni.b> d, CompletableFuture<Void> e) {
   }
}
