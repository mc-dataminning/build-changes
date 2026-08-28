import java.util.function.Consumer;

public interface fyb {
   void j(int var1);

   void k(int var1);

   int F();

   int G();

   int A();

   int y();

   default fys J() {
      return new fys(this.F(), this.G(), this.A(), this.y());
   }

   default void c(int $$0, int $$1) {
      this.j($$0);
      this.k($$1);
   }

   void a(Consumer<fuj> var1);
}
