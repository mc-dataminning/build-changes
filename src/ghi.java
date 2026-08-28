import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import javax.annotation.Nullable;

public class ghi implements ggt<drs> {
   private final Map<dmz.a, fxb> a;
   private static final Map<dmz.a, akq> b = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dmz.b.c, akq.b("textures/entity/skeleton/skeleton.png"));
      $$0.put(dmz.b.d, akq.b("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dmz.b.f, akq.b("textures/entity/zombie/zombie.png"));
      $$0.put(dmz.b.g, akq.b("textures/entity/creeper/creeper.png"));
      $$0.put(dmz.b.i, akq.b("textures/entity/enderdragon/dragon.png"));
      $$0.put(dmz.b.h, akq.b("textures/entity/piglin/piglin.png"));
      $$0.put(dmz.b.e, gqx.a());
   });

   public static Map<dmz.a, fxb> a(fya $$0) {
      Builder<dmz.a, fxb> $$1 = ImmutableMap.builder();
      $$1.put(dmz.b.c, new fxa($$0.a(fyd.bs)));
      $$1.put(dmz.b.d, new fxa($$0.a(fyd.cb)));
      $$1.put(dmz.b.e, new fxa($$0.a(fyd.aU)));
      $$1.put(dmz.b.f, new fxa($$0.a(fyd.ch)));
      $$1.put(dmz.b.g, new fxa($$0.a(fyd.K)));
      $$1.put(dmz.b.i, new fxy($$0.a(fyd.R)));
      $$1.put(dmz.b.h, new fwh($$0.a(fyd.aO)));
      return $$1.build();
   }

   public ghi(ggu.a $$0) {
      this.a = a($$0.e());
   }

   public void a(drs $$0, float $$1, fbc $$2, get $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dta $$7 = $$0.n();
      boolean $$8 = $$7.b() instanceof doy;
      ji $$9 = $$8 ? $$7.c(doy.d) : null;
      int $$10 = $$8 ? dug.a($$9.g()) : $$7.c(dmz.e);
      float $$11 = dug.b($$10);
      dmz.a $$12 = ((des)$$7.b()).b();
      fxb $$13 = this.a.get($$12);
      gfb $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable ji $$0, float $$1, float $$2, fbc $$3, get $$4, int $$5, fxb $$6, gfb $$7) {
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
      $$6.a($$3, $$9, $$5, gpw.d);
      $$3.b();
   }

   public static gfb a(dmz.a $$0, @Nullable cxs $$1) {
      akq $$2 = b.get($$0);
      if ($$0 == dmz.b.e && $$1 != null) {
         grg $$3 = fgi.Q().am();
         return gfb.i($$3.b($$1.f()).a());
      } else {
         return gfb.f($$2);
      }
   }
}
