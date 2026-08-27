import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import javax.annotation.Nullable;

public class gez implements gek<dps> {
   private final Map<dla.a, fut> a;
   private static final Map<dla.a, akm> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dla.b.c, new akm("textures/entity/skeleton/skeleton.png"));
      $$0.put(dla.b.d, new akm("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dla.b.f, new akm("textures/entity/zombie/zombie.png"));
      $$0.put(dla.b.g, new akm("textures/entity/creeper/creeper.png"));
      $$0.put(dla.b.i, new akm("textures/entity/enderdragon/dragon.png"));
      $$0.put(dla.b.h, new akm("textures/entity/piglin/piglin.png"));
      $$0.put(dla.b.e, gon.a());
   });

   public static Map<dla.a, fut> a(fvs $$0) {
      Builder<dla.a, fut> $$1 = ImmutableMap.builder();
      $$1.put(dla.b.c, new fus($$0.a(fvv.br)));
      $$1.put(dla.b.d, new fus($$0.a(fvv.ca)));
      $$1.put(dla.b.e, new fus($$0.a(fvv.aT)));
      $$1.put(dla.b.f, new fus($$0.a(fvv.cg)));
      $$1.put(dla.b.g, new fus($$0.a(fvv.J)));
      $$1.put(dla.b.i, new fvq($$0.a(fvv.Q)));
      $$1.put(dla.b.h, new ftz($$0.a(fvv.aN)));
      return $$1.build();
   }

   public gez(gel.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dps $$0, float $$1, eys $$2, gck $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      drb $$7 = $$0.n();
      boolean $$8 = $$7.b() instanceof dmz;
      it $$9 = $$8 ? $$7.c(dmz.d) : null;
      int $$10 = $$8 ? dsh.a($$9.g()) : $$7.c(dla.e);
      float $$11 = dsh.b($$10);
      dla.a $$12 = ((dcu)$$7.b()).b();
      fut $$13 = this.a.get($$12);
      gcs $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable it $$0, float $$1, float $$2, eys $$3, gck $$4, int $$5, fut $$6, gcs $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      eyw $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, gnm.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static gcs a(dla.a $$0, @Nullable cwq $$1) {
      akm $$2 = b.get($$0);
      if ($$0 == dla.b.e && $$1 != null) {
         gow $$3 = fdz.Q().an();
         return gcs.i($$3.b($$1.f()).a());
      } else {
         return gcs.f($$2);
      }
   }
}
