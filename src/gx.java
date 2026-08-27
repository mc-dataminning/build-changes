import java.util.function.Consumer;

public class gx<T extends du<T>> implements gl<T> {
   private final Consumer<gn<T>> a;
   private final dp b;

   public gx(Consumer<gn<T>> $$0, dp $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void execute(gm<T> $$0, go $$1) {
      int $$2 = $$1.c() + 1;
      go $$3 = new go($$2, this.b, $$0.b($$2));
      this.a.accept(gn.a($$0, $$3));
   }
}
