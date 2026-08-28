import java.util.Optional;

public class glm implements glk {
   private final glk.a a;
   private final glk.a b = glk.a(new fgo(1536));
   private int c = 255;
   private int d = 255;
   private int e = 255;
   private int f = 255;

   public glm(glk.a $$0) {
      this.a = $$0;
   }

   @Override
   public fgv getBuffer(glu $$0) {
      if ($$0.R()) {
         fgv $$1 = this.b.getBuffer($$0);
         return new glm.a($$1, this.c, this.d, this.e, this.f);
      } else {
         fgv $$2 = this.a.getBuffer($$0);
         Optional<glu> $$3 = $$0.Q();
         if ($$3.isPresent()) {
            fgv $$4 = this.b.getBuffer($$3.get());
            glm.a $$5 = new glm.a($$4, this.c, this.d, this.e, this.f);
            return fgy.a($$5, $$2);
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

   static record a(fgv a, int b) implements fgv {
      public a(fgv $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, ayp.a($$4, $$1, $$2, $$3));
      }

      @Override
      public fgv a(float $$0, float $$1, float $$2) {
         this.a.a($$0, $$1, $$2).a(this.b);
         return this;
      }

      @Override
      public fgv a(int $$0, int $$1, int $$2, int $$3) {
         return this;
      }

      @Override
      public fgv a(float $$0, float $$1) {
         this.a.a($$0, $$1);
         return this;
      }

      @Override
      public fgv a(int $$0, int $$1) {
         return this;
      }

      @Override
      public fgv b(int $$0, int $$1) {
         return this;
      }

      @Override
      public fgv b(float $$0, float $$1, float $$2) {
         return this;
      }
   }
}
