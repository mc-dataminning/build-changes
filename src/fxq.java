import java.util.function.Consumer;

public class fxq implements fxn {
   private final fxl a;
   private final fxq.a b;
   private int c = 0;

   private fxq(fxq.a $$0) {
      this(0, 0, $$0);
   }

   public fxq(int $$0, int $$1, fxq.a $$2) {
      this.a = new fxl($$0, $$1);
      this.b = $$2;
   }

   public fxq a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fxp b() {
      return this.a.b();
   }

   public fxp c() {
      return this.a.c();
   }

   public <T extends fxo> T a(T $$0, fxp $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fxo> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fxo> T a(T $$0, Consumer<fxp> $$1) {
      return this.b.a(this.a, $$0, this.c++, ag.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fxo> $$0) {
      this.a.b($$0);
   }

   @Override
   public void a() {
      this.a.a();
   }

   @Override
   public int A() {
      return this.a.A();
   }

   @Override
   public int y() {
      return this.a.y();
   }

   @Override
   public void j(int $$0) {
      this.a.j($$0);
   }

   @Override
   public void k(int $$0) {
      this.a.k($$0);
   }

   @Override
   public int F() {
      return this.a.F();
   }

   @Override
   public int G() {
      return this.a.G();
   }

   public static fxq d() {
      return new fxq(fxq.a.b);
   }

   public static fxq e() {
      return new fxq(fxq.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fxl $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fxo> T a(fxl $$0, T $$1, int $$2, fxp $$3) {
         return (T)(switch (this) {
            case a -> (fxo)$$0.a($$1, 0, $$2, $$3);
            case b -> (fxo)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
