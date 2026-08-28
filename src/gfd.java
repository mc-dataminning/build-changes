import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class gfd {
   private static final akq a = akq.b("textures/misc/underwater.png");

   public static void a(fgi $$0, fbc $$1) {
      cmv $$2 = $$0.s;
      if (!$$2.ag) {
         dta $$3 = a($$2);
         if ($$3 != null) {
            a($$0.ao().a().a($$3), $$1);
         }
      }

      if (!$$0.s.N_()) {
         if ($$0.s.a(awj.a)) {
            b($$0, $$1);
         }

         if ($$0.s.bR()) {
            c($$0, $$1);
         }
      }
   }

   @Nullable
   private static dta a(cmv $$0) {
      jd.a $$1 = new jd.a();

      for (int $$2 = 0; $$2 < 8; $$2++) {
         double $$3 = $$0.dv() + (double)(((float)(($$2 >> 0) % 2) - 0.5F) * $$0.dk() * 0.8F);
         double $$4 = $$0.dz() + (double)(((float)(($$2 >> 1) % 2) - 0.5F) * 0.1F * $$0.ec());
         double $$5 = $$0.dB() + (double)(((float)(($$2 >> 2) % 2) - 0.5F) * $$0.dk() * 0.8F);
         $$1.b($$3, $$4, $$5);
         dta $$6 = $$0.dQ().a_($$1);
         if ($$6.l() != dmd.a && $$6.p($$0.dQ(), $$1)) {
            return $$6;
         }
      }

      return null;
   }

   private static void a(gqf $$0, fbc $$1) {
      RenderSystem.setShaderTexture(0, $$0.i());
      RenderSystem.setShader(gem::r);
      float $$2 = 0.1F;
      float $$3 = -1.0F;
      float $$4 = 1.0F;
      float $$5 = -1.0F;
      float $$6 = 1.0F;
      float $$7 = -0.5F;
      float $$8 = $$0.c();
      float $$9 = $$0.d();
      float $$10 = $$0.g();
      float $$11 = $$0.h();
      Matrix4f $$12 = $$1.c().a();
      fax $$13 = fbe.b().a(fbh.c.h, fba.j);
      $$13.a($$12, -1.0F, -1.0F, -0.5F).a($$9, $$11).a(0.1F, 0.1F, 0.1F, 1.0F);
      $$13.a($$12, 1.0F, -1.0F, -0.5F).a($$8, $$11).a(0.1F, 0.1F, 0.1F, 1.0F);
      $$13.a($$12, 1.0F, 1.0F, -0.5F).a($$8, $$10).a(0.1F, 0.1F, 0.1F, 1.0F);
      $$13.a($$12, -1.0F, 1.0F, -0.5F).a($$9, $$10).a(0.1F, 0.1F, 0.1F, 1.0F);
      fay.a($$13.b());
   }

   private static void b(fgi $$0, fbc $$1) {
      RenderSystem.setShader(gem::q);
      RenderSystem.setShaderTexture(0, a);
      jd $$2 = jd.a($$0.s.dv(), $$0.s.dz(), $$0.s.dB());
      float $$3 = ges.a($$0.s.dQ().D_(), $$0.s.dQ().A($$2));
      RenderSystem.enableBlend();
      RenderSystem.setShaderColor($$3, $$3, $$3, 0.1F);
      float $$4 = 4.0F;
      float $$5 = -1.0F;
      float $$6 = 1.0F;
      float $$7 = -1.0F;
      float $$8 = 1.0F;
      float $$9 = -0.5F;
      float $$10 = -$$0.s.dG() / 64.0F;
      float $$11 = $$0.s.dI() / 64.0F;
      Matrix4f $$12 = $$1.c().a();
      fax $$13 = fbe.b().a(fbh.c.h, fba.i);
      $$13.a($$12, -1.0F, -1.0F, -0.5F).a(4.0F + $$10, 4.0F + $$11);
      $$13.a($$12, 1.0F, -1.0F, -0.5F).a(0.0F + $$10, 4.0F + $$11);
      $$13.a($$12, 1.0F, 1.0F, -0.5F).a(0.0F + $$10, 0.0F + $$11);
      $$13.a($$12, -1.0F, 1.0F, -0.5F).a(4.0F + $$10, 0.0F + $$11);
      fay.a($$13.b());
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.disableBlend();
   }

   private static void c(fgi $$0, fbc $$1) {
      RenderSystem.setShader(gem::r);
      RenderSystem.depthFunc(519);
      RenderSystem.depthMask(false);
      RenderSystem.enableBlend();
      gqf $$2 = gsl.b.c();
      RenderSystem.setShaderTexture(0, $$2.i());
      float $$3 = $$2.c();
      float $$4 = $$2.d();
      float $$5 = ($$3 + $$4) / 2.0F;
      float $$6 = $$2.g();
      float $$7 = $$2.h();
      float $$8 = ($$6 + $$7) / 2.0F;
      float $$9 = $$2.k();
      float $$10 = ayn.i($$9, $$3, $$5);
      float $$11 = ayn.i($$9, $$4, $$5);
      float $$12 = ayn.i($$9, $$6, $$8);
      float $$13 = ayn.i($$9, $$7, $$8);
      float $$14 = 1.0F;

      for (int $$15 = 0; $$15 < 2; $$15++) {
         $$1.a();
         float $$16 = -0.5F;
         float $$17 = 0.5F;
         float $$18 = -0.5F;
         float $$19 = 0.5F;
         float $$20 = -0.5F;
         $$1.a((float)(-($$15 * 2 - 1)) * 0.24F, -0.3F, 0.0F);
         $$1.a(a.d.rotationDegrees((float)($$15 * 2 - 1) * 10.0F));
         Matrix4f $$21 = $$1.c().a();
         fax $$22 = fbe.b().a(fbh.c.h, fba.j);
         $$22.a($$21, -0.5F, -0.5F, -0.5F).a($$11, $$13).a(1.0F, 1.0F, 1.0F, 0.9F);
         $$22.a($$21, 0.5F, -0.5F, -0.5F).a($$10, $$13).a(1.0F, 1.0F, 1.0F, 0.9F);
         $$22.a($$21, 0.5F, 0.5F, -0.5F).a($$10, $$12).a(1.0F, 1.0F, 1.0F, 0.9F);
         $$22.a($$21, -0.5F, 0.5F, -0.5F).a($$11, $$12).a(1.0F, 1.0F, 1.0F, 0.9F);
         fay.a($$22.b());
         $$1.b();
      }

      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
      RenderSystem.depthFunc(515);
   }
}
