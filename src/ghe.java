import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Objects;
import org.joml.Vector3f;

public class ghe implements AutoCloseable {
   public static final int a = 15728880;
   public static final int b = 15728640;
   public static final int c = 240;
   private static final int d = 16;
   private final fbp e;
   private boolean f;
   private float g;
   private final ggw h;
   private final fil i;

   public ghe(ggw $$0, fil $$1) {
      this.h = $$0;
      this.i = $$1;
      this.e = new fbp(16, 16, false);
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

   private float b(float $$0) {
      bsv $$1 = this.i.t.c(bsx.G);
      return $$1 != null ? $$1.a(this.i.t, $$0) : 0.0F;
   }

   private float a(buk $$0, float $$1, float $$2) {
      float $$3 = 0.45F * $$1;
      return Math.max(0.0F, azd.b(((float)$$0.ag - $$2) * (float) Math.PI * 0.025F) * $$3);
   }

   public void a(float $$0) {
      if (this.f) {
         this.f = false;
         this.i.aK().a("lightTex");
         gbh $$1 = this.i.s;
         if ($$1 != null) {
            float $$2 = $$1.g(1.0F);
            float $$3;
            if ($$1.i() > 0) {
               $$3 = 1.0F;
            } else {
               $$3 = $$2 * 0.95F + 0.05F;
            }

            float $$5 = this.i.n.an().c().floatValue();
            float $$6 = this.b($$0) * $$5;
            float $$7 = this.a(this.i.t, $$6, $$0) * $$5;
            float $$8 = this.i.t.E();
            float $$9;
            if (this.i.t.b(bsx.p)) {
               $$9 = ggw.a(this.i.t, $$0);
            } else if ($$8 > 0.0F && this.i.t.b(bsx.C)) {
               $$9 = $$8;
            } else {
               $$9 = 0.0F;
            }

            Vector3f $$12 = new Vector3f($$2, $$2, 1.0F).lerp(new Vector3f(1.0F, 1.0F, 1.0F), 0.35F);
            float $$13 = this.g + 1.5F;
            float $$14 = $$1.B_().s();
            boolean $$15 = $$1.c().d();
            float $$16 = this.i.n.ar().c().floatValue();
            ggp $$17 = Objects.requireNonNull(RenderSystem.setShader(ggq.b), "Lightmap shader not loaded");
            $$17.b("AmbientLightFactor").a($$14);
            $$17.b("SkyFactor").a($$3);
            $$17.b("BlockFactor").a($$13);
            $$17.b("UseBrightLightmap").a($$15 ? 1 : 0);
            $$17.b("SkyLightColor").a($$12);
            $$17.b("NightVisionFactor").a($$9);
            $$17.b("DarknessScale").a($$7);
            $$17.b("DarkenWorldFactor").a(this.h.c($$0));
            $$17.b("BrightnessFactor").a(Math.max(0.0F, $$16 - $$6));
            this.e.a(true);
            fcz $$18 = RenderSystem.renderThreadTesselator().a(fdj.c.h, fdc.a);
            $$18.a(0.0F, 0.0F, 0.0F);
            $$18.a(1.0F, 0.0F, 0.0F);
            $$18.a(1.0F, 1.0F, 0.0F);
            $$18.a(0.0F, 1.0F, 0.0F);
            fda.a($$18.b());
            this.e.e();
            this.i.aK().c();
         }
      }
   }

   public static float a(dyk $$0, int $$1) {
      return a($$0.s(), $$1);
   }

   public static float a(float $$0, int $$1) {
      float $$2 = (float)$$1 / 15.0F;
      float $$3 = $$2 / (4.0F - 3.0F * $$2);
      return azd.h($$0, $$3, 1.0F);
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
