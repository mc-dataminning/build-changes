import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import javax.annotation.Nullable;

public class gkl implements gjw<dtj> {
   private final Map<dop.a, fzl> a;
   private static final Map<dop.a, ale> b = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dop.b.c, ale.b("textures/entity/skeleton/skeleton.png"));
      $$0.put(dop.b.d, ale.b("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dop.b.f, ale.b("textures/entity/zombie/zombie.png"));
      $$0.put(dop.b.g, ale.b("textures/entity/creeper/creeper.png"));
      $$0.put(dop.b.i, ale.b("textures/entity/enderdragon/dragon.png"));
      $$0.put(dop.b.h, ale.b("textures/entity/piglin/piglin.png"));
      $$0.put(dop.b.e, gxy.a());
   });

   public static Map<dop.a, fzl> a(gam $$0) {
      Builder<dop.a, fzl> $$1 = ImmutableMap.builder();
      $$1.put(dop.b.c, new fzk($$0.a(gap.cr)));
      $$1.put(dop.b.d, new fzk($$0.a(gap.de)));
      $$1.put(dop.b.e, new fzk($$0.a(gap.bL)));
      $$1.put(dop.b.f, new fzk($$0.a(gap.dn)));
      $$1.put(dop.b.g, new fzk($$0.a(gap.Y)));
      $$1.put(dop.b.i, new gaj($$0.a(gap.ah)));
      $$1.put(dop.b.h, new fyp($$0.a(gap.bB)));
      return $$1.build();
   }

   public gkl(gjx.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dtj $$0, float $$1, fdi $$2, ghl $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dus $$7 = $$0.m();
      boolean $$8 = $$7.b() instanceof dqo;
      jk $$9 = $$8 ? $$7.c(dqo.d) : null;
      int $$10 = $$8 ? dvy.a($$9.g()) : $$7.c(dop.e);
      float $$11 = dvy.b($$10);
      dop.a $$12 = ((dgi)$$7.b()).b();
      fzl $$13 = this.a.get($$12);
      ghv $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable jk $$0, float $$1, float $$2, fdi $$3, ghl $$4, int $$5, fzl $$6, ghv $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      fdm $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, gwx.d);
      $$3.b();
   }

   public static ghv a(dop.a $$0, @Nullable cyv $$1) {
      ale $$2 = b.get($$0);
      if ($$0 == dop.b.e && $$1 != null) {
         gyi $$3 = fip.Q().an();
         return ghv.i($$3.b($$1.f()).a());
      } else {
         return ghv.g($$2);
      }
   }
}
