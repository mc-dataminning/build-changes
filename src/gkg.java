import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import javax.annotation.Nullable;

public class gkg implements gjr<dtg> {
   private final Map<dom.a, fzh> a;
   private static final Map<dom.a, alc> b = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dom.b.c, alc.b("textures/entity/skeleton/skeleton.png"));
      $$0.put(dom.b.d, alc.b("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dom.b.f, alc.b("textures/entity/zombie/zombie.png"));
      $$0.put(dom.b.g, alc.b("textures/entity/creeper/creeper.png"));
      $$0.put(dom.b.i, alc.b("textures/entity/enderdragon/dragon.png"));
      $$0.put(dom.b.h, alc.b("textures/entity/piglin/piglin.png"));
      $$0.put(dom.b.e, gxt.a());
   });

   public static Map<dom.a, fzh> a(gah $$0) {
      Builder<dom.a, fzh> $$1 = ImmutableMap.builder();
      $$1.put(dom.b.c, new fzg($$0.a(gak.cr)));
      $$1.put(dom.b.d, new fzg($$0.a(gak.de)));
      $$1.put(dom.b.e, new fzg($$0.a(gak.bL)));
      $$1.put(dom.b.f, new fzg($$0.a(gak.dn)));
      $$1.put(dom.b.g, new fzg($$0.a(gak.Y)));
      $$1.put(dom.b.i, new gae($$0.a(gak.ah)));
      $$1.put(dom.b.h, new fyl($$0.a(gak.bB)));
      return $$1.build();
   }

   public gkg(gjs.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dtg $$0, float $$1, fde $$2, ghg $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      duo $$7 = $$0.m();
      boolean $$8 = $$7.b() instanceof dql;
      jj $$9 = $$8 ? $$7.c(dql.d) : null;
      int $$10 = $$8 ? dvu.a($$9.g()) : $$7.c(dom.e);
      float $$11 = dvu.b($$10);
      dom.a $$12 = ((dgf)$$7.b()).b();
      fzh $$13 = this.a.get($$12);
      ghq $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable jj $$0, float $$1, float $$2, fde $$3, ghg $$4, int $$5, fzh $$6, ghq $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      fdi $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, gws.d);
      $$3.b();
   }

   public static ghq a(dom.a $$0, @Nullable cys $$1) {
      alc $$2 = b.get($$0);
      if ($$0 == dom.b.e && $$1 != null) {
         gyd $$3 = fil.Q().an();
         return ghq.i($$3.b($$1.f()).a());
      } else {
         return ghq.g($$2);
      }
   }
}
