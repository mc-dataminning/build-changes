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

public class grx implements atq, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<akk, akk> b = Map.of(
      geu.c,
      new akk("banner_patterns"),
      geu.b,
      new akk("beds"),
      geu.f,
      new akk("chests"),
      geu.d,
      new akk("shield_patterns"),
      geu.e,
      new akk("signs"),
      geu.a,
      new akk("shulker_boxes"),
      geu.g,
      new akk("armor_trims"),
      geu.h,
      new akk("decorated_pot"),
      gpp.e,
      new akk("blocks")
   );
   private Map<akk, grr> c;
   private final grq d;
   private final gey e;
   private final fgy f;
   private int g;
   private grr h;
   private Object2IntMap<dsl> i;

   public grx(gpr $$0, fgy $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new gey(this);
      this.d = new grq(b, $$0);
   }

   public grr a(gry $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public grr a() {
      return this.h;
   }

   public gey b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(atq.a $$0, atw $$1, bmv $$2, bmv $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<akk, gfh>> $$6 = a($$1, $$4);
      CompletableFuture<Map<akk, List<grw.c>>> $$7 = b($$1, $$4);
      CompletableFuture<grw> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new grw(this.f, $$2, $$1x, $$2x), $$4);
      Map<akk, CompletableFuture<grq.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (grq.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<akk, gfh>> a(atw $$0, Executor $$1) {
      return CompletableFuture.<Map<akk, atu>>supplyAsync(() -> grw.p.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<akk, gfh>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<akk, atu> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), gfh.a($$1xx));
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

   private static CompletableFuture<Map<akk, List<grw.c>>> b(atw $$0, Executor $$1) {
      return CompletableFuture.<Map<akk, List<atu>>>supplyAsync(() -> grw.o.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<akk, List<grw.c>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<akk, List<atu>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<atu> $$1xx = $$3.getValue();
               List<grw.c> $$2x = new ArrayList<>($$1xx.size());

               for (atu $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = axw.a($$4);
                     $$2x.add(new grw.c($$3x.b(), $$5));
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

   private grx.a a(bmv $$0, Map<akk, grq.b> $$1, grw $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<akk, gru> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         grq.b $$4x = $$1.get($$3x.a());
         gpq $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(gru.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<akk, grr> $$4 = $$2.a();
      grr $$5 = $$4.get(grw.n);
      Map<dsl, grr> $$6 = new IdentityHashMap<>();

      for (dfi $$7 : lq.e) {
         $$7.l().a().forEach($$3x -> {
            akk $$4x = $$3x.b().s().h().a();
            grr $$5x = $$4.getOrDefault(gey.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(grq.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new grx.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(grx.a $$0, bmv $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(grq.b::c);
      grw $$2 = $$0.a;
      this.c = $$2.a();
      this.i = $$2.b();
      this.h = $$0.b;
      $$1.b("cache");
      this.e.a($$0.c);
      $$1.c();
      $$1.b();
   }

   public boolean a(dsl $$0, dsl $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.i.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.i.getInt($$1);
            if ($$2 == $$3) {
               eoj $$4 = $$0.u();
               eoj $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public gpp a(akk $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(grw a, grr b, Map<dsl, grr> c, Map<akk, grq.b> d, CompletableFuture<Void> e) {
   }
}
