import java.util.Optional;

public class gse implements gsc {
   private final gsc.a a;
   private final gsc.a b = gsc.a(new fln(1536));
   private int c = 255;
   private int d = 255;
   private int e = 255;
   private int f = 255;

   public gse(gsc.a $$0) {
      this.a = $$0;
   }

   @Override
   public flt getBuffer(gsn $$0) {
      if ($$0.S()) {
         flt $$1 = this.b.getBuffer($$0);
         return new gse.a($$1, this.c, this.d, this.e, this.f);
      } else {
         flt $$2 = this.a.getBuffer($$0);
         Optional<gsn> $$3 = $$0.R();
         if ($$3.isPresent()) {
            flt $$4 = this.b.getBuffer($$3.get());
            gse.a $$5 = new gse.a($$4, this.c, this.d, this.e, this.f);
            return flw.a($$5, $$2);
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

   static record a(flt a, int b) implements flt {
      public a(flt $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, aya.a($$4, $$1, $$2, $$3));
      }

      @Override
      public flt a(float $$0, float $$1, float $$2) {
         this.a.a($$0, $$1, $$2).a(this.b);
         return this;
      }

      @Override
      public flt a(int $$0, int $$1, int $$2, int $$3) {
         return this;
      }

      @Override
      public flt a(float $$0, float $$1) {
         this.a.a($$0, $$1);
         return this;
      }

      @Override
      public flt a(int $$0, int $$1) {
         return this;
      }

      @Override
      public flt b(int $$0, int $$1) {
         return this;
      }

      @Override
      public flt b(float $$0, float $$1, float $$2) {
         return this;
      }
   }
}
