import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import javax.annotation.Nullable;

public class gok implements gnv<dwl> {
   private final Map<drq.a, gdi> a;
   private static final Map<drq.a, alz> b = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(drq.b.c, alz.b("textures/entity/skeleton/skeleton.png"));
      $$0.put(drq.b.d, alz.b("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(drq.b.f, alz.b("textures/entity/zombie/zombie.png"));
      $$0.put(drq.b.g, alz.b("textures/entity/creeper/creeper.png"));
      $$0.put(drq.b.i, alz.b("textures/entity/enderdragon/dragon.png"));
      $$0.put(drq.b.h, alz.b("textures/entity/piglin/piglin.png"));
      $$0.put(drq.b.e, hcc.a());
   });

   public static Map<drq.a, gdi> a(gej $$0) {
      Builder<drq.a, gdi> $$1 = ImmutableMap.builder();
      $$1.put(drq.b.c, new gdh($$0.a(gem.cK)));
      $$1.put(drq.b.d, new gdh($$0.a(gem.dz)));
      $$1.put(drq.b.e, new gdh($$0.a(gem.ce)));
      $$1.put(drq.b.f, new gdh($$0.a(gem.dL)));
      $$1.put(drq.b.g, new gdh($$0.a(gem.ah)));
      $$1.put(drq.b.i, new geg($$0.a(gem.as)));
      $$1.put(drq.b.h, new gcm($$0.a(gem.bU)));
      return $$1.build();
   }

   public gok(gnw.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dwl $$0, float $$1, fgr $$2, glk $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dxu $$7 = $$0.m();
      boolean $$8 = $$7.b() instanceof dtp;
      jm $$9 = $$8 ? $$7.c(dtp.d) : null;
      int $$10 = $$8 ? dyz.a($$9.g()) : $$7.c(drq.e);
      float $$11 = dyz.b($$10);
      drq.a $$12 = ((djh)$$7.b()).b();
      gdi $$13 = this.a.get($$12);
      glu $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable jm $$0, float $$1, float $$2, fgr $$3, glk $$4, int $$5, gdi $$6, glu $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      fgv $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, hbb.d);
      $$3.b();
   }

   public static glu a(drq.a $$0, @Nullable dan $$1) {
      alz $$2 = b.get($$0);
      if ($$0 == drq.b.e && $$1 != null) {
         hcm $$3 = fmf.Q().an();
         return glu.j($$3.b($$1.f()).a());
      } else {
         return glu.h($$2);
      }
   }
}
