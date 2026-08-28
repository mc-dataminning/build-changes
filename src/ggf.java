import com.mojang.blaze3d.systems.RenderSystem;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;

public class ggf {
   private static final int a = 6;
   private final alb[] b = new alb[6];

   public ggf(alb $$0) {
      for (int $$1 = 0; $$1 < 6; $$1++) {
         this.b[$$1] = $$0.e($$0.a() + "_" + $$1 + ".png");
      }
   }

   public void a(fib $$0, float $$1, float $$2, float $$3) {
      fcw $$4 = fcw.b();
      Matrix4f $$5 = new Matrix4f().setPerspective(1.4835298F, (float)$$0.aO().l() / (float)$$0.aO().m(), 0.05F, 10.0F);
      RenderSystem.backupProjectionMatrix();
      RenderSystem.setProjectionMatrix($$5, fdc.a);
      Matrix4fStack $$6 = RenderSystem.getModelViewStack();
      $$6.pushMatrix();
      $$6.rotationX((float) Math.PI);
      RenderSystem.setShader(ggl::r);
      RenderSystem.enableBlend();
      RenderSystem.disableCull();
      RenderSystem.depthMask(false);
      int $$7 = 2;

      for (int $$8 = 0; $$8 < 4; $$8++) {
         $$6.pushMatrix();
         float $$9 = ((float)($$8 % 2) / 2.0F - 0.5F) / 256.0F;
         float $$10 = ((float)($$8 / 2) / 2.0F - 0.5F) / 256.0F;
         float $$11 = 0.0F;
         $$6.translate($$9, $$10, 0.0F);
         $$6.rotateX($$1 * (float) (Math.PI / 180.0));
         $$6.rotateY($$2 * (float) (Math.PI / 180.0));

         for (int $$12 = 0; $$12 < 6; $$12++) {
            RenderSystem.setShaderTexture(0, this.b[$$12]);
            fcp $$13 = $$4.a(fcz.c.h, fcs.j);
            int $$14 = Math.round(255.0F * $$3) / ($$8 + 1);
            if ($$12 == 0) {
               $$13.a(-1.0F, -1.0F, 1.0F).a(0.0F, 0.0F).d($$14);
               $$13.a(-1.0F, 1.0F, 1.0F).a(0.0F, 1.0F).d($$14);
               $$13.a(1.0F, 1.0F, 1.0F).a(1.0F, 1.0F).d($$14);
               $$13.a(1.0F, -1.0F, 1.0F).a(1.0F, 0.0F).d($$14);
            }

            if ($$12 == 1) {
               $$13.a(1.0F, -1.0F, 1.0F).a(0.0F, 0.0F).d($$14);
               $$13.a(1.0F, 1.0F, 1.0F).a(0.0F, 1.0F).d($$14);
               $$13.a(1.0F, 1.0F, -1.0F).a(1.0F, 1.0F).d($$14);
               $$13.a(1.0F, -1.0F, -1.0F).a(1.0F, 0.0F).d($$14);
            }

            if ($$12 == 2) {
               $$13.a(1.0F, -1.0F, -1.0F).a(0.0F, 0.0F).d($$14);
               $$13.a(1.0F, 1.0F, -1.0F).a(0.0F, 1.0F).d($$14);
               $$13.a(-1.0F, 1.0F, -1.0F).a(1.0F, 1.0F).d($$14);
               $$13.a(-1.0F, -1.0F, -1.0F).a(1.0F, 0.0F).d($$14);
            }

            if ($$12 == 3) {
               $$13.a(-1.0F, -1.0F, -1.0F).a(0.0F, 0.0F).d($$14);
               $$13.a(-1.0F, 1.0F, -1.0F).a(0.0F, 1.0F).d($$14);
               $$13.a(-1.0F, 1.0F, 1.0F).a(1.0F, 1.0F).d($$14);
               $$13.a(-1.0F, -1.0F, 1.0F).a(1.0F, 0.0F).d($$14);
            }

            if ($$12 == 4) {
               $$13.a(-1.0F, -1.0F, -1.0F).a(0.0F, 0.0F).d($$14);
               $$13.a(-1.0F, -1.0F, 1.0F).a(0.0F, 1.0F).d($$14);
               $$13.a(1.0F, -1.0F, 1.0F).a(1.0F, 1.0F).d($$14);
               $$13.a(1.0F, -1.0F, -1.0F).a(1.0F, 0.0F).d($$14);
            }

            if ($$12 == 5) {
               $$13.a(-1.0F, 1.0F, 1.0F).a(0.0F, 0.0F).d($$14);
               $$13.a(-1.0F, 1.0F, -1.0F).a(0.0F, 1.0F).d($$14);
               $$13.a(1.0F, 1.0F, -1.0F).a(1.0F, 1.0F).d($$14);
               $$13.a(1.0F, 1.0F, 1.0F).a(1.0F, 0.0F).d($$14);
            }

            fcq.a($$13.b());
         }

         $$6.popMatrix();
         RenderSystem.colorMask(true, true, true, false);
      }

      RenderSystem.colorMask(true, true, true, true);
      RenderSystem.restoreProjectionMatrix();
      $$6.popMatrix();
      RenderSystem.depthMask(true);
      RenderSystem.enableCull();
      RenderSystem.enableDepthTest();
   }

   public CompletableFuture<Void> a(gwl $$0, Executor $$1) {
      CompletableFuture<?>[] $$2 = new CompletableFuture[6];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         $$2[$$3] = $$0.a(this.b[$$3], $$1);
      }

      return CompletableFuture.allOf($$2);
   }
}
