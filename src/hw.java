import java.util.function.Consumer;

public class hw<T extends em<T>> implements hk<T> {
   private final Consumer<hm<T>> a;
   private final eh b;

   public hw(Consumer<hm<T>> $$0, eh $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void execute(hl<T> $$0, hn $$1) {
      int $$2 = $$1.c() + 1;
      hn $$3 = new hn($$2, this.b, $$0.b($$2));
      this.a.accept(hm.a($$0, $$3));
   }
}
