import com.google.common.collect.Maps;
import java.util.Map;

public class gvr extends gsz<civ, hbr, gey> {
   private static final Map<civ.a, ald> a = Maps.newEnumMap(
      Map.of(
         civ.a.a,
         ald.b("textures/entity/panda/panda.png"),
         civ.a.b,
         ald.b("textures/entity/panda/lazy_panda.png"),
         civ.a.c,
         ald.b("textures/entity/panda/worried_panda.png"),
         civ.a.d,
         ald.b("textures/entity/panda/playful_panda.png"),
         civ.a.e,
         ald.b("textures/entity/panda/brown_panda.png"),
         civ.a.f,
         ald.b("textures/entity/panda/weak_panda.png"),
         civ.a.g,
         ald.b("textures/entity/panda/aggressive_panda.png")
      )
   );

   public gvr(guf.a $$0) {
      super($$0, new gey($$0.a(ghc.bV)), new gey($$0.a(ghc.bW)), 0.9F);
      this.a(new gyp(this));
   }

   public ald a(hbr $$0) {
      return a.getOrDefault($$0.a, a.get(civ.a.a));
   }

   public hbr b() {
      return new hbr();
   }

   public void a(civ $$0, hbr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      haz.a($$0, $$1, this.h);
      $$1.a = $$0.gE();
      $$1.b = $$0.q() > 0;
      $$1.c = $$0.t();
      $$1.d = $$0.gs();
      $$1.e = $$0.gr();
      $$1.f = $$0.gK();
      $$1.g = $$0.x();
      $$1.h = $$0.K($$2);
      $$1.j = $$0.L($$2);
      $$1.k = $$0.n_() ? 0.0F : $$0.M($$2);
      $$1.l = $$0.bF > 0 ? (float)$$0.bF + $$2 : 0.0F;
   }

   protected void a(hbr $$0, fho $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.l > 0.0F) {
         float $$4 = azk.i($$0.l);
         int $$5 = azk.d($$0.l);
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
         $$1.a(a.b.rotationDegrees(azk.h($$24, $$0.ab, $$0.ab + 90.0F)));
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
         $$1.a(a.b.rotationDegrees(azk.h($$26, $$0.ab, $$0.ab + 180.0F)));
      }
   }

   private float a(float $$0, float $$1, int $$2, float $$3, float $$4) {
      return (float)$$2 < $$4 ? azk.h($$3, $$0, $$1) : $$0;
   }
}
