import java.util.function.Consumer;

public class fwb implements fvy {
   private final fvw a;
   private final fwb.a b;
   private int c = 0;

   private fwb(fwb.a $$0) {
      this(0, 0, $$0);
   }

   public fwb(int $$0, int $$1, fwb.a $$2) {
      this.a = new fvw($$0, $$1);
      this.b = $$2;
   }

   public fwb a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fwa b() {
      return this.a.b();
   }

   public fwa c() {
      return this.a.c();
   }

   public <T extends fvz> T a(T $$0, fwa $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fvz> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fvz> T a(T $$0, Consumer<fwa> $$1) {
      return this.b.a(this.a, $$0, this.c++, af.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fvz> $$0) {
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

   public static fwb d() {
      return new fwb(fwb.a.b);
   }

   public static fwb e() {
      return new fwb(fwb.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fvw $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fvz> T a(fvw $$0, T $$1, int $$2, fwa $$3) {
         return (T)(switch (this) {
            case a -> (fvz)$$0.a($$1, 0, $$2, $$3);
            case b -> (fvz)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
