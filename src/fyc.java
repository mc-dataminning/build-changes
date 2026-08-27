import org.joml.Matrix3f;
import org.joml.Matrix4f;

public class fyc extends fyu<cbv, fjf> {
   private static final agt a = new agt("textures/entity/guardian.png");
   private static final agt i = new agt("textures/entity/guardian_beam.png");
   private static final fsq j = fsq.e(i);

   public fyc(fxo.a $$0) {
      this($$0, 0.5F, flx.aj);
   }

   protected fyc(fxo.a $$0, float $$1, flw $$2) {
      super($$0, new fjf($$0.a($$2)), $$1);
   }

   public boolean a(cbv $$0, fvl $$1, double $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         if ($$0.gg()) {
            blv $$5 = $$0.gh();
            if ($$5 != null) {
               elb $$6 = this.a($$5, (double)$$5.dh() * 0.5, 1.0F);
               elb $$7 = this.a($$0, (double)$$0.cI(), 1.0F);
               return $$1.a(new ekw($$7.c, $$7.d, $$7.e, $$6.c, $$6.d, $$6.e));
            }
         }

         return false;
      }
   }

   private elb a(blv $$0, double $$1, float $$2) {
      double $$3 = aty.d((double)$$2, $$0.ac, $$0.dr());
      double $$4 = aty.d((double)$$2, $$0.ad, $$0.dt()) + $$1;
      double $$5 = aty.d((double)$$2, $$0.ae, $$0.dx());
      return new elb($$3, $$4, $$5);
   }

   public void a(cbv $$0, float $$1, float $$2, epd $$3, fsi $$4, int $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      blv $$6 = $$0.gh();
      if ($$6 != null) {
         float $$7 = $$0.G($$2);
         float $$8 = $$0.gi() + $$2;
         float $$9 = $$8 * 0.5F % 1.0F;
         float $$10 = $$0.cI();
         $$3.a();
         $$3.a(0.0F, $$10, 0.0F);
         elb $$11 = this.a($$6, (double)$$6.dh() * 0.5, $$2);
         elb $$12 = this.a($$0, (double)$$10, $$2);
         elb $$13 = $$11.d($$12);
         float $$14 = (float)($$13.f() + 1.0);
         $$13 = $$13.d();
         float $$15 = (float)Math.acos($$13.d);
         float $$16 = (float)Math.atan2($$13.e, $$13.c);
         $$3.a(a.d.rotationDegrees(((float) (Math.PI / 2) - $$16) * (180.0F / (float)Math.PI)));
         $$3.a(a.b.rotationDegrees($$15 * (180.0F / (float)Math.PI)));
         int $$17 = 1;
         float $$18 = $$8 * 0.05F * -1.5F;
         float $$19 = $$7 * $$7;
         int $$20 = 64 + (int)($$19 * 191.0F);
         int $$21 = 32 + (int)($$19 * 191.0F);
         int $$22 = 128 - (int)($$19 * 64.0F);
         float $$23 = 0.2F;
         float $$24 = 0.282F;
         float $$25 = aty.b($$18 + (float) (Math.PI * 3.0 / 4.0)) * 0.282F;
         float $$26 = aty.a($$18 + (float) (Math.PI * 3.0 / 4.0)) * 0.282F;
         float $$27 = aty.b($$18 + (float) (Math.PI / 4)) * 0.282F;
         float $$28 = aty.a($$18 + (float) (Math.PI / 4)) * 0.282F;
         float $$29 = aty.b($$18 + ((float) Math.PI * 5.0F / 4.0F)) * 0.282F;
         float $$30 = aty.a($$18 + ((float) Math.PI * 5.0F / 4.0F)) * 0.282F;
         float $$31 = aty.b($$18 + ((float) Math.PI * 7.0F / 4.0F)) * 0.282F;
         float $$32 = aty.a($$18 + ((float) Math.PI * 7.0F / 4.0F)) * 0.282F;
         float $$33 = aty.b($$18 + (float) Math.PI) * 0.2F;
         float $$34 = aty.a($$18 + (float) Math.PI) * 0.2F;
         float $$35 = aty.b($$18 + 0.0F) * 0.2F;
         float $$36 = aty.a($$18 + 0.0F) * 0.2F;
         float $$37 = aty.b($$18 + (float) (Math.PI / 2)) * 0.2F;
         float $$38 = aty.a($$18 + (float) (Math.PI / 2)) * 0.2F;
         float $$39 = aty.b($$18 + (float) (Math.PI * 3.0 / 2.0)) * 0.2F;
         float $$40 = aty.a($$18 + (float) (Math.PI * 3.0 / 2.0)) * 0.2F;
         float $$42 = 0.0F;
         float $$43 = 0.4999F;
         float $$44 = -1.0F + $$9;
         float $$45 = $$14 * 2.5F + $$44;
         eph $$46 = $$4.getBuffer(j);
         epd.a $$47 = $$3.c();
         Matrix4f $$48 = $$47.a();
         Matrix3f $$49 = $$47.b();
         a($$46, $$48, $$49, $$33, $$14, $$34, $$20, $$21, $$22, 0.4999F, $$45);
         a($$46, $$48, $$49, $$33, 0.0F, $$34, $$20, $$21, $$22, 0.4999F, $$44);
         a($$46, $$48, $$49, $$35, 0.0F, $$36, $$20, $$21, $$22, 0.0F, $$44);
         a($$46, $$48, $$49, $$35, $$14, $$36, $$20, $$21, $$22, 0.0F, $$45);
         a($$46, $$48, $$49, $$37, $$14, $$38, $$20, $$21, $$22, 0.4999F, $$45);
         a($$46, $$48, $$49, $$37, 0.0F, $$38, $$20, $$21, $$22, 0.4999F, $$44);
         a($$46, $$48, $$49, $$39, 0.0F, $$40, $$20, $$21, $$22, 0.0F, $$44);
         a($$46, $$48, $$49, $$39, $$14, $$40, $$20, $$21, $$22, 0.0F, $$45);
         float $$50 = 0.0F;
         if ($$0.ah % 2 == 0) {
            $$50 = 0.5F;
         }

         a($$46, $$48, $$49, $$25, $$14, $$26, $$20, $$21, $$22, 0.5F, $$50 + 0.5F);
         a($$46, $$48, $$49, $$27, $$14, $$28, $$20, $$21, $$22, 1.0F, $$50 + 0.5F);
         a($$46, $$48, $$49, $$31, $$14, $$32, $$20, $$21, $$22, 1.0F, $$50);
         a($$46, $$48, $$49, $$29, $$14, $$30, $$20, $$21, $$22, 0.5F, $$50);
         $$3.b();
      }
   }

   private static void a(eph $$0, Matrix4f $$1, Matrix3f $$2, float $$3, float $$4, float $$5, int $$6, int $$7, int $$8, float $$9, float $$10) {
      $$0.a($$1, $$3, $$4, $$5).a($$6, $$7, $$8, 255).a($$9, $$10).c(gdf.d).b(15728880).a($$2, 0.0F, 1.0F, 0.0F).e();
   }

   public agt a(cbv $$0) {
      return a;
   }
}
