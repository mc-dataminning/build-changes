import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import javax.annotation.Nullable;

public class ghv implements ghg<drt> {
   private final Map<dms.a, fxp> a;
   private static final Map<dms.a, akt> b = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dms.b.c, new akt("textures/entity/skeleton/skeleton.png"));
      $$0.put(dms.b.d, new akt("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dms.b.f, new akt("textures/entity/zombie/zombie.png"));
      $$0.put(dms.b.g, new akt("textures/entity/creeper/creeper.png"));
      $$0.put(dms.b.i, new akt("textures/entity/enderdragon/dragon.png"));
      $$0.put(dms.b.h, new akt("textures/entity/piglin/piglin.png"));
      $$0.put(dms.b.e, grq.a());
   });

   public static Map<dms.a, fxp> a(fyo $$0) {
      Builder<dms.a, fxp> $$1 = ImmutableMap.builder();
      $$1.put(dms.b.c, new fxo($$0.a(fyr.bv)));
      $$1.put(dms.b.d, new fxo($$0.a(fyr.cg)));
      $$1.put(dms.b.e, new fxo($$0.a(fyr.aX)));
      $$1.put(dms.b.f, new fxo($$0.a(fyr.cm)));
      $$1.put(dms.b.g, new fxo($$0.a(fyr.K)));
      $$1.put(dms.b.i, new fym($$0.a(fyr.R)));
      $$1.put(dms.b.h, new fwu($$0.a(fyr.aR)));
      return $$1.build();
   }

   public ghv(ghh.a $$0) {
      this.a = a($$0.e());
   }

   public void a(drt $$0, float $$1, fbc $$2, gfg $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dtc $$7 = $$0.n();
      boolean $$8 = $$7.b() instanceof dot;
      iw $$9 = $$8 ? $$7.c(dot.d) : null;
      int $$10 = $$8 ? dui.a($$9.g()) : $$7.c(dms.e);
      float $$11 = dui.b($$10);
      dms.a $$12 = ((ddx)$$7.b()).b();
      fxp $$13 = this.a.get($$12);
      gfo $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable iw $$0, float $$1, float $$2, fbc $$3, gfg $$4, int $$5, fxp $$6, gfo $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      fbg $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, gqp.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static gfo a(dms.a $$0, @Nullable cxs $$1) {
      akt $$2 = b.get($$0);
      if ($$0 == dms.b.e && $$1 != null) {
         grz $$3 = fgj.Q().an();
         return gfo.i($$3.b($$1.f()).a());
      } else {
         return gfo.f($$2);
      }
   }
}
