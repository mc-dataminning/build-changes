import java.util.function.Consumer;

public class ig<T extends ew<T>> implements ht<T> {
   private final Consumer<hv<T>> a;
   private final er b;

   public ig(Consumer<hv<T>> $$0, er $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void execute(hu<T> $$0, hw $$1) {
      int $$2 = $$1.c() + 1;
      hw $$3 = new hw($$2, this.b, $$0.b($$2));
      this.a.accept(hv.a($$0, $$3));
   }
}
