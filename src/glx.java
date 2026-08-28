import java.util.Optional;

public class glx implements glv {
   private final glv.a a;
   private final glv.a b = glv.a(new ffp(1536));
   private int c = 255;
   private int d = 255;
   private int e = 255;
   private int f = 255;

   public glx(glv.a $$0) {
      this.a = $$0;
   }

   @Override
   public ffw getBuffer(gmf $$0) {
      if ($$0.V()) {
         ffw $$1 = this.b.getBuffer($$0);
         return new glx.a($$1, this.c, this.d, this.e, this.f);
      } else {
         ffw $$2 = this.a.getBuffer($$0);
         Optional<gmf> $$3 = $$0.U();
         if ($$3.isPresent()) {
            ffw $$4 = this.b.getBuffer($$3.get());
            glx.a $$5 = new glx.a($$4, this.c, this.d, this.e, this.f);
            return ffz.a($$5, $$2);
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

   static record a(ffw a, int b) implements ffw {
      public a(ffw $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, axj.a($$4, $$1, $$2, $$3));
      }

      @Override
      public ffw a(float $$0, float $$1, float $$2) {
         this.a.a($$0, $$1, $$2).a(this.b);
         return this;
      }

      @Override
      public ffw a(int $$0, int $$1, int $$2, int $$3) {
         return this;
      }

      @Override
      public ffw a(float $$0, float $$1) {
         this.a.a($$0, $$1);
         return this;
      }

      @Override
      public ffw a(int $$0, int $$1) {
         return this;
      }

      @Override
      public ffw b(int $$0, int $$1) {
         return this;
      }

      @Override
      public ffw b(float $$0, float $$1, float $$2) {
         return this;
      }
   }
}
