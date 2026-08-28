import org.joml.Quaternionf;

public class gcc extends gcr {
   private static final float a = 1.0472F;
   private int b;

   gcc(fyj $$0, double $$1, double $$2, double $$3, int $$4) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      this.D = 0.85F;
      this.b = $$4;
      this.t = 30;
      this.u = 0.0F;
      this.j = 0.0;
      this.k = 0.1;
      this.l = 0.0;
   }

   @Override
   public float b(float $$0) {
      return this.D * ayg.a(((float)this.s + $$0) / (float)this.t * 0.75F, 0.0F, 1.0F);
   }

   @Override
   public void a(faq $$0, ffe $$1, float $$2) {
      if (this.b <= 0) {
         this.y = 1.0F - ayg.a(((float)this.s + $$2) / (float)this.t, 0.0F, 1.0F);
         Quaternionf $$3 = new Quaternionf();
         $$3.rotationX(-1.0472F);
         this.a($$0, $$1, $$3, $$2);
         $$3.rotationYXZ((float) -Math.PI, 1.0472F, 0.0F);
         this.a($$0, $$1, $$3, $$2);
      }
   }

   @Override
   public int a(float $$0) {
      return 240;
   }

   @Override
   public gbv b() {
      return gbv.c;
   }

   @Override
   public void a() {
      if (this.b > 0) {
         this.b--;
      } else {
         super.a();
      }
   }

   public static class a implements gbu<lm> {
      private final gcm a;

      public a(gcm $$0) {
         this.a = $$0;
      }

      public gbr a(lm $$0, fyj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gcc $$8 = new gcc($$1, $$2, $$3, $$4, $$0.b());
         $$8.a(this.a);
         $$8.e(1.0F);
         return $$8;
      }
   }
}
