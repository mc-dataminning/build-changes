import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import javax.annotation.Nullable;

public class gez implements gek<dpu> {
   private final Map<dlc.a, fut> a;
   private static final Map<dlc.a, akn> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dlc.b.c, new akn("textures/entity/skeleton/skeleton.png"));
      $$0.put(dlc.b.d, new akn("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dlc.b.f, new akn("textures/entity/zombie/zombie.png"));
      $$0.put(dlc.b.g, new akn("textures/entity/creeper/creeper.png"));
      $$0.put(dlc.b.i, new akn("textures/entity/enderdragon/dragon.png"));
      $$0.put(dlc.b.h, new akn("textures/entity/piglin/piglin.png"));
      $$0.put(dlc.b.e, gon.a());
   });

   public static Map<dlc.a, fut> a(fvs $$0) {
      Builder<dlc.a, fut> $$1 = ImmutableMap.builder();
      $$1.put(dlc.b.c, new fus($$0.a(fvv.br)));
      $$1.put(dlc.b.d, new fus($$0.a(fvv.ca)));
      $$1.put(dlc.b.e, new fus($$0.a(fvv.aT)));
      $$1.put(dlc.b.f, new fus($$0.a(fvv.cg)));
      $$1.put(dlc.b.g, new fus($$0.a(fvv.J)));
      $$1.put(dlc.b.i, new fvq($$0.a(fvv.Q)));
      $$1.put(dlc.b.h, new ftz($$0.a(fvv.aN)));
      return $$1.build();
   }

   public gez(gel.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dpu $$0, float $$1, eyu $$2, gck $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      drd $$7 = $$0.n();
      boolean $$8 = $$7.b() instanceof dnb;
      it $$9 = $$8 ? $$7.c(dnb.d) : null;
      int $$10 = $$8 ? dsj.a($$9.g()) : $$7.c(dlc.e);
      float $$11 = dsj.b($$10);
      dlc.a $$12 = ((dcw)$$7.b()).b();
      fut $$13 = this.a.get($$12);
      gcs $$14 = a($$12, $$0.c());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable it $$0, float $$1, float $$2, eyu $$3, gck $$4, int $$5, fut $$6, gcs $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      eyy $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, gnm.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static gcs a(dlc.a $$0, @Nullable cws $$1) {
      akn $$2 = b.get($$0);
      if ($$0 == dlc.b.e && $$1 != null) {
         gow $$3 = feb.Q().am();
         return gcs.i($$3.b($$1.f()).a());
      } else {
         return gcs.f($$2);
      }
   }
}
