import com.mojang.blaze3d.systems.RenderSystem;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;

public class gas {
   private static final int a = 6;
   private final akf[] b = new akf[6];

   public gas(akf $$0) {
      for (int $$1 = 0; $$1 < 6; $$1++) {
         this.b[$$1] = $$0.c($$0.a() + "_" + $$1 + ".png");
      }
   }

   public void a(fcu $$0, float $$1, float $$2, float $$3) {
      exp $$4 = exp.b();
      exi $$5 = $$4.d();
      Matrix4f $$6 = new Matrix4f().setPerspective(1.4835298F, (float)$$0.aO().k() / (float)$$0.aO().l(), 0.05F, 10.0F);
      RenderSystem.backupProjectionMatrix();
      RenderSystem.setProjectionMatrix($$6, exv.a);
      Matrix4fStack $$7 = RenderSystem.getModelViewStack();
      $$7.pushMatrix();
      $$7.rotationX((float) Math.PI);
      RenderSystem.setShader(gax::t);
      RenderSystem.enableBlend();
      RenderSystem.disableCull();
      RenderSystem.depthMask(false);
      int $$8 = 2;

      for (int $$9 = 0; $$9 < 4; $$9++) {
         $$7.pushMatrix();
         float $$10 = ((float)($$9 % 2) / 2.0F - 0.5F) / 256.0F;
         float $$11 = ((float)($$9 / 2) / 2.0F - 0.5F) / 256.0F;
         float $$12 = 0.0F;
         $$7.translate($$10, $$11, 0.0F);
         $$7.rotateX($$1 * (float) (Math.PI / 180.0));
         $$7.rotateY($$2 * (float) (Math.PI / 180.0));
         RenderSystem.applyModelViewMatrix();

         for (int $$13 = 0; $$13 < 6; $$13++) {
            RenderSystem.setShaderTexture(0, this.b[$$13]);
            $$5.a(exs.b.h, exl.s);
            int $$14 = Math.round(255.0F * $$3) / ($$9 + 1);
            if ($$13 == 0) {
               $$5.a(-1.0, -1.0, 1.0).a(0.0F, 0.0F).a(255, 255, 255, $$14).e();
               $$5.a(-1.0, 1.0, 1.0).a(0.0F, 1.0F).a(255, 255, 255, $$14).e();
               $$5.a(1.0, 1.0, 1.0).a(1.0F, 1.0F).a(255, 255, 255, $$14).e();
               $$5.a(1.0, -1.0, 1.0).a(1.0F, 0.0F).a(255, 255, 255, $$14).e();
            }

            if ($$13 == 1) {
               $$5.a(1.0, -1.0, 1.0).a(0.0F, 0.0F).a(255, 255, 255, $$14).e();
               $$5.a(1.0, 1.0, 1.0).a(0.0F, 1.0F).a(255, 255, 255, $$14).e();
               $$5.a(1.0, 1.0, -1.0).a(1.0F, 1.0F).a(255, 255, 255, $$14).e();
               $$5.a(1.0, -1.0, -1.0).a(1.0F, 0.0F).a(255, 255, 255, $$14).e();
            }

            if ($$13 == 2) {
               $$5.a(1.0, -1.0, -1.0).a(0.0F, 0.0F).a(255, 255, 255, $$14).e();
               $$5.a(1.0, 1.0, -1.0).a(0.0F, 1.0F).a(255, 255, 255, $$14).e();
               $$5.a(-1.0, 1.0, -1.0).a(1.0F, 1.0F).a(255, 255, 255, $$14).e();
               $$5.a(-1.0, -1.0, -1.0).a(1.0F, 0.0F).a(255, 255, 255, $$14).e();
            }

            if ($$13 == 3) {
               $$5.a(-1.0, -1.0, -1.0).a(0.0F, 0.0F).a(255, 255, 255, $$14).e();
               $$5.a(-1.0, 1.0, -1.0).a(0.0F, 1.0F).a(255, 255, 255, $$14).e();
               $$5.a(-1.0, 1.0, 1.0).a(1.0F, 1.0F).a(255, 255, 255, $$14).e();
               $$5.a(-1.0, -1.0, 1.0).a(1.0F, 0.0F).a(255, 255, 255, $$14).e();
            }

            if ($$13 == 4) {
               $$5.a(-1.0, -1.0, -1.0).a(0.0F, 0.0F).a(255, 255, 255, $$14).e();
               $$5.a(-1.0, -1.0, 1.0).a(0.0F, 1.0F).a(255, 255, 255, $$14).e();
               $$5.a(1.0, -1.0, 1.0).a(1.0F, 1.0F).a(255, 255, 255, $$14).e();
               $$5.a(1.0, -1.0, -1.0).a(1.0F, 0.0F).a(255, 255, 255, $$14).e();
            }

            if ($$13 == 5) {
               $$5.a(-1.0, 1.0, 1.0).a(0.0F, 0.0F).a(255, 255, 255, $$14).e();
               $$5.a(-1.0, 1.0, -1.0).a(0.0F, 1.0F).a(255, 255, 255, $$14).e();
               $$5.a(1.0, 1.0, -1.0).a(1.0F, 1.0F).a(255, 255, 255, $$14).e();
               $$5.a(1.0, 1.0, 1.0).a(1.0F, 0.0F).a(255, 255, 255, $$14).e();
            }

            $$4.c();
         }

         $$7.popMatrix();
         RenderSystem.colorMask(true, true, true, false);
      }

      RenderSystem.colorMask(true, true, true, true);
      RenderSystem.restoreProjectionMatrix();
      $$7.popMatrix();
      RenderSystem.applyModelViewMatrix();
      RenderSystem.depthMask(true);
      RenderSystem.enableCull();
      RenderSystem.enableDepthTest();
   }

   public CompletableFuture<Void> a(gmp $$0, Executor $$1) {
      CompletableFuture<?>[] $$2 = new CompletableFuture[6];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         $$2[$$3] = $$0.a(this.b[$$3], $$1);
      }

      return CompletableFuture.allOf($$2);
   }
}
