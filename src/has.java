import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.gson.JsonObject;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class has implements auu, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final alb b = alb.a("blockstates");
   private static final alb c = alb.a("models");
   private static final Map<ali, ali> d = Map.of(
      gjc.c,
      ali.b("banner_patterns"),
      gjc.b,
      ali.b("beds"),
      gjc.f,
      ali.b("chests"),
      gjc.d,
      ali.b("shield_patterns"),
      gjc.e,
      ali.b("signs"),
      gjc.a,
      ali.b("shulker_boxes"),
      gjc.g,
      ali.b("armor_trims"),
      gjc.h,
      ali.b("decorated_pot"),
      gyc.d,
      ali.b("blocks")
   );
   private Map<hat, haf> e;
   private final hae f;
   private final gjj g;
   private final fkk h;
   private int i;
   private haf j;
   private Object2IntMap<dvj> k;

   public has(gye $$0, fkk $$1, int $$2) {
      this.h = $$1;
      this.i = $$2;
      this.g = new gjj(this);
      this.f = new hae(d, $$0);
   }

   public haf a(hat $$0) {
      return this.e.getOrDefault($$0, this.j);
   }

   public haf a() {
      return this.j;
   }

   public gjj b() {
      return this.g;
   }

   @Override
   public final CompletableFuture<Void> a(auu.a $$0, avb $$1, Executor $$2, Executor $$3) {
      hay $$4 = han.a();
      hah $$5 = new hah($$4);
      CompletableFuture<Map<ali, hay>> $$6 = a($$1, $$2);
      CompletableFuture<hah.c> $$7 = a($$5, $$1, $$2);
      CompletableFuture<haq> $$8 = $$7.thenCombineAsync($$6, ($$1x, $$2x) -> this.a($$4, $$2x, $$1x), $$2);
      CompletableFuture<Object2IntMap<dvj>> $$9 = $$7.thenApplyAsync($$0x -> a(this.h, $$0x), $$2);
      Map<ali, CompletableFuture<hae.b>> $$10 = this.f.a($$1, this.i, $$2);
      return CompletableFuture.allOf(Stream.concat($$10.values().stream(), Stream.of($$8, $$9)).toArray(CompletableFuture[]::new)).thenApplyAsync($$4x -> {
         Map<ali, hae.b> $$5x = $$10.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (hae.b)((CompletableFuture)$$0xx.getValue()).join()));
         haq $$6x = $$8.join();
         Object2IntMap<dvj> $$7x = $$9.join();
         return this.a(bom.a(), $$5x, new hap($$6x.b(), $$6x.c(), $$4), $$7x);
      }, $$2).thenCompose($$0x -> $$0x.f.thenApply($$1x -> $$0x)).thenCompose($$0::a).thenAcceptAsync($$0x -> this.a($$0x, bom.a()), $$3);
   }

   private static CompletableFuture<Map<ali, hay>> a(avb $$0, Executor $$1) {
      return CompletableFuture.<Map<ali, auz>>supplyAsync(() -> c.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<ali, gjt>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<ali, auz> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               ali $$1xx = c.b($$3.getKey());

               try {
                  Pair var4x;
                  try (Reader $$2x = $$3.getValue().e()) {
                     gjt $$3x = gjt.a($$2x);
                     $$3x.c = $$1xx.toString();
                     var4x = Pair.of($$1xx, $$3x);
                  }

                  return var4x;
               } catch (Exception var7) {
                  a.error("Failed to load model {}", $$3.getKey(), var7);
                  return null;
               }
            }, $$1));
         }

         return ae.d($$2).thenApply($$0xx -> $$0xx.stream().filter(Objects::nonNull).collect(Collectors.toUnmodifiableMap(Pair::getFirst, Pair::getSecond)));
      });
   }

   private haq a(hay $$0, Map<ali, hay> $$1, hah.c $$2) {
      haq $$3 = new haq($$1, $$0);
      $$3.a($$2);
      $$3.a();
      return $$3;
   }

   private static CompletableFuture<hah.c> a(hah $$0, avb $$1, Executor $$2) {
      Function<ali, dvk<die, dvj>> $$3 = hah.a();
      return CompletableFuture.<Map<ali, List<auz>>>supplyAsync(() -> b.b($$1), $$2).thenCompose($$3x -> {
         List<CompletableFuture<hah.c>> $$4 = new ArrayList<>($$3x.size());

         for (Entry<ali, List<auz>> $$5 : $$3x.entrySet()) {
            $$4.add(CompletableFuture.supplyAsync(() -> {
               ali $$3xx = b.b($$5.getKey());
               dvk<die, dvj> $$4x = $$3.apply($$3xx);
               if ($$4x == null) {
                  a.debug("Discovered unknown block state definition {}, ignoring", $$3xx);
                  return null;
               } else {
                  List<auz> $$5x = $$5.getValue();
                  List<hah.a> $$6 = new ArrayList<>($$5x.size());

                  for (auz $$7 : $$5x) {
                     try (Reader $$8 = $$7.e()) {
                        JsonObject $$9 = aza.a($$8);
                        gju $$10 = gju.a($$9);
                        $$6.add(new hah.a($$7.b(), $$10));
                     } catch (Exception var15) {
                        a.error("Failed to load blockstate definition {} from pack {}", new Object[]{$$3xx, $$7.b(), var15});
                     }
                  }

                  try {
                     return $$0.a($$3xx, $$4x, $$6);
                  } catch (Exception var12) {
                     a.error("Failed to load blockstate definition {}", $$3xx, var12);
                     return null;
                  }
               }
            }, $$2));
         }

         return ae.d($$4).thenApply($$0xx -> {
            Map<hat, hah.b> $$1xx = new HashMap<>();

            for (hah.c $$2xx : $$0xx) {
               if ($$2xx != null) {
                  $$1xx.putAll($$2xx.a());
               }
            }

            return new hah.c($$1xx);
         });
      });
   }

   private has.a a(bon $$0, Map<ali, hae.b> $$1, hap $$2, Object2IntMap<dvj> $$3) {
      $$0.a("baking");
      Multimap<hat, ham> $$4 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         hae.b $$4x = $$1.get($$3x.a());
         gyd $$5x = $$4x.a($$3x.b());
         if ($$5x != null) {
            return $$5x;
         } else {
            $$4.put($$2x, $$3x);
            return $$4x.a();
         }
      });
      $$4.asMap()
         .forEach(
            ($$0x, $$1x) -> a.warn(
                  "Missing textures in model {}:\n{}",
                  $$0x,
                  $$1x.stream().sorted(ham.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<hat, haf> $$5 = $$2.a();
      haf $$6 = $$5.get(han.c);
      Map<dvj, haf> $$7 = new IdentityHashMap<>();

      for (die $$8 : ly.e) {
         $$8.l().a().forEach($$3x -> {
            ali $$4x = $$3x.b().p().h().a();
            haf $$5x = $$5.getOrDefault(gjj.a($$4x, $$3x), $$6);
            $$7.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$9 = CompletableFuture.allOf($$1.values().stream().map(hae.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      return new has.a($$2, $$3, $$6, $$7, $$1, $$9);
   }

   private static Object2IntMap<dvj> a(fkk $$0, hah.c $$1) {
      return har.a($$0, $$1);
   }

   private void a(has.a $$0, bon $$1) {
      $$1.a("upload");
      $$0.e.values().forEach(hae.b::c);
      hap $$2 = $$0.a;
      this.e = $$2.a();
      this.k = $$0.b;
      this.j = $$0.c;
      $$1.b("cache");
      this.g.a($$0.d);
      $$1.c();
   }

   public boolean a(dvj $$0, dvj $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.k.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.k.getInt($$1);
            if ($$2 == $$3) {
               erk $$4 = $$0.y();
               erk $$5 = $$1.y();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public gyc a(ali $$0) {
      return this.f.a($$0);
   }

   @Override
   public void close() {
      this.f.close();
   }

   public void a(int $$0) {
      this.i = $$0;
   }

   static record a(hap a, Object2IntMap<dvj> b, haf c, Map<dvj, haf> d, Map<ali, hae.b> e, CompletableFuture<Void> f) {
   }
}
