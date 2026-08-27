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

public class gbh implements anq, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<aez, aez> b = Map.of(
      foo.c,
      new aez("banner_patterns"),
      foo.b,
      new aez("beds"),
      foo.f,
      new aez("chests"),
      foo.d,
      new aez("shield_patterns"),
      foo.e,
      new aez("signs"),
      foo.a,
      new aez("shulker_boxes"),
      foo.g,
      new aez("armor_trims"),
      foo.h,
      new aez("decorated_pot"),
      fyz.e,
      new aez("blocks")
   );
   private Map<aez, gbb> c;
   private final gba d;
   private final fot e;
   private final erq f;
   private int g;
   private gbb h;
   private Object2IntMap<dfd> i;

   public gbh(fzb $$0, erq $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new fot(this);
      this.d = new gba(b, $$0);
   }

   public gbb a(gbi $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public gbb a() {
      return this.h;
   }

   public fot b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(anq.a $$0, anw $$1, bdv $$2, bdv $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<aez, fpc>> $$6 = a($$1, $$4);
      CompletableFuture<Map<aez, List<gbg.c>>> $$7 = b($$1, $$4);
      CompletableFuture<gbg> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new gbg(this.f, $$2, $$1x, $$2x), $$4);
      Map<aez, CompletableFuture<gba.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (gba.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<aez, fpc>> a(anw $$0, Executor $$1) {
      return CompletableFuture.<Map<aez, anu>>supplyAsync(() -> gbg.p.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<aez, fpc>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<aez, anu> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), fpc.a($$1xx));
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

   private static CompletableFuture<Map<aez, List<gbg.c>>> b(anw $$0, Executor $$1) {
      return CompletableFuture.<Map<aez, List<anu>>>supplyAsync(() -> gbg.o.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<aez, List<gbg.c>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<aez, List<anu>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<anu> $$1xx = $$3.getValue();
               List<gbg.c> $$2x = new ArrayList<>($$1xx.size());

               for (anu $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = arr.a($$4);
                     $$2x.add(new gbg.c($$3x.b(), $$5));
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

   private gbh.a a(bdv $$0, Map<aez, gba.b> $$1, gbg $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<aez, gbe> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         gba.b $$4x = $$1.get($$3x.a());
         fza $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(gbe.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<aez, gbb> $$4 = $$2.a();
      gbb $$5 = $$4.get(gbg.n);
      Map<dfd, gbb> $$6 = new IdentityHashMap<>();

      for (ctc $$7 : jb.f) {
         $$7.n().a().forEach($$3x -> {
            aez $$4x = $$3x.b().r().g().a();
            gbb $$5x = $$4.getOrDefault(fot.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(gba.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new gbh.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(gbh.a $$0, bdv $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(gba.b::c);
      gbg $$2 = $$0.a;
      this.c = $$2.a();
      this.i = $$2.b();
      this.h = $$0.b;
      $$1.b("cache");
      this.e.a($$0.c);
      $$1.c();
      $$1.b();
   }

   public boolean a(dfd $$0, dfd $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.i.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.i.getInt($$1);
            if ($$2 == $$3) {
               eag $$4 = $$0.u();
               eag $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public fyz a(aez $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(gbg a, gbb b, Map<dfd, gbb> c, Map<aez, gba.b> d, CompletableFuture<Void> e) {
   }
}
