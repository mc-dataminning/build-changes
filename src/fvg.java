import java.util.function.Consumer;

public interface fvg {
   void j(int var1);

   void k(int var1);

   int F();

   int G();

   int A();

   int y();

   default fvx J() {
      return new fvx(this.F(), this.G(), this.A(), this.y());
   }

   default void c(int $$0, int $$1) {
      this.j($$0);
      this.k($$1);
   }

   void a(Consumer<fro> var1);
}
