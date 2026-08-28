import java.util.function.Consumer;

public class id<T extends ev<T>> implements hr<T> {
   private final Consumer<ht<T>> a;
   private final eq b;

   public id(Consumer<ht<T>> $$0, eq $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void execute(hs<T> $$0, hu $$1) {
      int $$2 = $$1.c() + 1;
      hu $$3 = new hu($$2, this.b, $$0.b($$2));
      this.a.accept(ht.a($$0, $$3));
   }
}
