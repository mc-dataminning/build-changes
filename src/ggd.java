import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import javax.annotation.Nullable;

public class ggd implements gfo<dqt> {
   private final Map<dmb.a, fvx> a;
   private static final Map<dmb.a, alf> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dmb.b.c, new alf("textures/entity/skeleton/skeleton.png"));
      $$0.put(dmb.b.d, new alf("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dmb.b.f, new alf("textures/entity/zombie/zombie.png"));
      $$0.put(dmb.b.g, new alf("textures/entity/creeper/creeper.png"));
      $$0.put(dmb.b.i, new alf("textures/entity/enderdragon/dragon.png"));
      $$0.put(dmb.b.h, new alf("textures/entity/piglin/piglin.png"));
      $$0.put(dmb.b.e, gpr.a());
   });

   public static Map<dmb.a, fvx> a(fww $$0) {
      Builder<dmb.a, fvx> $$1 = ImmutableMap.builder();
      $$1.put(dmb.b.c, new fvw($$0.a(fwz.br)));
      $$1.put(dmb.b.d, new fvw($$0.a(fwz.ca)));
      $$1.put(dmb.b.e, new fvw($$0.a(fwz.aT)));
      $$1.put(dmb.b.f, new fvw($$0.a(fwz.cg)));
      $$1.put(dmb.b.g, new fvw($$0.a(fwz.J)));
      $$1.put(dmb.b.i, new fwu($$0.a(fwz.Q)));
      $$1.put(dmb.b.h, new fvd($$0.a(fwz.aN)));
      return $$1.build();
   }

   public ggd(gfp.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dqt $$0, float $$1, ezy $$2, gdo $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dsc $$7 = $$0.n();
      boolean $$8 = $$7.b() instanceof doa;
      je $$9 = $$8 ? $$7.c(doa.d) : null;
      int $$10 = $$8 ? dti.a($$9.g()) : $$7.c(dmb.e);
      float $$11 = dti.b($$10);
      dmb.a $$12 = ((ddv)$$7.b()).b();
      fvx $$13 = this.a.get($$12);
      gdw $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable je $$0, float $$1, float $$2, ezy $$3, gdo $$4, int $$5, fvx $$6, gdw $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      fac $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, goq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static gdw a(dmb.a $$0, @Nullable cxr $$1) {
      alf $$2 = b.get($$0);
      if ($$0 == dmb.b.e && $$1 != null) {
         gqa $$3 = fff.Q().am();
         return gdw.i($$3.b($$1.f()).a());
      } else {
         return gdw.f($$2);
      }
   }
}
