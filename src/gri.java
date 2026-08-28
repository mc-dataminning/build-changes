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

public class gri implements auj, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<alf, alf> b = Map.of(
      gef.c,
      new alf("banner_patterns"),
      gef.b,
      new alf("beds"),
      gef.f,
      new alf("chests"),
      gef.d,
      new alf("shield_patterns"),
      gef.e,
      new alf("signs"),
      gef.a,
      new alf("shulker_boxes"),
      gef.g,
      new alf("armor_trims"),
      gef.h,
      new alf("decorated_pot"),
      gpa.e,
      new alf("blocks")
   );
   private Map<alf, grc> c;
   private final grb d;
   private final gej e;
   private final fgk f;
   private int g;
   private grc h;
   private Object2IntMap<dse> i;

   public gri(gpc $$0, fgk $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new gej(this);
      this.d = new grb(b, $$0);
   }

   public grc a(grj $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public grc a() {
      return this.h;
   }

   public gej b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(auj.a $$0, aup $$1, bnk $$2, bnk $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<alf, ges>> $$6 = a($$1, $$4);
      CompletableFuture<Map<alf, List<grh.c>>> $$7 = b($$1, $$4);
      CompletableFuture<grh> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new grh(this.f, $$2, $$1x, $$2x), $$4);
      Map<alf, CompletableFuture<grb.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (grb.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<alf, ges>> a(aup $$0, Executor $$1) {
      return CompletableFuture.<Map<alf, aun>>supplyAsync(() -> grh.p.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<alf, ges>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<alf, aun> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), ges.a($$1xx));
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

   private static CompletableFuture<Map<alf, List<grh.c>>> b(aup $$0, Executor $$1) {
      return CompletableFuture.<Map<alf, List<aun>>>supplyAsync(() -> grh.o.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<alf, List<grh.c>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<alf, List<aun>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<aun> $$1xx = $$3.getValue();
               List<grh.c> $$2x = new ArrayList<>($$1xx.size());

               for (aun $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = ayp.a($$4);
                     $$2x.add(new grh.c($$3x.b(), $$5));
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

   private gri.a a(bnk $$0, Map<alf, grb.b> $$1, grh $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<alf, grf> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         grb.b $$4x = $$1.get($$3x.a());
         gpb $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(grf.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<alf, grc> $$4 = $$2.a();
      grc $$5 = $$4.get(grh.n);
      Map<dse, grc> $$6 = new IdentityHashMap<>();

      for (dfb $$7 : lp.e) {
         $$7.l().a().forEach($$3x -> {
            alf $$4x = $$3x.b().s().h().a();
            grc $$5x = $$4.getOrDefault(gej.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(grb.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new gri.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(gri.a $$0, bnk $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(grb.b::c);
      grh $$2 = $$0.a;
      this.c = $$2.a();
      this.i = $$2.b();
      this.h = $$0.b;
      $$1.b("cache");
      this.e.a($$0.c);
      $$1.c();
      $$1.b();
   }

   public boolean a(dse $$0, dse $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.i.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.i.getInt($$1);
            if ($$2 == $$3) {
               enx $$4 = $$0.u();
               enx $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public gpa a(alf $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(grh a, grc b, Map<dse, grc> c, Map<alf, grb.b> d, CompletableFuture<Void> e) {
   }
}
