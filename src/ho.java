import java.util.function.Consumer;

public class ho<T extends eg<T>> implements hc<T> {
   private final Consumer<he<T>> a;
   private final eb b;

   public ho(Consumer<he<T>> $$0, eb $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void execute(hd<T> $$0, hf $$1) {
      int $$2 = $$1.c() + 1;
      hf $$3 = new hf($$2, this.b, $$0.b($$2));
      this.a.accept(he.a($$0, $$3));
   }
}
