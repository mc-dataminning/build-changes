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

public class hdz implements avp, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final als b = als.a("blockstates");
   private static final als c = als.a("models");
   private static final Map<alz, alz> d = Map.of(
      gmf.c,
      alz.b("banner_patterns"),
      gmf.b,
      alz.b("beds"),
      gmf.f,
      alz.b("chests"),
      gmf.d,
      alz.b("shield_patterns"),
      gmf.e,
      alz.b("signs"),
      gmf.a,
      alz.b("shulker_boxes"),
      gmf.g,
      alz.b("armor_trims"),
      gmf.h,
      alz.b("decorated_pot"),
      hbj.d,
      alz.b("blocks")
   );
   private Map<hea, hdm> e;
   private final hdl f;
   private final gmm g;
   private final fnh h;
   private int i;
   private hdm j;
   private Object2IntMap<dxu> k;

   public hdz(hbl $$0, fnh $$1, int $$2) {
      this.h = $$1;
      this.i = $$2;
      this.g = new gmm(this);
      this.f = new hdl(d, $$0);
   }

   public hdm a(hea $$0) {
      return this.e.getOrDefault($$0, this.j);
   }

   public hdm a() {
      return this.j;
   }

   public gmm b() {
      return this.g;
   }

   @Override
   public final CompletableFuture<Void> a(avp.a $$0, avv $$1, Executor $$2, Executor $$3) {
      hef $$4 = hdu.a();
      hdo $$5 = new hdo($$4);
      CompletableFuture<Map<alz, hef>> $$6 = a($$1, $$2);
      CompletableFuture<hdo.c> $$7 = a($$5, $$1, $$2);
      CompletableFuture<hdx> $$8 = $$7.thenCombineAsync($$6, ($$1x, $$2x) -> this.a($$4, $$2x, $$1x), $$2);
      CompletableFuture<Object2IntMap<dxu>> $$9 = $$7.thenApplyAsync($$0x -> a(this.h, $$0x), $$2);
      Map<alz, CompletableFuture<hdl.b>> $$10 = this.f.a($$1, this.i, $$2);
      return CompletableFuture.allOf(Stream.concat($$10.values().stream(), Stream.of($$8, $$9)).toArray(CompletableFuture[]::new)).thenApplyAsync($$4x -> {
         Map<alz, hdl.b> $$5x = $$10.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (hdl.b)((CompletableFuture)$$0xx.getValue()).join()));
         hdx $$6x = $$8.join();
         Object2IntMap<dxu> $$7x = $$9.join();
         return this.a(bpr.a(), $$5x, new hdw($$6x.b(), $$6x.c(), $$4), $$7x);
      }, $$2).thenCompose($$0x -> $$0x.f.thenApply($$1x -> $$0x)).thenCompose($$0::a).thenAcceptAsync($$0x -> this.a($$0x, bpr.a()), $$3);
   }

   private static CompletableFuture<Map<alz, hef>> a(avv $$0, Executor $$1) {
      return CompletableFuture.<Map<alz, avt>>supplyAsync(() -> c.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<alz, gmw>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<alz, avt> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               alz $$1xx = c.b($$3.getKey());

               try {
                  Pair var4x;
                  try (Reader $$2x = $$3.getValue().e()) {
                     gmw $$3x = gmw.a($$2x);
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

   private hdx a(hef $$0, Map<alz, hef> $$1, hdo.c $$2) {
      hdx $$3 = new hdx($$1, $$0);
      $$3.a($$2);
      $$3.a();
      return $$3;
   }

   private static CompletableFuture<hdo.c> a(hdo $$0, avv $$1, Executor $$2) {
      Function<alz, dxv<dkl, dxu>> $$3 = hdo.a();
      return CompletableFuture.<Map<alz, List<avt>>>supplyAsync(() -> b.b($$1), $$2).thenCompose($$3x -> {
         List<CompletableFuture<hdo.c>> $$4 = new ArrayList<>($$3x.size());

         for (Entry<alz, List<avt>> $$5 : $$3x.entrySet()) {
            $$4.add(CompletableFuture.supplyAsync(() -> {
               alz $$3xx = b.b($$5.getKey());
               dxv<dkl, dxu> $$4x = $$3.apply($$3xx);
               if ($$4x == null) {
                  a.debug("Discovered unknown block state definition {}, ignoring", $$3xx);
                  return null;
               } else {
                  List<avt> $$5x = $$5.getValue();
                  List<hdo.a> $$6 = new ArrayList<>($$5x.size());

                  for (avt $$7 : $$5x) {
                     try (Reader $$8 = $$7.e()) {
                        JsonObject $$9 = azu.a($$8);
                        gmx $$10 = gmx.a($$9);
                        $$6.add(new hdo.a($$7.b(), $$10));
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
            Map<hea, hdo.b> $$1xx = new HashMap<>();

            for (hdo.c $$2xx : $$0xx) {
               if ($$2xx != null) {
                  $$1xx.putAll($$2xx.a());
               }
            }

            return new hdo.c($$1xx);
         });
      });
   }

   private hdz.a a(bps $$0, Map<alz, hdl.b> $$1, hdw $$2, Object2IntMap<dxu> $$3) {
      $$0.a("baking");
      Multimap<hea, hdt> $$4 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         hdl.b $$4x = $$1.get($$3x.a());
         hbk $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(hdt.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<hea, hdm> $$5 = $$2.a();
      hdm $$6 = $$5.get(hdu.c);
      Map<dxu, hdm> $$7 = new IdentityHashMap<>();

      for (dkl $$8 : ma.e) {
         $$8.l().a().forEach($$3x -> {
            alz $$4x = $$3x.b().p().h().a();
            hdm $$5x = $$5.getOrDefault(gmm.a($$4x, $$3x), $$6);
            $$7.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$9 = CompletableFuture.allOf($$1.values().stream().map(hdl.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      return new hdz.a($$2, $$3, $$6, $$7, $$1, $$9);
   }

   private static Object2IntMap<dxu> a(fnh $$0, hdo.c $$1) {
      return hdy.a($$0, $$1);
   }

   private void a(hdz.a $$0, bps $$1) {
      $$1.a("upload");
      $$0.e.values().forEach(hdl.b::c);
      hdw $$2 = $$0.a;
      this.e = $$2.a();
      this.k = $$0.b;
      this.j = $$0.c;
      $$1.b("cache");
      this.g.a($$0.d);
      $$1.c();
   }

   public boolean a(dxu $$0, dxu $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         int $$2 = this.k.getInt($$0);
         if ($$2 != -1) {
            int $$3 = this.k.getInt($$1);
            if ($$2 == $$3) {
               etw $$4 = $$0.y();
               etw $$5 = $$1.y();
               return $$4 != $$5;
            }
         }

         return true;
      }
   }

   public hbj a(alz $$0) {
      return this.f.a($$0);
   }

   @Override
   public void close() {
      this.f.close();
   }

   public void a(int $$0) {
      this.i = $$0;
   }

   static record a(hdw a, Object2IntMap<dxu> b, hdm c, Map<dxu, hdm> d, Map<alz, hdl.b> e, CompletableFuture<Void> f) {
   }
}
