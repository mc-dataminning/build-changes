import java.util.Optional;

public class gdn implements gdm {
   private final gdm.a a;
   private final gdm.a b = gdm.a(new ezr(1536));
   private int c = 255;
   private int d = 255;
   private int e = 255;
   private int f = 255;

   public gdn(gdm.a $$0) {
      this.a = $$0;
   }

   @Override
   public faa getBuffer(gdu $$0) {
      if ($$0.M()) {
         faa $$1 = this.b.getBuffer($$0);
         return new gdn.a($$1, this.c, this.d, this.e, this.f);
      } else {
         faa $$2 = this.a.getBuffer($$0);
         Optional<gdu> $$3 = $$0.L();
         if ($$3.isPresent()) {
            faa $$4 = this.b.getBuffer($$3.get());
            gdn.a $$5 = new gdn.a($$4, this.c, this.d, this.e, this.f);
            return fad.a($$5, $$2);
         } else {
            return $$2;
         }
      }
   }

   public void a(int $$0, int $$1, int $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public void a() {
      this.b.b();
   }

   static class a extends ezv {
      private final faa f;
      private double g;
      private double h;
      private double i;
      private float j;
      private float k;

      a(faa $$0, int $$1, int $$2, int $$3, int $$4) {
         this.f = $$0;
         super.b($$1, $$2, $$3, $$4);
      }

      @Override
      public void b(int $$0, int $$1, int $$2, int $$3) {
      }

      @Override
      public void l() {
      }

      @Override
      public faa a(double $$0, double $$1, double $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         return this;
      }

      @Override
      public faa a(int $$0, int $$1, int $$2, int $$3) {
         return this;
      }

      @Override
      public faa a(float $$0, float $$1) {
         this.j = $$0;
         this.k = $$1;
         return this;
      }

      @Override
      public faa a(int $$0, int $$1) {
         return this;
      }

      @Override
      public faa b(int $$0, int $$1) {
         return this;
      }

      @Override
      public faa a(float $$0, float $$1, float $$2) {
         return this;
      }

      @Override
      public void a(
         float $$0,
         float $$1,
         float $$2,
         float $$3,
         float $$4,
         float $$5,
         float $$6,
         float $$7,
         float $$8,
         int $$9,
         int $$10,
         float $$11,
         float $$12,
         float $$13
      ) {
         this.f.a((double)$$0, (double)$$1, (double)$$2).a(this.b, this.c, this.d, this.e).a($$7, $$8).e();
      }

      @Override
      public void e() {
         this.f.a(this.g, this.h, this.i).a(this.b, this.c, this.d, this.e).a(this.j, this.k).e();
      }
   }
}
