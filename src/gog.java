import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import javax.annotation.Nullable;

public class gog implements gnr<dwf> {
   private final Map<drk.a, gde> a;
   private static final Map<drk.a, alp> b = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(drk.b.c, alp.b("textures/entity/skeleton/skeleton.png"));
      $$0.put(drk.b.d, alp.b("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(drk.b.f, alp.b("textures/entity/zombie/zombie.png"));
      $$0.put(drk.b.g, alp.b("textures/entity/creeper/creeper.png"));
      $$0.put(drk.b.i, alp.b("textures/entity/enderdragon/dragon.png"));
      $$0.put(drk.b.h, alp.b("textures/entity/piglin/piglin.png"));
      $$0.put(drk.b.e, hby.a());
   });

   public static Map<drk.a, gde> a(gef $$0) {
      Builder<drk.a, gde> $$1 = ImmutableMap.builder();
      $$1.put(drk.b.c, new gdd($$0.a(gei.cN)));
      $$1.put(drk.b.d, new gdd($$0.a(gei.dF)));
      $$1.put(drk.b.e, new gdd($$0.a(gei.ch)));
      $$1.put(drk.b.f, new gdd($$0.a(gei.dR)));
      $$1.put(drk.b.g, new gdd($$0.a(gei.ak)));
      $$1.put(drk.b.i, new gec($$0.a(gei.av)));
      $$1.put(drk.b.h, new gci($$0.a(gei.bX)));
      return $$1.build();
   }

   public gog(gns.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dwf $$0, float $$1, fgl $$2, glg $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dxo $$7 = $$0.m();
      boolean $$8 = $$7.b() instanceof dtj;
      jm $$9 = $$8 ? $$7.c(dtj.d) : null;
      int $$10 = $$8 ? dyt.a($$9.g()) : $$7.c(drk.e);
      float $$11 = dyt.b($$10);
      drk.a $$12 = ((diz)$$7.b()).b();
      gde $$13 = this.a.get($$12);
      glq $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable jm $$0, float $$1, float $$2, fgl $$3, glg $$4, int $$5, gde $$6, glq $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      fgp $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, hax.d);
      $$3.b();
   }

   public static glq a(drk.a $$0, @Nullable daf $$1) {
      alp $$2 = b.get($$0);
      if ($$0 == drk.b.e && $$1 != null) {
         hci $$3 = flz.Q().an();
         return glq.j($$3.b($$1.f()).a());
      } else {
         return glq.h($$2);
      }
   }
}
