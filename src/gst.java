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

public class gst implements aty, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<akr, akr> b = Map.of(
      gfo.c,
      akr.b("banner_patterns"),
      gfo.b,
      akr.b("beds"),
      gfo.f,
      akr.b("chests"),
      gfo.d,
      akr.b("shield_patterns"),
      gfo.e,
      akr.b("signs"),
      gfo.a,
      akr.b("shulker_boxes"),
      gfo.g,
      akr.b("armor_trims"),
      gfo.h,
      akr.b("decorated_pot"),
      gqk.e,
      akr.b("blocks")
   );
   private Map<gsu, gsm> c;
   private final gsl d;
   private final gfs e;
   private final fhq f;
   private int g;
   private gsm h;
   private Object2IntMap<dtc> i;

   public gst(gqm $$0, fhq $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new gfs(this);
      this.d = new gsl(b, $$0);
   }

   public gsm a(gsu $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public gsm a() {
      return this.h;
   }

   public gfs b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(aty.a $$0, aue $$1, bnf $$2, bnf $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<akr, ggb>> $$6 = a($$1, $$4);
      CompletableFuture<Map<akr, List<gso.b>>> $$7 = b($$1, $$4);
      CompletableFuture<gss> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new gss(this.f, $$2, $$1x, $$2x), $$4);
      Map<akr, CompletableFuture<gsl.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (gsl.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<akr, ggb>> a(aue $$0, Executor $$1) {
      return CompletableFuture.<Map<akr, auc>>supplyAsync(() -> gss.o.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<akr, ggb>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<akr, auc> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), ggb.a($$1xx));
                  }

                  return var2x;
               } catch (Exception var6) {
                  a.error("Failed to load model {}", $$3.getKey(), var6);
                  return null;
               }
            }, $$1));
         }

         return ad.d($$2).thenApply($$0xx -> $$0xx.stream().filter(Objects::nonNull).collect(Collectors.toUnmodifiableMap(Pair::getFirst, Pair::getSecond)));
      });
   }

   private static CompletableFuture<Map<akr, List<gso.b>>> b(aue $$0, Executor $$1) {
      return CompletableFuture.<Map<akr, List<auc>>>supplyAsync(() -> gso.b.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<akr, List<gso.b>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<akr, List<auc>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<auc> $$1xx = $$3.getValue();
               List<gso.b> $$2x = new ArrayList<>($$1xx.size());

               for (auc $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = aye.a($$4);
                     $$2x.add(new gso.b($$3x.b(), $$5));
                  } catch (Exception var10) {
                     a.error("Failed to load blockstate {} from pack {}", new Object[]{$$3.getKey(), $$3x.b(), var10});
                  }
               }

               return Pair.of($$3.getKey(), $$2x);
            }, $$1));
         }

         return ad.d($$2).thenApply($$0xx -> $$0xx.stream().filter(Objects::nonNull).collect(Collectors.toUnmodifiableMap(Pair::getFirst, Pair::getSecond)));
      });
   }

   private gst.a a(bnf $$0, Map<akr, gsl.b> $$1, gss $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<gsu, gsq> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         gsl.b $$4x = $$1.get($$3x.a());
         gql $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(gsq.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<gsu, gsm> $$4 = $$2.a();
      gsm $$5 = $$4.get(gss.n);
      Map<dtc, gsm> $$6 = new IdentityHashMap<>();

      for (dfy $$7 : lt.e) {
         $$7.l().a().forEach($$3x -> {
            akr $$4x = $$3x.b().s().h().a();
            gsm $$5x = $$4.getOrDefault(gfs.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(gsl.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new gst.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(gst.a $$0, bnf $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(gsl.b::c);
      gss $$2 = $$0.a;
      this.c = $$2.a();
      this.i = $$2.b();
      this.h = $$0.b;
      $$1.b("cache");
      this.e.a($$0.c);
      $$1.c();
      $$1.b();
   }

   public boolean a(dtc $$0, dtc $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.i.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.i.getInt($$1);
            if ($$2 == $$3) {
               epe $$4 = $$0.u();
               epe $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public gqk a(akr $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(gss a, gsm b, Map<dtc, gsm> c, Map<akr, gsl.b> d, CompletableFuture<Void> e) {
   }
}
