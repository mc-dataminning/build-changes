import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import javax.annotation.Nullable;

public class ggu implements ggf<drd> {
   private final Map<dmk.a, fwn> a;
   private static final Map<dmk.a, akk> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dmk.b.c, new akk("textures/entity/skeleton/skeleton.png"));
      $$0.put(dmk.b.d, new akk("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dmk.b.f, new akk("textures/entity/zombie/zombie.png"));
      $$0.put(dmk.b.g, new akk("textures/entity/creeper/creeper.png"));
      $$0.put(dmk.b.i, new akk("textures/entity/enderdragon/dragon.png"));
      $$0.put(dmk.b.h, new akk("textures/entity/piglin/piglin.png"));
      $$0.put(dmk.b.e, gqi.a());
   });

   public static Map<dmk.a, fwn> a(fxm $$0) {
      Builder<dmk.a, fwn> $$1 = ImmutableMap.builder();
      $$1.put(dmk.b.c, new fwm($$0.a(fxp.br)));
      $$1.put(dmk.b.d, new fwm($$0.a(fxp.ca)));
      $$1.put(dmk.b.e, new fwm($$0.a(fxp.aT)));
      $$1.put(dmk.b.f, new fwm($$0.a(fxp.cg)));
      $$1.put(dmk.b.g, new fwm($$0.a(fxp.J)));
      $$1.put(dmk.b.i, new fxk($$0.a(fxp.Q)));
      $$1.put(dmk.b.h, new fvt($$0.a(fxp.aN)));
      return $$1.build();
   }

   public ggu(ggg.a $$0) {
      this.a = a($$0.e());
   }

   public void a(drd $$0, float $$1, fao $$2, gef $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dsl $$7 = $$0.n();
      boolean $$8 = $$7.b() instanceof doj;
      jf $$9 = $$8 ? $$7.c(doj.d) : null;
      int $$10 = $$8 ? dtr.a($$9.g()) : $$7.c(dmk.e);
      float $$11 = dtr.b($$10);
      dmk.a $$12 = ((dee)$$7.b()).b();
      fwn $$13 = this.a.get($$12);
      gen $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable jf $$0, float $$1, float $$2, fao $$3, gef $$4, int $$5, fwn $$6, gen $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      fas $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, gph.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static gen a(dmk.a $$0, @Nullable cxe $$1) {
      akk $$2 = b.get($$0);
      if ($$0 == dmk.b.e && $$1 != null) {
         gqr $$3 = ffw.Q().am();
         return gen.i($$3.b($$1.f()).a());
      } else {
         return gen.f($$2);
      }
   }
}
