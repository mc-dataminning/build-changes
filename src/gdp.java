import com.mojang.blaze3d.systems.RenderSystem;
import org.joml.Vector3f;

public class gdp implements AutoCloseable {
   public static final int a = 15728880;
   public static final int b = 15728640;
   public static final int c = 240;
   private final goo d;
   private final ezb e;
   private final alf f;
   private boolean g;
   private float h;
   private final gdj i;
   private final ffh j;

   public gdp(gdj $$0, ffh $$1) {
      this.i = $$0;
      this.j = $$1;
      this.d = new goo(16, 16, false);
      this.f = this.j.aa().a("light_map", this.d);
      this.e = this.d.e();

      for (int $$2 = 0; $$2 < 16; $$2++) {
         for (int $$3 = 0; $$3 < 16; $$3++) {
            this.e.a($$3, $$2, -1);
         }
      }

      this.d.d();
   }

   @Override
   public void close() {
      this.d.close();
   }

   public void a() {
      this.h = this.h + (float)((Math.random() - Math.random()) * Math.random() * Math.random() * 0.1);
      this.h *= 0.9F;
      this.g = true;
   }

   public void b() {
      RenderSystem.setShaderTexture(2, 0);
   }

   public void c() {
      RenderSystem.setShaderTexture(2, this.f);
      this.j.aa().a(this.f);
      RenderSystem.texParameter(3553, 10241, 9729);
      RenderSystem.texParameter(3553, 10240, 9729);
   }

   private float b(float $$0) {
      bse $$1 = this.j.s.c(bsg.G);
      return $$1 != null ? $$1.a(this.j.s, $$0) : 0.0F;
   }

   private float a(btr $$0, float $$1, float $$2) {
      float $$3 = 0.45F * $$1;
      return Math.max(0.0F, ayz.b(((float)$$0.ai - $$2) * (float) Math.PI * 0.025F) * $$3);
   }

   public void a(float $$0) {
      if (this.g) {
         this.g = false;
         this.j.aI().a("lightTex");
         fxx $$1 = this.j.r;
         if ($$1 != null) {
            float $$2 = $$1.g(1.0F);
            float $$3;
            if ($$1.j() > 0) {
               $$3 = 1.0F;
            } else {
               $$3 = $$2 * 0.95F + 0.05F;
            }

            float $$5 = this.j.m.al().c().floatValue();
            float $$6 = this.b($$0) * $$5;
            float $$7 = this.a(this.j.s, $$6, $$0) * $$5;
            float $$8 = this.j.s.D();
            float $$9;
            if (this.j.s.b(bsg.p)) {
               $$9 = gdj.a(this.j.s, $$0);
            } else if ($$8 > 0.0F && this.j.s.b(bsg.C)) {
               $$9 = $$8;
            } else {
               $$9 = 0.0F;
            }

            Vector3f $$12 = new Vector3f($$2, $$2, 1.0F).lerp(new Vector3f(1.0F, 1.0F, 1.0F), 0.35F);
            float $$13 = this.h + 1.5F;
            Vector3f $$14 = new Vector3f();

            for (int $$15 = 0; $$15 < 16; $$15++) {
               for (int $$16 = 0; $$16 < 16; $$16++) {
                  float $$17 = a($$1.D_(), $$15) * $$3;
                  float $$18 = a($$1.D_(), $$16) * $$13;
                  float $$20 = $$18 * (($$18 * 0.6F + 0.4F) * 0.6F + 0.4F);
                  float $$21 = $$18 * ($$18 * $$18 * 0.6F + 0.4F);
                  $$14.set($$18, $$20, $$21);
                  boolean $$22 = $$1.d().d();
                  if ($$22) {
                     $$14.lerp(new Vector3f(0.99F, 1.12F, 1.0F), 0.25F);
                     a($$14);
                  } else {
                     Vector3f $$23 = new Vector3f($$12).mul($$17);
                     $$14.add($$23);
                     $$14.lerp(new Vector3f(0.75F, 0.75F, 0.75F), 0.04F);
                     if (this.i.c($$0) > 0.0F) {
                        float $$24 = this.i.c($$0);
                        Vector3f $$25 = new Vector3f($$14).mul(0.7F, 0.6F, 0.6F);
                        $$14.lerp($$25, $$24);
                     }
                  }

                  if ($$9 > 0.0F) {
                     float $$26 = Math.max($$14.x(), Math.max($$14.y(), $$14.z()));
                     if ($$26 < 1.0F) {
                        float $$27 = 1.0F / $$26;
                        Vector3f $$28 = new Vector3f($$14).mul($$27);
                        $$14.lerp($$28, $$9);
                     }
                  }

                  if (!$$22) {
                     if ($$7 > 0.0F) {
                        $$14.add(-$$7, -$$7, -$$7);
                     }

                     a($$14);
                  }

                  float $$29 = this.j.m.ap().c().floatValue();
                  Vector3f $$30 = new Vector3f(this.c($$14.x), this.c($$14.y), this.c($$14.z));
                  $$14.lerp($$30, Math.max(0.0F, $$29 - $$6));
                  $$14.lerp(new Vector3f(0.75F, 0.75F, 0.75F), 0.04F);
                  a($$14);
                  $$14.mul(255.0F);
                  int $$31 = 255;
                  int $$32 = (int)$$14.x();
                  int $$33 = (int)$$14.y();
                  int $$34 = (int)$$14.z();
                  this.e.a($$16, $$15, 0xFF000000 | $$34 << 16 | $$33 << 8 | $$32);
               }
            }

            this.d.d();
            this.j.aI().c();
         }
      }
   }

   private static void a(Vector3f $$0) {
      $$0.set(ayz.a($$0.x, 0.0F, 1.0F), ayz.a($$0.y, 0.0F, 1.0F), ayz.a($$0.z, 0.0F, 1.0F));
   }

   private float c(float $$0) {
      float $$1 = 1.0F - $$0;
      return 1.0F - $$1 * $$1 * $$1 * $$1;
   }

   public static float a(dvw $$0, int $$1) {
      float $$2 = (float)$$1 / 15.0F;
      float $$3 = $$2 / (4.0F - 3.0F * $$2);
      return ayz.i($$0.s(), $$3, 1.0F);
   }

   public static int a(int $$0, int $$1) {
      return $$0 << 4 | $$1 << 20;
   }

   public static int a(int $$0) {
      return $$0 >> 4 & 65535;
   }

   public static int b(int $$0) {
      return $$0 >> 20 & 65535;
   }
}
