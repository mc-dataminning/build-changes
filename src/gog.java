public class gog extends gpx {
   private static final float a = 0.3F;
   private static final float b = 0.1F;
   private static final float F = 0.5F;
   private static final float G = 0.3F;
   private static final int H = 36;
   private static final int I = 180;

   gog(glo $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      this.C = true;
      this.B = 0.96F;
      this.D *= 0.75F;
      this.k *= 0.8F;
      this.j *= 0.8F;
      this.l *= 0.8F;
   }

   @Override
   public gpb b() {
      return gpb.c;
   }

   @Override
   public int a(float $$0) {
      return (int)(255.0F * b(this.f((float)this.s + $$0), 0.1F, 0.3F));
   }

   @Override
   public void a() {
      super.a();
      if (!this.c.a_(iw.a(this.g, this.h, this.i)).l()) {
         this.k();
      } else {
         this.e(b(this.f((float)this.s), 0.3F, 0.5F));
         if (Math.random() > 0.95 || this.s == 1) {
            this.b(-0.05F + 0.1F * Math.random(), -0.05F + 0.1F * Math.random(), -0.05F + 0.1F * Math.random());
         }
      }
   }

   private float f(float $$0) {
      return azz.a($$0 / (float)this.t, 0.0F, 1.0F);
   }

   private static float b(float $$0, float $$1, float $$2) {
      if ($$0 >= 1.0F - $$1) {
         return (1.0F - $$0) / $$1;
      } else {
         return $$0 <= $$2 ? $$0 / $$2 : 1.0F;
      }
   }

   public static class a implements gpa<md> {
      private final gps a;

      public a(gps $$0) {
         this.a = $$0;
      }

      public gox a(md $$0, glo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gog $$8 = new gog($$1, $$2, $$3, $$4, 0.5 - $$1.A.j(), $$1.A.h() ? $$6 : -$$6, 0.5 - $$1.A.j());
         $$8.a($$1.A.a(36, 180));
         $$8.d(1.5F);
         $$8.a(this.a);
         $$8.e(0.0F);
         return $$8;
      }
   }
}
