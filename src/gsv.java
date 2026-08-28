import com.mojang.blaze3d.systems.RenderSystem;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Vector3f;

public class gsv implements AutoCloseable {
   private static final ali b = ali.b("textures/environment/sun.png");
   private static final ali c = ali.b("textures/environment/moon_phases.png");
   public static final ali a = ali.b("textures/environment/end_sky.png");
   private static final float d = 512.0F;
   private static final int e = 10;
   private static final int f = 1500;
   private static final int g = 6;
   private final fig h;
   private final RenderSystem.a i = RenderSystem.getSequentialBuffer(fls.c.h);
   private final fig j;
   private final fig k;
   private final fig l;

   public gsv() {
      this.h = c();
      this.l = d();

      try (fll $$0 = new fll(10 * flm.e.b())) {
         flk $$1 = new flk($$0, fls.c.g, flm.e);
         this.a($$1, 16.0F);

         try (fln $$2 = $$1.b()) {
            this.j = RenderSystem.getDevice().a(() -> "Top sky vertex buffer", fie.a, fif.b, $$2.a());
         }

         $$1 = new flk($$0, fls.c.g, flm.e);
         this.a($$1, -16.0F);

         try (fln $$3 = $$1.b()) {
            this.k = RenderSystem.getDevice().a(() -> "Bottom sky vertex buffer", fie.a, fif.b, $$3.a());
         }
      }
   }

   private static fig c() {
      azx $$0 = azx.a(10842L);
      float $$1 = 100.0F;

      fig var18;
      try (fll $$2 = new fll(flm.e.b() * 1500 * 4)) {
         flk $$3 = new flk($$2, fls.c.h, flm.e);

         for (int $$4 = 0; $$4 < 1500; $$4++) {
            float $$5 = $$0.i() * 2.0F - 1.0F;
            float $$6 = $$0.i() * 2.0F - 1.0F;
            float $$7 = $$0.i() * 2.0F - 1.0F;
            float $$8 = 0.15F + $$0.i() * 0.1F;
            float $$9 = azo.k($$5, $$6, $$7);
            if (!($$9 <= 0.010000001F) && !($$9 >= 1.0F)) {
               Vector3f $$10 = new Vector3f($$5, $$6, $$7).normalize(100.0F);
               float $$11 = (float)($$0.j() * (float) Math.PI * 2.0);
               Matrix3f $$12 = new Matrix3f().rotateTowards(new Vector3f($$10).negate(), new Vector3f(0.0F, 1.0F, 0.0F)).rotateZ(-$$11);
               $$3.a(new Vector3f($$8, -$$8, 0.0F).mul($$12).add($$10));
               $$3.a(new Vector3f($$8, $$8, 0.0F).mul($$12).add($$10));
               $$3.a(new Vector3f(-$$8, $$8, 0.0F).mul($$12).add($$10));
               $$3.a(new Vector3f(-$$8, -$$8, 0.0F).mul($$12).add($$10));
            }
         }

         try (fln $$13 = $$3.b()) {
            var18 = RenderSystem.getDevice().a(() -> "Stars vertex buffer", fie.a, fif.b, $$13.a());
         }
      }

      return var18;
   }

   private void a(flr $$0, float $$1) {
      float $$2 = Math.signum($$1) * 512.0F;
      $$0.a(0.0F, $$1, 0.0F);

      for (int $$3 = -180; $$3 <= 180; $$3 += 45) {
         $$0.a($$2 * azo.b((float)$$3 * (float) (Math.PI / 180.0)), $$1, 512.0F * azo.a((float)$$3 * (float) (Math.PI / 180.0)));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      RenderSystem.setShaderColor($$0, $$1, $$2, 1.0F);
      flh $$3 = frd.Q().h().d();
      flh $$4 = frd.Q().h().e();

      try (flb $$5 = RenderSystem.getDevice().b().a($$3, OptionalInt.empty(), $$4, OptionalDouble.empty())) {
         $$5.a(gsj.ak);
         $$5.a(0, this.j);
         $$5.b(0, 10);
      }

      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public void a() {
      RenderSystem.setShaderColor(0.0F, 0.0F, 0.0F, 1.0F);
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.translate(0.0F, 12.0F, 0.0F);
      flh $$1 = frd.Q().h().d();
      flh $$2 = frd.Q().h().e();

      try (flb $$3 = RenderSystem.getDevice().b().a($$1, OptionalInt.empty(), $$2, OptionalDouble.empty())) {
         $$3.a(gsj.ak);
         $$3.a(0, this.k);
         $$3.b(0, 10);
      }

      $$0.popMatrix();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public void a(flo $$0, gsa.a $$1, float $$2, int $$3, float $$4, float $$5, gro $$6) {
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

   private void a(float $$0, gsa $$1, flo $$2) {
      float $$3 = 30.0F;
      float $$4 = 100.0F;
      flr $$5 = $$1.getBuffer(gsl.C(b));
      int $$6 = axy.a($$0);
      Matrix4f $$7 = $$2.c().a();
      $$5.a($$7, -30.0F, 100.0F, -30.0F).a(0.0F, 0.0F).a($$6);
      $$5.a($$7, 30.0F, 100.0F, -30.0F).a(1.0F, 0.0F).a($$6);
      $$5.a($$7, 30.0F, 100.0F, 30.0F).a(1.0F, 1.0F).a($$6);
      $$5.a($$7, -30.0F, 100.0F, 30.0F).a(0.0F, 1.0F).a($$6);
   }

   private void a(int $$0, float $$1, gsa $$2, flo $$3) {
      float $$4 = 20.0F;
      int $$5 = $$0 % 4;
      int $$6 = $$0 / 4 % 2;
      float $$7 = (float)($$5 + 0) / 4.0F;
      float $$8 = (float)($$6 + 0) / 2.0F;
      float $$9 = (float)($$5 + 1) / 4.0F;
      float $$10 = (float)($$6 + 1) / 2.0F;
      float $$11 = 100.0F;
      flr $$12 = $$2.getBuffer(gsl.C(c));
      int $$13 = axy.a($$1);
      Matrix4f $$14 = $$3.c().a();
      $$12.a($$14, -20.0F, -100.0F, 20.0F).a($$9, $$10).a($$13);
      $$12.a($$14, 20.0F, -100.0F, 20.0F).a($$7, $$10).a($$13);
      $$12.a($$14, 20.0F, -100.0F, -20.0F).a($$7, $$8).a($$13);
      $$12.a($$14, -20.0F, -100.0F, -20.0F).a($$9, $$8).a($$13);
   }

   private void a(gro $$0, float $$1, flo $$2) {
      Matrix4fStack $$3 = RenderSystem.getModelViewStack();
      $$3.pushMatrix();
      $$3.mul($$2.c().a());
      RenderSystem.setShaderColor($$1, $$1, $$1, $$1);
      RenderSystem.setShaderFog(gro.a);
      fjp $$4 = gsj.an;
      flh $$5 = frd.Q().h().d();
      flh $$6 = frd.Q().h().e();

      try (flb $$7 = RenderSystem.getDevice().b().a($$5, OptionalInt.empty(), $$6, OptionalDouble.empty())) {
         $$7.a($$4);
         $$7.a(0, this.h);
         $$7.a(this.i.b(9000), this.i.a());
         $$7.a(0, 9000);
      }

      RenderSystem.setShaderFog($$0);
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      $$3.popMatrix();
   }

   public void a(flo $$0, gsa.a $$1, float $$2, int $$3) {
      $$0.a();
      $$0.a(a.b.rotationDegrees(90.0F));
      float $$4 = azo.a($$2) < 0.0F ? 180.0F : 0.0F;
      $$0.a(a.f.rotationDegrees($$4));
      $$0.a(a.f.rotationDegrees(90.0F));
      Matrix4f $$5 = $$0.c().a();
      flr $$6 = $$1.getBuffer(gsl.E());
      float $$7 = axy.i($$3);
      $$6.a($$5, 0.0F, 100.0F, 0.0F).a($$3);
      int $$8 = axy.g($$3);
      int $$9 = 16;

      for (int $$10 = 0; $$10 <= 16; $$10++) {
         float $$11 = (float)$$10 * (float) (Math.PI * 2) / 16.0F;
         float $$12 = azo.a($$11);
         float $$13 = azo.b($$11);
         $$6.a($$5, $$12 * 120.0F, $$13 * 120.0F, -$$13 * 40.0F * $$7).a($$8);
      }

      $$0.b();
   }

   private static fig d() {
      fig var10;
      try (fll $$0 = new fll(24 * flm.j.b())) {
         flk $$1 = new flk($$0, fls.c.h, flm.j);

         for (int $$2 = 0; $$2 < 6; $$2++) {
            Matrix4f $$3 = new Matrix4f();
            switch ($$2) {
               case 1:
                  $$3.rotationX((float) (Math.PI / 2));
                  break;
               case 2:
                  $$3.rotationX((float) (-Math.PI / 2));
                  break;
               case 3:
                  $$3.rotationX((float) Math.PI);
                  break;
               case 4:
                  $$3.rotationZ((float) (Math.PI / 2));
                  break;
               case 5:
                  $$3.rotationZ((float) (-Math.PI / 2));
            }

            $$1.a($$3, -100.0F, -100.0F, -100.0F).a(0.0F, 0.0F).a(-14145496);
            $$1.a($$3, -100.0F, -100.0F, 100.0F).a(0.0F, 16.0F).a(-14145496);
            $$1.a($$3, 100.0F, -100.0F, 100.0F).a(16.0F, 16.0F).a(-14145496);
            $$1.a($$3, 100.0F, -100.0F, -100.0F).a(16.0F, 0.0F).a(-14145496);
         }

         try (fln $$4 = $$1.b()) {
            var10 = RenderSystem.getDevice().a(() -> "End sky vertex buffer", fie.a, fif.b, $$4.a());
         }
      }

      return var10;
   }

   public void b() {
      hlc $$0 = frd.Q().aa();
      hkl $$1 = $$0.b(a);
      $$1.a(bau.b, false);
      RenderSystem.a $$2 = RenderSystem.getSequentialBuffer(fls.c.h);
      flh $$3 = frd.Q().h().d();
      flh $$4 = frd.Q().h().e();

      try (flb $$5 = RenderSystem.getDevice().b().a($$3, OptionalInt.empty(), $$4, OptionalDouble.empty())) {
         $$5.a(gsj.al);
         $$5.a("Sampler0", $$1.a());
         $$5.a(0, this.l);
         $$5.a($$2.b(36), $$2.a());
         $$5.a(0, 36);
      }
   }

   @Override
   public void close() {
      this.h.close();
      this.j.close();
      this.k.close();
      this.l.close();
   }
}
