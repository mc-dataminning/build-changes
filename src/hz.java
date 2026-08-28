import java.util.function.Consumer;

public class hz<T extends er<T>> implements hn<T> {
   private final Consumer<hp<T>> a;
   private final em b;

   public hz(Consumer<hp<T>> $$0, em $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void execute(ho<T> $$0, hq $$1) {
      int $$2 = $$1.c() + 1;
      hq $$3 = new hq($$2, this.b, $$0.b($$2));
      this.a.accept(hp.a($$0, $$3));
   }
}
