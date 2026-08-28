import com.mojang.blaze3d.systems.RenderSystem;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Vector3f;

public class gih implements AutoCloseable {
   private static final ale a = ale.b("textures/environment/sun.png");
   private static final ale b = ale.b("textures/environment/moon_phases.png");
   private static final ale c = ale.b("textures/environment/end_sky.png");
   private static final float d = 512.0F;
   private final fdl e = this.a();
   private final fdl f = this.b();
   private final fdl g = this.c();

   private fdl a() {
      fdl $$0 = new fdl(fdl.a.a);
      $$0.a();
      $$0.a(this.a(fdk.b()));
      fdl.b();
      return $$0;
   }

   private fdl b() {
      fdl $$0 = new fdl(fdl.a.a);
      $$0.a();
      $$0.a(this.a(fdk.b(), 16.0F));
      fdl.b();
      return $$0;
   }

   private fdl c() {
      fdl $$0 = new fdl(fdl.a.a);
      $$0.a();
      $$0.a(this.a(fdk.b(), -16.0F));
      fdl.b();
      return $$0;
   }

   private fdh a(fdk $$0) {
      azn $$1 = azn.a(10842L);
      int $$2 = 1500;
      float $$3 = 100.0F;
      fdd $$4 = $$0.a(fdn.c.h, fdg.e);

      for (int $$5 = 0; $$5 < 1500; $$5++) {
         float $$6 = $$1.i() * 2.0F - 1.0F;
         float $$7 = $$1.i() * 2.0F - 1.0F;
         float $$8 = $$1.i() * 2.0F - 1.0F;
         float $$9 = 0.15F + $$1.i() * 0.1F;
         float $$10 = azf.k($$6, $$7, $$8);
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

   private fdh a(fdk $$0, float $$1) {
      float $$2 = Math.signum($$1) * 512.0F;
      fdd $$3 = $$0.a(fdn.c.g, fdg.e);
      $$3.a(0.0F, $$1, 0.0F);

      for (int $$4 = -180; $$4 <= 180; $$4 += 45) {
         $$3.a($$2 * azf.b((float)$$4 * (float) (Math.PI / 180.0)), $$1, 512.0F * azf.a((float)$$4 * (float) (Math.PI / 180.0)));
      }

      return $$3.b();
   }

   public void a(float $$0, float $$1, float $$2) {
      RenderSystem.depthMask(false);
      RenderSystem.setShader(ggv.d);
      RenderSystem.setShaderColor($$0, $$1, $$2, 1.0F);
      this.f.a();
      this.f.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
      fdl.b();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.depthMask(true);
   }

   public void a(fdi $$0) {
      RenderSystem.depthMask(false);
      RenderSystem.setShader(ggv.d);
      RenderSystem.setShaderColor(0.0F, 0.0F, 0.0F, 1.0F);
      $$0.a();
      $$0.a(0.0F, 12.0F, 0.0F);
      this.g.a();
      this.g.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
      fdl.b();
      $$0.b();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.depthMask(true);
   }

   public void a(fdi $$0, fdk $$1, float $$2, int $$3, float $$4, float $$5, ggz $$6) {
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

   private void a(float $$0, fdk $$1, fdi $$2) {
      float $$3 = 30.0F;
      float $$4 = 100.0F;
      fdd $$5 = $$1.a(fdn.c.h, fdg.i);
      Matrix4f $$6 = $$2.c().a();
      RenderSystem.depthMask(false);
      RenderSystem.overlayBlendFunc();
      RenderSystem.setShader(ggv.h);
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, $$0);
      RenderSystem.setShaderTexture(0, a);
      RenderSystem.enableBlend();
      $$5.a($$6, -30.0F, 100.0F, -30.0F).a(0.0F, 0.0F);
      $$5.a($$6, 30.0F, 100.0F, -30.0F).a(1.0F, 0.0F);
      $$5.a($$6, 30.0F, 100.0F, 30.0F).a(1.0F, 1.0F);
      $$5.a($$6, -30.0F, 100.0F, 30.0F).a(0.0F, 1.0F);
      fde.a($$5.b());
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.depthMask(true);
   }

   private void a(int $$0, float $$1, fdk $$2, fdi $$3) {
      float $$4 = 20.0F;
      int $$5 = $$0 % 4;
      int $$6 = $$0 / 4 % 2;
      float $$7 = (float)($$5 + 0) / 4.0F;
      float $$8 = (float)($$6 + 0) / 2.0F;
      float $$9 = (float)($$5 + 1) / 4.0F;
      float $$10 = (float)($$6 + 1) / 2.0F;
      float $$11 = 100.0F;
      fdd $$12 = $$2.a(fdn.c.h, fdg.i);
      RenderSystem.depthMask(false);
      RenderSystem.overlayBlendFunc();
      RenderSystem.setShader(ggv.h);
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, $$1);
      RenderSystem.setShaderTexture(0, b);
      RenderSystem.enableBlend();
      Matrix4f $$13 = $$3.c().a();
      $$12.a($$13, -20.0F, -100.0F, 20.0F).a($$9, $$10);
      $$12.a($$13, 20.0F, -100.0F, 20.0F).a($$7, $$10);
      $$12.a($$13, 20.0F, -100.0F, -20.0F).a($$7, $$8);
      $$12.a($$13, -20.0F, -100.0F, -20.0F).a($$9, $$8);
      fde.a($$12.b());
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.depthMask(true);
   }

   private void a(ggz $$0, float $$1, fdi $$2) {
      Matrix4fStack $$3 = RenderSystem.getModelViewStack();
      $$3.pushMatrix();
      $$3.mul($$2.c().a());
      RenderSystem.depthMask(false);
      RenderSystem.overlayBlendFunc();
      RenderSystem.setShader(ggv.d);
      RenderSystem.setShaderColor($$1, $$1, $$1, $$1);
      RenderSystem.enableBlend();
      RenderSystem.setShaderFog(ggz.a);
      this.e.a();
      this.e.a($$3, RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
      fdl.b();
      RenderSystem.setShaderFog($$0);
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.depthMask(true);
      $$3.popMatrix();
   }

   public void a(fdi $$0, fdk $$1, float $$2, int $$3) {
      RenderSystem.setShader(ggv.e);
      RenderSystem.depthMask(false);
      RenderSystem.enableBlend();
      $$0.a();
      $$0.a(a.b.rotationDegrees(90.0F));
      float $$4 = azf.a($$2) < 0.0F ? 180.0F : 0.0F;
      $$0.a(a.f.rotationDegrees($$4));
      $$0.a(a.f.rotationDegrees(90.0F));
      Matrix4f $$5 = $$0.c().a();
      fdd $$6 = $$1.a(fdn.c.g, fdg.f);
      float $$7 = axq.h(axq.a($$3));
      $$6.a($$5, 0.0F, 100.0F, 0.0F).a($$3);
      int $$8 = axq.g($$3);
      int $$9 = 16;

      for (int $$10 = 0; $$10 <= 16; $$10++) {
         float $$11 = (float)$$10 * (float) (Math.PI * 2) / 16.0F;
         float $$12 = azf.a($$11);
         float $$13 = azf.b($$11);
         $$6.a($$5, $$12 * 120.0F, $$13 * 120.0F, -$$13 * 40.0F * $$7).a($$8);
      }

      fde.a($$6.b());
      $$0.b();
      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
   }

   public void b(fdi $$0) {
      RenderSystem.enableBlend();
      RenderSystem.depthMask(false);
      RenderSystem.setShader(ggv.i);
      RenderSystem.setShaderTexture(0, c);
      fdk $$1 = fdk.b();

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
         fdd $$4 = $$1.a(fdn.c.h, fdg.j);
         $$4.a($$3, -100.0F, -100.0F, -100.0F).a(0.0F, 0.0F).a(-14145496);
         $$4.a($$3, -100.0F, -100.0F, 100.0F).a(0.0F, 16.0F).a(-14145496);
         $$4.a($$3, 100.0F, -100.0F, 100.0F).a(16.0F, 16.0F).a(-14145496);
         $$4.a($$3, 100.0F, -100.0F, -100.0F).a(16.0F, 0.0F).a(-14145496);
         fde.a($$4.b());
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
