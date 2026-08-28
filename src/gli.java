import java.util.Optional;

public class gli implements glg {
   private final glg.a a;
   private final glg.a b = glg.a(new fgi(1536));
   private int c = 255;
   private int d = 255;
   private int e = 255;
   private int f = 255;

   public gli(glg.a $$0) {
      this.a = $$0;
   }

   @Override
   public fgp getBuffer(glq $$0) {
      if ($$0.V()) {
         fgp $$1 = this.b.getBuffer($$0);
         return new gli.a($$1, this.c, this.d, this.e, this.f);
      } else {
         fgp $$2 = this.a.getBuffer($$0);
         Optional<glq> $$3 = $$0.U();
         if ($$3.isPresent()) {
            fgp $$4 = this.b.getBuffer($$3.get());
            gli.a $$5 = new gli.a($$4, this.c, this.d, this.e, this.f);
            return fgs.a($$5, $$2);
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

   static record a(fgp a, int b) implements fgp {
      public a(fgp $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, ayf.a($$4, $$1, $$2, $$3));
      }

      @Override
      public fgp a(float $$0, float $$1, float $$2) {
         this.a.a($$0, $$1, $$2).a(this.b);
         return this;
      }

      @Override
      public fgp a(int $$0, int $$1, int $$2, int $$3) {
         return this;
      }

      @Override
      public fgp a(float $$0, float $$1) {
         this.a.a($$0, $$1);
         return this;
      }

      @Override
      public fgp a(int $$0, int $$1) {
         return this;
      }

      @Override
      public fgp b(int $$0, int $$1) {
         return this;
      }

      @Override
      public fgp b(float $$0, float $$1, float $$2) {
         return this;
      }
   }
}
