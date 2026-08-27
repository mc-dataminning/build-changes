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

public class gbl implements ano, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<aex, aex> b = Map.of(
      fot.c,
      new aex("banner_patterns"),
      fot.b,
      new aex("beds"),
      fot.f,
      new aex("chests"),
      fot.d,
      new aex("shield_patterns"),
      fot.e,
      new aex("signs"),
      fot.a,
      new aex("shulker_boxes"),
      fot.g,
      new aex("armor_trims"),
      fot.h,
      new aex("decorated_pot"),
      fzd.e,
      new aex("blocks")
   );
   private Map<aex, gbf> c;
   private final gbe d;
   private final fox e;
   private final erw f;
   private int g;
   private gbf h;
   private Object2IntMap<dfj> i;

   public gbl(fzf $$0, erw $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new fox(this);
      this.d = new gbe(b, $$0);
   }

   public gbf a(gbm $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public gbf a() {
      return this.h;
   }

   public fox b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(ano.a $$0, anu $$1, bdp $$2, bdp $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<aex, fpg>> $$6 = a($$1, $$4);
      CompletableFuture<Map<aex, List<gbk.c>>> $$7 = b($$1, $$4);
      CompletableFuture<gbk> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new gbk(this.f, $$2, $$1x, $$2x), $$4);
      Map<aex, CompletableFuture<gbe.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (gbe.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<aex, fpg>> a(anu $$0, Executor $$1) {
      return CompletableFuture.<Map<aex, ans>>supplyAsync(() -> gbk.p.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<aex, fpg>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<aex, ans> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), fpg.a($$1xx));
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

   private static CompletableFuture<Map<aex, List<gbk.c>>> b(anu $$0, Executor $$1) {
      return CompletableFuture.<Map<aex, List<ans>>>supplyAsync(() -> gbk.o.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<aex, List<gbk.c>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<aex, List<ans>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<ans> $$1xx = $$3.getValue();
               List<gbk.c> $$2x = new ArrayList<>($$1xx.size());

               for (ans $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = aro.a($$4);
                     $$2x.add(new gbk.c($$3x.b(), $$5));
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

   private gbl.a a(bdp $$0, Map<aex, gbe.b> $$1, gbk $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<aex, gbi> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         gbe.b $$4x = $$1.get($$3x.a());
         fze $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(gbi.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<aex, gbf> $$4 = $$2.a();
      gbf $$5 = $$4.get(gbk.n);
      Map<dfj, gbf> $$6 = new IdentityHashMap<>();

      for (csv $$7 : jd.f) {
         $$7.l().a().forEach($$3x -> {
            aex $$4x = $$3x.b().q().g().a();
            gbf $$5x = $$4.getOrDefault(fox.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(gbe.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new gbl.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(gbl.a $$0, bdp $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(gbe.b::c);
      gbk $$2 = $$0.a;
      this.c = $$2.a();
      this.i = $$2.b();
      this.h = $$0.b;
      $$1.b("cache");
      this.e.a($$0.c);
      $$1.c();
      $$1.b();
   }

   public boolean a(dfj $$0, dfj $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.i.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.i.getInt($$1);
            if ($$2 == $$3) {
               eam $$4 = $$0.u();
               eam $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public fzd a(aex $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(gbk a, gbf b, Map<dfj, gbf> c, Map<aex, gbe.b> d, CompletableFuture<Void> e) {
   }
}
