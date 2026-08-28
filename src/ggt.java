import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import javax.annotation.Nullable;
import org.joml.Vector3f;
import org.slf4j.Logger;

public class ggt implements AutoCloseable {
   public static final int a = 15728880;
   public static final int b = 15728640;
   public static final int c = 240;
   private static final int d = 16;
   private static final Logger e = LogUtils.getLogger();
   @Nullable
   private ghk f;
   private final fba g;
   private boolean h;
   private float i;
   private final ggl j;
   private final fib k;

   public ggt(ggl $$0, fib $$1) {
      this.j = $$0;
      this.k = $$1;
      this.g = new fba(16, 16, false);
      this.g.a(9729);
      this.g.a(1.0F, 1.0F, 1.0F, 1.0F);
      this.g.f();
   }

   public void a(auv $$0) {
      if (this.f != null) {
         this.f.close();
      }

      try {
         this.f = new ghk($$0, "lightmap", fcs.a);
      } catch (IOException var3) {
         e.error("Failed to load lightmap shader", var3);
         this.f = null;
      }
   }

   @Override
   public void close() {
      if (this.f != null) {
         this.f.close();
         this.f = null;
      }

      this.g.a();
   }

   public void a() {
      this.i = this.i + (float)((Math.random() - Math.random()) * Math.random() * Math.random() * 0.1);
      this.i *= 0.9F;
      this.h = true;
   }

   public void b() {
      RenderSystem.setShaderTexture(2, 0);
   }

   public void c() {
      RenderSystem.setShaderTexture(2, this.g.g());
   }

   private float b(float $$0) {
      bsq $$1 = this.k.t.c(bss.G);
      return $$1 != null ? $$1.a(this.k.t, $$0) : 0.0F;
   }

   private float a(buf $$0, float $$1, float $$2) {
      float $$3 = 0.45F * $$1;
      return Math.max(0.0F, azc.b(((float)$$0.ag - $$2) * (float) Math.PI * 0.025F) * $$3);
   }

   public void a(float $$0) {
      if (this.h && this.f != null) {
         this.h = false;
         this.k.aJ().a("lightTex");
         gax $$1 = this.k.s;
         if ($$1 != null) {
            float $$2 = $$1.g(1.0F);
            float $$3;
            if ($$1.i() > 0) {
               $$3 = 1.0F;
            } else {
               $$3 = $$2 * 0.95F + 0.05F;
            }

            float $$5 = this.k.n.an().c().floatValue();
            float $$6 = this.b($$0) * $$5;
            float $$7 = this.a(this.k.t, $$6, $$0) * $$5;
            float $$8 = this.k.t.E();
            float $$9;
            if (this.k.t.b(bss.p)) {
               $$9 = ggl.a(this.k.t, $$0);
            } else if ($$8 > 0.0F && this.k.t.b(bss.C)) {
               $$9 = $$8;
            } else {
               $$9 = 0.0F;
            }

            Vector3f $$12 = new Vector3f($$2, $$2, 1.0F).lerp(new Vector3f(1.0F, 1.0F, 1.0F), 0.35F);
            float $$13 = this.i + 1.5F;
            float $$14 = $$1.B_().s();
            boolean $$15 = $$1.c().d();
            float $$16 = this.k.n.ar().c().floatValue();
            this.f.b("AmbientLightFactor").a($$14);
            this.f.b("SkyFactor").a($$3);
            this.f.b("BlockFactor").a($$13);
            this.f.b("UseBrightLightmap").a($$15 ? 1 : 0);
            this.f.b("SkyLightColor").a($$12);
            this.f.b("NightVisionFactor").a($$9);
            this.f.b("DarknessScale").a($$7);
            this.f.b("DarkenWorldFactor").a(this.j.c($$0));
            this.f.b("BrightnessFactor").a(Math.max(0.0F, $$16 - $$6));
            this.f.g();
            this.g.a(true);
            fcp $$17 = RenderSystem.renderThreadTesselator().a(fcz.c.h, fcs.a);
            $$17.a(0.0F, 0.0F, 0.0F);
            $$17.a(1.0F, 0.0F, 0.0F);
            $$17.a(1.0F, 1.0F, 0.0F);
            $$17.a(0.0F, 1.0F, 0.0F);
            fcq.b($$17.b());
            this.f.f();
            this.g.e();
            this.k.aJ().c();
         }
      }
   }

   public static float a(dxw $$0, int $$1) {
      return a($$0.s(), $$1);
   }

   public static float a(float $$0, int $$1) {
      float $$2 = (float)$$1 / 15.0F;
      float $$3 = $$2 / (4.0F - 3.0F * $$2);
      return azc.h($$0, $$3, 1.0F);
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
      int $$2 = Math.max(b($$0), $$1);
      int $$3 = Math.max(a($$0), $$1);
      return a($$3, $$2);
   }
}
