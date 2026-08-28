import java.util.Optional;

public class geu implements get {
   private final get.a a;
   private final get.a b = get.a(new faz(1536));
   private int c = 255;
   private int d = 255;
   private int e = 255;
   private int f = 255;

   public geu(get.a $$0) {
      this.a = $$0;
   }

   @Override
   public fbg getBuffer(gfb $$0) {
      if ($$0.K()) {
         fbg $$1 = this.b.getBuffer($$0);
         return new geu.a($$1, this.c, this.d, this.e, this.f);
      } else {
         fbg $$2 = this.a.getBuffer($$0);
         Optional<gfb> $$3 = $$0.J();
         if ($$3.isPresent()) {
            fbg $$4 = this.b.getBuffer($$3.get());
            geu.a $$5 = new geu.a($$4, this.c, this.d, this.e, this.f);
            return fbj.a($$5, $$2);
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

   static record a(fbg a, int b) implements fbg {
      public a(fbg $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, axx.b.a($$4, $$1, $$2, $$3));
      }

      @Override
      public fbg a(float $$0, float $$1, float $$2) {
         this.a.a($$0, $$1, $$2).a(this.b);
         return this;
      }

      @Override
      public fbg a(int $$0, int $$1, int $$2, int $$3) {
         return this;
      }

      @Override
      public fbg a(float $$0, float $$1) {
         this.a.a($$0, $$1);
         return this;
      }

      @Override
      public fbg a(int $$0, int $$1) {
         return this;
      }

      @Override
      public fbg b(int $$0, int $$1) {
         return this;
      }

      @Override
      public fbg b(float $$0, float $$1, float $$2) {
         return this;
      }
   }
}
