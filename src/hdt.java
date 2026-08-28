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

public class hdt implements avp, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final als b = als.a("blockstates");
   private static final als c = als.a("models");
   private static final Map<alz, alz> d = Map.of(
      glz.c,
      alz.b("banner_patterns"),
      glz.b,
      alz.b("beds"),
      glz.f,
      alz.b("chests"),
      glz.d,
      alz.b("shield_patterns"),
      glz.e,
      alz.b("signs"),
      glz.a,
      alz.b("shulker_boxes"),
      glz.g,
      alz.b("armor_trims"),
      glz.h,
      alz.b("decorated_pot"),
      hbd.d,
      alz.b("blocks")
   );
   private Map<hdu, hdg> e;
   private final hdf f;
   private final gmg g;
   private final fnb h;
   private int i;
   private hdg j;
   private Object2IntMap<dxn> k;

   public hdt(hbf $$0, fnb $$1, int $$2) {
      this.h = $$1;
      this.i = $$2;
      this.g = new gmg(this);
      this.f = new hdf(d, $$0);
   }

   public hdg a(hdu $$0) {
      return this.e.getOrDefault($$0, this.j);
   }

   public hdg a() {
      return this.j;
   }

   public gmg b() {
      return this.g;
   }

   @Override
   public final CompletableFuture<Void> a(avp.a $$0, avv $$1, Executor $$2, Executor $$3) {
      hdz $$4 = hdo.a();
      hdi $$5 = new hdi($$4);
      CompletableFuture<Map<alz, hdz>> $$6 = a($$1, $$2);
      CompletableFuture<hdi.c> $$7 = a($$5, $$1, $$2);
      CompletableFuture<hdr> $$8 = $$7.thenCombineAsync($$6, ($$1x, $$2x) -> this.a($$4, $$2x, $$1x), $$2);
      CompletableFuture<Object2IntMap<dxn>> $$9 = $$7.thenApplyAsync($$0x -> a(this.h, $$0x), $$2);
      Map<alz, CompletableFuture<hdf.b>> $$10 = this.f.a($$1, this.i, $$2);
      return CompletableFuture.allOf(Stream.concat($$10.values().stream(), Stream.of($$8, $$9)).toArray(CompletableFuture[]::new)).thenApplyAsync($$4x -> {
         Map<alz, hdf.b> $$5x = $$10.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (hdf.b)((CompletableFuture)$$0xx.getValue()).join()));
         hdr $$6x = $$8.join();
         Object2IntMap<dxn> $$7x = $$9.join();
         return this.a(bpn.a(), $$5x, new hdq($$6x.b(), $$6x.c(), $$4), $$7x);
      }, $$2).thenCompose($$0x -> $$0x.f.thenApply($$1x -> $$0x)).thenCompose($$0::a).thenAcceptAsync($$0x -> this.a($$0x, bpn.a()), $$3);
   }

   private static CompletableFuture<Map<alz, hdz>> a(avv $$0, Executor $$1) {
      return CompletableFuture.<Map<alz, avt>>supplyAsync(() -> c.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<alz, gmq>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<alz, avt> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               alz $$1xx = c.b($$3.getKey());

               try {
                  Pair var4x;
                  try (Reader $$2x = $$3.getValue().e()) {
                     gmq $$3x = gmq.a($$2x);
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

   private hdr a(hdz $$0, Map<alz, hdz> $$1, hdi.c $$2) {
      hdr $$3 = new hdr($$1, $$0);
      $$3.a($$2);
      $$3.a();
      return $$3;
   }

   private static CompletableFuture<hdi.c> a(hdi $$0, avv $$1, Executor $$2) {
      Function<alz, dxo<dke, dxn>> $$3 = hdi.a();
      return CompletableFuture.<Map<alz, List<avt>>>supplyAsync(() -> b.b($$1), $$2).thenCompose($$3x -> {
         List<CompletableFuture<hdi.c>> $$4 = new ArrayList<>($$3x.size());

         for (Entry<alz, List<avt>> $$5 : $$3x.entrySet()) {
            $$4.add(CompletableFuture.supplyAsync(() -> {
               alz $$3xx = b.b($$5.getKey());
               dxo<dke, dxn> $$4x = $$3.apply($$3xx);
               if ($$4x == null) {
                  a.debug("Discovered unknown block state definition {}, ignoring", $$3xx);
                  return null;
               } else {
                  List<avt> $$5x = $$5.getValue();
                  List<hdi.a> $$6 = new ArrayList<>($$5x.size());

                  for (avt $$7 : $$5x) {
                     try (Reader $$8 = $$7.e()) {
                        JsonObject $$9 = azu.a($$8);
                        gmr $$10 = gmr.a($$9);
                        $$6.add(new hdi.a($$7.b(), $$10));
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
            Map<hdu, hdi.b> $$1xx = new HashMap<>();

            for (hdi.c $$2xx : $$0xx) {
               if ($$2xx != null) {
                  $$1xx.putAll($$2xx.a());
               }
            }

            return new hdi.c($$1xx);
         });
      });
   }

   private hdt.a a(bpo $$0, Map<alz, hdf.b> $$1, hdq $$2, Object2IntMap<dxn> $$3) {
      $$0.a("baking");
      Multimap<hdu, hdn> $$4 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         hdf.b $$4x = $$1.get($$3x.a());
         hbe $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(hdn.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<hdu, hdg> $$5 = $$2.a();
      hdg $$6 = $$5.get(hdo.c);
      Map<dxn, hdg> $$7 = new IdentityHashMap<>();

      for (dke $$8 : ma.e) {
         $$8.l().a().forEach($$3x -> {
            alz $$4x = $$3x.b().p().h().a();
            hdg $$5x = $$5.getOrDefault(gmg.a($$4x, $$3x), $$6);
            $$7.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$9 = CompletableFuture.allOf($$1.values().stream().map(hdf.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      return new hdt.a($$2, $$3, $$6, $$7, $$1, $$9);
   }

   private static Object2IntMap<dxn> a(fnb $$0, hdi.c $$1) {
      return hds.a($$0, $$1);
   }

   private void a(hdt.a $$0, bpo $$1) {
      $$1.a("upload");
      $$0.e.values().forEach(hdf.b::c);
      hdq $$2 = $$0.a;
      this.e = $$2.a();
      this.k = $$0.b;
      this.j = $$0.c;
      $$1.b("cache");
      this.g.a($$0.d);
      $$1.c();
   }

   public boolean a(dxn $$0, dxn $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.k.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.k.getInt($$1);
            if ($$2 == $$3) {
               etp $$4 = $$0.y();
               etp $$5 = $$1.y();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public hbd a(alz $$0) {
      return this.f.a($$0);
   }

   @Override
   public void close() {
      this.f.close();
   }

   public void a(int $$0) {
      this.i = $$0;
   }

   static record a(hdq a, Object2IntMap<dxn> b, hdg c, Map<dxn, hdg> d, Map<alz, hdf.b> e, CompletableFuture<Void> f) {
   }
}
