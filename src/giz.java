import java.util.Optional;

public class giz implements gix {
   private final gix.a a;
   private final gix.a b = gix.a(new feh(1536));
   private int c = 255;
   private int d = 255;
   private int e = 255;
   private int f = 255;

   public giz(gix.a $$0) {
      this.a = $$0;
   }

   @Override
   public feo getBuffer(gjh $$0) {
      if ($$0.Q()) {
         feo $$1 = this.b.getBuffer($$0);
         return new giz.a($$1, this.c, this.d, this.e, this.f);
      } else {
         feo $$2 = this.a.getBuffer($$0);
         Optional<gjh> $$3 = $$0.P();
         if ($$3.isPresent()) {
            feo $$4 = this.b.getBuffer($$3.get());
            giz.a $$5 = new giz.a($$4, this.c, this.d, this.e, this.f);
            return fer.a($$5, $$2);
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

   static record a(feo a, int b) implements feo {
      public a(feo $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, axy.a($$4, $$1, $$2, $$3));
      }

      @Override
      public feo a(float $$0, float $$1, float $$2) {
         this.a.a($$0, $$1, $$2).a(this.b);
         return this;
      }

      @Override
      public feo a(int $$0, int $$1, int $$2, int $$3) {
         return this;
      }

      @Override
      public feo a(float $$0, float $$1) {
         this.a.a($$0, $$1);
         return this;
      }

      @Override
      public feo a(int $$0, int $$1) {
         return this;
      }

      @Override
      public feo b(int $$0, int $$1) {
         return this;
      }

      @Override
      public feo b(float $$0, float $$1, float $$2) {
         return this;
      }
   }
}
