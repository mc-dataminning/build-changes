import java.util.function.Consumer;

public class hd<T extends dw<T>> implements gr<T> {
   private final Consumer<gt<T>> a;
   private final dr b;

   public hd(Consumer<gt<T>> $$0, dr $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void execute(gs<T> $$0, gu $$1) {
      int $$2 = $$1.c() + 1;
      gu $$3 = new gu($$2, this.b, $$0.b($$2));
      this.a.accept(gt.a($$0, $$3));
   }
}
