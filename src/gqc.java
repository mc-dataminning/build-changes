import java.util.Optional;

public class gqc implements gqa {
   private final gqa.a a;
   private final gqa.a b = gqa.a(new fjg(1536));
   private int c = 255;
   private int d = 255;
   private int e = 255;
   private int f = 255;

   public gqc(gqa.a $$0) {
      this.a = $$0;
   }

   @Override
   public fjn getBuffer(gqk $$0) {
      if ($$0.W()) {
         fjn $$1 = this.b.getBuffer($$0);
         return new gqc.a($$1, this.c, this.d, this.e, this.f);
      } else {
         fjn $$2 = this.a.getBuffer($$0);
         Optional<gqk> $$3 = $$0.V();
         if ($$3.isPresent()) {
            fjn $$4 = this.b.getBuffer($$3.get());
            gqc.a $$5 = new gqc.a($$4, this.c, this.d, this.e, this.f);
            return fjq.a($$5, $$2);
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

   static record a(fjn a, int b) implements fjn {
      public a(fjn $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, axw.a($$4, $$1, $$2, $$3));
      }

      @Override
      public fjn a(float $$0, float $$1, float $$2) {
         this.a.a($$0, $$1, $$2).a(this.b);
         return this;
      }

      @Override
      public fjn a(int $$0, int $$1, int $$2, int $$3) {
         return this;
      }

      @Override
      public fjn a(float $$0, float $$1) {
         this.a.a($$0, $$1);
         return this;
      }

      @Override
      public fjn a(int $$0, int $$1) {
         return this;
      }

      @Override
      public fjn b(int $$0, int $$1) {
         return this;
      }

      @Override
      public fjn b(float $$0, float $$1, float $$2) {
         return this;
      }
   }
}
