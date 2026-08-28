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

public class gsr implements aty, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<akr, akr> b = Map.of(
      gfm.c,
      akr.b("banner_patterns"),
      gfm.b,
      akr.b("beds"),
      gfm.f,
      akr.b("chests"),
      gfm.d,
      akr.b("shield_patterns"),
      gfm.e,
      akr.b("signs"),
      gfm.a,
      akr.b("shulker_boxes"),
      gfm.g,
      akr.b("armor_trims"),
      gfm.h,
      akr.b("decorated_pot"),
      gqi.e,
      akr.b("blocks")
   );
   private Map<gss, gsk> c;
   private final gsj d;
   private final gfq e;
   private final fho f;
   private int g;
   private gsk h;
   private Object2IntMap<dtc> i;

   public gsr(gqk $$0, fho $$1, int $$2) {
      this.f = $$1;
      this.g = $$2;
      this.e = new gfq(this);
      this.d = new gsj(b, $$0);
   }

   public gsk a(gss $$0) {
      return this.c.getOrDefault($$0, this.h);
   }

   public gsk a() {
      return this.h;
   }

   public gfq b() {
      return this.e;
   }

   @Override
   public final CompletableFuture<Void> a(aty.a $$0, aue $$1, bnf $$2, bnf $$3, Executor $$4, Executor $$5) {
      $$2.a();
      CompletableFuture<Map<akr, gfz>> $$6 = a($$1, $$4);
      CompletableFuture<Map<akr, List<gsm.b>>> $$7 = b($$1, $$4);
      CompletableFuture<gsq> $$8 = $$6.thenCombineAsync($$7, ($$1x, $$2x) -> new gsq(this.f, $$2, $$1x, $$2x), $$4);
      Map<akr, CompletableFuture<gsj.b>> $$9 = this.d.a($$1, this.g, $$4);
      return CompletableFuture.allOf(Stream.concat($$9.values().stream(), Stream.of($$8)).toArray(CompletableFuture[]::new))
         .thenApplyAsync(
            $$3x -> this.a(
                  $$2,
                  $$9.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (gsj.b)((CompletableFuture)$$0xx.getValue()).join())),
                  $$8.join()
               ),
            $$4
         )
         .thenCompose($$0x -> $$0x.e.thenApply($$1x -> $$0x))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private static CompletableFuture<Map<akr, gfz>> a(aue $$0, Executor $$1) {
      return CompletableFuture.<Map<akr, auc>>supplyAsync(() -> gsq.o.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<akr, gfz>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<akr, auc> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               try {
                  Pair var2x;
                  try (Reader $$1xx = $$3.getValue().e()) {
                     var2x = Pair.of($$3.getKey(), gfz.a($$1xx));
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

   private static CompletableFuture<Map<akr, List<gsm.b>>> b(aue $$0, Executor $$1) {
      return CompletableFuture.<Map<akr, List<auc>>>supplyAsync(() -> gsm.b.b($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<akr, List<gsm.b>>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<akr, List<auc>> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               List<auc> $$1xx = $$3.getValue();
               List<gsm.b> $$2x = new ArrayList<>($$1xx.size());

               for (auc $$3x : $$1xx) {
                  try (Reader $$4 = $$3x.e()) {
                     JsonObject $$5 = aye.a($$4);
                     $$2x.add(new gsm.b($$3x.b(), $$5));
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

   private gsr.a a(bnf $$0, Map<akr, gsj.b> $$1, gsq $$2) {
      $$0.a("load");
      $$0.b("baking");
      Multimap<gss, gso> $$3 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         gsj.b $$4x = $$1.get($$3x.a());
         gqj $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(gso.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<gss, gsk> $$4 = $$2.a();
      gsk $$5 = $$4.get(gsq.n);
      Map<dtc, gsk> $$6 = new IdentityHashMap<>();

      for (dfy $$7 : lt.e) {
         $$7.l().a().forEach($$3x -> {
            akr $$4x = $$3x.b().s().h().a();
            gsk $$5x = $$4.getOrDefault(gfq.a($$4x, $$3x), $$5);
            $$6.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$8 = CompletableFuture.allOf($$1.values().stream().map(gsj.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      $$0.b();
      return new gsr.a($$2, $$5, $$6, $$1, $$8);
   }

   private void a(gsr.a $$0, bnf $$1) {
      $$1.a();
      $$1.a("upload");
      $$0.d.values().forEach(gsj.b::c);
      gsq $$2 = $$0.a;
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
               epc $$4 = $$0.u();
               epc $$5 = $$1.u();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public gqi a(akr $$0) {
      return this.d.a($$0);
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   static record a(gsq a, gsk b, Map<dtc, gsk> c, Map<akr, gsj.b> d, CompletableFuture<Void> e) {
   }
}
