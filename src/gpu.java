import java.util.Optional;

public class gpu implements gps {
   private final gps.a a;
   private final gps.a b = gps.a(new fiz(1536));
   private int c = 255;
   private int d = 255;
   private int e = 255;
   private int f = 255;

   public gpu(gps.a $$0) {
      this.a = $$0;
   }

   @Override
   public fjg getBuffer(gqc $$0) {
      if ($$0.V()) {
         fjg $$1 = this.b.getBuffer($$0);
         return new gpu.a($$1, this.c, this.d, this.e, this.f);
      } else {
         fjg $$2 = this.a.getBuffer($$0);
         Optional<gqc> $$3 = $$0.U();
         if ($$3.isPresent()) {
            fjg $$4 = this.b.getBuffer($$3.get());
            gpu.a $$5 = new gpu.a($$4, this.c, this.d, this.e, this.f);
            return fjj.a($$5, $$2);
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

   static record a(fjg a, int b) implements fjg {
      public a(fjg $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, axw.a($$4, $$1, $$2, $$3));
      }

      @Override
      public fjg a(float $$0, float $$1, float $$2) {
         this.a.a($$0, $$1, $$2).a(this.b);
         return this;
      }

      @Override
      public fjg a(int $$0, int $$1, int $$2, int $$3) {
         return this;
      }

      @Override
      public fjg a(float $$0, float $$1) {
         this.a.a($$0, $$1);
         return this;
      }

      @Override
      public fjg a(int $$0, int $$1) {
         return this;
      }

      @Override
      public fjg b(int $$0, int $$1) {
         return this;
      }

      @Override
      public fjg b(float $$0, float $$1, float $$2) {
         return this;
      }
   }
}
