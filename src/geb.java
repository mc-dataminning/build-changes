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

public class geb implements apb, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<agi, agi> b = Map.of(
      frj.c,
      new agi("banner_patterns"),
      frj.b,
      new agi("beds"),
      frj.f,
      new agi("chests"),
      frj.d,
      new agi("shield_patterns"),
      frj.e,
      new agi("signs"),
      frj.a,
      new agi("shulker_boxes"),
      frj.g,
      new agi("armor_trims"),
      frj.h,
      new agi("decorated_pot"),
      gbt.e,
      new agi("blocks")
   );
   private Map<agi, gdv> c;
   private final gdu d;
   private final frn e;
   private final euf f;
   private int g;
   private gdv h;
   private Object2IntMap<dhi> i;

   public geb(gbv $$0, euf $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new frn(this);
      this.d = new gdu(b, $$0);
   }

   public gdv a(gec $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public gdv a() {
      return this.h;
   }

   public frn b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(apb.a $$0, aph $$1, bfo $$2, bfo $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<agi, frw>> $$6 = a($$1, $$4);
      CompletableFuture<Map<agi, List<gea.c>>> $$7 = b($$1, $$4);
      CompletableFuture<gea> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new gea(this.f, $$2, $$1x, $$2x), $$4);
      Map<agi, CompletableFuture<gdu.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (gdu.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<agi, frw>> a(aph $$0, Executor $$1) {
      return CompletableFuture.<Map<agi, apf>>supplyAsync(() -> gea.p.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<agi, frw>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<agi, apf> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), frw.a($$1xx));
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

   private static CompletableFuture<Map<agi, List<gea.c>>> b(aph $$0, Executor $$1) {
      return CompletableFuture.<Map<agi, List<apf>>>supplyAsync(() -> gea.o.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<agi, List<gea.c>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<agi, List<apf>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<apf> $$1xx = $$3.getValue();
               List<gea.c> $$2x = new ArrayList<>($$1xx.size());

               for (apf $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = atc.a($$4);
                     $$2x.add(new gea.c($$3x.b(), $$5));
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

   private geb.a a(bfo $$0, Map<agi, gdu.b> $$1, gea $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<agi, gdy> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         gdu.b $$4x = $$1.get($$3x.a());
         gbu $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(gdy.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<agi, gdv> $$4 = $$2.a();
      gdv $$5 = $$4.get(gea.n);
      Map<dhi, gdv> $$6 = new IdentityHashMap<>();

      for (cva $$7 : jy.f) {
         $$7.n().a().forEach($$3x -> {
            agi $$4x = $$3x.b().r().g().a();
            gdv $$5x = $$4.getOrDefault(frn.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(gdu.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new geb.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(geb.a $$0, bfo $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(gdu.b::c);
      gea $$2 = $$0.a;
      this.c = $$2.a();
      this.i = $$2.b();
      this.h = $$0.b;
      $$1.b("cache");
      this.e.a($$0.c);
      $$1.c();
      $$1.b();
   }

   public boolean a(dhi $$0, dhi $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.i.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.i.getInt($$1);
            if ($$2 == $$3) {
               ecs $$4 = $$0.u();
               ecs $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public gbt a(agi $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(gea a, gdv b, Map<dhi, gdv> c, Map<agi, gdu.b> d, CompletableFuture<Void> e) {
   }
}
