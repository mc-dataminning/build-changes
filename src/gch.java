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

public class gch implements aon, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<afw, afw> b = Map.of(
      fpp.c,
      new afw("banner_patterns"),
      fpp.b,
      new afw("beds"),
      fpp.f,
      new afw("chests"),
      fpp.d,
      new afw("shield_patterns"),
      fpp.e,
      new afw("signs"),
      fpp.a,
      new afw("shulker_boxes"),
      fpp.g,
      new afw("armor_trims"),
      fpp.h,
      new afw("decorated_pot"),
      fzz.e,
      new afw("blocks")
   );
   private Map<afw, gcb> c;
   private final gca d;
   private final fpt e;
   private final esp f;
   private int g;
   private gcb h;
   private Object2IntMap<dgb> i;

   public gch(gab $$0, esp $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new fpt(this);
      this.d = new gca(b, $$0);
   }

   public gcb a(gci $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public gcb a() {
      return this.h;
   }

   public fpt b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(aon.a $$0, aot $$1, bes $$2, bes $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<afw, fqc>> $$6 = a($$1, $$4);
      CompletableFuture<Map<afw, List<gcg.c>>> $$7 = b($$1, $$4);
      CompletableFuture<gcg> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new gcg(this.f, $$2, $$1x, $$2x), $$4);
      Map<afw, CompletableFuture<gca.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (gca.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<afw, fqc>> a(aot $$0, Executor $$1) {
      return CompletableFuture.<Map<afw, aor>>supplyAsync(() -> gcg.p.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<afw, fqc>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<afw, aor> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), fqc.a($$1xx));
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

   private static CompletableFuture<Map<afw, List<gcg.c>>> b(aot $$0, Executor $$1) {
      return CompletableFuture.<Map<afw, List<aor>>>supplyAsync(() -> gcg.o.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<afw, List<gcg.c>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<afw, List<aor>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<aor> $$1xx = $$3.getValue();
               List<gcg.c> $$2x = new ArrayList<>($$1xx.size());

               for (aor $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = aso.a($$4);
                     $$2x.add(new gcg.c($$3x.b(), $$5));
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

   private gch.a a(bes $$0, Map<afw, gca.b> $$1, gcg $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<afw, gce> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         gca.b $$4x = $$1.get($$3x.a());
         gaa $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(gce.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<afw, gcb> $$4 = $$2.a();
      gcb $$5 = $$4.get(gcg.n);
      Map<dgb, gcb> $$6 = new IdentityHashMap<>();

      for (cua $$7 : jy.f) {
         $$7.n().a().forEach($$3x -> {
            afw $$4x = $$3x.b().r().g().a();
            gcb $$5x = $$4.getOrDefault(fpt.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(gca.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new gch.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(gch.a $$0, bes $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(gca.b::c);
      gcg $$2 = $$0.a;
      this.c = $$2.a();
      this.i = $$2.b();
      this.h = $$0.b;
      $$1.b("cache");
      this.e.a($$0.c);
      $$1.c();
      $$1.b();
   }

   public boolean a(dgb $$0, dgb $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.i.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.i.getInt($$1);
            if ($$2 == $$3) {
               ebe $$4 = $$0.u();
               ebe $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public fzz a(afw $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(gcg a, gcb b, Map<dgb, gcb> c, Map<afw, gca.b> d, CompletableFuture<Void> e) {
   }
}
