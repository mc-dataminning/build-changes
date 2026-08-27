import com.google.common.collect.Maps;
import java.util.Map;

public class fwv extends fwq<bwy, fib<bwy>> {
   private static final Map<bwy.a, agg> a = ac.a(Maps.newEnumMap(bwy.a.class), $$0 -> {
      $$0.put(bwy.a.a, new agg("textures/entity/panda/panda.png"));
      $$0.put(bwy.a.b, new agg("textures/entity/panda/lazy_panda.png"));
      $$0.put(bwy.a.c, new agg("textures/entity/panda/worried_panda.png"));
      $$0.put(bwy.a.d, new agg("textures/entity/panda/playful_panda.png"));
      $$0.put(bwy.a.e, new agg("textures/entity/panda/brown_panda.png"));
      $$0.put(bwy.a.f, new agg("textures/entity/panda/weak_panda.png"));
      $$0.put(bwy.a.g, new agg("textures/entity/panda/aggressive_panda.png"));
   });

   public fwv(fvk.a $$0) {
      super($$0, new fib<>($$0.a(fka.az)), 0.9F);
      this.a(new fzo(this, $$0.d()));
   }

   public agg a(bwy $$0) {
      return a.getOrDefault($$0.gq(), a.get(bwy.a.a));
   }

   protected void a(bwy $$0, enk $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$0.bU > 0) {
         int $$5 = $$0.bU;
         int $$6 = $$5 + 1;
         float $$7 = 7.0F;
         float $$8 = $$0.n_() ? 0.3F : 0.8F;
         if ($$5 < 8) {
            float $$9 = (float)(90 * $$5) / 7.0F;
            float $$10 = (float)(90 * $$6) / 7.0F;
            float $$11 = this.a($$9, $$10, $$6, $$4, 8.0F);
            $$1.a(0.0F, ($$8 + 0.2F) * ($$11 / 90.0F), 0.0F);
            $$1.a(a.b.rotationDegrees(-$$11));
         } else if ($$5 < 16) {
            float $$12 = ((float)$$5 - 8.0F) / 7.0F;
            float $$13 = 90.0F + 90.0F * $$12;
            float $$14 = 90.0F + 90.0F * ((float)$$6 - 8.0F) / 7.0F;
            float $$15 = this.a($$13, $$14, $$6, $$4, 16.0F);
            $$1.a(0.0F, $$8 + 0.2F + ($$8 - 0.2F) * ($$15 - 90.0F) / 90.0F, 0.0F);
            $$1.a(a.b.rotationDegrees(-$$15));
         } else if ((float)$$5 < 24.0F) {
            float $$16 = ((float)$$5 - 16.0F) / 7.0F;
            float $$17 = 180.0F + 90.0F * $$16;
            float $$18 = 180.0F + 90.0F * ((float)$$6 - 16.0F) / 7.0F;
            float $$19 = this.a($$17, $$18, $$6, $$4, 24.0F);
            $$1.a(0.0F, $$8 + $$8 * (270.0F - $$19) / 90.0F, 0.0F);
            $$1.a(a.b.rotationDegrees(-$$19));
         } else if ($$5 < 32) {
            float $$20 = ((float)$$5 - 24.0F) / 7.0F;
            float $$21 = 270.0F + 90.0F * $$20;
            float $$22 = 270.0F + 90.0F * ((float)$$6 - 24.0F) / 7.0F;
            float $$23 = this.a($$21, $$22, $$6, $$4, 32.0F);
            $$1.a(0.0F, $$8 * ((360.0F - $$23) / 90.0F), 0.0F);
            $$1.a(a.b.rotationDegrees(-$$23));
         }
      }

      float $$24 = $$0.E($$4);
      if ($$24 > 0.0F) {
         $$1.a(0.0F, 0.8F * $$24, 0.0F);
         $$1.a(a.b.rotationDegrees(ati.i($$24, $$0.dD(), $$0.dD() + 90.0F)));
         $$1.a(0.0F, -1.0F * $$24, 0.0F);
         if ($$0.gw()) {
            float $$25 = (float)(Math.cos((double)$$0.ah * 1.25) * Math.PI * 0.05F);
            $$1.a(a.d.rotationDegrees($$25));
            if ($$0.n_()) {
               $$1.a(0.0F, 0.8F, 0.55F);
            }
         }
      }

      float $$26 = $$0.F($$4);
      if ($$26 > 0.0F) {
         float $$27 = $$0.n_() ? 0.5F : 1.3F;
         $$1.a(0.0F, $$27 * $$26, 0.0F);
         $$1.a(a.b.rotationDegrees(ati.i($$26, $$0.dD(), $$0.dD() + 180.0F)));
      }
   }

   private float a(float $$0, float $$1, int $$2, float $$3, float $$4) {
      return (float)$$2 < $$4 ? ati.i($$3, $$0, $$1) : $$0;
   }
}
