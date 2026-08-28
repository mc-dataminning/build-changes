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

public class grp implements ato, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<akk, akk> b = Map.of(
      gem.c,
      new akk("banner_patterns"),
      gem.b,
      new akk("beds"),
      gem.f,
      new akk("chests"),
      gem.d,
      new akk("shield_patterns"),
      gem.e,
      new akk("signs"),
      gem.a,
      new akk("shulker_boxes"),
      gem.g,
      new akk("armor_trims"),
      gem.h,
      new akk("decorated_pot"),
      gph.e,
      new akk("blocks")
   );
   private Map<akk, grj> c;
   private final gri d;
   private final geq e;
   private final fgq f;
   private int g;
   private grj h;
   private Object2IntMap<dsh> i;

   public grp(gpj $$0, fgq $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new geq(this);
      this.d = new gri(b, $$0);
   }

   public grj a(grq $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public grj a() {
      return this.h;
   }

   public geq b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(ato.a $$0, atu $$1, bmr $$2, bmr $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<akk, gez>> $$6 = a($$1, $$4);
      CompletableFuture<Map<akk, List<gro.c>>> $$7 = b($$1, $$4);
      CompletableFuture<gro> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new gro(this.f, $$2, $$1x, $$2x), $$4);
      Map<akk, CompletableFuture<gri.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (gri.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<akk, gez>> a(atu $$0, Executor $$1) {
      return CompletableFuture.<Map<akk, ats>>supplyAsync(() -> gro.p.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<akk, gez>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<akk, ats> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), gez.a($$1xx));
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

   private static CompletableFuture<Map<akk, List<gro.c>>> b(atu $$0, Executor $$1) {
      return CompletableFuture.<Map<akk, List<ats>>>supplyAsync(() -> gro.o.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<akk, List<gro.c>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<akk, List<ats>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<ats> $$1xx = $$3.getValue();
               List<gro.c> $$2x = new ArrayList<>($$1xx.size());

               for (ats $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = axu.a($$4);
                     $$2x.add(new gro.c($$3x.b(), $$5));
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

   private grp.a a(bmr $$0, Map<akk, gri.b> $$1, gro $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<akk, grm> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         gri.b $$4x = $$1.get($$3x.a());
         gpi $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(grm.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<akk, grj> $$4 = $$2.a();
      grj $$5 = $$4.get(gro.n);
      Map<dsh, grj> $$6 = new IdentityHashMap<>();

      for (dff $$7 : lq.e) {
         $$7.l().a().forEach($$3x -> {
            akk $$4x = $$3x.b().s().h().a();
            grj $$5x = $$4.getOrDefault(geq.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(gri.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new grp.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(grp.a $$0, bmr $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(gri.b::c);
      gro $$2 = $$0.a;
      this.c = $$2.a();
      this.i = $$2.b();
      this.h = $$0.b;
      $$1.b("cache");
      this.e.a($$0.c);
      $$1.c();
      $$1.b();
   }

   public boolean a(dsh $$0, dsh $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.i.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.i.getInt($$1);
            if ($$2 == $$3) {
               eob $$4 = $$0.u();
               eob $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public gph a(akk $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(gro a, grj b, Map<dsh, grj> c, Map<akk, gri.b> d, CompletableFuture<Void> e) {
   }
}
