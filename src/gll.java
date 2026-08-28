import java.util.Optional;

public class gll implements glj {
   private final glj.a a;
   private final glj.a b = glj.a(new fgn(1536));
   private int c = 255;
   private int d = 255;
   private int e = 255;
   private int f = 255;

   public gll(glj.a $$0) {
      this.a = $$0;
   }

   @Override
   public fgu getBuffer(glt $$0) {
      if ($$0.R()) {
         fgu $$1 = this.b.getBuffer($$0);
         return new gll.a($$1, this.c, this.d, this.e, this.f);
      } else {
         fgu $$2 = this.a.getBuffer($$0);
         Optional<glt> $$3 = $$0.Q();
         if ($$3.isPresent()) {
            fgu $$4 = this.b.getBuffer($$3.get());
            gll.a $$5 = new gll.a($$4, this.c, this.d, this.e, this.f);
            return fgx.a($$5, $$2);
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

   static record a(fgu a, int b) implements fgu {
      public a(fgu $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, ayp.a($$4, $$1, $$2, $$3));
      }

      @Override
      public fgu a(float $$0, float $$1, float $$2) {
         this.a.a($$0, $$1, $$2).a(this.b);
         return this;
      }

      @Override
      public fgu a(int $$0, int $$1, int $$2, int $$3) {
         return this;
      }

      @Override
      public fgu a(float $$0, float $$1) {
         this.a.a($$0, $$1);
         return this;
      }

      @Override
      public fgu a(int $$0, int $$1) {
         return this;
      }

      @Override
      public fgu b(int $$0, int $$1) {
         return this;
      }

      @Override
      public fgu b(float $$0, float $$1, float $$2) {
         return this;
      }
   }
}
