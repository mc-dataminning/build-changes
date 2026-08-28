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

public class hea implements avp, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final als b = als.a("blockstates");
   private static final als c = als.a("models");
   private static final Map<alz, alz> d = Map.of(
      gmg.c,
      alz.b("banner_patterns"),
      gmg.b,
      alz.b("beds"),
      gmg.f,
      alz.b("chests"),
      gmg.d,
      alz.b("shield_patterns"),
      gmg.e,
      alz.b("signs"),
      gmg.a,
      alz.b("shulker_boxes"),
      gmg.g,
      alz.b("armor_trims"),
      gmg.h,
      alz.b("decorated_pot"),
      hbk.d,
      alz.b("blocks")
   );
   private Map<heb, hdn> e;
   private final hdm f;
   private final gmn g;
   private final fni h;
   private int i;
   private hdn j;
   private Object2IntMap<dxv> k;

   public hea(hbm $$0, fni $$1, int $$2) {
      this.h = $$1;
      this.i = $$2;
      this.g = new gmn(this);
      this.f = new hdm(d, $$0);
   }

   public hdn a(heb $$0) {
      return this.e.getOrDefault($$0, this.j);
   }

   public hdn a() {
      return this.j;
   }

   public gmn b() {
      return this.g;
   }

   @Override
   public final CompletableFuture<Void> a(avp.a $$0, avv $$1, Executor $$2, Executor $$3) {
      heg $$4 = hdv.a();
      hdp $$5 = new hdp($$4);
      CompletableFuture<Map<alz, heg>> $$6 = a($$1, $$2);
      CompletableFuture<hdp.c> $$7 = a($$5, $$1, $$2);
      CompletableFuture<hdy> $$8 = $$7.thenCombineAsync($$6, ($$1x, $$2x) -> this.a($$4, $$2x, $$1x), $$2);
      CompletableFuture<Object2IntMap<dxv>> $$9 = $$7.thenApplyAsync($$0x -> a(this.h, $$0x), $$2);
      Map<alz, CompletableFuture<hdm.b>> $$10 = this.f.a($$1, this.i, $$2);
      return CompletableFuture.allOf(Stream.concat($$10.values().stream(), Stream.of($$8, $$9)).toArray(CompletableFuture[]::new)).thenApplyAsync($$4x -> {
         Map<alz, hdm.b> $$5x = $$10.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (hdm.b)((CompletableFuture)$$0xx.getValue()).join()));
         hdy $$6x = $$8.join();
         Object2IntMap<dxv> $$7x = $$9.join();
         return this.a(bps.a(), $$5x, new hdx($$6x.b(), $$6x.c(), $$4), $$7x);
      }, $$2).thenCompose($$0x -> $$0x.f.thenApply($$1x -> $$0x)).thenCompose($$0::a).thenAcceptAsync($$0x -> this.a($$0x, bps.a()), $$3);
   }

   private static CompletableFuture<Map<alz, heg>> a(avv $$0, Executor $$1) {
      return CompletableFuture.<Map<alz, avt>>supplyAsync(() -> c.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<alz, gmx>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<alz, avt> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               alz $$1xx = c.b($$3.getKey());

               try {
                  Pair var4x;
                  try (Reader $$2x = $$3.getValue().e()) {
                     gmx $$3x = gmx.a($$2x);
                     $$3x.d = $$1xx.toString();
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

   private hdy a(heg $$0, Map<alz, heg> $$1, hdp.c $$2) {
      hdy $$3 = new hdy($$1, $$0);
      $$3.a($$2);
      $$3.a();
      return $$3;
   }

   private static CompletableFuture<hdp.c> a(hdp $$0, avv $$1, Executor $$2) {
      Function<alz, dxw<dkm, dxv>> $$3 = hdp.a();
      return CompletableFuture.<Map<alz, List<avt>>>supplyAsync(() -> b.b($$1), $$2).thenCompose($$3x -> {
         List<CompletableFuture<hdp.c>> $$4 = new ArrayList<>($$3x.size());

         for (Entry<alz, List<avt>> $$5 : $$3x.entrySet()) {
            $$4.add(CompletableFuture.supplyAsync(() -> {
               alz $$3xx = b.b($$5.getKey());
               dxw<dkm, dxv> $$4x = $$3.apply($$3xx);
               if ($$4x == null) {
                  a.debug("Discovered unknown block state definition {}, ignoring", $$3xx);
                  return null;
               } else {
                  List<avt> $$5x = $$5.getValue();
                  List<hdp.a> $$6 = new ArrayList<>($$5x.size());

                  for (avt $$7 : $$5x) {
                     try (Reader $$8 = $$7.e()) {
                        JsonObject $$9 = azu.a($$8);
                        gmy $$10 = gmy.a($$9);
                        $$6.add(new hdp.a($$7.b(), $$10));
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
            Map<heb, hdp.b> $$1xx = new HashMap<>();

            for (hdp.c $$2xx : $$0xx) {
               if ($$2xx != null) {
                  $$1xx.putAll($$2xx.a());
               }
            }

            return new hdp.c($$1xx);
         });
      });
   }

   private hea.a a(bpt $$0, Map<alz, hdm.b> $$1, hdx $$2, Object2IntMap<dxv> $$3) {
      $$0.a("baking");
      Multimap<heb, hdu> $$4 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         hdm.b $$4x = $$1.get($$3x.a());
         hbl $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(hdu.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<heb, hdn> $$5 = $$2.a();
      hdn $$6 = $$5.get(hdv.c);
      Map<dxv, hdn> $$7 = new IdentityHashMap<>();

      for (dkm $$8 : ma.e) {
         $$8.l().a().forEach($$3x -> {
            alz $$4x = $$3x.b().p().h().a();
            hdn $$5x = $$5.getOrDefault(gmn.a($$4x, $$3x), $$6);
            $$7.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$9 = CompletableFuture.allOf($$1.values().stream().map(hdm.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      return new hea.a($$2, $$3, $$6, $$7, $$1, $$9);
   }

   private static Object2IntMap<dxv> a(fni $$0, hdp.c $$1) {
      return hdz.a($$0, $$1);
   }

   private void a(hea.a $$0, bpt $$1) {
      $$1.a("upload");
      $$0.e.values().forEach(hdm.b::c);
      hdx $$2 = $$0.a;
      this.e = $$2.a();
      this.k = $$0.b;
      this.j = $$0.c;
      $$1.b("cache");
      this.g.a($$0.d);
      $$1.c();
   }

   public boolean a(dxv $$0, dxv $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.k.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.k.getInt($$1);
            if ($$2 == $$3) {
               etx $$4 = $$0.y();
               etx $$5 = $$1.y();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public hbk a(alz $$0) {
      return this.f.a($$0);
   }

   @Override
   public void close() {
      this.f.close();
   }

   public void a(int $$0) {
      this.i = $$0;
   }

   static record a(hdx a, Object2IntMap<dxv> b, hdn c, Map<dxv, hdn> d, Map<alz, hdm.b> e, CompletableFuture<Void> f) {
   }
}
