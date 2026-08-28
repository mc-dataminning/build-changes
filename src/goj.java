import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import javax.annotation.Nullable;

public class goj implements gnu<dwl> {
   private final Map<drq.a, gdh> a;
   private static final Map<drq.a, alz> b = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(drq.b.c, alz.b("textures/entity/skeleton/skeleton.png"));
      $$0.put(drq.b.d, alz.b("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(drq.b.f, alz.b("textures/entity/zombie/zombie.png"));
      $$0.put(drq.b.g, alz.b("textures/entity/creeper/creeper.png"));
      $$0.put(drq.b.i, alz.b("textures/entity/enderdragon/dragon.png"));
      $$0.put(drq.b.h, alz.b("textures/entity/piglin/piglin.png"));
      $$0.put(drq.b.e, hcb.a());
   });

   public static Map<drq.a, gdh> a(gei $$0) {
      Builder<drq.a, gdh> $$1 = ImmutableMap.builder();
      $$1.put(drq.b.c, new gdg($$0.a(gel.cK)));
      $$1.put(drq.b.d, new gdg($$0.a(gel.dz)));
      $$1.put(drq.b.e, new gdg($$0.a(gel.ce)));
      $$1.put(drq.b.f, new gdg($$0.a(gel.dL)));
      $$1.put(drq.b.g, new gdg($$0.a(gel.ah)));
      $$1.put(drq.b.i, new gef($$0.a(gel.as)));
      $$1.put(drq.b.h, new gcl($$0.a(gel.bU)));
      return $$1.build();
   }

   public goj(gnv.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dwl $$0, float $$1, fgq $$2, glj $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dxu $$7 = $$0.m();
      boolean $$8 = $$7.b() instanceof dtp;
      jm $$9 = $$8 ? $$7.c(dtp.d) : null;
      int $$10 = $$8 ? dyz.a($$9.g()) : $$7.c(drq.e);
      float $$11 = dyz.b($$10);
      drq.a $$12 = ((djh)$$7.b()).b();
      gdh $$13 = this.a.get($$12);
      glt $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable jm $$0, float $$1, float $$2, fgq $$3, glj $$4, int $$5, gdh $$6, glt $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      fgu $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, hba.d);
      $$3.b();
   }

   public static glt a(drq.a $$0, @Nullable dan $$1) {
      alz $$2 = b.get($$0);
      if ($$0 == drq.b.e && $$1 != null) {
         hcl $$3 = fme.Q().an();
         return glt.i($$3.b($$1.f()).a());
      } else {
         return glt.g($$2);
      }
   }
}
