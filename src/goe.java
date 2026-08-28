import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import javax.annotation.Nullable;

public class goe implements gnp<dwe> {
   private final Map<drj.a, gdc> a;
   private static final Map<drj.a, alz> b = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(drj.b.c, alz.b("textures/entity/skeleton/skeleton.png"));
      $$0.put(drj.b.d, alz.b("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(drj.b.f, alz.b("textures/entity/zombie/zombie.png"));
      $$0.put(drj.b.g, alz.b("textures/entity/creeper/creeper.png"));
      $$0.put(drj.b.i, alz.b("textures/entity/enderdragon/dragon.png"));
      $$0.put(drj.b.h, alz.b("textures/entity/piglin/piglin.png"));
      $$0.put(drj.b.e, hbw.a());
   });

   public static Map<drj.a, gdc> a(ged $$0) {
      Builder<drj.a, gdc> $$1 = ImmutableMap.builder();
      $$1.put(drj.b.c, new gdb($$0.a(geg.cK)));
      $$1.put(drj.b.d, new gdb($$0.a(geg.dz)));
      $$1.put(drj.b.e, new gdb($$0.a(geg.ce)));
      $$1.put(drj.b.f, new gdb($$0.a(geg.dL)));
      $$1.put(drj.b.g, new gdb($$0.a(geg.ah)));
      $$1.put(drj.b.i, new gea($$0.a(geg.as)));
      $$1.put(drj.b.h, new gcg($$0.a(geg.bU)));
      return $$1.build();
   }

   public goe(gnq.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dwe $$0, float $$1, fgl $$2, gle $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dxn $$7 = $$0.m();
      boolean $$8 = $$7.b() instanceof dti;
      jm $$9 = $$8 ? $$7.c(dti.d) : null;
      int $$10 = $$8 ? dys.a($$9.g()) : $$7.c(drj.e);
      float $$11 = dys.b($$10);
      drj.a $$12 = ((dja)$$7.b()).b();
      gdc $$13 = this.a.get($$12);
      glo $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable jm $$0, float $$1, float $$2, fgl $$3, gle $$4, int $$5, gdc $$6, glo $$7) {
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
      $$6.a($$3, $$9, $$5, hav.d);
      $$3.b();
   }

   public static glo a(drj.a $$0, @Nullable daj $$1) {
      alz $$2 = b.get($$0);
      if ($$0 == drj.b.e && $$1 != null) {
         hcg $$3 = flz.Q().an();
         return glo.i($$3.b($$1.f()).a());
      } else {
         return glo.g($$2);
      }
   }
}
