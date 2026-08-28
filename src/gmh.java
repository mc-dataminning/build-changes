import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class gmh {
   private static final aku a = aku.b("textures/misc/underwater.png");

   public static void a(flh $$0, ffs $$1, glv $$2) {
      cov $$3 = $$0.t;
      if (!$$3.ad) {
         dwv $$4 = a($$3);
         if ($$4 != null) {
            a($$0.ap().a().a($$4), $$1, $$2);
         }
      }

      if (!$$0.t.Z_()) {
         if ($$0.t.a(awu.a)) {
            b($$0, $$1, $$2);
         }

         if ($$0.t.bY()) {
            a($$1, $$2);
         }
      }
   }

   @Nullable
   private static dwv a(cov $$0) {
      ji.a $$1 = new ji.a();

      for (int $$2 = 0; $$2 < 8; $$2++) {
         double $$3 = $$0.dB() + (double)(((float)(($$2 >> 0) % 2) - 0.5F) * $$0.dr() * 0.8F);
         double $$4 = $$0.dF() + (double)(((float)(($$2 >> 1) % 2) - 0.5F) * 0.1F * $$0.ek());
         double $$5 = $$0.dH() + (double)(((float)(($$2 >> 2) % 2) - 0.5F) * $$0.dr() * 0.8F);
         $$1.b($$3, $$4, $$5);
         dwv $$6 = $$0.dW().a_($$1);
         if ($$6.o() != dpv.a && $$6.k($$0.dW(), $$1)) {
            return $$6;
         }
      }

      return null;
   }

   private static void a(hem $$0, ffs $$1, glv $$2) {
      float $$3 = 0.1F;
      int $$4 = axj.a(1.0F, 0.1F, 0.1F, 0.1F);
      float $$5 = -1.0F;
      float $$6 = 1.0F;
      float $$7 = -1.0F;
      float $$8 = 1.0F;
      float $$9 = -0.5F;
      float $$10 = $$0.c();
      float $$11 = $$0.d();
      float $$12 = $$0.g();
      float $$13 = $$0.h();
      Matrix4f $$14 = $$1.c().a();
      ffw $$15 = $$2.getBuffer(gmf.D($$0.i()));
      $$15.a($$14, -1.0F, -1.0F, -0.5F).a($$11, $$13).a($$4);
      $$15.a($$14, 1.0F, -1.0F, -0.5F).a($$10, $$13).a($$4);
      $$15.a($$14, 1.0F, 1.0F, -0.5F).a($$10, $$12).a($$4);
      $$15.a($$14, -1.0F, 1.0F, -0.5F).a($$11, $$12).a($$4);
   }

   private static void b(flh $$0, ffs $$1, glv $$2) {
      ji $$3 = ji.a($$0.t.dB(), $$0.t.dF(), $$0.t.dH());
      float $$4 = glt.a($$0.t.dW().G_(), $$0.t.dW().A($$3));
      int $$5 = axj.a(0.1F, $$4, $$4, $$4);
      float $$6 = 4.0F;
      float $$7 = -1.0F;
      float $$8 = 1.0F;
      float $$9 = -1.0F;
      float $$10 = 1.0F;
      float $$11 = -0.5F;
      float $$12 = -$$0.t.dM() / 64.0F;
      float $$13 = $$0.t.dO() / 64.0F;
      Matrix4f $$14 = $$1.c().a();
      ffw $$15 = $$2.getBuffer(gmf.D(a));
      $$15.a($$14, -1.0F, -1.0F, -0.5F).a(4.0F + $$12, 4.0F + $$13).a($$5);
      $$15.a($$14, 1.0F, -1.0F, -0.5F).a(0.0F + $$12, 4.0F + $$13).a($$5);
      $$15.a($$14, 1.0F, 1.0F, -0.5F).a(0.0F + $$12, 0.0F + $$13).a($$5);
      $$15.a($$14, -1.0F, 1.0F, -0.5F).a(4.0F + $$12, 0.0F + $$13).a($$5);
   }

   private static void a(ffs $$0, glv $$1) {
      hem $$2 = hgw.b.c();
      ffw $$3 = $$1.getBuffer(gmf.E($$2.i()));
      float $$4 = $$2.c();
      float $$5 = $$2.d();
      float $$6 = ($$4 + $$5) / 2.0F;
      float $$7 = $$2.g();
      float $$8 = $$2.h();
      float $$9 = ($$7 + $$8) / 2.0F;
      float $$10 = $$2.k();
      float $$11 = ayy.h($$10, $$4, $$6);
      float $$12 = ayy.h($$10, $$5, $$6);
      float $$13 = ayy.h($$10, $$7, $$9);
      float $$14 = ayy.h($$10, $$8, $$9);
      float $$15 = 1.0F;

      for (int $$16 = 0; $$16 < 2; $$16++) {
         $$0.a();
         float $$17 = -0.5F;
         float $$18 = 0.5F;
         float $$19 = -0.5F;
         float $$20 = 0.5F;
         float $$21 = -0.5F;
         $$0.a((float)(-($$16 * 2 - 1)) * 0.24F, -0.3F, 0.0F);
         $$0.a(a.d.rotationDegrees((float)($$16 * 2 - 1) * 10.0F));
         Matrix4f $$22 = $$0.c().a();
         $$3.a($$22, -0.5F, -0.5F, -0.5F).a($$12, $$14).a(1.0F, 1.0F, 1.0F, 0.9F);
         $$3.a($$22, 0.5F, -0.5F, -0.5F).a($$11, $$14).a(1.0F, 1.0F, 1.0F, 0.9F);
         $$3.a($$22, 0.5F, 0.5F, -0.5F).a($$11, $$13).a(1.0F, 1.0F, 1.0F, 0.9F);
         $$3.a($$22, -0.5F, 0.5F, -0.5F).a($$12, $$13).a(1.0F, 1.0F, 1.0F, 0.9F);
         $$0.b();
      }
   }
}
