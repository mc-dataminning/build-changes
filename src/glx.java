import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class glx {
   private static final alz a = alz.b("textures/misc/underwater.png");

   public static void a(fmg $$0, fgs $$1) {
      cpx $$2 = $$0.t;
      if (!$$2.ad) {
         dxv $$3 = a($$2);
         if ($$3 != null) {
            a($$0.ap().a().a($$3), $$1);
         }
      }

      if (!$$0.t.aa_()) {
         if ($$0.t.a(aya.a)) {
            b($$0, $$1);
         }

         if ($$0.t.bY()) {
            c($$0, $$1);
         }
      }
   }

   @Nullable
   private static dxv a(cpx $$0) {
      jh.a $$1 = new jh.a();

      for (int $$2 = 0; $$2 < 8; $$2++) {
         double $$3 = $$0.dB() + (double)(((float)(($$2 >> 0) % 2) - 0.5F) * $$0.dr() * 0.8F);
         double $$4 = $$0.dF() + (double)(((float)(($$2 >> 1) % 2) - 0.5F) * 0.1F * $$0.ek());
         double $$5 = $$0.dH() + (double)(((float)(($$2 >> 2) % 2) - 0.5F) * $$0.dr() * 0.8F);
         $$1.b($$3, $$4, $$5);
         dxv $$6 = $$0.dW().a_($$1);
         if ($$6.o() != dqv.a && $$6.k($$0.dW(), $$1)) {
            return $$6;
         }
      }

      return null;
   }

   private static void a(hbl $$0, fgs $$1) {
      RenderSystem.setShaderTexture(0, $$0.i());
      RenderSystem.setShader(gkv.i);
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
      fgn $$13 = fgu.b().a(fgx.c.h, fgq.j);
      $$13.a($$12, -1.0F, -1.0F, -0.5F).a($$9, $$11).a(0.1F, 0.1F, 0.1F, 1.0F);
      $$13.a($$12, 1.0F, -1.0F, -0.5F).a($$8, $$11).a(0.1F, 0.1F, 0.1F, 1.0F);
      $$13.a($$12, 1.0F, 1.0F, -0.5F).a($$8, $$10).a(0.1F, 0.1F, 0.1F, 1.0F);
      $$13.a($$12, -1.0F, 1.0F, -0.5F).a($$9, $$10).a(0.1F, 0.1F, 0.1F, 1.0F);
      fgo.a($$13.b());
   }

   private static void b(fmg $$0, fgs $$1) {
      RenderSystem.setShader(gkv.h);
      RenderSystem.setShaderTexture(0, a);
      jh $$2 = jh.a($$0.t.dB(), $$0.t.dF(), $$0.t.dH());
      float $$3 = glj.a($$0.t.dW().G_(), $$0.t.dW().A($$2));
      RenderSystem.enableBlend();
      RenderSystem.setShaderColor($$3, $$3, $$3, 0.1F);
      float $$4 = 4.0F;
      float $$5 = -1.0F;
      float $$6 = 1.0F;
      float $$7 = -1.0F;
      float $$8 = 1.0F;
      float $$9 = -0.5F;
      float $$10 = -$$0.t.dM() / 64.0F;
      float $$11 = $$0.t.dO() / 64.0F;
      Matrix4f $$12 = $$1.c().a();
      fgn $$13 = fgu.b().a(fgx.c.h, fgq.i);
      $$13.a($$12, -1.0F, -1.0F, -0.5F).a(4.0F + $$10, 4.0F + $$11);
      $$13.a($$12, 1.0F, -1.0F, -0.5F).a(0.0F + $$10, 4.0F + $$11);
      $$13.a($$12, 1.0F, 1.0F, -0.5F).a(0.0F + $$10, 0.0F + $$11);
      $$13.a($$12, -1.0F, 1.0F, -0.5F).a(4.0F + $$10, 0.0F + $$11);
      fgo.a($$13.b());
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.disableBlend();
   }

   private static void c(fmg $$0, fgs $$1) {
      RenderSystem.setShader(gkv.i);
      RenderSystem.depthFunc(519);
      RenderSystem.depthMask(false);
      RenderSystem.enableBlend();
      hbl $$2 = hdx.b.c();
      RenderSystem.setShaderTexture(0, $$2.i());
      float $$3 = $$2.c();
      float $$4 = $$2.d();
      float $$5 = ($$3 + $$4) / 2.0F;
      float $$6 = $$2.g();
      float $$7 = $$2.h();
      float $$8 = ($$6 + $$7) / 2.0F;
      float $$9 = $$2.k();
      float $$10 = bae.h($$9, $$3, $$5);
      float $$11 = bae.h($$9, $$4, $$5);
      float $$12 = bae.h($$9, $$6, $$8);
      float $$13 = bae.h($$9, $$7, $$8);
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
         fgn $$22 = fgu.b().a(fgx.c.h, fgq.j);
         $$22.a($$21, -0.5F, -0.5F, -0.5F).a($$11, $$13).a(1.0F, 1.0F, 1.0F, 0.9F);
         $$22.a($$21, 0.5F, -0.5F, -0.5F).a($$10, $$13).a(1.0F, 1.0F, 1.0F, 0.9F);
         $$22.a($$21, 0.5F, 0.5F, -0.5F).a($$10, $$12).a(1.0F, 1.0F, 1.0F, 0.9F);
         $$22.a($$21, -0.5F, 0.5F, -0.5F).a($$11, $$12).a(1.0F, 1.0F, 1.0F, 0.9F);
         fgo.a($$22.b());
         $$1.b();
      }

      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
      RenderSystem.depthFunc(515);
   }
}
