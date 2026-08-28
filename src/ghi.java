import java.util.Optional;

public class ghi implements ghg {
   private final ghg.a a;
   private final ghg.a b = ghg.a(new fdb(1536));
   private int c = 255;
   private int d = 255;
   private int e = 255;
   private int f = 255;

   public ghi(ghg.a $$0) {
      this.a = $$0;
   }

   @Override
   public fdi getBuffer(ghq $$0) {
      if ($$0.Q()) {
         fdi $$1 = this.b.getBuffer($$0);
         return new ghi.a($$1, this.c, this.d, this.e, this.f);
      } else {
         fdi $$2 = this.a.getBuffer($$0);
         Optional<ghq> $$3 = $$0.P();
         if ($$3.isPresent()) {
            fdi $$4 = this.b.getBuffer($$3.get());
            ghi.a $$5 = new ghi.a($$4, this.c, this.d, this.e, this.f);
            return fdl.a($$5, $$2);
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

   static record a(fdi a, int b) implements fdi {
      public a(fdi $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, axo.a($$4, $$1, $$2, $$3));
      }

      @Override
      public fdi a(float $$0, float $$1, float $$2) {
         this.a.a($$0, $$1, $$2).a(this.b);
         return this;
      }

      @Override
      public fdi a(int $$0, int $$1, int $$2, int $$3) {
         return this;
      }

      @Override
      public fdi a(float $$0, float $$1) {
         this.a.a($$0, $$1);
         return this;
      }

      @Override
      public fdi a(int $$0, int $$1) {
         return this;
      }

      @Override
      public fdi b(int $$0, int $$1) {
         return this;
      }

      @Override
      public fdi b(float $$0, float $$1, float $$2) {
         return this;
      }
   }
}
