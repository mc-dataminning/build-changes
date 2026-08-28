import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Objects;
import org.joml.Vector3f;

public class gpp implements AutoCloseable {
   public static final int a = 15728880;
   public static final int b = 15728640;
   public static final int c = 240;
   private static final int d = 16;
   private final fhn e;
   private boolean f;
   private float g;
   private final gpi h;
   private final fos i;

   public gpp(gpi $$0, fos $$1) {
      this.h = $$0;
      this.i = $$1;
      this.e = new fhn(16, 16, false);
      this.e.a(9729);
      this.e.a(1.0F, 1.0F, 1.0F, 1.0F);
      this.e.f();
   }

   @Override
   public void close() {
      this.e.a();
   }

   public void a() {
      this.g = this.g + (float)((Math.random() - Math.random()) * Math.random() * Math.random() * 0.1);
      this.g *= 0.9F;
      this.f = true;
   }

   public void b() {
      RenderSystem.setShaderTexture(2, 0);
   }

   public void c() {
      RenderSystem.setShaderTexture(2, this.e.g());
   }

   private float a(bxc $$0, float $$1, float $$2) {
      float $$3 = 0.45F * $$1;
      return Math.max(0.0F, azm.b(((float)$$0.af - $$2) * (float) Math.PI * 0.025F) * $$3);
   }

   public void a(float $$0) {
      if (this.f) {
         this.f = false;
         bqm $$1 = bql.a();
         $$1.a("lightTex");
         gjr $$2 = this.i.s;
         if ($$2 != null) {
            float $$3 = $$2.g(1.0F);
            float $$4;
            if ($$2.j() > 0) {
               $$4 = 1.0F;
            } else {
               $$4 = $$3 * 0.95F + 0.05F;
            }

            float $$6 = this.i.n.ao().c().floatValue();
            float $$7 = this.i.t.a(bvj.G, $$0) * $$6;
            float $$8 = this.a(this.i.t, $$7, $$0) * $$6;
            float $$9 = this.i.t.D();
            float $$10;
            if (this.i.t.b(bvj.p)) {
               $$10 = gpi.a(this.i.t, $$0);
            } else if ($$9 > 0.0F && this.i.t.b(bvj.C)) {
               $$10 = $$9;
            } else {
               $$10 = 0.0F;
            }

            Vector3f $$13 = new Vector3f($$3, $$3, 1.0F).lerp(new Vector3f(1.0F, 1.0F, 1.0F), 0.35F);
            float $$14 = this.g + 1.5F;
            float $$15 = $$2.B_().s();
            boolean $$16 = $$2.c().d();
            float $$17 = this.i.n.as().c().floatValue();
            gpb $$18 = Objects.requireNonNull(RenderSystem.setShader(gpc.b), "Lightmap shader not loaded");
            $$18.c("AmbientLightFactor").a($$15);
            $$18.c("SkyFactor").a($$4);
            $$18.c("BlockFactor").a($$14);
            $$18.c("UseBrightLightmap").a($$16 ? 1 : 0);
            $$18.c("SkyLightColor").a($$13);
            $$18.c("NightVisionFactor").a($$10);
            $$18.c("DarknessScale").a($$8);
            $$18.c("DarkenWorldFactor").a(this.h.c($$0));
            $$18.c("BrightnessFactor").a(Math.max(0.0F, $$17 - $$7));
            this.e.a(true);
            fix $$19 = RenderSystem.renderThreadTesselator().a(fjh.c.h, fja.a);
            $$19.a(0.0F, 0.0F, 0.0F);
            $$19.a(1.0F, 0.0F, 0.0F);
            $$19.a(1.0F, 1.0F, 0.0F);
            $$19.a(0.0F, 1.0F, 0.0F);
            fiy.a($$19.b());
            this.e.e();
            $$1.c();
         }
      }
   }

   public static float a(edw $$0, int $$1) {
      return a($$0.s(), $$1);
   }

   public static float a(float $$0, int $$1) {
      float $$2 = (float)$$1 / 15.0F;
      float $$3 = $$2 / (4.0F - 3.0F * $$2);
      return azm.h($$0, $$3, 1.0F);
   }

   public static int a(int $$0, int $$1) {
      return $$0 << 4 | $$1 << 20;
   }

   public static int a(int $$0) {
      return $$0 >>> 4 & 15;
   }

   public static int b(int $$0) {
      return $$0 >>> 20 & 15;
   }

   public static int b(int $$0, int $$1) {
      if ($$1 == 0) {
         return $$0;
      } else {
         int $$2 = Math.max(b($$0), $$1);
         int $$3 = Math.max(a($$0), $$1);
         return a($$3, $$2);
      }
   }
}
