import java.util.function.Consumer;

public class fvu implements fvr {
   private final fvp a;
   private final fvu.a b;
   private int c = 0;

   private fvu(fvu.a $$0) {
      this(0, 0, $$0);
   }

   public fvu(int $$0, int $$1, fvu.a $$2) {
      this.a = new fvp($$0, $$1);
      this.b = $$2;
   }

   public fvu a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fvt b() {
      return this.a.b();
   }

   public fvt c() {
      return this.a.c();
   }

   public <T extends fvs> T a(T $$0, fvt $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fvs> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fvs> T a(T $$0, Consumer<fvt> $$1) {
      return this.b.a(this.a, $$0, this.c++, af.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fvs> $$0) {
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

   public static fvu d() {
      return new fvu(fvu.a.b);
   }

   public static fvu e() {
      return new fvu(fvu.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fvp $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fvs> T a(fvp $$0, T $$1, int $$2, fvt $$3) {
         return (T)(switch (this) {
            case a -> (fvs)$$0.a($$1, 0, $$2, $$3);
            case b -> (fvs)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
