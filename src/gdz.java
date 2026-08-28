import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class gdz {
   private static final alf a = new alf("textures/misc/underwater.png");

   public static void a(ffg $$0, ezz $$1) {
      cmy $$2 = $$0.s;
      if (!$$2.ag) {
         dsd $$3 = a($$2);
         if ($$3 != null) {
            a($$0.ao().a().a($$3), $$1);
         }
      }

      if (!$$0.s.N_()) {
         if ($$0.s.a(awv.a)) {
            b($$0, $$1);
         }

         if ($$0.s.bQ()) {
            c($$0, $$1);
         }
      }
   }

   @Nullable
   private static dsd a(cmy $$0) {
      iz.a $$1 = new iz.a();

      for (int $$2 = 0; $$2 < 8; $$2++) {
         double $$3 = $$0.du() + (double)(((float)(($$2 >> 0) % 2) - 0.5F) * $$0.dj() * 0.8F);
         double $$4 = $$0.dy() + (double)(((float)(($$2 >> 1) % 2) - 0.5F) * 0.1F * $$0.ee());
         double $$5 = $$0.dA() + (double)(((float)(($$2 >> 2) % 2) - 0.5F) * $$0.dj() * 0.8F);
         $$1.b($$3, $$4, $$5);
         dsd $$6 = $$0.dP().a_($$1);
         if ($$6.l() != dlg.a && $$6.p($$0.dP(), $$1)) {
            return $$6;
         }
      }

      return null;
   }

   private static void a(gpa $$0, ezz $$1) {
      RenderSystem.setShaderTexture(0, $$0.i());
      RenderSystem.setShader(gdi::q);
      ezu $$2 = fab.b().d();
      float $$3 = 0.1F;
      float $$4 = -1.0F;
      float $$5 = 1.0F;
      float $$6 = -1.0F;
      float $$7 = 1.0F;
      float $$8 = -0.5F;
      float $$9 = $$0.c();
      float $$10 = $$0.d();
      float $$11 = $$0.g();
      float $$12 = $$0.h();
      Matrix4f $$13 = $$1.c().a();
      $$2.a(fae.b.h, ezx.r);
      $$2.a($$13, -1.0F, -1.0F, -0.5F).a(0.1F, 0.1F, 0.1F, 1.0F).a($$10, $$12).e();
      $$2.a($$13, 1.0F, -1.0F, -0.5F).a(0.1F, 0.1F, 0.1F, 1.0F).a($$9, $$12).e();
      $$2.a($$13, 1.0F, 1.0F, -0.5F).a(0.1F, 0.1F, 0.1F, 1.0F).a($$9, $$11).e();
      $$2.a($$13, -1.0F, 1.0F, -0.5F).a(0.1F, 0.1F, 0.1F, 1.0F).a($$10, $$11).e();
      ezv.a($$2.d());
   }

   private static void b(ffg $$0, ezz $$1) {
      RenderSystem.setShader(gdi::r);
      RenderSystem.setShaderTexture(0, a);
      ezu $$2 = fab.b().d();
      iz $$3 = iz.a($$0.s.du(), $$0.s.dy(), $$0.s.dA());
      float $$4 = gdo.a($$0.s.dP().D_(), $$0.s.dP().A($$3));
      RenderSystem.enableBlend();
      RenderSystem.setShaderColor($$4, $$4, $$4, 0.1F);
      float $$5 = 4.0F;
      float $$6 = -1.0F;
      float $$7 = 1.0F;
      float $$8 = -1.0F;
      float $$9 = 1.0F;
      float $$10 = -0.5F;
      float $$11 = -$$0.s.dF() / 64.0F;
      float $$12 = $$0.s.dH() / 64.0F;
      Matrix4f $$13 = $$1.c().a();
      $$2.a(fae.b.h, ezx.q);
      $$2.a($$13, -1.0F, -1.0F, -0.5F).a(4.0F + $$11, 4.0F + $$12).e();
      $$2.a($$13, 1.0F, -1.0F, -0.5F).a(0.0F + $$11, 4.0F + $$12).e();
      $$2.a($$13, 1.0F, 1.0F, -0.5F).a(0.0F + $$11, 0.0F + $$12).e();
      $$2.a($$13, -1.0F, 1.0F, -0.5F).a(4.0F + $$11, 0.0F + $$12).e();
      ezv.a($$2.d());
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.disableBlend();
   }

   private static void c(ffg $$0, ezz $$1) {
      ezu $$2 = fab.b().d();
      RenderSystem.setShader(gdi::q);
      RenderSystem.depthFunc(519);
      RenderSystem.depthMask(false);
      RenderSystem.enableBlend();
      gpa $$3 = grg.b.c();
      RenderSystem.setShaderTexture(0, $$3.i());
      float $$4 = $$3.c();
      float $$5 = $$3.d();
      float $$6 = ($$4 + $$5) / 2.0F;
      float $$7 = $$3.g();
      float $$8 = $$3.h();
      float $$9 = ($$7 + $$8) / 2.0F;
      float $$10 = $$3.k();
      float $$11 = ayz.i($$10, $$4, $$6);
      float $$12 = ayz.i($$10, $$5, $$6);
      float $$13 = ayz.i($$10, $$7, $$9);
      float $$14 = ayz.i($$10, $$8, $$9);
      float $$15 = 1.0F;

      for (int $$16 = 0; $$16 < 2; $$16++) {
         $$1.a();
         float $$17 = -0.5F;
         float $$18 = 0.5F;
         float $$19 = -0.5F;
         float $$20 = 0.5F;
         float $$21 = -0.5F;
         $$1.a((float)(-($$16 * 2 - 1)) * 0.24F, -0.3F, 0.0F);
         $$1.a(a.d.rotationDegrees((float)($$16 * 2 - 1) * 10.0F));
         Matrix4f $$22 = $$1.c().a();
         $$2.a(fae.b.h, ezx.r);
         $$2.a($$22, -0.5F, -0.5F, -0.5F).a(1.0F, 1.0F, 1.0F, 0.9F).a($$12, $$14).e();
         $$2.a($$22, 0.5F, -0.5F, -0.5F).a(1.0F, 1.0F, 1.0F, 0.9F).a($$11, $$14).e();
         $$2.a($$22, 0.5F, 0.5F, -0.5F).a(1.0F, 1.0F, 1.0F, 0.9F).a($$11, $$13).e();
         $$2.a($$22, -0.5F, 0.5F, -0.5F).a(1.0F, 1.0F, 1.0F, 0.9F).a($$12, $$13).e();
         ezv.a($$2.d());
         $$1.b();
      }

      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
      RenderSystem.depthFunc(515);
   }
}
