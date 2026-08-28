import java.util.Optional;

public class gij implements gih {
   private final gih.a a;
   private final gih.a b = gih.a(new fdy(1536));
   private int c = 255;
   private int d = 255;
   private int e = 255;
   private int f = 255;

   public gij(gih.a $$0) {
      this.a = $$0;
   }

   @Override
   public fef getBuffer(gir $$0) {
      if ($$0.Q()) {
         fef $$1 = this.b.getBuffer($$0);
         return new gij.a($$1, this.c, this.d, this.e, this.f);
      } else {
         fef $$2 = this.a.getBuffer($$0);
         Optional<gir> $$3 = $$0.P();
         if ($$3.isPresent()) {
            fef $$4 = this.b.getBuffer($$3.get());
            gij.a $$5 = new gij.a($$4, this.c, this.d, this.e, this.f);
            return fei.a($$5, $$2);
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

   static record a(fef a, int b) implements fef {
      public a(fef $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, axv.a($$4, $$1, $$2, $$3));
      }

      @Override
      public fef a(float $$0, float $$1, float $$2) {
         this.a.a($$0, $$1, $$2).a(this.b);
         return this;
      }

      @Override
      public fef a(int $$0, int $$1, int $$2, int $$3) {
         return this;
      }

      @Override
      public fef a(float $$0, float $$1) {
         this.a.a($$0, $$1);
         return this;
      }

      @Override
      public fef a(int $$0, int $$1) {
         return this;
      }

      @Override
      public fef b(int $$0, int $$1) {
         return this;
      }

      @Override
      public fef b(float $$0, float $$1, float $$2) {
         return this;
      }
   }
}
