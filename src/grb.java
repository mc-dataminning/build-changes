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

public class grb implements auf, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<alb, alb> b = Map.of(
      gdy.c,
      new alb("banner_patterns"),
      gdy.b,
      new alb("beds"),
      gdy.f,
      new alb("chests"),
      gdy.d,
      new alb("shield_patterns"),
      gdy.e,
      new alb("signs"),
      gdy.a,
      new alb("shulker_boxes"),
      gdy.g,
      new alb("armor_trims"),
      gdy.h,
      new alb("decorated_pot"),
      got.e,
      new alb("blocks")
   );
   private Map<alb, gqv> c;
   private final gqu d;
   private final gec e;
   private final fgd f;
   private int g;
   private gqv h;
   private Object2IntMap<drx> i;

   public grb(gov $$0, fgd $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new gec(this);
      this.d = new gqu(b, $$0);
   }

   public gqv a(grc $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public gqv a() {
      return this.h;
   }

   public gec b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(auf.a $$0, aul $$1, bnd $$2, bnd $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<alb, gel>> $$6 = a($$1, $$4);
      CompletableFuture<Map<alb, List<gra.c>>> $$7 = b($$1, $$4);
      CompletableFuture<gra> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new gra(this.f, $$2, $$1x, $$2x), $$4);
      Map<alb, CompletableFuture<gqu.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (gqu.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<alb, gel>> a(aul $$0, Executor $$1) {
      return CompletableFuture.<Map<alb, auj>>supplyAsync(() -> gra.p.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<alb, gel>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<alb, auj> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), gel.a($$1xx));
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

   private static CompletableFuture<Map<alb, List<gra.c>>> b(aul $$0, Executor $$1) {
      return CompletableFuture.<Map<alb, List<auj>>>supplyAsync(() -> gra.o.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<alb, List<gra.c>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<alb, List<auj>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<auj> $$1xx = $$3.getValue();
               List<gra.c> $$2x = new ArrayList<>($$1xx.size());

               for (auj $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = ayk.a($$4);
                     $$2x.add(new gra.c($$3x.b(), $$5));
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

   private grb.a a(bnd $$0, Map<alb, gqu.b> $$1, gra $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<alb, gqy> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         gqu.b $$4x = $$1.get($$3x.a());
         gou $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(gqy.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<alb, gqv> $$4 = $$2.a();
      gqv $$5 = $$4.get(gra.n);
      Map<drx, gqv> $$6 = new IdentityHashMap<>();

      for (deu $$7 : lp.e) {
         $$7.l().a().forEach($$3x -> {
            alb $$4x = $$3x.b().q().h().a();
            gqv $$5x = $$4.getOrDefault(gec.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(gqu.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new grb.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(grb.a $$0, bnd $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(gqu.b::c);
      gra $$2 = $$0.a;
      this.c = $$2.a();
      this.i = $$2.b();
      this.h = $$0.b;
      $$1.b("cache");
      this.e.a($$0.c);
      $$1.c();
      $$1.b();
   }

   public boolean a(drx $$0, drx $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.i.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.i.getInt($$1);
            if ($$2 == $$3) {
               enq $$4 = $$0.u();
               enq $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public got a(alb $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(gra a, gqv b, Map<drx, gqv> c, Map<alb, gqu.b> d, CompletableFuture<Void> e) {
   }
}
