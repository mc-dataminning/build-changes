import java.util.function.Consumer;

public class ie<T extends ev<T>> implements hs<T> {
   private final Consumer<hu<T>> a;
   private final eq b;

   public ie(Consumer<hu<T>> $$0, eq $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void execute(ht<T> $$0, hv $$1) {
      int $$2 = $$1.c() + 1;
      hv $$3 = new hv($$2, this.b, $$0.b($$2));
      this.a.accept(hu.a($$0, $$3));
   }
}
