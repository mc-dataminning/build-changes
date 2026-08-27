import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class gfq {
   private static final akt a = new akt("textures/misc/underwater.png");

   public static void a(fgj $$0, fbc $$1) {
      cly $$2 = $$0.s;
      if (!$$2.ah) {
         dtc $$3 = a($$2);
         if ($$3 != null) {
            a($$0.ap().a().a($$3), $$1);
         }
      }

      if (!$$0.s.O_()) {
         if ($$0.s.a(awj.a)) {
            b($$0, $$1);
         }

         if ($$0.s.bV()) {
            c($$0, $$1);
         }
      }
   }

   @Nullable
   private static dtc a(cly $$0) {
      ir.a $$1 = new ir.a();

      for (int $$2 = 0; $$2 < 8; $$2++) {
         double $$3 = $$0.dz() + (double)(((float)(($$2 >> 0) % 2) - 0.5F) * $$0.do() * 0.8F);
         double $$4 = $$0.dD() + (double)(((float)(($$2 >> 1) % 2) - 0.5F) * 0.1F * $$0.em());
         double $$5 = $$0.dF() + (double)(((float)(($$2 >> 2) % 2) - 0.5F) * $$0.do() * 0.8F);
         $$1.b($$3, $$4, $$5);
         dtc $$6 = $$0.dU().a_($$1);
         if ($$6.l() != dlw.a && $$6.p($$0.dU(), $$1)) {
            return $$6;
         }
      }

      return null;
   }

   private static void a(gqy $$0, fbc $$1) {
      RenderSystem.setShaderTexture(0, $$0.i());
      RenderSystem.setShader(gez::r);
      fax $$2 = fbe.b().d();
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
      $$2.a(fbh.b.h, fba.r);
      $$2.a($$13, -1.0F, -1.0F, -0.5F).a(0.1F, 0.1F, 0.1F, 1.0F).a($$10, $$12).e();
      $$2.a($$13, 1.0F, -1.0F, -0.5F).a(0.1F, 0.1F, 0.1F, 1.0F).a($$9, $$12).e();
      $$2.a($$13, 1.0F, 1.0F, -0.5F).a(0.1F, 0.1F, 0.1F, 1.0F).a($$9, $$11).e();
      $$2.a($$13, -1.0F, 1.0F, -0.5F).a(0.1F, 0.1F, 0.1F, 1.0F).a($$10, $$11).e();
      fay.a($$2.d());
   }

   private static void b(fgj $$0, fbc $$1) {
      RenderSystem.setShader(gez::s);
      RenderSystem.setShaderTexture(0, a);
      fax $$2 = fbe.b().d();
      ir $$3 = ir.a($$0.s.dz(), $$0.s.dD(), $$0.s.dF());
      float $$4 = gff.a($$0.s.dU().E_(), $$0.s.dU().A($$3));
      RenderSystem.enableBlend();
      RenderSystem.setShaderColor($$4, $$4, $$4, 0.1F);
      float $$5 = 4.0F;
      float $$6 = -1.0F;
      float $$7 = 1.0F;
      float $$8 = -1.0F;
      float $$9 = 1.0F;
      float $$10 = -0.5F;
      float $$11 = -$$0.s.dK() / 64.0F;
      float $$12 = $$0.s.dM() / 64.0F;
      Matrix4f $$13 = $$1.c().a();
      $$2.a(fbh.b.h, fba.q);
      $$2.a($$13, -1.0F, -1.0F, -0.5F).a(4.0F + $$11, 4.0F + $$12).e();
      $$2.a($$13, 1.0F, -1.0F, -0.5F).a(0.0F + $$11, 4.0F + $$12).e();
      $$2.a($$13, 1.0F, 1.0F, -0.5F).a(0.0F + $$11, 0.0F + $$12).e();
      $$2.a($$13, -1.0F, 1.0F, -0.5F).a(4.0F + $$11, 0.0F + $$12).e();
      fay.a($$2.d());
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.disableBlend();
   }

   private static void c(fgj $$0, fbc $$1) {
      fax $$2 = fbe.b().d();
      RenderSystem.setShader(gez::r);
      RenderSystem.depthFunc(519);
      RenderSystem.depthMask(false);
      RenderSystem.enableBlend();
      gqy $$3 = gte.b.c();
      RenderSystem.setShaderTexture(0, $$3.i());
      float $$4 = $$3.c();
      float $$5 = $$3.d();
      float $$6 = ($$4 + $$5) / 2.0F;
      float $$7 = $$3.g();
      float $$8 = $$3.h();
      float $$9 = ($$7 + $$8) / 2.0F;
      float $$10 = $$3.k();
      float $$11 = aym.i($$10, $$4, $$6);
      float $$12 = aym.i($$10, $$5, $$6);
      float $$13 = aym.i($$10, $$7, $$9);
      float $$14 = aym.i($$10, $$8, $$9);
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
         $$2.a(fbh.b.h, fba.r);
         $$2.a($$22, -0.5F, -0.5F, -0.5F).a(1.0F, 1.0F, 1.0F, 0.9F).a($$12, $$14).e();
         $$2.a($$22, 0.5F, -0.5F, -0.5F).a(1.0F, 1.0F, 1.0F, 0.9F).a($$11, $$14).e();
         $$2.a($$22, 0.5F, 0.5F, -0.5F).a(1.0F, 1.0F, 1.0F, 0.9F).a($$11, $$13).e();
         $$2.a($$22, -0.5F, 0.5F, -0.5F).a(1.0F, 1.0F, 1.0F, 0.9F).a($$12, $$13).e();
         fay.a($$2.d());
         $$1.b();
      }

      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
      RenderSystem.depthFunc(515);
   }
}
