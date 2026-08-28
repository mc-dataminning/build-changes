import java.util.Optional;

public class ghy implements ghw {
   private final ghw.a a;
   private final ghw.a b = ghw.a(new fdq(1536));
   private int c = 255;
   private int d = 255;
   private int e = 255;
   private int f = 255;

   public ghy(ghw.a $$0) {
      this.a = $$0;
   }

   @Override
   public fdx getBuffer(gig $$0) {
      if ($$0.Q()) {
         fdx $$1 = this.b.getBuffer($$0);
         return new ghy.a($$1, this.c, this.d, this.e, this.f);
      } else {
         fdx $$2 = this.a.getBuffer($$0);
         Optional<gig> $$3 = $$0.P();
         if ($$3.isPresent()) {
            fdx $$4 = this.b.getBuffer($$3.get());
            ghy.a $$5 = new ghy.a($$4, this.c, this.d, this.e, this.f);
            return fea.a($$5, $$2);
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

   static record a(fdx a, int b) implements fdx {
      public a(fdx $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, axu.a($$4, $$1, $$2, $$3));
      }

      @Override
      public fdx a(float $$0, float $$1, float $$2) {
         this.a.a($$0, $$1, $$2).a(this.b);
         return this;
      }

      @Override
      public fdx a(int $$0, int $$1, int $$2, int $$3) {
         return this;
      }

      @Override
      public fdx a(float $$0, float $$1) {
         this.a.a($$0, $$1);
         return this;
      }

      @Override
      public fdx a(int $$0, int $$1) {
         return this;
      }

      @Override
      public fdx b(int $$0, int $$1) {
         return this;
      }

      @Override
      public fdx b(float $$0, float $$1, float $$2) {
         return this;
      }
   }
}
