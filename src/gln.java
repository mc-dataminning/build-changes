import java.util.Optional;

public class gln implements gll {
   private final gll.a a;
   private final gll.a b = gll.a(new fgp(1536));
   private int c = 255;
   private int d = 255;
   private int e = 255;
   private int f = 255;

   public gln(gll.a $$0) {
      this.a = $$0;
   }

   @Override
   public fgw getBuffer(glv $$0) {
      if ($$0.R()) {
         fgw $$1 = this.b.getBuffer($$0);
         return new gln.a($$1, this.c, this.d, this.e, this.f);
      } else {
         fgw $$2 = this.a.getBuffer($$0);
         Optional<glv> $$3 = $$0.Q();
         if ($$3.isPresent()) {
            fgw $$4 = this.b.getBuffer($$3.get());
            gln.a $$5 = new gln.a($$4, this.c, this.d, this.e, this.f);
            return fgz.a($$5, $$2);
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

   static record a(fgw a, int b) implements fgw {
      public a(fgw $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, ayp.a($$4, $$1, $$2, $$3));
      }

      @Override
      public fgw a(float $$0, float $$1, float $$2) {
         this.a.a($$0, $$1, $$2).a(this.b);
         return this;
      }

      @Override
      public fgw a(int $$0, int $$1, int $$2, int $$3) {
         return this;
      }

      @Override
      public fgw a(float $$0, float $$1) {
         this.a.a($$0, $$1);
         return this;
      }

      @Override
      public fgw a(int $$0, int $$1) {
         return this;
      }

      @Override
      public fgw b(int $$0, int $$1) {
         return this;
      }

      @Override
      public fgw b(float $$0, float $$1, float $$2) {
         return this;
      }
   }
}
