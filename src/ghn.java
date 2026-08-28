import java.util.Optional;

public class ghn implements ghl {
   private final ghl.a a;
   private final ghl.a b = ghl.a(new fdf(1536));
   private int c = 255;
   private int d = 255;
   private int e = 255;
   private int f = 255;

   public ghn(ghl.a $$0) {
      this.a = $$0;
   }

   @Override
   public fdm getBuffer(ghv $$0) {
      if ($$0.Q()) {
         fdm $$1 = this.b.getBuffer($$0);
         return new ghn.a($$1, this.c, this.d, this.e, this.f);
      } else {
         fdm $$2 = this.a.getBuffer($$0);
         Optional<ghv> $$3 = $$0.P();
         if ($$3.isPresent()) {
            fdm $$4 = this.b.getBuffer($$3.get());
            ghn.a $$5 = new ghn.a($$4, this.c, this.d, this.e, this.f);
            return fdp.a($$5, $$2);
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

   static record a(fdm a, int b) implements fdm {
      public a(fdm $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, axq.a($$4, $$1, $$2, $$3));
      }

      @Override
      public fdm a(float $$0, float $$1, float $$2) {
         this.a.a($$0, $$1, $$2).a(this.b);
         return this;
      }

      @Override
      public fdm a(int $$0, int $$1, int $$2, int $$3) {
         return this;
      }

      @Override
      public fdm a(float $$0, float $$1) {
         this.a.a($$0, $$1);
         return this;
      }

      @Override
      public fdm a(int $$0, int $$1) {
         return this;
      }

      @Override
      public fdm b(int $$0, int $$1) {
         return this;
      }

      @Override
      public fdm b(float $$0, float $$1, float $$2) {
         return this;
      }
   }
}
