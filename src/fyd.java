import java.util.function.Consumer;

public class fyd implements fya {
   private final fxy a;
   private final fyd.a b;
   private int c = 0;

   private fyd(fyd.a $$0) {
      this(0, 0, $$0);
   }

   public fyd(int $$0, int $$1, fyd.a $$2) {
      this.a = new fxy($$0, $$1);
      this.b = $$2;
   }

   public fyd a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fyc b() {
      return this.a.b();
   }

   public fyc c() {
      return this.a.c();
   }

   public <T extends fyb> T a(T $$0, fyc $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fyb> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fyb> T a(T $$0, Consumer<fyc> $$1) {
      return this.b.a(this.a, $$0, this.c++, ag.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fyb> $$0) {
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

   public static fyd d() {
      return new fyd(fyd.a.b);
   }

   public static fyd e() {
      return new fyd(fyd.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fxy $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fyb> T a(fxy $$0, T $$1, int $$2, fyc $$3) {
         return (T)(switch (this) {
            case a -> (fyb)$$0.a($$1, 0, $$2, $$3);
            case b -> (fyb)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
