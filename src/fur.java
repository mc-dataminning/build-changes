import org.joml.Matrix3f;
import org.joml.Matrix4f;

public class fur extends fvj<cah, fge> {
   private static final afw a = new afw("textures/entity/guardian.png");
   private static final afw i = new afw("textures/entity/guardian_beam.png");
   private static final fpj j = fpj.e(i);

   public fur(fud.a $$0) {
      this($$0, 0.5F, fiv.ag);
   }

   protected fur(fud.a $$0, float $$1, fiu $$2) {
      super($$0, new fge($$0.a($$2)), $$1);
   }

   public boolean a(cah $$0, fsc $$1, double $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         if ($$0.gg()) {
            bkj $$5 = $$0.gh();
            if ($$5 != null) {
               eif $$6 = this.a($$5, (double)$$5.dg() * 0.5, 1.0F);
               eif $$7 = this.a($$0, (double)$$0.cH(), 1.0F);
               return $$1.a(new eia($$7.c, $$7.d, $$7.e, $$6.c, $$6.d, $$6.e));
            }
         }

         return false;
      }
   }

   private eif a(bkj $$0, double $$1, float $$2) {
      double $$3 = asy.d((double)$$2, $$0.ac, $$0.dq());
      double $$4 = asy.d((double)$$2, $$0.ad, $$0.ds()) + $$1;
      double $$5 = asy.d((double)$$2, $$0.ae, $$0.dw());
      return new eif($$3, $$4, $$5);
   }

   public void a(cah $$0, float $$1, float $$2, emh $$3, fpb $$4, int $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      bkj $$6 = $$0.gh();
      if ($$6 != null) {
         float $$7 = $$0.G($$2);
         float $$8 = $$0.gi() + $$2;
         float $$9 = $$8 * 0.5F % 1.0F;
         float $$10 = $$0.cH();
         $$3.a();
         $$3.a(0.0F, $$10, 0.0F);
         eif $$11 = this.a($$6, (double)$$6.dg() * 0.5, $$2);
         eif $$12 = this.a($$0, (double)$$10, $$2);
         eif $$13 = $$11.d($$12);
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
         float $$25 = asy.b($$18 + (float) (Math.PI * 3.0 / 4.0)) * 0.282F;
         float $$26 = asy.a($$18 + (float) (Math.PI * 3.0 / 4.0)) * 0.282F;
         float $$27 = asy.b($$18 + (float) (Math.PI / 4)) * 0.282F;
         float $$28 = asy.a($$18 + (float) (Math.PI / 4)) * 0.282F;
         float $$29 = asy.b($$18 + ((float) Math.PI * 5.0F / 4.0F)) * 0.282F;
         float $$30 = asy.a($$18 + ((float) Math.PI * 5.0F / 4.0F)) * 0.282F;
         float $$31 = asy.b($$18 + ((float) Math.PI * 7.0F / 4.0F)) * 0.282F;
         float $$32 = asy.a($$18 + ((float) Math.PI * 7.0F / 4.0F)) * 0.282F;
         float $$33 = asy.b($$18 + (float) Math.PI) * 0.2F;
         float $$34 = asy.a($$18 + (float) Math.PI) * 0.2F;
         float $$35 = asy.b($$18 + 0.0F) * 0.2F;
         float $$36 = asy.a($$18 + 0.0F) * 0.2F;
         float $$37 = asy.b($$18 + (float) (Math.PI / 2)) * 0.2F;
         float $$38 = asy.a($$18 + (float) (Math.PI / 2)) * 0.2F;
         float $$39 = asy.b($$18 + (float) (Math.PI * 3.0 / 2.0)) * 0.2F;
         float $$40 = asy.a($$18 + (float) (Math.PI * 3.0 / 2.0)) * 0.2F;
         float $$42 = 0.0F;
         float $$43 = 0.4999F;
         float $$44 = -1.0F + $$9;
         float $$45 = $$14 * 2.5F + $$44;
         eml $$46 = $$4.getBuffer(j);
         emh.a $$47 = $$3.c();
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

   private static void a(eml $$0, Matrix4f $$1, Matrix3f $$2, float $$3, float $$4, float $$5, int $$6, int $$7, int $$8, float $$9, float $$10) {
      $$0.a($$1, $$3, $$4, $$5).a($$6, $$7, $$8, 255).a($$9, $$10).c(fzr.d).b(15728880).a($$2, 0.0F, 1.0F, 0.0F).e();
   }

   public afw a(cah $$0) {
      return a;
   }
}
