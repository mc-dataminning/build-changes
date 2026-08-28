import com.mojang.blaze3d.systems.RenderSystem;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Vector3f;

public class gma implements AutoCloseable {
   private static final alz a = alz.b("textures/environment/sun.png");
   private static final alz b = alz.b("textures/environment/moon_phases.png");
   private static final alz c = alz.b("textures/environment/end_sky.png");
   private static final float d = 512.0F;
   private final fgo e = this.a();
   private final fgo f = this.b();
   private final fgo g = this.c();

   private fgo a() {
      fgo $$0 = new fgo(fef.b);
      $$0.a();
      $$0.a(this.a(fgn.b()));
      fgo.b();
      return $$0;
   }

   private fgo b() {
      fgo $$0 = new fgo(fef.b);
      $$0.a();
      $$0.a(this.a(fgn.b(), 16.0F));
      fgo.b();
      return $$0;
   }

   private fgo c() {
      fgo $$0 = new fgo(fef.b);
      $$0.a();
      $$0.a(this.a(fgn.b(), -16.0F));
      fgo.b();
      return $$0;
   }

   private fgk a(fgn $$0) {
      bam $$1 = bam.a(10842L);
      int $$2 = 1500;
      float $$3 = 100.0F;
      fgg $$4 = $$0.a(fgq.c.h, fgj.e);

      for (int $$5 = 0; $$5 < 1500; $$5++) {
         float $$6 = $$1.i() * 2.0F - 1.0F;
         float $$7 = $$1.i() * 2.0F - 1.0F;
         float $$8 = $$1.i() * 2.0F - 1.0F;
         float $$9 = 0.15F + $$1.i() * 0.1F;
         float $$10 = bae.k($$6, $$7, $$8);
         if (!($$10 <= 0.010000001F) && !($$10 >= 1.0F)) {
            Vector3f $$11 = new Vector3f($$6, $$7, $$8).normalize(100.0F);
            float $$12 = (float)($$1.j() * (float) Math.PI * 2.0);
            Matrix3f $$13 = new Matrix3f().rotateTowards(new Vector3f($$11).negate(), new Vector3f(0.0F, 1.0F, 0.0F)).rotateZ(-$$12);
            $$4.a(new Vector3f($$9, -$$9, 0.0F).mul($$13).add($$11));
            $$4.a(new Vector3f($$9, $$9, 0.0F).mul($$13).add($$11));
            $$4.a(new Vector3f(-$$9, $$9, 0.0F).mul($$13).add($$11));
            $$4.a(new Vector3f(-$$9, -$$9, 0.0F).mul($$13).add($$11));
         }
      }

      return $$4.b();
   }

   private fgk a(fgn $$0, float $$1) {
      float $$2 = Math.signum($$1) * 512.0F;
      fgg $$3 = $$0.a(fgq.c.g, fgj.e);
      $$3.a(0.0F, $$1, 0.0F);

      for (int $$4 = -180; $$4 <= 180; $$4 += 45) {
         $$3.a($$2 * bae.b((float)$$4 * (float) (Math.PI / 180.0)), $$1, 512.0F * bae.a((float)$$4 * (float) (Math.PI / 180.0)));
      }

      return $$3.b();
   }

   public void a(float $$0, float $$1, float $$2) {
      RenderSystem.depthMask(false);
      RenderSystem.setShader(gko.d);
      RenderSystem.setShaderColor($$0, $$1, $$2, 1.0F);
      this.f.a();
      this.f.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
      fgo.b();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.depthMask(true);
   }

   public void a(fgl $$0) {
      RenderSystem.depthMask(false);
      RenderSystem.setShader(gko.d);
      RenderSystem.setShaderColor(0.0F, 0.0F, 0.0F, 1.0F);
      $$0.a();
      $$0.a(0.0F, 12.0F, 0.0F);
      this.g.a();
      this.g.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
      fgo.b();
      $$0.b();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.depthMask(true);
   }

   public void a(fgl $$0, fgn $$1, float $$2, int $$3, float $$4, float $$5, gks $$6) {
      $$0.a();
      $$0.a(a.d.rotationDegrees(-90.0F));
      $$0.a(a.b.rotationDegrees($$2 * 360.0F));
      this.a($$4, $$1, $$0);
      this.a($$3, $$4, $$1, $$0);
      if ($$5 > 0.0F) {
         this.a($$6, $$5, $$0);
      }

      $$0.b();
   }

   private void a(float $$0, fgn $$1, fgl $$2) {
      float $$3 = 30.0F;
      float $$4 = 100.0F;
      fgg $$5 = $$1.a(fgq.c.h, fgj.i);
      Matrix4f $$6 = $$2.c().a();
      RenderSystem.depthMask(false);
      RenderSystem.overlayBlendFunc();
      RenderSystem.setShader(gko.h);
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, $$0);
      RenderSystem.setShaderTexture(0, a);
      RenderSystem.enableBlend();
      $$5.a($$6, -30.0F, 100.0F, -30.0F).a(0.0F, 0.0F);
      $$5.a($$6, 30.0F, 100.0F, -30.0F).a(1.0F, 0.0F);
      $$5.a($$6, 30.0F, 100.0F, 30.0F).a(1.0F, 1.0F);
      $$5.a($$6, -30.0F, 100.0F, 30.0F).a(0.0F, 1.0F);
      fgh.a($$5.b());
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.depthMask(true);
   }

   private void a(int $$0, float $$1, fgn $$2, fgl $$3) {
      float $$4 = 20.0F;
      int $$5 = $$0 % 4;
      int $$6 = $$0 / 4 % 2;
      float $$7 = (float)($$5 + 0) / 4.0F;
      float $$8 = (float)($$6 + 0) / 2.0F;
      float $$9 = (float)($$5 + 1) / 4.0F;
      float $$10 = (float)($$6 + 1) / 2.0F;
      float $$11 = 100.0F;
      fgg $$12 = $$2.a(fgq.c.h, fgj.i);
      RenderSystem.depthMask(false);
      RenderSystem.overlayBlendFunc();
      RenderSystem.setShader(gko.h);
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, $$1);
      RenderSystem.setShaderTexture(0, b);
      RenderSystem.enableBlend();
      Matrix4f $$13 = $$3.c().a();
      $$12.a($$13, -20.0F, -100.0F, 20.0F).a($$9, $$10);
      $$12.a($$13, 20.0F, -100.0F, 20.0F).a($$7, $$10);
      $$12.a($$13, 20.0F, -100.0F, -20.0F).a($$7, $$8);
      $$12.a($$13, -20.0F, -100.0F, -20.0F).a($$9, $$8);
      fgh.a($$12.b());
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.depthMask(true);
   }

   private void a(gks $$0, float $$1, fgl $$2) {
      Matrix4fStack $$3 = RenderSystem.getModelViewStack();
      $$3.pushMatrix();
      $$3.mul($$2.c().a());
      RenderSystem.depthMask(false);
      RenderSystem.overlayBlendFunc();
      RenderSystem.setShader(gko.d);
      RenderSystem.setShaderColor($$1, $$1, $$1, $$1);
      RenderSystem.enableBlend();
      RenderSystem.setShaderFog(gks.a);
      this.e.a();
      this.e.a($$3, RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
      fgo.b();
      RenderSystem.setShaderFog($$0);
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.depthMask(true);
      $$3.popMatrix();
   }

   public void a(fgl $$0, fgn $$1, float $$2, int $$3) {
      RenderSystem.setShader(gko.e);
      RenderSystem.depthMask(false);
      RenderSystem.enableBlend();
      $$0.a();
      $$0.a(a.b.rotationDegrees(90.0F));
      float $$4 = bae.a($$2) < 0.0F ? 180.0F : 0.0F;
      $$0.a(a.f.rotationDegrees($$4));
      $$0.a(a.f.rotationDegrees(90.0F));
      Matrix4f $$5 = $$0.c().a();
      fgg $$6 = $$1.a(fgq.c.g, fgj.f);
      float $$7 = ayp.h(ayp.a($$3));
      $$6.a($$5, 0.0F, 100.0F, 0.0F).a($$3);
      int $$8 = ayp.g($$3);
      int $$9 = 16;

      for (int $$10 = 0; $$10 <= 16; $$10++) {
         float $$11 = (float)$$10 * (float) (Math.PI * 2) / 16.0F;
         float $$12 = bae.a($$11);
         float $$13 = bae.b($$11);
         $$6.a($$5, $$12 * 120.0F, $$13 * 120.0F, -$$13 * 40.0F * $$7).a($$8);
      }

      fgh.a($$6.b());
      $$0.b();
      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
   }

   public void b(fgl $$0) {
      RenderSystem.enableBlend();
      RenderSystem.depthMask(false);
      RenderSystem.setShader(gko.i);
      RenderSystem.setShaderTexture(0, c);
      fgn $$1 = fgn.b();

      for (int $$2 = 0; $$2 < 6; $$2++) {
         $$0.a();
         if ($$2 == 1) {
            $$0.a(a.b.rotationDegrees(90.0F));
         }

         if ($$2 == 2) {
            $$0.a(a.b.rotationDegrees(-90.0F));
         }

         if ($$2 == 3) {
            $$0.a(a.b.rotationDegrees(180.0F));
         }

         if ($$2 == 4) {
            $$0.a(a.f.rotationDegrees(90.0F));
         }

         if ($$2 == 5) {
            $$0.a(a.f.rotationDegrees(-90.0F));
         }

         Matrix4f $$3 = $$0.c().a();
         fgg $$4 = $$1.a(fgq.c.h, fgj.j);
         $$4.a($$3, -100.0F, -100.0F, -100.0F).a(0.0F, 0.0F).a(-14145496);
         $$4.a($$3, -100.0F, -100.0F, 100.0F).a(0.0F, 16.0F).a(-14145496);
         $$4.a($$3, 100.0F, -100.0F, 100.0F).a(16.0F, 16.0F).a(-14145496);
         $$4.a($$3, 100.0F, -100.0F, -100.0F).a(16.0F, 0.0F).a(-14145496);
         fgh.a($$4.b());
         $$0.b();
      }

      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
   }

   @Override
   public void close() {
      this.e.close();
      this.f.close();
      this.g.close();
   }
}
