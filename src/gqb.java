import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.stream.IntStream;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;

public class gqb {
   private static final int a = 6;
   private final List<alg> b;
   private final fkg[] c = new fkg[6];

   public gqb(alg $$0) {
      this.b = IntStream.range(0, 6).mapToObj($$1 -> $$0.e($$0.a() + "_" + $$1 + ".png")).toList();
   }

   public void a(fpt $$0, float $$1, float $$2, float $$3) {
      if (this.c[0] == null) {
         this.a();
      }

      Matrix4f $$4 = new Matrix4f().setPerspective(1.4835298F, (float)$$0.aO().k() / (float)$$0.aO().l(), 0.05F, 10.0F);
      RenderSystem.backupProjectionMatrix();
      RenderSystem.setProjectionMatrix($$4, fhg.a);
      Matrix4fStack $$5 = RenderSystem.getModelViewStack();
      $$5.pushMatrix();
      $$5.rotationX((float) Math.PI);
      int $$6 = 2;

      for (int $$7 = 0; $$7 < 4; $$7++) {
         $$5.pushMatrix();
         float $$8 = ((float)($$7 % 2) / 2.0F - 0.5F) / 256.0F;
         float $$9 = ((float)($$7 / 2) / 2.0F - 0.5F) / 256.0F;
         float $$10 = 0.0F;
         $$5.translate($$8, $$9, 0.0F);
         $$5.rotateX($$1 * (float) (Math.PI / 180.0));
         $$5.rotateY($$2 * (float) (Math.PI / 180.0));
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, $$3 / (float)($$7 + 1));

         for (int $$11 = 0; $$11 < 6; $$11++) {
            this.c[$$11].a();
            this.c[$$11].a(grc.I(this.b.get($$11)));
         }

         fkg.b();
         $$5.popMatrix();
         RenderSystem.colorMask(true, true, true, false);
      }

      RenderSystem.colorMask(true, true, true, true);
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.restoreProjectionMatrix();
      $$5.popMatrix();
   }

   private void a() {
      try (fka $$0 = new fka(fkb.i.b() * 4)) {
         for (int $$1 = 0; $$1 < 6; $$1++) {
            fjz $$2 = new fjz($$0, fki.c.h, fkb.i);
            if ($$1 == 0) {
               $$2.a(-1.0F, -1.0F, 1.0F).a(0.0F, 0.0F);
               $$2.a(-1.0F, 1.0F, 1.0F).a(0.0F, 1.0F);
               $$2.a(1.0F, 1.0F, 1.0F).a(1.0F, 1.0F);
               $$2.a(1.0F, -1.0F, 1.0F).a(1.0F, 0.0F);
            }

            if ($$1 == 1) {
               $$2.a(1.0F, -1.0F, 1.0F).a(0.0F, 0.0F);
               $$2.a(1.0F, 1.0F, 1.0F).a(0.0F, 1.0F);
               $$2.a(1.0F, 1.0F, -1.0F).a(1.0F, 1.0F);
               $$2.a(1.0F, -1.0F, -1.0F).a(1.0F, 0.0F);
            }

            if ($$1 == 2) {
               $$2.a(1.0F, -1.0F, -1.0F).a(0.0F, 0.0F);
               $$2.a(1.0F, 1.0F, -1.0F).a(0.0F, 1.0F);
               $$2.a(-1.0F, 1.0F, -1.0F).a(1.0F, 1.0F);
               $$2.a(-1.0F, -1.0F, -1.0F).a(1.0F, 0.0F);
            }

            if ($$1 == 3) {
               $$2.a(-1.0F, -1.0F, -1.0F).a(0.0F, 0.0F);
               $$2.a(-1.0F, 1.0F, -1.0F).a(0.0F, 1.0F);
               $$2.a(-1.0F, 1.0F, 1.0F).a(1.0F, 1.0F);
               $$2.a(-1.0F, -1.0F, 1.0F).a(1.0F, 0.0F);
            }

            if ($$1 == 4) {
               $$2.a(-1.0F, -1.0F, -1.0F).a(0.0F, 0.0F);
               $$2.a(-1.0F, -1.0F, 1.0F).a(0.0F, 1.0F);
               $$2.a(1.0F, -1.0F, 1.0F).a(1.0F, 1.0F);
               $$2.a(1.0F, -1.0F, -1.0F).a(1.0F, 0.0F);
            }

            if ($$1 == 5) {
               $$2.a(-1.0F, 1.0F, 1.0F).a(0.0F, 0.0F);
               $$2.a(-1.0F, 1.0F, -1.0F).a(0.0F, 1.0F);
               $$2.a(1.0F, 1.0F, -1.0F).a(1.0F, 1.0F);
               $$2.a(1.0F, 1.0F, 1.0F).a(1.0F, 0.0F);
            }

            this.c[$$1] = new fkg(fhr.b);
            this.c[$$1].a();
            this.c[$$1].a($$2.b());
            fkg.b();
         }
      }
   }

   public void a(hjs $$0) {
      for (alg $$1 : this.b) {
         $$0.a($$1);
      }
   }
}
