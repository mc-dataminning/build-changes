import java.util.Optional;

public class gey implements gex {
   private final gex.a a;
   private final gex.a b = gex.a(new fbd(1536));
   private int c = 255;
   private int d = 255;
   private int e = 255;
   private int f = 255;

   public gey(gex.a $$0) {
      this.a = $$0;
   }

   @Override
   public fbk getBuffer(gff $$0) {
      if ($$0.M()) {
         fbk $$1 = this.b.getBuffer($$0);
         return new gey.a($$1, this.c, this.d, this.e, this.f);
      } else {
         fbk $$2 = this.a.getBuffer($$0);
         Optional<gff> $$3 = $$0.L();
         if ($$3.isPresent()) {
            fbk $$4 = this.b.getBuffer($$3.get());
            gey.a $$5 = new gey.a($$4, this.c, this.d, this.e, this.f);
            return fbn.a($$5, $$2);
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

   static record a(fbk a, int b) implements fbk {
      public a(fbk $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, axy.b.a($$4, $$1, $$2, $$3));
      }

      @Override
      public fbk a(float $$0, float $$1, float $$2) {
         this.a.a($$0, $$1, $$2).a(this.b);
         return this;
      }

      @Override
      public fbk a(int $$0, int $$1, int $$2, int $$3) {
         return this;
      }

      @Override
      public fbk a(float $$0, float $$1) {
         this.a.a($$0, $$1);
         return this;
      }

      @Override
      public fbk a(int $$0, int $$1) {
         return this;
      }

      @Override
      public fbk b(int $$0, int $$1) {
         return this;
      }

      @Override
      public fbk b(float $$0, float $$1, float $$2) {
         return this;
      }
   }
}
