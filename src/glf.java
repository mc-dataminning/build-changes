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

public class glf implements asi, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<ajh, ajh> b = Map.of(
      fyf.c,
      new ajh("banner_patterns"),
      fyf.b,
      new ajh("beds"),
      fyf.f,
      new ajh("chests"),
      fyf.d,
      new ajh("shield_patterns"),
      fyf.e,
      new ajh("signs"),
      fyf.a,
      new ajh("shulker_boxes"),
      fyf.g,
      new ajh("armor_trims"),
      fyf.h,
      new ajh("decorated_pot"),
      giy.e,
      new ajh("blocks")
   );
   private Map<ajh, gkz> c;
   private final gky d;
   private final fyj e;
   private final fak f;
   private int g;
   private gkz h;
   private Object2IntMap<dmz> i;

   public glf(gja $$0, fak $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new fyj(this);
      this.d = new gky(b, $$0);
   }

   public gkz a(glg $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public gkz a() {
      return this.h;
   }

   public fyj b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(asi.a $$0, aso $$1, bjq $$2, bjq $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<ajh, fys>> $$6 = a($$1, $$4);
      CompletableFuture<Map<ajh, List<gle.c>>> $$7 = b($$1, $$4);
      CompletableFuture<gle> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new gle(this.f, $$2, $$1x, $$2x), $$4);
      Map<ajh, CompletableFuture<gky.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (gky.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<ajh, fys>> a(aso $$0, Executor $$1) {
      return CompletableFuture.<Map<ajh, asm>>supplyAsync(() -> gle.p.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<ajh, fys>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<ajh, asm> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), fys.a($$1xx));
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

   private static CompletableFuture<Map<ajh, List<gle.c>>> b(aso $$0, Executor $$1) {
      return CompletableFuture.<Map<ajh, List<asm>>>supplyAsync(() -> gle.o.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<ajh, List<gle.c>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<ajh, List<asm>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<asm> $$1xx = $$3.getValue();
               List<gle.c> $$2x = new ArrayList<>($$1xx.size());

               for (asm $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = awm.a($$4);
                     $$2x.add(new gle.c($$3x.b(), $$5));
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

   private glf.a a(bjq $$0, Map<ajh, gky.b> $$1, gle $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<ajh, glc> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         gky.b $$4x = $$1.get($$3x.a());
         giz $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(glc.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<ajh, gkz> $$4 = $$2.a();
      gkz $$5 = $$4.get(gle.n);
      Map<dmz, gkz> $$6 = new IdentityHashMap<>();

      for (daa $$7 : ki.e) {
         $$7.n().a().forEach($$3x -> {
            ajh $$4x = $$3x.b().r().h().a();
            gkz $$5x = $$4.getOrDefault(fyj.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(gky.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new glf.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(glf.a $$0, bjq $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(gky.b::c);
      gle $$2 = $$0.a;
      this.c = $$2.a();
      this.i = $$2.b();
      this.h = $$0.b;
      $$1.b("cache");
      this.e.a($$0.c);
      $$1.c();
      $$1.b();
   }

   public boolean a(dmz $$0, dmz $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.i.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.i.getInt($$1);
            if ($$2 == $$3) {
               ein $$4 = $$0.u();
               ein $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public giy a(ajh $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(gle a, gkz b, Map<dmz, gkz> c, Map<ajh, gky.b> d, CompletableFuture<Void> e) {
   }
}
