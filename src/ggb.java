import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import javax.annotation.Nullable;

public class ggb implements gfm<dqr> {
   private final Map<dlz.a, fvv> a;
   private static final Map<dlz.a, ale> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dlz.b.c, new ale("textures/entity/skeleton/skeleton.png"));
      $$0.put(dlz.b.d, new ale("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dlz.b.f, new ale("textures/entity/zombie/zombie.png"));
      $$0.put(dlz.b.g, new ale("textures/entity/creeper/creeper.png"));
      $$0.put(dlz.b.i, new ale("textures/entity/enderdragon/dragon.png"));
      $$0.put(dlz.b.h, new ale("textures/entity/piglin/piglin.png"));
      $$0.put(dlz.b.e, gpp.a());
   });

   public static Map<dlz.a, fvv> a(fwu $$0) {
      Builder<dlz.a, fvv> $$1 = ImmutableMap.builder();
      $$1.put(dlz.b.c, new fvu($$0.a(fwx.br)));
      $$1.put(dlz.b.d, new fvu($$0.a(fwx.ca)));
      $$1.put(dlz.b.e, new fvu($$0.a(fwx.aT)));
      $$1.put(dlz.b.f, new fvu($$0.a(fwx.cg)));
      $$1.put(dlz.b.g, new fvu($$0.a(fwx.J)));
      $$1.put(dlz.b.i, new fws($$0.a(fwx.Q)));
      $$1.put(dlz.b.h, new fvb($$0.a(fwx.aN)));
      return $$1.build();
   }

   public ggb(gfn.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dqr $$0, float $$1, ezw $$2, gdm $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dsa $$7 = $$0.n();
      boolean $$8 = $$7.b() instanceof dny;
      je $$9 = $$8 ? $$7.c(dny.d) : null;
      int $$10 = $$8 ? dtg.a($$9.g()) : $$7.c(dlz.e);
      float $$11 = dtg.b($$10);
      dlz.a $$12 = ((ddt)$$7.b()).b();
      fvv $$13 = this.a.get($$12);
      gdu $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable je $$0, float $$1, float $$2, ezw $$3, gdm $$4, int $$5, fvv $$6, gdu $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      faa $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, goo.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static gdu a(dlz.a $$0, @Nullable cxp $$1) {
      ale $$2 = b.get($$0);
      if ($$0 == dlz.b.e && $$1 != null) {
         gpy $$3 = ffd.Q().am();
         return gdu.i($$3.b($$1.f()).a());
      } else {
         return gdu.f($$2);
      }
   }
}
