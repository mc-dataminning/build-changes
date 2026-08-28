import java.util.Optional;

public class ggm extends ggp {
   ggm(gci $$0, ggk $$1, double $$2, double $$3, double $$4) {
      super($$0, $$2, $$3 - 0.125, $$4);
      this.b(0.01F, 0.01F);
      this.a($$1);
      this.D = this.D * (this.r.i() * 0.6F + 0.2F);
      this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      this.n = false;
      this.B = 1.0F;
      this.u = 0.0F;
   }

   ggm(gci $$0, ggk $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      super($$0, $$2, $$3 - 0.125, $$4, $$5, $$6, $$7);
      this.b(0.01F, 0.01F);
      this.a($$1);
      this.D = this.D * (this.r.i() * 0.6F + 0.6F);
      this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      this.n = false;
      this.B = 1.0F;
      this.u = 0.0F;
   }

   @Override
   public gft b() {
      return gft.b;
   }

   public static class a implements gfs<lv> {
      private final ggk a;

      public a(ggk $$0) {
         this.a = $$0;
      }

      public gfp a(lv $$0, gci $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         azs $$8 = $$1.A;
         double $$9 = $$8.k() * 1.0E-6F;
         double $$10 = $$8.k() * 1.0E-4F;
         double $$11 = $$8.k() * 1.0E-6F;
         ggm $$12 = new ggm($$1, this.a, $$2, $$3, $$4, $$9, $$10, $$11);
         $$12.a(0.9F, 0.4F, 0.5F);
         return $$12;
      }
   }

   public static class b implements gfs<lv> {
      private final ggk a;

      public b(ggk $$0) {
         this.a = $$0;
      }

      public gfp a(lv $$0, gci $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         ggm $$8 = new ggm($$1, this.a, $$2, $$3, $$4, 0.0, -0.8F, 0.0) {
            @Override
            public Optional<lo> o() {
               return Optional.of(lo.a);
            }
         };
         $$8.t = azk.b($$1.A, 500, 1000);
         $$8.u = 0.01F;
         $$8.a(0.32F, 0.5F, 0.22F);
         return $$8;
      }
   }

   public static class c implements gfs<lv> {
      private final ggk a;

      public c(ggk $$0) {
         this.a = $$0;
      }

      public gfp a(lv $$0, gci $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         ggm $$8 = new ggm($$1, this.a, $$2, $$3, $$4);
         $$8.a(0.4F, 0.4F, 0.7F);
         return $$8;
      }
   }

   public static class d implements gfs<lv> {
      private final ggk a;

      public d(ggk $$0) {
         this.a = $$0;
      }

      public gfp a(lv $$0, gci $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         double $$8 = (double)$$1.A.i() * -1.9 * (double)$$1.A.i() * 0.1;
         ggm $$9 = new ggm($$1, this.a, $$2, $$3, $$4, 0.0, $$8, 0.0);
         $$9.a(0.1F, 0.1F, 0.3F);
         $$9.b(0.001F, 0.001F);
         return $$9;
      }
   }
}
