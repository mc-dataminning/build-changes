import java.util.function.Consumer;

public class fyf implements fyc {
   private final fya a;
   private final fyf.a b;
   private int c = 0;

   private fyf(fyf.a $$0) {
      this(0, 0, $$0);
   }

   public fyf(int $$0, int $$1, fyf.a $$2) {
      this.a = new fya($$0, $$1);
      this.b = $$2;
   }

   public fyf a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fye b() {
      return this.a.b();
   }

   public fye c() {
      return this.a.c();
   }

   public <T extends fyd> T a(T $$0, fye $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fyd> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fyd> T a(T $$0, Consumer<fye> $$1) {
      return this.b.a(this.a, $$0, this.c++, ag.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fyd> $$0) {
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

   public static fyf d() {
      return new fyf(fyf.a.b);
   }

   public static fyf e() {
      return new fyf(fyf.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fya $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fyd> T a(fya $$0, T $$1, int $$2, fye $$3) {
         return (T)(switch (this) {
            case a -> (fyd)$$0.a($$1, 0, $$2, $$3);
            case b -> (fyd)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
