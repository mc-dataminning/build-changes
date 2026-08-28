import java.util.Optional;

public class gfa implements gez {
   private final gez.a a;
   private final gez.a b = gez.a(new fbf(1536));
   private int c = 255;
   private int d = 255;
   private int e = 255;
   private int f = 255;

   public gfa(gez.a $$0) {
      this.a = $$0;
   }

   @Override
   public fbm getBuffer(gfh $$0) {
      if ($$0.N()) {
         fbm $$1 = this.b.getBuffer($$0);
         return new gfa.a($$1, this.c, this.d, this.e, this.f);
      } else {
         fbm $$2 = this.a.getBuffer($$0);
         Optional<gfh> $$3 = $$0.M();
         if ($$3.isPresent()) {
            fbm $$4 = this.b.getBuffer($$3.get());
            gfa.a $$5 = new gfa.a($$4, this.c, this.d, this.e, this.f);
            return fbp.a($$5, $$2);
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

   static record a(fbm a, int b) implements fbm {
      public a(fbm $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, axy.b.a($$4, $$1, $$2, $$3));
      }

      @Override
      public fbm a(float $$0, float $$1, float $$2) {
         this.a.a($$0, $$1, $$2).a(this.b);
         return this;
      }

      @Override
      public fbm a(int $$0, int $$1, int $$2, int $$3) {
         return this;
      }

      @Override
      public fbm a(float $$0, float $$1) {
         this.a.a($$0, $$1);
         return this;
      }

      @Override
      public fbm a(int $$0, int $$1) {
         return this;
      }

      @Override
      public fbm b(int $$0, int $$1) {
         return this;
      }

      @Override
      public fbm b(float $$0, float $$1, float $$2) {
         return this;
      }
   }
}
