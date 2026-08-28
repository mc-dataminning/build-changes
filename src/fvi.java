import java.util.function.Consumer;

public class fvi implements fvf {
   private final fvd a;
   private final fvi.a b;
   private int c = 0;

   private fvi(fvi.a $$0) {
      this(0, 0, $$0);
   }

   public fvi(int $$0, int $$1, fvi.a $$2) {
      this.a = new fvd($$0, $$1);
      this.b = $$2;
   }

   public fvi a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fvh b() {
      return this.a.b();
   }

   public fvh c() {
      return this.a.c();
   }

   public <T extends fvg> T a(T $$0, fvh $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fvg> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fvg> T a(T $$0, Consumer<fvh> $$1) {
      return this.b.a(this.a, $$0, this.c++, af.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fvg> $$0) {
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

   public static fvi d() {
      return new fvi(fvi.a.b);
   }

   public static fvi e() {
      return new fvi(fvi.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fvd $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fvg> T a(fvd $$0, T $$1, int $$2, fvh $$3) {
         return (T)(switch (this) {
            case a -> (fvg)$$0.a($$1, 0, $$2, $$3);
            case b -> (fvg)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
