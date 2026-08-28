import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;

public class gjy {
   private static final all a = all.b("textures/misc/forcefield.png");

   public void a(dxe $$0, ezr $$1, double $$2, double $$3) {
      double $$4 = $$0.e();
      double $$5 = $$0.g();
      double $$6 = $$0.f();
      double $$7 = $$0.h();
      if (!($$1.d < $$5 - $$2) || !($$1.d > $$4 + $$2) || !($$1.f < $$7 - $$2) || !($$1.f > $$6 + $$2)) {
         double $$8 = 1.0 - $$0.b($$1.d, $$1.f) / $$2;
         $$8 = Math.pow($$8, 4.0);
         $$8 = azn.a($$8, 0.0, 1.0);
         double $$9 = $$1.d;
         double $$10 = $$1.f;
         float $$11 = (float)$$3;
         RenderSystem.enableBlend();
         RenderSystem.enableDepthTest();
         RenderSystem.blendFuncSeparate(
            GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO
         );
         RenderSystem.setShaderTexture(0, a);
         RenderSystem.depthMask(fjx.O());
         int $$12 = $$0.d().a();
         float $$13 = (float)axy.b($$12) / 255.0F;
         float $$14 = (float)axy.c($$12) / 255.0F;
         float $$15 = (float)axy.d($$12) / 255.0F;
         RenderSystem.setShaderColor($$13, $$14, $$15, (float)$$8);
         RenderSystem.setShader(gih.h);
         RenderSystem.polygonOffset(-3.0F, -3.0F);
         RenderSystem.enablePolygonOffset();
         RenderSystem.disableCull();
         float $$16 = (float)(ae.c() % 3000L) / 3000.0F;
         float $$17 = (float)(-azn.e($$1.e * 0.5));
         float $$18 = $$17 + $$11;
         fef $$19 = fem.b().a(fep.c.h, fei.i);
         double $$20 = Math.max((double)azn.a($$10 - $$2), $$6);
         double $$21 = Math.min((double)azn.c($$10 + $$2), $$7);
         float $$22 = (float)(azn.a($$20) & 1) * 0.5F;
         if ($$9 > $$5 - $$2) {
            float $$23 = $$22;

            for (double $$24 = $$20; $$24 < $$21; $$23 += 0.5F) {
               double $$25 = Math.min(1.0, $$21 - $$24);
               float $$26 = (float)$$25 * 0.5F;
               $$19.a((float)($$5 - $$9), -$$11, (float)($$24 - $$10)).a($$16 - $$23, $$16 + $$18);
               $$19.a((float)($$5 - $$9), -$$11, (float)($$24 + $$25 - $$10)).a($$16 - ($$26 + $$23), $$16 + $$18);
               $$19.a((float)($$5 - $$9), $$11, (float)($$24 + $$25 - $$10)).a($$16 - ($$26 + $$23), $$16 + $$17);
               $$19.a((float)($$5 - $$9), $$11, (float)($$24 - $$10)).a($$16 - $$23, $$16 + $$17);
               $$24++;
            }
         }

         if ($$9 < $$4 + $$2) {
            float $$27 = $$22;

            for (double $$28 = $$20; $$28 < $$21; $$27 += 0.5F) {
               double $$29 = Math.min(1.0, $$21 - $$28);
               float $$30 = (float)$$29 * 0.5F;
               $$19.a((float)($$4 - $$9), -$$11, (float)($$28 - $$10)).a($$16 + $$27, $$16 + $$18);
               $$19.a((float)($$4 - $$9), -$$11, (float)($$28 + $$29 - $$10)).a($$16 + $$30 + $$27, $$16 + $$18);
               $$19.a((float)($$4 - $$9), $$11, (float)($$28 + $$29 - $$10)).a($$16 + $$30 + $$27, $$16 + $$17);
               $$19.a((float)($$4 - $$9), $$11, (float)($$28 - $$10)).a($$16 + $$27, $$16 + $$17);
               $$28++;
            }
         }

         $$20 = Math.max((double)azn.a($$9 - $$2), $$4);
         $$21 = Math.min((double)azn.c($$9 + $$2), $$5);
         $$22 = (float)(azn.a($$20) & 1) * 0.5F;
         if ($$10 > $$7 - $$2) {
            float $$31 = $$22;

            for (double $$32 = $$20; $$32 < $$21; $$31 += 0.5F) {
               double $$33 = Math.min(1.0, $$21 - $$32);
               float $$34 = (float)$$33 * 0.5F;
               $$19.a((float)($$32 - $$9), -$$11, (float)($$7 - $$10)).a($$16 + $$31, $$16 + $$18);
               $$19.a((float)($$32 + $$33 - $$9), -$$11, (float)($$7 - $$10)).a($$16 + $$34 + $$31, $$16 + $$18);
               $$19.a((float)($$32 + $$33 - $$9), $$11, (float)($$7 - $$10)).a($$16 + $$34 + $$31, $$16 + $$17);
               $$19.a((float)($$32 - $$9), $$11, (float)($$7 - $$10)).a($$16 + $$31, $$16 + $$17);
               $$32++;
            }
         }

         if ($$10 < $$6 + $$2) {
            float $$35 = $$22;

            for (double $$36 = $$20; $$36 < $$21; $$35 += 0.5F) {
               double $$37 = Math.min(1.0, $$21 - $$36);
               float $$38 = (float)$$37 * 0.5F;
               $$19.a((float)($$36 - $$9), -$$11, (float)($$6 - $$10)).a($$16 - $$35, $$16 + $$18);
               $$19.a((float)($$36 + $$37 - $$9), -$$11, (float)($$6 - $$10)).a($$16 - ($$38 + $$35), $$16 + $$18);
               $$19.a((float)($$36 + $$37 - $$9), $$11, (float)($$6 - $$10)).a($$16 - ($$38 + $$35), $$16 + $$17);
               $$19.a((float)($$36 - $$9), $$11, (float)($$6 - $$10)).a($$16 - $$35, $$16 + $$17);
               $$36++;
            }
         }

         fej $$39 = $$19.a();
         if ($$39 != null) {
            feg.a($$39);
         }

         RenderSystem.enableCull();
         RenderSystem.polygonOffset(0.0F, 0.0F);
         RenderSystem.disablePolygonOffset();
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.depthMask(true);
      }
   }
}
