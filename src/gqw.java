import com.google.common.collect.Maps;
import java.util.Map;

public class gqw extends gof<chn, gwu, gag> {
   private static final Map<chn.a, alj> a = ae.a(Maps.newEnumMap(chn.a.class), $$0 -> {
      $$0.put(chn.a.a, alj.b("textures/entity/panda/panda.png"));
      $$0.put(chn.a.b, alj.b("textures/entity/panda/lazy_panda.png"));
      $$0.put(chn.a.c, alj.b("textures/entity/panda/worried_panda.png"));
      $$0.put(chn.a.d, alj.b("textures/entity/panda/playful_panda.png"));
      $$0.put(chn.a.e, alj.b("textures/entity/panda/brown_panda.png"));
      $$0.put(chn.a.f, alj.b("textures/entity/panda/weak_panda.png"));
      $$0.put(chn.a.g, alj.b("textures/entity/panda/aggressive_panda.png"));
   });

   public gqw(gpk.a $$0) {
      super($$0, new gag($$0.a(gck.bF)), new gag($$0.a(gck.bG)), 0.9F);
      this.a(new gtu(this, $$0.b()));
   }

   public alj a(gwu $$0) {
      return a.getOrDefault($$0.a, a.get(chn.a.a));
   }

   public gwu b() {
      return new gwu();
   }

   public void a(chn $$0, gwu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gA();
      $$1.b = $$0.n() > 0;
      $$1.c = $$0.q();
      $$1.d = $$0.go();
      $$1.e = $$0.gn();
      $$1.f = $$0.gG();
      $$1.g = $$0.v();
      $$1.h = $$0.J($$2);
      $$1.i = $$0.K($$2);
      $$1.j = $$0.e_() ? 0.0F : $$0.L($$2);
      $$1.k = $$0.bZ > 0 ? (float)$$0.bZ + $$2 : 0.0F;
   }

   protected void a(gwu $$0, fer $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.k > 0.0F) {
         float $$4 = azm.i($$0.k);
         int $$5 = azm.d($$0.k);
         int $$6 = $$5 + 1;
         float $$7 = 7.0F;
         float $$8 = $$0.ae ? 0.3F : 0.8F;
         if ((float)$$5 < 8.0F) {
            float $$9 = 90.0F * (float)$$5 / 7.0F;
            float $$10 = 90.0F * (float)$$6 / 7.0F;
            float $$11 = this.a($$9, $$10, $$6, $$4, 8.0F);
            $$1.a(0.0F, ($$8 + 0.2F) * ($$11 / 90.0F), 0.0F);
            $$1.a(a.b.rotationDegrees(-$$11));
         } else if ((float)$$5 < 16.0F) {
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

      float $$24 = $$0.h;
      if ($$24 > 0.0F) {
         $$1.a(0.0F, 0.8F * $$24, 0.0F);
         $$1.a(a.b.rotationDegrees(azm.h($$24, $$0.V, $$0.V + 90.0F)));
         $$1.a(0.0F, -1.0F * $$24, 0.0F);
         if ($$0.f) {
            float $$25 = (float)(Math.cos((double)($$0.p * 1.25F)) * Math.PI * 0.05F);
            $$1.a(a.d.rotationDegrees($$25));
            if ($$0.ae) {
               $$1.a(0.0F, 0.8F, 0.55F);
            }
         }
      }

      float $$26 = $$0.i;
      if ($$26 > 0.0F) {
         float $$27 = $$0.ae ? 0.5F : 1.3F;
         $$1.a(0.0F, $$27 * $$26, 0.0F);
         $$1.a(a.b.rotationDegrees(azm.h($$26, $$0.V, $$0.V + 180.0F)));
      }
   }

   private float a(float $$0, float $$1, int $$2, float $$3, float $$4) {
      return (float)$$2 < $$4 ? azm.h($$3, $$0, $$1) : $$0;
   }
}
