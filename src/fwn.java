import java.util.function.Consumer;

public class fwn implements fwk {
   private final fwi a;
   private final fwn.a b;
   private int c = 0;

   private fwn(fwn.a $$0) {
      this(0, 0, $$0);
   }

   public fwn(int $$0, int $$1, fwn.a $$2) {
      this.a = new fwi($$0, $$1);
      this.b = $$2;
   }

   public fwn a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fwm b() {
      return this.a.b();
   }

   public fwm c() {
      return this.a.c();
   }

   public <T extends fwl> T a(T $$0, fwm $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fwl> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fwl> T a(T $$0, Consumer<fwm> $$1) {
      return this.b.a(this.a, $$0, this.c++, ag.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fwl> $$0) {
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

   public static fwn d() {
      return new fwn(fwn.a.b);
   }

   public static fwn e() {
      return new fwn(fwn.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fwi $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fwl> T a(fwi $$0, T $$1, int $$2, fwm $$3) {
         return (T)(switch (this) {
            case a -> (fwl)$$0.a($$1, 0, $$2, $$3);
            case b -> (fwl)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
