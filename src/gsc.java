import java.util.Optional;

public class gsc implements gsa {
   private final gsa.a a;
   private final gsa.a b = gsa.a(new fll(1536));
   private int c = 255;
   private int d = 255;
   private int e = 255;
   private int f = 255;

   public gsc(gsa.a $$0) {
      this.a = $$0;
   }

   @Override
   public flr getBuffer(gsl $$0) {
      if ($$0.S()) {
         flr $$1 = this.b.getBuffer($$0);
         return new gsc.a($$1, this.c, this.d, this.e, this.f);
      } else {
         flr $$2 = this.a.getBuffer($$0);
         Optional<gsl> $$3 = $$0.R();
         if ($$3.isPresent()) {
            flr $$4 = this.b.getBuffer($$3.get());
            gsc.a $$5 = new gsc.a($$4, this.c, this.d, this.e, this.f);
            return flu.a($$5, $$2);
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

   static record a(flr a, int b) implements flr {
      public a(flr $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, axy.a($$4, $$1, $$2, $$3));
      }

      @Override
      public flr a(float $$0, float $$1, float $$2) {
         this.a.a($$0, $$1, $$2).a(this.b);
         return this;
      }

      @Override
      public flr a(int $$0, int $$1, int $$2, int $$3) {
         return this;
      }

      @Override
      public flr a(float $$0, float $$1) {
         this.a.a($$0, $$1);
         return this;
      }

      @Override
      public flr a(int $$0, int $$1) {
         return this;
      }

      @Override
      public flr b(int $$0, int $$1) {
         return this;
      }

      @Override
      public flr b(float $$0, float $$1, float $$2) {
         return this;
      }
   }
}
