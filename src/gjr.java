import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import javax.annotation.Nullable;

public class gjr implements gjc<dss> {
   private final Map<dny.a, fyx> a;
   private static final Map<dny.a, alb> b = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dny.b.c, alb.b("textures/entity/skeleton/skeleton.png"));
      $$0.put(dny.b.d, alb.b("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dny.b.f, alb.b("textures/entity/zombie/zombie.png"));
      $$0.put(dny.b.g, alb.b("textures/entity/creeper/creeper.png"));
      $$0.put(dny.b.i, alb.b("textures/entity/enderdragon/dragon.png"));
      $$0.put(dny.b.h, alb.b("textures/entity/piglin/piglin.png"));
      $$0.put(dny.b.e, gxc.a());
   });

   public static Map<dny.a, fyx> a(fzx $$0) {
      Builder<dny.a, fyx> $$1 = ImmutableMap.builder();
      $$1.put(dny.b.c, new fyw($$0.a(gaa.cq)));
      $$1.put(dny.b.d, new fyw($$0.a(gaa.dd)));
      $$1.put(dny.b.e, new fyw($$0.a(gaa.bK)));
      $$1.put(dny.b.f, new fyw($$0.a(gaa.dm)));
      $$1.put(dny.b.g, new fyw($$0.a(gaa.Y)));
      $$1.put(dny.b.i, new fzu($$0.a(gaa.ah)));
      $$1.put(dny.b.h, new fyb($$0.a(gaa.bA)));
      return $$1.build();
   }

   public gjr(gjd.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dss $$0, float $$1, fcu $$2, ggv $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dua $$7 = $$0.m();
      boolean $$8 = $$7.b() instanceof dpx;
      jj $$9 = $$8 ? $$7.c(dpx.d) : null;
      int $$10 = $$8 ? dvg.a($$9.g()) : $$7.c(dny.e);
      float $$11 = dvg.b($$10);
      dny.a $$12 = ((dfr)$$7.b()).b();
      fyx $$13 = this.a.get($$12);
      ghe $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable jj $$0, float $$1, float $$2, fcu $$3, ggv $$4, int $$5, fyx $$6, ghe $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      fcy $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, gwb.d);
      $$3.b();
   }

   public static ghe a(dny.a $$0, @Nullable cyn $$1) {
      alb $$2 = b.get($$0);
      if ($$0 == dny.b.e && $$1 != null) {
         gxm $$3 = fib.Q().am();
         return ghe.j($$3.b($$1.f()).a());
      } else {
         return ghe.g($$2);
      }
   }
}
