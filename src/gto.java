import com.google.common.collect.Maps;
import java.util.Map;

public class gto extends gqw<chm, gzp, gcx> {
   private static final Map<chm.a, aku> a = af.a(Maps.newEnumMap(chm.a.class), $$0 -> {
      $$0.put(chm.a.a, aku.b("textures/entity/panda/panda.png"));
      $$0.put(chm.a.b, aku.b("textures/entity/panda/lazy_panda.png"));
      $$0.put(chm.a.c, aku.b("textures/entity/panda/worried_panda.png"));
      $$0.put(chm.a.d, aku.b("textures/entity/panda/playful_panda.png"));
      $$0.put(chm.a.e, aku.b("textures/entity/panda/brown_panda.png"));
      $$0.put(chm.a.f, aku.b("textures/entity/panda/weak_panda.png"));
      $$0.put(chm.a.g, aku.b("textures/entity/panda/aggressive_panda.png"));
   });

   public gto(gsc.a $$0) {
      super($$0, new gcx($$0.a(gfb.bL)), new gcx($$0.a(gfb.bM)), 0.9F);
      this.a(new gwn(this));
   }

   public aku a(gzp $$0) {
      return a.getOrDefault($$0.a, a.get(chm.a.a));
   }

   public gzp b() {
      return new gzp();
   }

   public void a(chm $$0, gzp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gyx.a($$0, $$1, this.i);
      $$1.a = $$0.gD();
      $$1.b = $$0.p() > 0;
      $$1.c = $$0.t();
      $$1.d = $$0.gr();
      $$1.e = $$0.gq();
      $$1.f = $$0.gJ();
      $$1.g = $$0.x();
      $$1.h = $$0.J($$2);
      $$1.j = $$0.K($$2);
      $$1.k = $$0.e_() ? 0.0F : $$0.L($$2);
      $$1.l = $$0.bZ > 0 ? (float)$$0.bZ + $$2 : 0.0F;
   }

   protected void a(gzp $$0, ffu $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.l > 0.0F) {
         float $$4 = ayz.i($$0.l);
         int $$5 = ayz.d($$0.l);
         int $$6 = $$5 + 1;
         float $$7 = 7.0F;
         float $$8 = $$0.aj ? 0.3F : 0.8F;
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
         $$1.a(a.b.rotationDegrees(ayz.h($$24, $$0.ab, $$0.ab + 90.0F)));
         $$1.a(0.0F, -1.0F * $$24, 0.0F);
         if ($$0.f) {
            float $$25 = (float)(Math.cos((double)($$0.u * 1.25F)) * Math.PI * 0.05F);
            $$1.a(a.d.rotationDegrees($$25));
            if ($$0.aj) {
               $$1.a(0.0F, 0.8F, 0.55F);
            }
         }
      }

      float $$26 = $$0.j;
      if ($$26 > 0.0F) {
         float $$27 = $$0.aj ? 0.5F : 1.3F;
         $$1.a(0.0F, $$27 * $$26, 0.0F);
         $$1.a(a.b.rotationDegrees(ayz.h($$26, $$0.ab, $$0.ab + 180.0F)));
      }
   }

   private float a(float $$0, float $$1, int $$2, float $$3, float $$4) {
      return (float)$$2 < $$4 ? ayz.h($$3, $$0, $$1) : $$0;
   }
}
