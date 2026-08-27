import org.joml.Matrix3f;
import org.joml.Matrix4f;

public class gbo extends gcg<cen, fmp> {
   private static final aiy a = new aiy("textures/entity/guardian.png");
   private static final aiy i = new aiy("textures/entity/guardian_beam.png");
   private static final fwb j = fwb.e(i);

   public gbo(gba.a $$0) {
      this($$0, 0.5F, fpi.ai);
   }

   protected gbo(gba.a $$0, float $$1, fph $$2) {
      super($$0, new fmp($$0.a($$2)), $$1);
   }

   public boolean a(cen $$0, fyw $$1, double $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         if ($$0.gi()) {
            boi $$5 = $$0.gj();
            if ($$5 != null) {
               enz $$6 = this.a($$5, (double)$$5.dh() * 0.5, 1.0F);
               enz $$7 = this.a($$0, (double)$$0.cI(), 1.0F);
               return $$1.a(new enu($$7.c, $$7.d, $$7.e, $$6.c, $$6.d, $$6.e));
            }
         }

         return false;
      }
   }

   private enz a(boi $$0, double $$1, float $$2) {
      double $$3 = awi.d((double)$$2, $$0.ab, $$0.dr());
      double $$4 = awi.d((double)$$2, $$0.ac, $$0.dt()) + $$1;
      double $$5 = awi.d((double)$$2, $$0.ad, $$0.dx());
      return new enz($$3, $$4, $$5);
   }

   public void a(cen $$0, float $$1, float $$2, esh $$3, fvt $$4, int $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      boi $$6 = $$0.gj();
      if ($$6 != null) {
         float $$7 = $$0.G($$2);
         float $$8 = $$0.gk() + $$2;
         float $$9 = $$8 * 0.5F % 1.0F;
         float $$10 = $$0.cI();
         $$3.a();
         $$3.a(0.0F, $$10, 0.0F);
         enz $$11 = this.a($$6, (double)$$6.dh() * 0.5, $$2);
         enz $$12 = this.a($$0, (double)$$10, $$2);
         enz $$13 = $$11.d($$12);
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
         float $$25 = awi.b($$18 + (float) (Math.PI * 3.0 / 4.0)) * 0.282F;
         float $$26 = awi.a($$18 + (float) (Math.PI * 3.0 / 4.0)) * 0.282F;
         float $$27 = awi.b($$18 + (float) (Math.PI / 4)) * 0.282F;
         float $$28 = awi.a($$18 + (float) (Math.PI / 4)) * 0.282F;
         float $$29 = awi.b($$18 + ((float) Math.PI * 5.0F / 4.0F)) * 0.282F;
         float $$30 = awi.a($$18 + ((float) Math.PI * 5.0F / 4.0F)) * 0.282F;
         float $$31 = awi.b($$18 + ((float) Math.PI * 7.0F / 4.0F)) * 0.282F;
         float $$32 = awi.a($$18 + ((float) Math.PI * 7.0F / 4.0F)) * 0.282F;
         float $$33 = awi.b($$18 + (float) Math.PI) * 0.2F;
         float $$34 = awi.a($$18 + (float) Math.PI) * 0.2F;
         float $$35 = awi.b($$18 + 0.0F) * 0.2F;
         float $$36 = awi.a($$18 + 0.0F) * 0.2F;
         float $$37 = awi.b($$18 + (float) (Math.PI / 2)) * 0.2F;
         float $$38 = awi.a($$18 + (float) (Math.PI / 2)) * 0.2F;
         float $$39 = awi.b($$18 + (float) (Math.PI * 3.0 / 2.0)) * 0.2F;
         float $$40 = awi.a($$18 + (float) (Math.PI * 3.0 / 2.0)) * 0.2F;
         float $$42 = 0.0F;
         float $$43 = 0.4999F;
         float $$44 = -1.0F + $$9;
         float $$45 = $$14 * 2.5F + $$44;
         esl $$46 = $$4.getBuffer(j);
         esh.a $$47 = $$3.c();
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
         if ($$0.ag % 2 == 0) {
            $$50 = 0.5F;
         }

         a($$46, $$48, $$49, $$25, $$14, $$26, $$20, $$21, $$22, 0.5F, $$50 + 0.5F);
         a($$46, $$48, $$49, $$27, $$14, $$28, $$20, $$21, $$22, 1.0F, $$50 + 0.5F);
         a($$46, $$48, $$49, $$31, $$14, $$32, $$20, $$21, $$22, 1.0F, $$50);
         a($$46, $$48, $$49, $$29, $$14, $$30, $$20, $$21, $$22, 0.5F, $$50);
         $$3.b();
      }
   }

   private static void a(esl $$0, Matrix4f $$1, Matrix3f $$2, float $$3, float $$4, float $$5, int $$6, int $$7, int $$8, float $$9, float $$10) {
      $$0.a($$1, $$3, $$4, $$5).a($$6, $$7, $$8, 255).a($$9, $$10).c(ggs.d).b(15728880).a($$2, 0.0F, 1.0F, 0.0F).e();
   }

   public aiy a(cen $$0) {
      return a;
   }
}
