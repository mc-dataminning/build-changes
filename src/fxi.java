import com.google.common.collect.Maps;
import java.util.Map;

public class fxi extends fxd<bxg, fio<bxg>> {
   private static final Map<bxg.a, agi> a = ac.a(Maps.newEnumMap(bxg.a.class), $$0 -> {
      $$0.put(bxg.a.a, new agi("textures/entity/panda/panda.png"));
      $$0.put(bxg.a.b, new agi("textures/entity/panda/lazy_panda.png"));
      $$0.put(bxg.a.c, new agi("textures/entity/panda/worried_panda.png"));
      $$0.put(bxg.a.d, new agi("textures/entity/panda/playful_panda.png"));
      $$0.put(bxg.a.e, new agi("textures/entity/panda/brown_panda.png"));
      $$0.put(bxg.a.f, new agi("textures/entity/panda/weak_panda.png"));
      $$0.put(bxg.a.g, new agi("textures/entity/panda/aggressive_panda.png"));
   });

   public fxi(fvx.a $$0) {
      super($$0, new fio<>($$0.a(fkn.az)), 0.9F);
      this.a(new gab(this, $$0.d()));
   }

   public agi a(bxg $$0) {
      return a.getOrDefault($$0.gr(), a.get(bxg.a.a));
   }

   protected void a(bxg $$0, enw $$1, float $$2, float $$3, float $$4) {
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
         $$1.a(a.b.rotationDegrees(atm.i($$24, $$0.dF(), $$0.dF() + 90.0F)));
         $$1.a(0.0F, -1.0F * $$24, 0.0F);
         if ($$0.gx()) {
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
         $$1.a(a.b.rotationDegrees(atm.i($$26, $$0.dF(), $$0.dF() + 180.0F)));
      }
   }

   private float a(float $$0, float $$1, int $$2, float $$3, float $$4) {
      return (float)$$2 < $$4 ? atm.i($$3, $$0, $$1) : $$0;
   }
}
