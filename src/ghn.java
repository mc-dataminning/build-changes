import com.mojang.blaze3d.systems.RenderSystem;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Vector3f;

public class ghn {
   private static final alb a = alb.b("textures/environment/sun.png");
   private static final alb b = alb.b("textures/environment/moon_phases.png");
   private static final alb c = alb.b("textures/environment/end_sky.png");
   private static final float d = 512.0F;
   private final fcx e = this.a();
   private final fcx f = this.b();
   private final fcx g = this.c();

   private fcx a() {
      fcx $$0 = new fcx(fcx.a.a);
      $$0.a();
      $$0.a(this.a(fcw.b()));
      fcx.b();
      return $$0;
   }

   private fcx b() {
      fcx $$0 = new fcx(fcx.a.a);
      $$0.a();
      $$0.a(this.a(fcw.b(), 16.0F));
      fcx.b();
      return $$0;
   }

   private fcx c() {
      fcx $$0 = new fcx(fcx.a.a);
      $$0.a();
      $$0.a(this.a(fcw.b(), -16.0F));
      fcx.b();
      return $$0;
   }

   private fct a(fcw $$0) {
      azk $$1 = azk.a(10842L);
      int $$2 = 1500;
      float $$3 = 100.0F;
      fcp $$4 = $$0.a(fcz.c.h, fcs.e);

      for (int $$5 = 0; $$5 < 1500; $$5++) {
         float $$6 = $$1.i() * 2.0F - 1.0F;
         float $$7 = $$1.i() * 2.0F - 1.0F;
         float $$8 = $$1.i() * 2.0F - 1.0F;
         float $$9 = 0.15F + $$1.i() * 0.1F;
         float $$10 = azc.k($$6, $$7, $$8);
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

   private fct a(fcw $$0, float $$1) {
      float $$2 = Math.signum($$1) * 512.0F;
      fcp $$3 = $$0.a(fcz.c.g, fcs.e);
      $$3.a(0.0F, $$1, 0.0F);

      for (int $$4 = -180; $$4 <= 180; $$4 += 45) {
         $$3.a($$2 * azc.b((float)$$4 * (float) (Math.PI / 180.0)), $$1, 512.0F * azc.a((float)$$4 * (float) (Math.PI / 180.0)));
      }

      return $$3.b();
   }

   public void a(float $$0, float $$1, float $$2) {
      RenderSystem.depthMask(false);
      RenderSystem.setShaderColor($$0, $$1, $$2, 1.0F);
      this.f.a();
      this.f.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), ggl.o());
      fcx.b();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.depthMask(true);
   }

   public void a(fcu $$0) {
      RenderSystem.depthMask(false);
      RenderSystem.setShaderColor(0.0F, 0.0F, 0.0F, 1.0F);
      $$0.a();
      $$0.a(0.0F, 12.0F, 0.0F);
      this.g.a();
      this.g.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), ggl.o());
      fcx.b();
      $$0.b();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.depthMask(true);
   }

   public void a(fcu $$0, fcw $$1, float $$2, int $$3, float $$4, float $$5, ggj $$6) {
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

   private void a(float $$0, fcw $$1, fcu $$2) {
      float $$3 = 30.0F;
      float $$4 = 100.0F;
      fcp $$5 = $$1.a(fcz.c.h, fcs.i);
      Matrix4f $$6 = $$2.c().a();
      RenderSystem.depthMask(false);
      RenderSystem.overlayBlendFunc();
      RenderSystem.setShader(ggl::q);
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, $$0);
      RenderSystem.setShaderTexture(0, a);
      RenderSystem.enableBlend();
      $$5.a($$6, -30.0F, 100.0F, -30.0F).a(0.0F, 0.0F);
      $$5.a($$6, 30.0F, 100.0F, -30.0F).a(1.0F, 0.0F);
      $$5.a($$6, 30.0F, 100.0F, 30.0F).a(1.0F, 1.0F);
      $$5.a($$6, -30.0F, 100.0F, 30.0F).a(0.0F, 1.0F);
      fcq.a($$5.b());
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.depthMask(true);
   }

   private void a(int $$0, float $$1, fcw $$2, fcu $$3) {
      float $$4 = 20.0F;
      int $$5 = $$0 % 4;
      int $$6 = $$0 / 4 % 2;
      float $$7 = (float)($$5 + 0) / 4.0F;
      float $$8 = (float)($$6 + 0) / 2.0F;
      float $$9 = (float)($$5 + 1) / 4.0F;
      float $$10 = (float)($$6 + 1) / 2.0F;
      float $$11 = 100.0F;
      fcp $$12 = $$2.a(fcz.c.h, fcs.i);
      RenderSystem.depthMask(false);
      RenderSystem.overlayBlendFunc();
      RenderSystem.setShader(ggl::q);
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, $$1);
      RenderSystem.setShaderTexture(0, b);
      RenderSystem.enableBlend();
      Matrix4f $$13 = $$3.c().a();
      $$12.a($$13, -20.0F, -100.0F, 20.0F).a($$9, $$10);
      $$12.a($$13, 20.0F, -100.0F, 20.0F).a($$7, $$10);
      $$12.a($$13, 20.0F, -100.0F, -20.0F).a($$7, $$8);
      $$12.a($$13, -20.0F, -100.0F, -20.0F).a($$9, $$8);
      fcq.a($$12.b());
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.depthMask(true);
   }

   private void a(ggj $$0, float $$1, fcu $$2) {
      Matrix4fStack $$3 = RenderSystem.getModelViewStack();
      $$3.pushMatrix();
      $$3.mul($$2.c().a());
      RenderSystem.depthMask(false);
      RenderSystem.overlayBlendFunc();
      RenderSystem.setShaderColor($$1, $$1, $$1, $$1);
      RenderSystem.enableBlend();
      RenderSystem.setShaderFog(ggj.a);
      this.e.a();
      this.e.a($$3, RenderSystem.getProjectionMatrix(), ggl.o());
      fcx.b();
      RenderSystem.setShaderFog($$0);
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.depthMask(true);
      $$3.popMatrix();
   }

   public void a(fcu $$0, fcw $$1, float $$2, int $$3) {
      RenderSystem.setShader(ggl::p);
      RenderSystem.depthMask(false);
      RenderSystem.enableBlend();
      $$0.a();
      $$0.a(a.b.rotationDegrees(90.0F));
      float $$4 = azc.a($$2) < 0.0F ? 180.0F : 0.0F;
      $$0.a(a.f.rotationDegrees($$4));
      $$0.a(a.f.rotationDegrees(90.0F));
      Matrix4f $$5 = $$0.c().a();
      fcp $$6 = $$1.a(fcz.c.g, fcs.f);
      float $$7 = axn.h(axn.a($$3));
      $$6.a($$5, 0.0F, 100.0F, 0.0F).a($$3);
      int $$8 = axn.g($$3);
      int $$9 = 16;

      for (int $$10 = 0; $$10 <= 16; $$10++) {
         float $$11 = (float)$$10 * (float) (Math.PI * 2) / 16.0F;
         float $$12 = azc.a($$11);
         float $$13 = azc.b($$11);
         $$6.a($$5, $$12 * 120.0F, $$13 * 120.0F, -$$13 * 40.0F * $$7).a($$8);
      }

      fcq.a($$6.b());
      $$0.b();
      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
   }

   public void b(fcu $$0) {
      RenderSystem.enableBlend();
      RenderSystem.depthMask(false);
      RenderSystem.setShader(ggl::r);
      RenderSystem.setShaderTexture(0, c);
      fcw $$1 = fcw.b();

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
         fcp $$4 = $$1.a(fcz.c.h, fcs.j);
         $$4.a($$3, -100.0F, -100.0F, -100.0F).a(0.0F, 0.0F).a(-14145496);
         $$4.a($$3, -100.0F, -100.0F, 100.0F).a(0.0F, 16.0F).a(-14145496);
         $$4.a($$3, 100.0F, -100.0F, 100.0F).a(16.0F, 16.0F).a(-14145496);
         $$4.a($$3, 100.0F, -100.0F, -100.0F).a(16.0F, 0.0F).a(-14145496);
         fcq.a($$4.b());
         $$0.b();
      }

      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
   }
}
