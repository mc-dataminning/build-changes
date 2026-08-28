import java.util.function.Consumer;

public class hu<T extends ek<T>> implements hi<T> {
   private final Consumer<hk<T>> a;
   private final ef b;

   public hu(Consumer<hk<T>> $$0, ef $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void execute(hj<T> $$0, hl $$1) {
      int $$2 = $$1.c() + 1;
      hl $$3 = new hl($$2, this.b, $$0.b($$2));
      this.a.accept(hk.a($$0, $$3));
   }
}
