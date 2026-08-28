import java.util.Optional;

public class ggw implements ggv {
   private final ggv.a a;
   private final ggv.a b = ggv.a(new fcr(1536));
   private int c = 255;
   private int d = 255;
   private int e = 255;
   private int f = 255;

   public ggw(ggv.a $$0) {
      this.a = $$0;
   }

   @Override
   public fcy getBuffer(ghe $$0) {
      if ($$0.R()) {
         fcy $$1 = this.b.getBuffer($$0);
         return new ggw.a($$1, this.c, this.d, this.e, this.f);
      } else {
         fcy $$2 = this.a.getBuffer($$0);
         Optional<ghe> $$3 = $$0.Q();
         if ($$3.isPresent()) {
            fcy $$4 = this.b.getBuffer($$3.get());
            ggw.a $$5 = new ggw.a($$4, this.c, this.d, this.e, this.f);
            return fdb.a($$5, $$2);
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

   static record a(fcy a, int b) implements fcy {
      public a(fcy $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, axn.a($$4, $$1, $$2, $$3));
      }

      @Override
      public fcy a(float $$0, float $$1, float $$2) {
         this.a.a($$0, $$1, $$2).a(this.b);
         return this;
      }

      @Override
      public fcy a(int $$0, int $$1, int $$2, int $$3) {
         return this;
      }

      @Override
      public fcy a(float $$0, float $$1) {
         this.a.a($$0, $$1);
         return this;
      }

      @Override
      public fcy a(int $$0, int $$1) {
         return this;
      }

      @Override
      public fcy b(int $$0, int $$1) {
         return this;
      }

      @Override
      public fcy b(float $$0, float $$1, float $$2) {
         return this;
      }
   }
}
