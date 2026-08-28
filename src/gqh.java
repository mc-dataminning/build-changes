import java.util.Optional;

public class gqh extends gqk {
   gqh(gmb $$0, gqf $$1, double $$2, double $$3, double $$4) {
      super($$0, $$2, $$3 - 0.125, $$4);
      this.b(0.01F, 0.01F);
      this.a($$1);
      this.D = this.D * (this.r.i() * 0.6F + 0.2F);
      this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      this.n = false;
      this.B = 1.0F;
      this.u = 0.0F;
   }

   gqh(gmb $$0, gqf $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
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
   public gpo b() {
      return gpo.b;
   }

   public static class a implements gpn<mc> {
      private final gqf a;

      public a(gqf $$0) {
         this.a = $$0;
      }

      public gpk a(mc $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         azx $$8 = $$1.A;
         double $$9 = $$8.k() * 1.0E-6F;
         double $$10 = $$8.k() * 1.0E-4F;
         double $$11 = $$8.k() * 1.0E-6F;
         gqh $$12 = new gqh($$1, this.a, $$2, $$3, $$4, $$9, $$10, $$11);
         $$12.a(0.9F, 0.4F, 0.5F);
         return $$12;
      }
   }

   public static class b implements gpn<mc> {
      private final gqf a;

      public b(gqf $$0) {
         this.a = $$0;
      }

      public gpk a(mc $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gqh $$8 = new gqh($$1, this.a, $$2, $$3, $$4, 0.0, -0.8F, 0.0) {
            @Override
            public Optional<lv> o() {
               return Optional.of(lv.a);
            }
         };
         $$8.t = azo.b($$1.A, 500, 1000);
         $$8.u = 0.01F;
         $$8.a(0.32F, 0.5F, 0.22F);
         return $$8;
      }
   }

   public static class c implements gpn<mc> {
      private final gqf a;

      public c(gqf $$0) {
         this.a = $$0;
      }

      public gpk a(mc $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gqh $$8 = new gqh($$1, this.a, $$2, $$3, $$4);
         $$8.a(0.4F, 0.4F, 0.7F);
         return $$8;
      }
   }

   public static class d implements gpn<mc> {
      private final gqf a;

      public d(gqf $$0) {
         this.a = $$0;
      }

      public gpk a(mc $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         double $$8 = (double)$$1.A.i() * -1.9 * (double)$$1.A.i() * 0.1;
         gqh $$9 = new gqh($$1, this.a, $$2, $$3, $$4, 0.0, $$8, 0.0);
         $$9.a(0.1F, 0.1F, 0.3F);
         $$9.b(0.001F, 0.001F);
         return $$9;
      }
   }
}
