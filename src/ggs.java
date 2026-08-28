import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import javax.annotation.Nullable;

public class ggs implements ggd<drc> {
   private final Map<dmj.a, fwl> a;
   private static final Map<dmj.a, akk> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dmj.b.c, new akk("textures/entity/skeleton/skeleton.png"));
      $$0.put(dmj.b.d, new akk("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dmj.b.f, new akk("textures/entity/zombie/zombie.png"));
      $$0.put(dmj.b.g, new akk("textures/entity/creeper/creeper.png"));
      $$0.put(dmj.b.i, new akk("textures/entity/enderdragon/dragon.png"));
      $$0.put(dmj.b.h, new akk("textures/entity/piglin/piglin.png"));
      $$0.put(dmj.b.e, gqg.a());
   });

   public static Map<dmj.a, fwl> a(fxk $$0) {
      Builder<dmj.a, fwl> $$1 = ImmutableMap.builder();
      $$1.put(dmj.b.c, new fwk($$0.a(fxn.br)));
      $$1.put(dmj.b.d, new fwk($$0.a(fxn.ca)));
      $$1.put(dmj.b.e, new fwk($$0.a(fxn.aT)));
      $$1.put(dmj.b.f, new fwk($$0.a(fxn.cg)));
      $$1.put(dmj.b.g, new fwk($$0.a(fxn.J)));
      $$1.put(dmj.b.i, new fxi($$0.a(fxn.Q)));
      $$1.put(dmj.b.h, new fvr($$0.a(fxn.aN)));
      return $$1.build();
   }

   public ggs(gge.a $$0) {
      this.a = a($$0.e());
   }

   public void a(drc $$0, float $$1, fam $$2, ged $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dsk $$7 = $$0.n();
      boolean $$8 = $$7.b() instanceof doi;
      jf $$9 = $$8 ? $$7.c(doi.d) : null;
      int $$10 = $$8 ? dtq.a($$9.g()) : $$7.c(dmj.e);
      float $$11 = dtq.b($$10);
      dmj.a $$12 = ((ded)$$7.b()).b();
      fwl $$13 = this.a.get($$12);
      gel $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable jf $$0, float $$1, float $$2, fam $$3, ged $$4, int $$5, fwl $$6, gel $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      faq $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, gpf.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static gel a(dmj.a $$0, @Nullable cxd $$1) {
      akk $$2 = b.get($$0);
      if ($$0 == dmj.b.e && $$1 != null) {
         gqp $$3 = fft.Q().am();
         return gel.i($$3.b($$1.f()).a());
      } else {
         return gel.f($$2);
      }
   }
}
