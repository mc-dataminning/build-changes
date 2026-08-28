import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import javax.annotation.Nullable;

public class gfy implements gfj<dqo> {
   private final Map<dlw.a, fvs> a;
   private static final Map<dlw.a, alb> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dlw.b.c, new alb("textures/entity/skeleton/skeleton.png"));
      $$0.put(dlw.b.d, new alb("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dlw.b.f, new alb("textures/entity/zombie/zombie.png"));
      $$0.put(dlw.b.g, new alb("textures/entity/creeper/creeper.png"));
      $$0.put(dlw.b.i, new alb("textures/entity/enderdragon/dragon.png"));
      $$0.put(dlw.b.h, new alb("textures/entity/piglin/piglin.png"));
      $$0.put(dlw.b.e, gpm.a());
   });

   public static Map<dlw.a, fvs> a(fwr $$0) {
      Builder<dlw.a, fvs> $$1 = ImmutableMap.builder();
      $$1.put(dlw.b.c, new fvr($$0.a(fwu.br)));
      $$1.put(dlw.b.d, new fvr($$0.a(fwu.ca)));
      $$1.put(dlw.b.e, new fvr($$0.a(fwu.aT)));
      $$1.put(dlw.b.f, new fvr($$0.a(fwu.cg)));
      $$1.put(dlw.b.g, new fvr($$0.a(fwu.J)));
      $$1.put(dlw.b.i, new fwp($$0.a(fwu.Q)));
      $$1.put(dlw.b.h, new fuy($$0.a(fwu.aN)));
      return $$1.build();
   }

   public gfy(gfk.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dqo $$0, float $$1, ezt $$2, gdj $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      drx $$7 = $$0.n();
      boolean $$8 = $$7.b() instanceof dnv;
      je $$9 = $$8 ? $$7.c(dnv.d) : null;
      int $$10 = $$8 ? dtd.a($$9.g()) : $$7.c(dlw.e);
      float $$11 = dtd.b($$10);
      dlw.a $$12 = ((ddq)$$7.b()).b();
      fvs $$13 = this.a.get($$12);
      gdr $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable je $$0, float $$1, float $$2, ezt $$3, gdj $$4, int $$5, fvs $$6, gdr $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      ezx $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, gol.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static gdr a(dlw.a $$0, @Nullable cxm $$1) {
      alb $$2 = b.get($$0);
      if ($$0 == dlw.b.e && $$1 != null) {
         gpv $$3 = ffa.Q().am();
         return gdr.i($$3.b($$1.f()).a());
      } else {
         return gdr.f($$2);
      }
   }
}
