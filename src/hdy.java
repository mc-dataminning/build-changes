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

public class hdy implements avp, AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final als b = als.a("blockstates");
   private static final als c = als.a("models");
   private static final Map<alz, alz> d = Map.of(
      gme.c,
      alz.b("banner_patterns"),
      gme.b,
      alz.b("beds"),
      gme.f,
      alz.b("chests"),
      gme.d,
      alz.b("shield_patterns"),
      gme.e,
      alz.b("signs"),
      gme.a,
      alz.b("shulker_boxes"),
      gme.g,
      alz.b("armor_trims"),
      gme.h,
      alz.b("decorated_pot"),
      hbi.d,
      alz.b("blocks")
   );
   private Map<hdz, hdl> e;
   private final hdk f;
   private final gml g;
   private final fng h;
   private int i;
   private hdl j;
   private Object2IntMap<dxu> k;

   public hdy(hbk $$0, fng $$1, int $$2) {
      this.h = $$1;
      this.i = $$2;
      this.g = new gml(this);
      this.f = new hdk(d, $$0);
   }

   public hdl a(hdz $$0) {
      return this.e.getOrDefault($$0, this.j);
   }

   public hdl a() {
      return this.j;
   }

   public gml b() {
      return this.g;
   }

   @Override
   public final CompletableFuture<Void> a(avp.a $$0, avv $$1, Executor $$2, Executor $$3) {
      hee $$4 = hdt.a();
      hdn $$5 = new hdn($$4);
      CompletableFuture<Map<alz, hee>> $$6 = a($$1, $$2);
      CompletableFuture<hdn.c> $$7 = a($$5, $$1, $$2);
      CompletableFuture<hdw> $$8 = $$7.thenCombineAsync($$6, ($$1x, $$2x) -> this.a($$4, $$2x, $$1x), $$2);
      CompletableFuture<Object2IntMap<dxu>> $$9 = $$7.thenApplyAsync($$0x -> a(this.h, $$0x), $$2);
      Map<alz, CompletableFuture<hdk.b>> $$10 = this.f.a($$1, this.i, $$2);
      return CompletableFuture.allOf(Stream.concat($$10.values().stream(), Stream.of($$8, $$9)).toArray(CompletableFuture[]::new)).thenApplyAsync($$4x -> {
         Map<alz, hdk.b> $$5x = $$10.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$0xx -> (hdk.b)((CompletableFuture)$$0xx.getValue()).join()));
         hdw $$6x = $$8.join();
         Object2IntMap<dxu> $$7x = $$9.join();
         return this.a(bpr.a(), $$5x, new hdv($$6x.b(), $$6x.c(), $$4), $$7x);
      }, $$2).thenCompose($$0x -> $$0x.f.thenApply($$1x -> $$0x)).thenCompose($$0::a).thenAcceptAsync($$0x -> this.a($$0x, bpr.a()), $$3);
   }

   private static CompletableFuture<Map<alz, hee>> a(avv $$0, Executor $$1) {
      return CompletableFuture.<Map<alz, avt>>supplyAsync(() -> c.a($$0), $$1).thenCompose($$1x -> {
         List<CompletableFuture<Pair<alz, gmv>>> $$2 = new ArrayList<>($$1x.size());

         for (Entry<alz, avt> $$3 : $$1x.entrySet()) {
            $$2.add(CompletableFuture.supplyAsync(() -> {
               alz $$1xx = c.b($$3.getKey());

               try {
                  Pair var4x;
                  try (Reader $$2x = $$3.getValue().e()) {
                     gmv $$3x = gmv.a($$2x);
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

   private hdw a(hee $$0, Map<alz, hee> $$1, hdn.c $$2) {
      hdw $$3 = new hdw($$1, $$0);
      $$3.a($$2);
      $$3.a();
      return $$3;
   }

   private static CompletableFuture<hdn.c> a(hdn $$0, avv $$1, Executor $$2) {
      Function<alz, dxv<dkl, dxu>> $$3 = hdn.a();
      return CompletableFuture.<Map<alz, List<avt>>>supplyAsync(() -> b.b($$1), $$2).thenCompose($$3x -> {
         List<CompletableFuture<hdn.c>> $$4 = new ArrayList<>($$3x.size());

         for (Entry<alz, List<avt>> $$5 : $$3x.entrySet()) {
            $$4.add(CompletableFuture.supplyAsync(() -> {
               alz $$3xx = b.b($$5.getKey());
               dxv<dkl, dxu> $$4x = $$3.apply($$3xx);
               if ($$4x == null) {
                  a.debug("Discovered unknown block state definition {}, ignoring", $$3xx);
                  return null;
               } else {
                  List<avt> $$5x = $$5.getValue();
                  List<hdn.a> $$6 = new ArrayList<>($$5x.size());

                  for (avt $$7 : $$5x) {
                     try (Reader $$8 = $$7.e()) {
                        JsonObject $$9 = azu.a($$8);
                        gmw $$10 = gmw.a($$9);
                        $$6.add(new hdn.a($$7.b(), $$10));
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
            Map<hdz, hdn.b> $$1xx = new HashMap<>();

            for (hdn.c $$2xx : $$0xx) {
               if ($$2xx != null) {
                  $$1xx.putAll($$2xx.a());
               }
            }

            return new hdn.c($$1xx);
         });
      });
   }

   private hdy.a a(bps $$0, Map<alz, hdk.b> $$1, hdv $$2, Object2IntMap<dxu> $$3) {
      $$0.a("baking");
      Multimap<hdz, hds> $$4 = HashMultimap.create();
      $$2.a(($$2x, $$3x) -> {
         hdk.b $$4x = $$1.get($$3x.a());
         hbj $$5x = $$4x.a($$3x.b());
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
                  $$1x.stream().sorted(hds.a).map($$0xx -> "    " + $$0xx.a() + ":" + $$0xx.b()).collect(Collectors.joining("\n"))
               )
         );
      $$0.b("dispatch");
      Map<hdz, hdl> $$5 = $$2.a();
      hdl $$6 = $$5.get(hdt.c);
      Map<dxu, hdl> $$7 = new IdentityHashMap<>();

      for (dkl $$8 : ma.e) {
         $$8.l().a().forEach($$3x -> {
            alz $$4x = $$3x.b().p().h().a();
            hdl $$5x = $$5.getOrDefault(gml.a($$4x, $$3x), $$6);
            $$7.put($$3x, $$5x);
         });
      }

      CompletableFuture<Void> $$9 = CompletableFuture.allOf($$1.values().stream().map(hdk.b::b).toArray(CompletableFuture[]::new));
      $$0.c();
      return new hdy.a($$2, $$3, $$6, $$7, $$1, $$9);
   }

   private static Object2IntMap<dxu> a(fng $$0, hdn.c $$1) {
      return hdx.a($$0, $$1);
   }

   private void a(hdy.a $$0, bps $$1) {
      $$1.a("upload");
      $$0.e.values().forEach(hdk.b::c);
      hdv $$2 = $$0.a;
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

   public hbi a(alz $$0) {
      return this.f.a($$0);
   }

   @Override
   public void close() {
      this.f.close();
   }

   public void a(int $$0) {
      this.i = $$0;
   }

   static record a(hdv a, Object2IntMap<dxu> b, hdl c, Map<dxu, hdl> d, Map<alz, hdk.b> e, CompletableFuture<Void> f) {
   }
}
