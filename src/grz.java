import com.mojang.blaze3d.systems.RenderSystem;
import java.util.OptionalInt;
import org.joml.Vector3f;

public class grz implements AutoCloseable {
   public static final int a = 15728880;
   public static final int b = 15728640;
   public static final int c = 240;
   private static final int d = 16;
   private final flj e;
   private boolean f;
   private float g;
   private final grs h;
   private final frf i;

   public grz(grs $$0, frf $$1) {
      this.h = $$0;
      this.i = $$1;
      flc $$2 = RenderSystem.getDevice();
      this.e = $$2.a("Light Texture", flk.a, 16, 16, 1);
      this.e.a(fli.b, false);
      $$2.b().a(this.e, -1);
   }

   public flj a() {
      return this.e;
   }

   @Override
   public void close() {
      this.e.close();
   }

   public void b() {
      this.g = this.g + (float)((Math.random() - Math.random()) * Math.random() * Math.random() * 0.1);
      this.g *= 0.9F;
      this.f = true;
   }

   public void c() {
      RenderSystem.setShaderTexture(2, null);
   }

   public void d() {
      RenderSystem.setShaderTexture(2, this.e);
   }

   private float a(bxw $$0, float $$1, float $$2) {
      float $$3 = 0.45F * $$1;
      return Math.max(0.0F, azq.b(((float)$$0.af - $$2) * (float) Math.PI * 0.025F) * $$3);
   }

   public void a(float $$0) {
      if (this.f) {
         this.f = false;
         brd $$1 = brc.a();
         $$1.a("lightTex");
         gmd $$2 = this.i.s;
         if ($$2 != null) {
            float $$3 = $$2.g(1.0F);
            float $$4;
            if ($$2.j() > 0) {
               $$4 = 1.0F;
            } else {
               $$4 = $$3 * 0.95F + 0.05F;
            }

            float $$6 = this.i.n.ao().c().floatValue();
            float $$7 = this.i.t.a(bwb.G, $$0) * $$6;
            float $$8 = this.a(this.i.t, $$7, $$0) * $$6;
            float $$9 = this.i.t.D();
            float $$10;
            if (this.i.t.b(bwb.p)) {
               $$10 = grs.a(this.i.t, $$0);
            } else if ($$9 > 0.0F && this.i.t.b(bwb.C)) {
               $$10 = $$9;
            } else {
               $$10 = 0.0F;
            }

            Vector3f $$13 = new Vector3f($$3, $$3, 1.0F).lerp(new Vector3f(1.0F, 1.0F, 1.0F), 0.35F);
            float $$14 = this.g + 1.5F;
            float $$15 = $$2.F_().s();
            boolean $$16 = $$2.c().d();
            float $$17 = this.i.n.as().c().floatValue();

            try (fld $$18 = RenderSystem.getDevice().b().a(this.e, OptionalInt.empty())) {
               $$18.a(gsl.aH);
               $$18.a("AmbientLightFactor", $$15);
               $$18.a("SkyFactor", $$4);
               $$18.a("BlockFactor", $$14);
               $$18.a("UseBrightLightmap", $$16 ? 1 : 0);
               $$18.a("SkyLightColor", $$13.x, $$13.y, $$13.z);
               $$18.a("NightVisionFactor", $$10);
               $$18.a("DarknessScale", $$8);
               $$18.a("DarkenWorldFactor", this.h.c($$0));
               $$18.a("BrightnessFactor", Math.max(0.0F, $$17 - $$7));
               $$18.a(0, RenderSystem.getQuadVertexBuffer());
               RenderSystem.a $$19 = RenderSystem.getSequentialBuffer(flu.c.h);
               $$18.a($$19.b(6), $$19.a());
               $$18.a(0, 6);
            }

            $$1.c();
         }
      }
   }

   public static float a(efd $$0, int $$1) {
      return a($$0.s(), $$1);
   }

   public static float a(float $$0, int $$1) {
      float $$2 = (float)$$1 / 15.0F;
      float $$3 = $$2 / (4.0F - 3.0F * $$2);
      return azq.h($$0, $$3, 1.0F);
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
