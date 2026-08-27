import com.google.common.collect.Maps;
import java.util.Map;

public class gcd extends gby<cai, fna<cai>> {
   private static final Map<cai.a, aiy> a = ac.a(Maps.newEnumMap(cai.a.class), $$0 -> {
      $$0.put(cai.a.a, new aiy("textures/entity/panda/panda.png"));
      $$0.put(cai.a.b, new aiy("textures/entity/panda/lazy_panda.png"));
      $$0.put(cai.a.c, new aiy("textures/entity/panda/worried_panda.png"));
      $$0.put(cai.a.d, new aiy("textures/entity/panda/playful_panda.png"));
      $$0.put(cai.a.e, new aiy("textures/entity/panda/brown_panda.png"));
      $$0.put(cai.a.f, new aiy("textures/entity/panda/weak_panda.png"));
      $$0.put(cai.a.g, new aiy("textures/entity/panda/aggressive_panda.png"));
   });

   public gcd(gas.a $$0) {
      super($$0, new fna<>($$0.a(fpb.aB)), 0.9F);
      this.a(new gez(this, $$0.d()));
   }

   public aiy a(cai $$0) {
      return a.getOrDefault($$0.gs(), a.get(cai.a.a));
   }

   protected void a(cai $$0, esa $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.bU > 0) {
         int $$6 = $$0.bU;
         int $$7 = $$6 + 1;
         float $$8 = 7.0F;
         float $$9 = $$0.o_() ? 0.3F : 0.8F;
         if ($$6 < 8) {
            float $$10 = (float)(90 * $$6) / 7.0F;
            float $$11 = (float)(90 * $$7) / 7.0F;
            float $$12 = this.a($$10, $$11, $$7, $$4, 8.0F);
            $$1.a(0.0F, ($$9 + 0.2F) * ($$12 / 90.0F), 0.0F);
            $$1.a(a.b.rotationDegrees(-$$12));
         } else if ($$6 < 16) {
            float $$13 = ((float)$$6 - 8.0F) / 7.0F;
            float $$14 = 90.0F + 90.0F * $$13;
            float $$15 = 90.0F + 90.0F * ((float)$$7 - 8.0F) / 7.0F;
            float $$16 = this.a($$14, $$15, $$7, $$4, 16.0F);
            $$1.a(0.0F, $$9 + 0.2F + ($$9 - 0.2F) * ($$16 - 90.0F) / 90.0F, 0.0F);
            $$1.a(a.b.rotationDegrees(-$$16));
         } else if ((float)$$6 < 24.0F) {
            float $$17 = ((float)$$6 - 16.0F) / 7.0F;
            float $$18 = 180.0F + 90.0F * $$17;
            float $$19 = 180.0F + 90.0F * ((float)$$7 - 16.0F) / 7.0F;
            float $$20 = this.a($$18, $$19, $$7, $$4, 24.0F);
            $$1.a(0.0F, $$9 + $$9 * (270.0F - $$20) / 90.0F, 0.0F);
            $$1.a(a.b.rotationDegrees(-$$20));
         } else if ($$6 < 32) {
            float $$21 = ((float)$$6 - 24.0F) / 7.0F;
            float $$22 = 270.0F + 90.0F * $$21;
            float $$23 = 270.0F + 90.0F * ((float)$$7 - 24.0F) / 7.0F;
            float $$24 = this.a($$22, $$23, $$7, $$4, 32.0F);
            $$1.a(0.0F, $$9 * ((360.0F - $$24) / 90.0F), 0.0F);
            $$1.a(a.b.rotationDegrees(-$$24));
         }
      }

      float $$25 = $$0.E($$4);
      if ($$25 > 0.0F) {
         $$1.a(0.0F, 0.8F * $$25, 0.0F);
         $$1.a(a.b.rotationDegrees(awh.i($$25, $$0.dE(), $$0.dE() + 90.0F)));
         $$1.a(0.0F, -1.0F * $$25, 0.0F);
         if ($$0.gy()) {
            float $$26 = (float)(Math.cos((double)$$0.ag * 1.25) * Math.PI * 0.05F);
            $$1.a(a.d.rotationDegrees($$26));
            if ($$0.o_()) {
               $$1.a(0.0F, 0.8F, 0.55F);
            }
         }
      }

      float $$27 = $$0.F($$4);
      if ($$27 > 0.0F) {
         float $$28 = $$0.o_() ? 0.5F : 1.3F;
         $$1.a(0.0F, $$28 * $$27, 0.0F);
         $$1.a(a.b.rotationDegrees(awh.i($$27, $$0.dE(), $$0.dE() + 180.0F)));
      }
   }

   private float a(float $$0, float $$1, int $$2, float $$3, float $$4) {
      return (float)$$2 < $$4 ? awh.i($$3, $$0, $$1) : $$0;
   }
}
