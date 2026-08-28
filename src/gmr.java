public class gmr extends goi {
   private static final float a = 0.5F;
   private static final float b = 0.3F;
   private static final int F = 36;
   private static final int G = 180;

   gmr(gjz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      this.C = true;
      this.B = 0.96F;
      this.D *= 0.75F;
      this.k *= 0.8F;
      this.j *= 0.8F;
      this.l *= 0.8F;
   }

   @Override
   public gnm b() {
      return gnm.c;
   }

   @Override
   public int a(float $$0) {
      float $$1 = azm.a(((float)this.s + $$0) / (float)this.t, 0.0F, 1.0F);
      if ($$1 > 0.5F) {
         float $$2 = (1.0F - $$1) / 0.5F;
         return (int)(255.0F * $$2);
      } else if ($$1 < 0.3F) {
         float $$3 = $$1 / 0.3F;
         return (int)(255.0F * $$3);
      } else {
         return 255;
      }
   }

   @Override
   public void a() {
      super.a();
      if (!this.c.a_(iu.a(this.g, this.h, this.i)).l()) {
         this.k();
      } else {
         if (Math.random() > 0.95 || this.s == 1) {
            this.b(-0.05F + 0.1F * Math.random(), -0.05F + 0.1F * Math.random(), -0.05F + 0.1F * Math.random());
         }
      }
   }

   public static class a implements gnl<mb> {
      private final god a;

      public a(god $$0) {
         this.a = $$0;
      }

      public gni a(mb $$0, gjz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gmr $$8 = new gmr($$1, $$2, $$3, $$4, 0.5 - $$1.A.j(), $$1.A.h() ? $$6 : -$$6, 0.5 - $$1.A.j());
         $$8.a($$1.A.a(36, 180));
         $$8.d(1.5F);
         $$8.a(this.a);
         return $$8;
      }
   }
}
