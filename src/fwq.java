import java.util.function.Consumer;

public interface fwq {
   void j(int var1);

   void k(int var1);

   int F();

   int G();

   int A();

   int y();

   default fxh J() {
      return new fxh(this.F(), this.G(), this.A(), this.y());
   }

   default void c(int $$0, int $$1) {
      this.j($$0);
      this.k($$1);
   }

   void a(Consumer<fsy> var1);
}
