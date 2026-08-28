import java.util.Optional;

public class gma implements gly {
   private final gly.a a;
   private final gly.a b = gly.a(new ffr(1536));
   private int c = 255;
   private int d = 255;
   private int e = 255;
   private int f = 255;

   public gma(gly.a $$0) {
      this.a = $$0;
   }

   @Override
   public ffy getBuffer(gmi $$0) {
      if ($$0.V()) {
         ffy $$1 = this.b.getBuffer($$0);
         return new gma.a($$1, this.c, this.d, this.e, this.f);
      } else {
         ffy $$2 = this.a.getBuffer($$0);
         Optional<gmi> $$3 = $$0.U();
         if ($$3.isPresent()) {
            ffy $$4 = this.b.getBuffer($$3.get());
            gma.a $$5 = new gma.a($$4, this.c, this.d, this.e, this.f);
            return fgb.a($$5, $$2);
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

   static record a(ffy a, int b) implements ffy {
      public a(ffy $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, axk.a($$4, $$1, $$2, $$3));
      }

      @Override
      public ffy a(float $$0, float $$1, float $$2) {
         this.a.a($$0, $$1, $$2).a(this.b);
         return this;
      }

      @Override
      public ffy a(int $$0, int $$1, int $$2, int $$3) {
         return this;
      }

      @Override
      public ffy a(float $$0, float $$1) {
         this.a.a($$0, $$1);
         return this;
      }

      @Override
      public ffy a(int $$0, int $$1) {
         return this;
      }

      @Override
      public ffy b(int $$0, int $$1) {
         return this;
      }

      @Override
      public ffy b(float $$0, float $$1, float $$2) {
         return this;
      }
   }
}
