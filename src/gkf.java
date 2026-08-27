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

public class gkf implements arz, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<ajc, ajc> b = Map.of(
      fxf.c,
      new ajc("banner_patterns"),
      fxf.b,
      new ajc("beds"),
      fxf.f,
      new ajc("chests"),
      fxf.d,
      new ajc("shield_patterns"),
      fxf.e,
      new ajc("signs"),
      fxf.a,
      new ajc("shulker_boxes"),
      fxf.g,
      new ajc("armor_trims"),
      fxf.h,
      new ajc("decorated_pot"),
      ghy.e,
      new ajc("blocks")
   );
   private Map<ajc, gjz> c;
   private final gjy d;
   private final fxj e;
   private final ezo f;
   private int g;
   private gjz h;
   private Object2IntMap<dme> i;

   public gkf(gia $$0, ezo $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new fxj(this);
      this.d = new gjy(b, $$0);
   }

   public gjz a(gkg $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public gjz a() {
      return this.h;
   }

   public fxj b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(arz.a $$0, asf $$1, bjc $$2, bjc $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<ajc, fxs>> $$6 = a($$1, $$4);
      CompletableFuture<Map<ajc, List<gke.c>>> $$7 = b($$1, $$4);
      CompletableFuture<gke> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new gke(this.f, $$2, $$1x, $$2x), $$4);
      Map<ajc, CompletableFuture<gjy.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (gjy.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<ajc, fxs>> a(asf $$0, Executor $$1) {
      return CompletableFuture.<Map<ajc, asd>>supplyAsync(() -> gke.p.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<ajc, fxs>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<ajc, asd> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), fxs.a($$1xx));
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

   private static CompletableFuture<Map<ajc, List<gke.c>>> b(asf $$0, Executor $$1) {
      return CompletableFuture.<Map<ajc, List<asd>>>supplyAsync(() -> gke.o.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<ajc, List<gke.c>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<ajc, List<asd>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<asd> $$1xx = $$3.getValue();
               List<gke.c> $$2x = new ArrayList<>($$1xx.size());

               for (asd $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = awc.a($$4);
                     $$2x.add(new gke.c($$3x.b(), $$5));
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

   private gkf.a a(bjc $$0, Map<ajc, gjy.b> $$1, gke $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<ajc, gkc> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         gjy.b $$4x = $$1.get($$3x.a());
         ghz $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(gkc.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<ajc, gjz> $$4 = $$2.a();
      gjz $$5 = $$4.get(gke.n);
      Map<dme, gjz> $$6 = new IdentityHashMap<>();

      for (czf $$7 : kh.e) {
         $$7.n().a().forEach($$3x -> {
            ajc $$4x = $$3x.b().r().h().a();
            gjz $$5x = $$4.getOrDefault(fxj.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(gjy.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new gkf.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(gkf.a $$0, bjc $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(gjy.b::c);
      gke $$2 = $$0.a;
      this.c = $$2.a();
      this.i = $$2.b();
      this.h = $$0.b;
      $$1.b("cache");
      this.e.a($$0.c);
      $$1.c();
      $$1.b();
   }

   public boolean a(dme $$0, dme $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.i.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.i.getInt($$1);
            if ($$2 == $$3) {
               ehr $$4 = $$0.u();
               ehr $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public ghy a(ajc $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(gke a, gjz b, Map<dme, gjz> c, Map<ajc, gjy.b> d, CompletableFuture<Void> e) {
   }
}
