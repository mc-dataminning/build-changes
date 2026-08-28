public class gan extends gbk {
   gan(fxv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public gbg b() {
      return gbg.b;
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.a(this.n().d($$0, $$1, $$2));
      this.l();
   }

   @Override
   public float b(float $$0) {
      float $$1 = ((float)this.s + $$0) / (float)this.t;
      return this.D * (1.0F - $$1 * $$1 * 0.5F);
   }

   @Override
   public int a(float $$0) {
      float $$1 = ((float)this.s + $$0) / (float)this.t;
      $$1 = ayz.a($$1, 0.0F, 1.0F);
      int $$2 = super.a($$0);
      int $$3 = $$2 & 0xFF;
      int $$4 = $$2 >> 16 & 0xFF;
      $$3 += (int)($$1 * 15.0F * 16.0F);
      if ($$3 > 240) {
         $$3 = 240;
      }

      return $$3 | $$4 << 16;
   }

   public static class a implements gbf<lm> {
      private final gbx a;

      public a(gbx $$0) {
         this.a = $$0;
      }

      public gbc a(lm $$0, fxv $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gan $$8 = new gan($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$8.a(this.a);
         return $$8;
      }
   }

   public static class b implements gbf<lm> {
      private final gbx a;

      public b(gbx $$0) {
         this.a = $$0;
      }

      public gbc a(lm $$0, fxv $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gan $$8 = new gan($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$8.a(this.a);
         $$8.d(0.5F);
         return $$8;
      }
   }
}
