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

public class hma {
   public static final hlx a = new hlx(hjp.c, alg.b("block/fire_0"));
   public static final hlx b = new hlx(hjp.c, alg.b("block/fire_1"));
   public static final hlx c = new hlx(hjp.c, alg.b("block/lava_flow"));
   public static final hlx d = new hlx(hjp.c, alg.b("block/water_flow"));
   public static final hlx e = new hlx(hjp.c, alg.b("block/water_overlay"));
   public static final hlx f = new hlx(grl.c, alg.b("entity/banner_base"));
   public static final hlx g = new hlx(grl.d, alg.b("entity/shield_base"));
   public static final hlx h = new hlx(grl.d, alg.b("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<alg> j = IntStream.range(0, 10).mapToObj($$0 -> alg.b("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<alg> k = j.stream().map($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).collect(Collectors.toList());
   public static final List<grc> l = k.stream().map(grc::t).collect(Collectors.toList());
   static final Logger m = LogUtils.getLogger();
   private final gjp n;
   private final Map<eat, gsd.a> o;
   private final Map<alg, hgb> p;
   final Map<alg, hmj> q;
   final hmj r;

   public hma(gjp $$0, Map<eat, gsd.a> $$1, Map<alg, hgb> $$2, Map<alg, hmj> $$3, hmj $$4) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
      this.q = $$3;
      this.r = $$4;
   }

   public CompletableFuture<hma.a> a(hmk $$0, Executor $$1) {
      hma.b $$2 = hma.b.a(this.r, $$0);
      hma.c $$3 = new hma.c($$0);
      CompletableFuture<Map<eat, gsd>> $$4 = bsx.a(this.o, ($$1x, $$2x) -> {
         try {
            return $$2x.a($$3);
         } catch (Exception var4x) {
            m.warn("Unable to bake model: '{}': {}", $$1x, var4x);
            return null;
         }
      }, $$1);
      CompletableFuture<Map<alg, hgf>> $$5 = bsx.a(this.p, ($$2x, $$3x) -> {
         try {
            return $$3x.a().a(new hgf.a($$3, this.n, $$2.b, $$3x.c()));
         } catch (Exception var6x) {
            m.warn("Unable to bake item model: '{}'", $$2x, var6x);
            return null;
         }
      }, $$1);
      Map<alg, hgb.a> $$6 = new HashMap<>(this.p.size());
      this.p.forEach(($$1x, $$2x) -> {
         hgb.a $$3x = $$2x.b();
         if (!$$3x.equals(hgb.a.a)) {
            $$6.put($$1x, $$3x);
         }
      });
      return $$4.thenCombine($$5, ($$2x, $$3x) -> new hma.a($$2, $$2x, $$3x, $$6));
   }

   public static record a(hma.b a, Map<eat, gsd> b, Map<alg, hgf> c, Map<alg, hgb.a> d) {
   }

   public static record b(gsd a, hgf b) {

      public static hma.b a(hmj $$0, final hmk $$1) {
         hlz $$2 = new hlz() {
            @Override
            public hmj a(alg $$0) {
               throw new IllegalStateException("Missing model can't have dependencies, but asked for " + $$0);
            }

            @Override
            public hmk a() {
               return $$1;
            }
         };
         gsl $$3 = $$0.g();
         boolean $$4 = $$0.c();
         boolean $$5 = $$0.d().a();
         gsh $$6 = $$0.e();
         hmh $$7 = $$0.a($$3, $$2, hlr.a);
         hjq $$8 = $$0.a($$3, $$2);
         gsd $$9 = new gsj($$7, $$4, $$8);
         hgf $$10 = new hgj($$7.a(), new hgk($$5, $$8, $$6));
         return new hma.b($$9, $$10);
      }
   }

   class c implements hlz {
      private final hmk b;

      c(final hmk $$0) {
         this.b = $$0;
      }

      @Override
      public hmk a() {
         return this.b;
      }

      @Override
      public hmj a(alg $$0) {
         hmj $$1 = hma.this.q.get($$0);
         if ($$1 == null) {
            hma.m.warn("Requested a model that was not discovered previously: {}", $$0);
            return hma.this.r;
         } else {
            return $$1;
         }
      }
   }
}
