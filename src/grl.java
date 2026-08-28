import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;

public class grl {
   private static final int a = 6;
   @Nullable
   private fig b = null;
   private final List<ali> c;

   public grl(ali $$0) {
      this.c = IntStream.range(0, 6).mapToObj($$1 -> $$0.e($$0.a() + "_" + $$1 + ".png")).toList();
   }

   public void a(frd $$0, float $$1, float $$2, float $$3) {
      if (this.b == null) {
         this.a();
      }

      Matrix4f $$4 = new Matrix4f().setPerspective(1.4835298F, (float)$$0.aO().k() / (float)$$0.aO().l(), 0.05F, 10.0F);
      RenderSystem.backupProjectionMatrix();
      RenderSystem.setProjectionMatrix($$4, fhu.a);
      Matrix4fStack $$5 = RenderSystem.getModelViewStack();
      $$5.pushMatrix();
      $$5.rotationX((float) Math.PI);
      int $$6 = 2;
      fjp $$7 = gsj.aE;
      fjq $$8 = frd.Q().h();
      flh $$9 = $$8.d();
      flh $$10 = $$8.e();

      try (flb $$11 = RenderSystem.getDevice().b().a($$9, OptionalInt.empty(), $$10, OptionalDouble.empty())) {
         RenderSystem.a $$12 = RenderSystem.getSequentialBuffer(fls.c.h);
         $$11.a($$7);
         $$11.a(0, this.b);
         $$11.a($$12.b(6), $$12.a());

         for (int $$13 = 0; $$13 < 4; $$13++) {
            $$5.pushMatrix();
            float $$14 = ((float)($$13 % 2) / 2.0F - 0.5F) / 256.0F;
            float $$15 = ((float)($$13 / 2) / 2.0F - 0.5F) / 256.0F;
            float $$16 = 0.0F;
            $$5.translate($$14, $$15, 0.0F);
            $$5.rotateX($$1 * (float) (Math.PI / 180.0));
            $$5.rotateY($$2 * (float) (Math.PI / 180.0));
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, $$3 / (float)($$13 + 1));

            for (int $$17 = 0; $$17 < 6; $$17++) {
               $$11.a("Sampler0", $$0.aa().b(this.c.get($$17)).a());
               $$11.a(6 * $$17, 6);
            }

            $$5.popMatrix();
         }
      }

      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.restoreProjectionMatrix();
      $$5.popMatrix();
   }

   private void a() {
      this.b = RenderSystem.getDevice().a(() -> "Cube map vertex buffer", fie.a, fif.a, 24 * flm.i.b());

      try (fll $$0 = new fll(flm.i.b() * 4)) {
         flk $$1 = new flk($$0, fls.c.h, flm.i);
         $$1.a(-1.0F, -1.0F, 1.0F).a(0.0F, 0.0F);
         $$1.a(-1.0F, 1.0F, 1.0F).a(0.0F, 1.0F);
         $$1.a(1.0F, 1.0F, 1.0F).a(1.0F, 1.0F);
         $$1.a(1.0F, -1.0F, 1.0F).a(1.0F, 0.0F);
         $$1.a(1.0F, -1.0F, 1.0F).a(0.0F, 0.0F);
         $$1.a(1.0F, 1.0F, 1.0F).a(0.0F, 1.0F);
         $$1.a(1.0F, 1.0F, -1.0F).a(1.0F, 1.0F);
         $$1.a(1.0F, -1.0F, -1.0F).a(1.0F, 0.0F);
         $$1.a(1.0F, -1.0F, -1.0F).a(0.0F, 0.0F);
         $$1.a(1.0F, 1.0F, -1.0F).a(0.0F, 1.0F);
         $$1.a(-1.0F, 1.0F, -1.0F).a(1.0F, 1.0F);
         $$1.a(-1.0F, -1.0F, -1.0F).a(1.0F, 0.0F);
         $$1.a(-1.0F, -1.0F, -1.0F).a(0.0F, 0.0F);
         $$1.a(-1.0F, 1.0F, -1.0F).a(0.0F, 1.0F);
         $$1.a(-1.0F, 1.0F, 1.0F).a(1.0F, 1.0F);
         $$1.a(-1.0F, -1.0F, 1.0F).a(1.0F, 0.0F);
         $$1.a(-1.0F, -1.0F, -1.0F).a(0.0F, 0.0F);
         $$1.a(-1.0F, -1.0F, 1.0F).a(0.0F, 1.0F);
         $$1.a(1.0F, -1.0F, 1.0F).a(1.0F, 1.0F);
         $$1.a(1.0F, -1.0F, -1.0F).a(1.0F, 0.0F);
         $$1.a(-1.0F, 1.0F, 1.0F).a(0.0F, 0.0F);
         $$1.a(-1.0F, 1.0F, -1.0F).a(0.0F, 1.0F);
         $$1.a(1.0F, 1.0F, -1.0F).a(1.0F, 1.0F);
         $$1.a(1.0F, 1.0F, 1.0F).a(1.0F, 0.0F);

         try (fln $$2 = $$1.b()) {
            fkz $$3 = RenderSystem.getDevice().b();
            $$3.a(this.b, $$2.a(), 0);
         }
      }
   }

   public void a(hlc $$0) {
      for (ali $$1 : this.c) {
         $$0.a($$1);
      }
   }
}
