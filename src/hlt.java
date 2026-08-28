import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.slf4j.Logger;

public class hlt {
   public static final hlq a = new hlq(hjj.c, alg.b("block/fire_0"));
   public static final hlq b = new hlq(hjj.c, alg.b("block/fire_1"));
   public static final hlq c = new hlq(hjj.c, alg.b("block/lava_flow"));
   public static final hlq d = new hlq(hjj.c, alg.b("block/water_flow"));
   public static final hlq e = new hlq(hjj.c, alg.b("block/water_overlay"));
   public static final hlq f = new hlq(grg.c, alg.b("entity/banner_base"));
   public static final hlq g = new hlq(grg.d, alg.b("entity/shield_base"));
   public static final hlq h = new hlq(grg.d, alg.b("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<alg> j = IntStream.range(0, 10).mapToObj($$0 -> alg.b("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<alg> k = j.stream().map($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).collect(Collectors.toList());
   public static final List<gqx> l = k.stream().map(gqx::t).collect(Collectors.toList());
   static final Logger m = LogUtils.getLogger();
   private final gjk n;
   private final Map<eao, gry.a> o;
   private final Map<alg, hfv> p;
   final Map<alg, hmc> q;
   final hmc r;

   public hlt(gjk $$0, Map<eao, gry.a> $$1, Map<alg, hfv> $$2, Map<alg, hmc> $$3, hmc $$4) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
      this.q = $$3;
      this.r = $$4;
   }

   public CompletableFuture<hlt.a> a(hmd $$0, Executor $$1) {
      hlt.b $$2 = hlt.b.a(this.r, $$0);
      hlt.c $$3 = new hlt.c($$0);
      CompletableFuture<Map<eao, gry>> $$4 = bsx.a(this.o, ($$1x, $$2x) -> {
         try {
            return $$2x.a($$3);
         } catch (Exception var4x) {
            m.warn("Unable to bake model: '{}': {}", $$1x, var4x);
            return null;
         }
      }, $$1);
      CompletableFuture<Map<alg, hfz>> $$5 = bsx.a(this.p, ($$2x, $$3x) -> {
         try {
            return $$3x.a().a(new hfz.a($$3, this.n, $$2.b, $$3x.c()));
         } catch (Exception var6x) {
            m.warn("Unable to bake item model: '{}'", $$2x, var6x);
            return null;
         }
      }, $$1);
      Map<alg, hfv.a> $$6 = new HashMap<>(this.p.size());
      this.p.forEach(($$1x, $$2x) -> {
         hfv.a $$3x = $$2x.b();
         if (!$$3x.equals(hfv.a.a)) {
            $$6.put($$1x, $$3x);
         }
      });
      return $$4.thenCombine($$5, ($$2x, $$3x) -> new hlt.a($$2, $$2x, $$3x, $$6));
   }

   public static record a(hlt.b a, Map<eao, gry> b, Map<alg, hfz> c, Map<alg, hfv.a> d) {
   }

   public static record b(gry a, hfz b) {

      public static hlt.b a(hmc $$0, final hmd $$1) {
         hls $$2 = new hls() {
            @Override
            public hmc a(alg $$0) {
               throw new IllegalStateException("Missing model can't have dependencies, but asked for " + $$0);
            }

            @Override
            public hmd a() {
               return $$1;
            }
         };
         gsg $$3 = $$0.g();
         boolean $$4 = $$0.c();
         boolean $$5 = $$0.d().a();
         gsc $$6 = $$0.e();
         hma $$7 = $$0.a($$3, $$2, hlk.a);
         hjk $$8 = $$0.a($$3, $$2);
         gry $$9 = new gse($$7, $$4, $$8);
         hfz $$10 = new hgd($$7.a(), new hge($$5, $$8, $$6));
         return new hlt.b($$9, $$10);
      }
   }

   class c implements hls {
      private final hmd b;

      c(final hmd $$0) {
         this.b = $$0;
      }

      @Override
      public hmd a() {
         return this.b;
      }

      @Override
      public hmc a(alg $$0) {
         hmc $$1 = hlt.this.q.get($$0);
         if ($$1 == null) {
            hlt.m.warn("Requested a model that was not discovered previously: {}", $$0);
            return hlt.this.r;
         } else {
            return $$1;
         }
      }
   }
}
