import com.mojang.blaze3d.systems.RenderSystem;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Vector3f;

public class gmc implements AutoCloseable {
   private static final alp b = alp.b("textures/environment/sun.png");
   private static final alp c = alp.b("textures/environment/moon_phases.png");
   public static final alp a = alp.b("textures/environment/end_sky.png");
   private static final float d = 512.0F;
   private final fgo e = fgo.a(fgq.c.h, fgj.e, this::a);
   private final fgo f = fgo.a(fgq.c.g, fgj.e, $$0 -> this.a($$0, 16.0F));
   private final fgo g = fgo.a(fgq.c.g, fgj.e, $$0 -> this.a($$0, -16.0F));
   private final fgo h = fgo.a(fgq.c.h, fgj.j, this::b);

   private void a(fgp $$0) {
      bac $$1 = bac.a(10842L);
      int $$2 = 1500;
      float $$3 = 100.0F;

      for (int $$4 = 0; $$4 < 1500; $$4++) {
         float $$5 = $$1.i() * 2.0F - 1.0F;
         float $$6 = $$1.i() * 2.0F - 1.0F;
         float $$7 = $$1.i() * 2.0F - 1.0F;
         float $$8 = 0.15F + $$1.i() * 0.1F;
         float $$9 = azu.k($$5, $$6, $$7);
         if (!($$9 <= 0.010000001F) && !($$9 >= 1.0F)) {
            Vector3f $$10 = new Vector3f($$5, $$6, $$7).normalize(100.0F);
            float $$11 = (float)($$1.j() * (float) Math.PI * 2.0);
            Matrix3f $$12 = new Matrix3f().rotateTowards(new Vector3f($$10).negate(), new Vector3f(0.0F, 1.0F, 0.0F)).rotateZ(-$$11);
            $$0.a(new Vector3f($$8, -$$8, 0.0F).mul($$12).add($$10));
            $$0.a(new Vector3f($$8, $$8, 0.0F).mul($$12).add($$10));
            $$0.a(new Vector3f(-$$8, $$8, 0.0F).mul($$12).add($$10));
            $$0.a(new Vector3f(-$$8, -$$8, 0.0F).mul($$12).add($$10));
         }
      }
   }

   private void a(fgp $$0, float $$1) {
      float $$2 = Math.signum($$1) * 512.0F;
      $$0.a(0.0F, $$1, 0.0F);

      for (int $$3 = -180; $$3 <= 180; $$3 += 45) {
         $$0.a($$2 * azu.b((float)$$3 * (float) (Math.PI / 180.0)), $$1, 512.0F * azu.a((float)$$3 * (float) (Math.PI / 180.0)));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      RenderSystem.setShaderColor($$0, $$1, $$2, 1.0F);
      this.f.a(glq.G());
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public void a(fgl $$0) {
      RenderSystem.setShaderColor(0.0F, 0.0F, 0.0F, 1.0F);
      $$0.a();
      $$0.a(0.0F, 12.0F, 0.0F);
      this.g.a(glq.G());
      $$0.b();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public void a(fgl $$0, glg.a $$1, float $$2, int $$3, float $$4, float $$5, gku $$6) {
      $$0.a();
      $$0.a(a.d.rotationDegrees(-90.0F));
      $$0.a(a.b.rotationDegrees($$2 * 360.0F));
      this.a($$4, $$1, $$0);
      this.a($$3, $$4, $$1, $$0);
      $$1.b();
      if ($$5 > 0.0F) {
         this.a($$6, $$5, $$0);
      }

      $$0.b();
   }

   private void a(float $$0, glg $$1, fgl $$2) {
      float $$3 = 30.0F;
      float $$4 = 100.0F;
      fgp $$5 = $$1.getBuffer(glq.C(b));
      int $$6 = ayf.a($$0);
      Matrix4f $$7 = $$2.c().a();
      $$5.a($$7, -30.0F, 100.0F, -30.0F).a(0.0F, 0.0F).a($$6);
      $$5.a($$7, 30.0F, 100.0F, -30.0F).a(1.0F, 0.0F).a($$6);
      $$5.a($$7, 30.0F, 100.0F, 30.0F).a(1.0F, 1.0F).a($$6);
      $$5.a($$7, -30.0F, 100.0F, 30.0F).a(0.0F, 1.0F).a($$6);
   }

   private void a(int $$0, float $$1, glg $$2, fgl $$3) {
      float $$4 = 20.0F;
      int $$5 = $$0 % 4;
      int $$6 = $$0 / 4 % 2;
      float $$7 = (float)($$5 + 0) / 4.0F;
      float $$8 = (float)($$6 + 0) / 2.0F;
      float $$9 = (float)($$5 + 1) / 4.0F;
      float $$10 = (float)($$6 + 1) / 2.0F;
      float $$11 = 100.0F;
      fgp $$12 = $$2.getBuffer(glq.C(c));
      int $$13 = ayf.a($$1);
      Matrix4f $$14 = $$3.c().a();
      $$12.a($$14, -20.0F, -100.0F, 20.0F).a($$9, $$10).a($$13);
      $$12.a($$14, 20.0F, -100.0F, 20.0F).a($$7, $$10).a($$13);
      $$12.a($$14, 20.0F, -100.0F, -20.0F).a($$7, $$8).a($$13);
      $$12.a($$14, -20.0F, -100.0F, -20.0F).a($$9, $$8).a($$13);
   }

   private void a(gku $$0, float $$1, fgl $$2) {
      Matrix4fStack $$3 = RenderSystem.getModelViewStack();
      $$3.pushMatrix();
      $$3.mul($$2.c().a());
      RenderSystem.setShaderColor($$1, $$1, $$1, $$1);
      RenderSystem.setShaderFog(gku.a);
      this.e.a(glq.J());
      RenderSystem.setShaderFog($$0);
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      $$3.popMatrix();
   }

   public void a(fgl $$0, glg.a $$1, float $$2, int $$3) {
      $$0.a();
      $$0.a(a.b.rotationDegrees(90.0F));
      float $$4 = azu.a($$2) < 0.0F ? 180.0F : 0.0F;
      $$0.a(a.f.rotationDegrees($$4));
      $$0.a(a.f.rotationDegrees(90.0F));
      Matrix4f $$5 = $$0.c().a();
      fgp $$6 = $$1.getBuffer(glq.I());
      float $$7 = ayf.i($$3);
      $$6.a($$5, 0.0F, 100.0F, 0.0F).a($$3);
      int $$8 = ayf.g($$3);
      int $$9 = 16;

      for (int $$10 = 0; $$10 <= 16; $$10++) {
         float $$11 = (float)$$10 * (float) (Math.PI * 2) / 16.0F;
         float $$12 = azu.a($$11);
         float $$13 = azu.b($$11);
         $$6.a($$5, $$12 * 120.0F, $$13 * 120.0F, -$$13 * 40.0F * $$7).a($$8);
      }

      $$0.b();
   }

   private void b(fgp $$0) {
      for (int $$1 = 0; $$1 < 6; $$1++) {
         Matrix4f $$2 = new Matrix4f();
         switch ($$1) {
            case 1:
               $$2.rotationX((float) (Math.PI / 2));
               break;
            case 2:
               $$2.rotationX((float) (-Math.PI / 2));
               break;
            case 3:
               $$2.rotationX((float) Math.PI);
               break;
            case 4:
               $$2.rotationZ((float) (Math.PI / 2));
               break;
            case 5:
               $$2.rotationZ((float) (-Math.PI / 2));
         }

         $$0.a($$2, -100.0F, -100.0F, -100.0F).a(0.0F, 0.0F).a(-14145496);
         $$0.a($$2, -100.0F, -100.0F, 100.0F).a(0.0F, 16.0F).a(-14145496);
         $$0.a($$2, 100.0F, -100.0F, 100.0F).a(16.0F, 16.0F).a(-14145496);
         $$0.a($$2, 100.0F, -100.0F, -100.0F).a(16.0F, 0.0F).a(-14145496);
      }
   }

   public void a() {
      this.h.a(glq.H());
   }

   @Override
   public void close() {
      this.e.close();
      this.f.close();
      this.g.close();
      this.h.close();
   }
}
