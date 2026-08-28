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

public class hbt implements auw, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final alc b = alc.a("blockstates");
   private static final alc c = alc.a("models");
   private static final Map<alj, alj> d = Map.of(
      gkb.c,
      alj.b("banner_patterns"),
      gkb.b,
      alj.b("beds"),
      gkb.f,
      alj.b("chests"),
      gkb.d,
      alj.b("shield_patterns"),
      gkb.e,
      alj.b("signs"),
      gkb.a,
      alj.b("shulker_boxes"),
      gkb.g,
      alj.b("armor_trims"),
      gkb.h,
      alj.b("decorated_pot"),
      gzd.d,
      alj.b("blocks")
   );
   private Map<hbu, hbg> e;
   private final hbf f;
   private final gki g;
   private final flg h;
   private int i;
   private hbg j;
   private Object2IntMap<dvv> k;

   public hbt(gzf $$0, flg $$1, int $$2) {
      this.h = $$1;
      this.i = $$2;
      this.g = new gki(this);
      this.f = new hbf(d, $$0);
   }

   public hbg a(hbu $$0) {
      return this.e.getOrDefault($$0, this.j);
   }

   public hbg a() {
      return this.j;
   }

   public gki b() {
      return this.g;
   }

   @Override
   public final CompletableFuture<Void> a(auw.a $$0, avd $$1, Executor $$2, Executor $$3) {
      hbz $$4 = hbo.a();
      hbi $$5 = new hbi($$4);
      CompletableFuture<Map<alj, hbz>> $$6 = a($$1, $$2);
      CompletableFuture<hbi.c> $$7 = a($$5, $$1, $$2);
      CompletableFuture<hbr> $$8 = $$7.thenCombineAsync($$6, ($$1x, $$2x) -> this.a($$4, $$2x, $$1x), $$2);
      CompletableFuture<Object2IntMap<dvv>> $$9 = $$7.thenApplyAsync($$0x -> a(this.h, $$0x), $$2);
      Map<alj, CompletableFuture<hbf.b>> $$10 = this.f.a($$1, this.i, $$2);
      return CompletableFuture.allOf(Stream.concat($$10.values().stream(), Stream.of($$8, $$9)).toArray(CompletableFuture[]::new)).thenApplyAsync($$4x -> {
         Map<alj, hbf.b> $$5x = $$10.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (hbf.b)((CompletableFuture)$$0xx.getValue()).join()));
         hbr $$6x = $$8.join();
         Object2IntMap<dvv> $$7x = $$9.join();
         return this.a(bot.a(), $$5x, new hbq($$6x.b(), $$6x.c(), $$4), $$7x);
      }, $$2).thenCompose($$0x -> $$0x.f.thenApply($$1x -> $$0x)).thenCompose($$0::a).thenAcceptAsync($$0x -> this.a($$0x, bot.a()), $$3);
   }

   private static CompletableFuture<Map<alj, hbz>> a(avd $$0, Executor $$1) {
      return CompletableFuture.<Map<alj, avb>>supplyAsync(() -> c.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<alj, gks>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<alj, avb> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               alj $$1xx = c.b($$3.getKey());

               try {
                  Pair var4x;
                  try (Reader $$2x = $$3.getValue().e()) {
                     gks $$3x = gks.a($$2x);
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

   private hbr a(hbz $$0, Map<alj, hbz> $$1, hbi.c $$2) {
      hbr $$3 = new hbr($$1, $$0);
      $$3.a($$2);
      $$3.a();
      return $$3;
   }

   private static CompletableFuture<hbi.c> a(hbi $$0, avd $$1, Executor $$2) {
      Function<alj, dvw<diq, dvv>> $$3 = hbi.a();
      return CompletableFuture.<Map<alj, List<avb>>>supplyAsync(() -> b.b($$1), $$2).thenCompose($$3x -> {
         List<CompletableFuture<hbi.c>> $$4 = new ArrayList<>($$3x.size());

         for (Entry<alj, List<avb>> $$5 : $$3x.entrySet()) {
            $$4.add(CompletableFuture.supplyAsync(() -> {
               alj $$3xx = b.b($$5.getKey());
               dvw<diq, dvv> $$4x = $$3.apply($$3xx);
               if ($$4x == null) {
                  a.debug("Discovered unknown block state definition {}, ignoring", $$3xx);
                  return null;
               } else {
                  List<avb> $$5x = $$5.getValue();
                  List<hbi.a> $$6 = new ArrayList<>($$5x.size());

                  for (avb $$7 : $$5x) {
                     try (Reader $$8 = $$7.e()) {
                        JsonObject $$9 = azc.a($$8);
                        gkt $$10 = gkt.a($$9);
                        $$6.add(new hbi.a($$7.b(), $$10));
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
            Map<hbu, hbi.b> $$1xx = new HashMap<>();

            for (hbi.c $$2xx : $$0xx) {
               if ($$2xx != null) {
                  $$1xx.putAll($$2xx.a());
               }
            }

            return new hbi.c($$1xx);
         });
      });
   }

   private hbt.a a(bou $$0, Map<alj, hbf.b> $$1, hbq $$2, Object2IntMap<dvv> $$3) {
      $$0.a("baking");
      Multimap<hbu, hbn> $$4 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         hbf.b $$4x = $$1.get($$3x.a());
         gze $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(hbn.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<hbu, hbg> $$5 = $$2.a();
      hbg $$6 = $$5.get(hbo.c);
      Map<dvv, hbg> $$7 = new IdentityHashMap<>();

      for (diq $$8 : lz.e) {
         $$8.l().a().forEach($$3x -> {
            alj $$4x = $$3x.b().p().h().a();
            hbg $$5x = $$5.getOrDefault(gki.a($$4x, $$3x), $$6);
            $$7.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$9 = CompletableFuture.allOf($$1.values().stream().map(hbf.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      return new hbt.a($$2, $$3, $$6, $$7, $$1, $$9);
   }

   private static Object2IntMap<dvv> a(flg $$0, hbi.c $$1) {
      return hbs.a($$0, $$1);
   }

   private void a(hbt.a $$0, bou $$1) {
      $$1.a("upload");
      $$0.e.values().forEach(hbf.b::c);
      hbq $$2 = $$0.a;
      this.e = $$2.a();
      this.k = $$0.b;
      this.j = $$0.c;
      $$1.b("cache");
      this.g.a($$0.d);
      $$1.c();
   }

   public boolean a(dvv $$0, dvv $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.k.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.k.getInt($$1);
            if ($$2 == $$3) {
               erv $$4 = $$0.y();
               erv $$5 = $$1.y();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public gzd a(alj $$0) {
      return this.f.a($$0);
   }

   @Override
   public void close() {
      this.f.close();
   }

   public void a(int $$0) {
      this.i = $$0;
   }

   static record a(hbq a, Object2IntMap<dvv> b, hbg c, Map<dvv, hbg> d, Map<alj, hbf.b> e, CompletableFuture<Void> f) {
   }
}
