import java.util.function.Consumer;

public class fws implements fwp {
   private final fwn a;
   private final fws.a b;
   private int c = 0;

   private fws(fws.a $$0) {
      this(0, 0, $$0);
   }

   public fws(int $$0, int $$1, fws.a $$2) {
      this.a = new fwn($$0, $$1);
      this.b = $$2;
   }

   public fws a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fwr b() {
      return this.a.b();
   }

   public fwr c() {
      return this.a.c();
   }

   public <T extends fwq> T a(T $$0, fwr $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fwq> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fwq> T a(T $$0, Consumer<fwr> $$1) {
      return this.b.a(this.a, $$0, this.c++, ag.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fwq> $$0) {
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

   public static fws d() {
      return new fws(fws.a.b);
   }

   public static fws e() {
      return new fws(fws.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fwn $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fwq> T a(fwn $$0, T $$1, int $$2, fwr $$3) {
         return (T)(switch (this) {
            case a -> (fwq)$$0.a($$1, 0, $$2, $$3);
            case b -> (fwq)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
