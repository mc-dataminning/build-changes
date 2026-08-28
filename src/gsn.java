import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class gsn {
   private static final ali a = ali.b("textures/misc/underwater.png");

   public static void a(frd $$0, flo $$1, gsa $$2) {
      crx $$3 = $$0.t;
      if (!$$3.ad) {
         ebe $$4 = a($$3);
         if ($$4 != null) {
            a($$0.ap().a().a($$4), $$1, $$2);
         }
      }

      if (!$$0.t.Z_()) {
         if ($$0.t.a(axj.a)) {
            b($$0, $$1, $$2);
         }

         if ($$0.t.bX()) {
            a($$1, $$2);
         }
      }
   }

   @Nullable
   private static ebe a(crx $$0) {
      iv.a $$1 = new iv.a();

      for (int $$2 = 0; $$2 < 8; $$2++) {
         double $$3 = $$0.dA() + (double)(((float)(($$2 >> 0) % 2) - 0.5F) * $$0.dq() * 0.8F);
         double $$4 = $$0.dE() + (double)(((float)(($$2 >> 1) % 2) - 0.5F) * 0.1F * $$0.el());
         double $$5 = $$0.dG() + (double)(((float)(($$2 >> 2) % 2) - 0.5F) * $$0.dq() * 0.8F);
         $$1.b($$3, $$4, $$5);
         ebe $$6 = $$0.dV().a_($$1);
         if ($$6.o() != dtp.a && $$6.k($$0.dV(), $$1)) {
            return $$6;
         }
      }

      return null;
   }

   private static void a(hla $$0, flo $$1, gsa $$2) {
      float $$3 = 0.1F;
      int $$4 = axy.a(1.0F, 0.1F, 0.1F, 0.1F);
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
      flr $$15 = $$2.getBuffer(gsl.D($$0.i()));
      $$15.a($$14, -1.0F, -1.0F, -0.5F).a($$11, $$13).a($$4);
      $$15.a($$14, 1.0F, -1.0F, -0.5F).a($$10, $$13).a($$4);
      $$15.a($$14, 1.0F, 1.0F, -0.5F).a($$10, $$12).a($$4);
      $$15.a($$14, -1.0F, 1.0F, -0.5F).a($$11, $$12).a($$4);
   }

   private static void b(frd $$0, flo $$1, gsa $$2) {
      iv $$3 = iv.a($$0.t.dA(), $$0.t.dE(), $$0.t.dG());
      float $$4 = grx.a($$0.t.dV().F_(), $$0.t.dV().B($$3));
      int $$5 = axy.a(0.1F, $$4, $$4, $$4);
      float $$6 = 4.0F;
      float $$7 = -1.0F;
      float $$8 = 1.0F;
      float $$9 = -1.0F;
      float $$10 = 1.0F;
      float $$11 = -0.5F;
      float $$12 = -$$0.t.dL() / 64.0F;
      float $$13 = $$0.t.dN() / 64.0F;
      Matrix4f $$14 = $$1.c().a();
      flr $$15 = $$2.getBuffer(gsl.D(a));
      $$15.a($$14, -1.0F, -1.0F, -0.5F).a(4.0F + $$12, 4.0F + $$13).a($$5);
      $$15.a($$14, 1.0F, -1.0F, -0.5F).a(0.0F + $$12, 4.0F + $$13).a($$5);
      $$15.a($$14, 1.0F, 1.0F, -0.5F).a(0.0F + $$12, 0.0F + $$13).a($$5);
      $$15.a($$14, -1.0F, 1.0F, -0.5F).a(4.0F + $$12, 0.0F + $$13).a($$5);
   }

   private static void a(flo $$0, gsa $$1) {
      hla $$2 = hnk.b.c();
      flr $$3 = $$1.getBuffer(gsl.E($$2.i()));
      float $$4 = $$2.c();
      float $$5 = $$2.d();
      float $$6 = ($$4 + $$5) / 2.0F;
      float $$7 = $$2.g();
      float $$8 = $$2.h();
      float $$9 = ($$7 + $$8) / 2.0F;
      float $$10 = $$2.j();
      float $$11 = azo.h($$10, $$4, $$6);
      float $$12 = azo.h($$10, $$5, $$6);
      float $$13 = azo.h($$10, $$7, $$9);
      float $$14 = azo.h($$10, $$8, $$9);
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
