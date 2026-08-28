import java.util.Optional;

public class goa implements gny {
   private final gny.a a;
   private final gny.a b = gny.a(new fhl(1536));
   private int c = 255;
   private int d = 255;
   private int e = 255;
   private int f = 255;

   public goa(gny.a $$0) {
      this.a = $$0;
   }

   @Override
   public fhs getBuffer(goi $$0) {
      if ($$0.V()) {
         fhs $$1 = this.b.getBuffer($$0);
         return new goa.a($$1, this.c, this.d, this.e, this.f);
      } else {
         fhs $$2 = this.a.getBuffer($$0);
         Optional<goi> $$3 = $$0.U();
         if ($$3.isPresent()) {
            fhs $$4 = this.b.getBuffer($$3.get());
            goa.a $$5 = new goa.a($$4, this.c, this.d, this.e, this.f);
            return fhv.a($$5, $$2);
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

   static record a(fhs a, int b) implements fhs {
      public a(fhs $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, axu.a($$4, $$1, $$2, $$3));
      }

      @Override
      public fhs a(float $$0, float $$1, float $$2) {
         this.a.a($$0, $$1, $$2).a(this.b);
         return this;
      }

      @Override
      public fhs a(int $$0, int $$1, int $$2, int $$3) {
         return this;
      }

      @Override
      public fhs a(float $$0, float $$1) {
         this.a.a($$0, $$1);
         return this;
      }

      @Override
      public fhs a(int $$0, int $$1) {
         return this;
      }

      @Override
      public fhs b(int $$0, int $$1) {
         return this;
      }

      @Override
      public fhs b(float $$0, float $$1, float $$2) {
         return this;
      }
   }
}
