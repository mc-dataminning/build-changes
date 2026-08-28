import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class gpy implements gpj<dwh> {
   private final Function<drm.a, gex> a;
   private static final Map<drm.a, aku> b = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(drm.b.c, aku.b("textures/entity/skeleton/skeleton.png"));
      $$0.put(drm.b.d, aku.b("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(drm.b.f, aku.b("textures/entity/zombie/zombie.png"));
      $$0.put(drm.b.g, aku.b("textures/entity/creeper/creeper.png"));
      $$0.put(drm.b.i, aku.b("textures/entity/enderdragon/dragon.png"));
      $$0.put(drm.b.h, aku.b("textures/entity/piglin/piglin.png"));
      $$0.put(drm.b.e, hgk.a());
   });

   @Nullable
   public static gex a(gfy $$0, drm.a $$1) {
      if ($$1 instanceof drm.b $$2) {
         return (gex)(switch ($$2) {
            case c -> new gew($$0.a(ggb.cP));
            case d -> new gew($$0.a(ggb.dH));
            case e -> new gew($$0.a(ggb.cj));
            case f -> new gew($$0.a(ggb.dT));
            case g -> new gew($$0.a(ggb.am));
            case i -> new gfv($$0.a(ggb.ax));
            case h -> new geb($$0.a(ggb.bZ));
         });
      } else {
         return null;
      }
   }

   public gpy(gpk.a $$0) {
      gfy $$1 = $$0.f();
      this.a = af.b($$1x -> a($$1, $$1x));
   }

   public void a(dwh $$0, float $$1, fgr $$2, gmx $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dxq $$7 = $$0.m();
      boolean $$8 = $$7.b() instanceof dtl;
      jn $$9 = $$8 ? $$7.c(dtl.d) : null;
      int $$10 = $$8 ? dyw.a($$9.g()) : $$7.c(drm.e);
      float $$11 = dyw.b($$10);
      drm.a $$12 = ((dja)$$7.b()).b();
      gex $$13 = this.a.apply($$12);
      gnh $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable jn $$0, float $$1, float $$2, fgr $$3, gmx $$4, int $$5, gex $$6, gnh $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      fgv $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, hfh.d);
      $$3.b();
   }

   public static gnh a(drm.a $$0, @Nullable dae $$1) {
      return a($$0, $$1, null);
   }

   public static gnh a(drm.a $$0, @Nullable dae $$1, @Nullable aku $$2) {
      return $$0 == drm.b.e && $$1 != null ? gnh.j($$2 != null ? $$2 : fmg.Q().an().b($$1.f()).a()) : gnh.h($$2 != null ? $$2 : b.get($$0));
   }
}
