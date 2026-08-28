import java.util.Optional;

public class gqo implements gqm {
   private final gqm.a a;
   private final gqm.a b = gqm.a(new fjv(1536));
   private int c = 255;
   private int d = 255;
   private int e = 255;
   private int f = 255;

   public gqo(gqm.a $$0) {
      this.a = $$0;
   }

   @Override
   public fkc getBuffer(gqx $$0) {
      if ($$0.Z()) {
         fkc $$1 = this.b.getBuffer($$0);
         return new gqo.a($$1, this.c, this.d, this.e, this.f);
      } else {
         fkc $$2 = this.a.getBuffer($$0);
         Optional<gqx> $$3 = $$0.Y();
         if ($$3.isPresent()) {
            fkc $$4 = this.b.getBuffer($$3.get());
            gqo.a $$5 = new gqo.a($$4, this.c, this.d, this.e, this.f);
            return fkf.a($$5, $$2);
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

   static record a(fkc a, int b) implements fkc {
      public a(fkc $$0, int $$1, int $$2, int $$3, int $$4) {
         this($$0, axw.a($$4, $$1, $$2, $$3));
      }

      @Override
      public fkc a(float $$0, float $$1, float $$2) {
         this.a.a($$0, $$1, $$2).a(this.b);
         return this;
      }

      @Override
      public fkc a(int $$0, int $$1, int $$2, int $$3) {
         return this;
      }

      @Override
      public fkc a(float $$0, float $$1) {
         this.a.a($$0, $$1);
         return this;
      }

      @Override
      public fkc a(int $$0, int $$1) {
         return this;
      }

      @Override
      public fkc b(int $$0, int $$1) {
         return this;
      }

      @Override
      public fkc b(float $$0, float $$1, float $$2) {
         return this;
      }
   }
}
