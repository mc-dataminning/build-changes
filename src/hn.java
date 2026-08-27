import java.util.function.Consumer;

public class hn<T extends ef<T>> implements hb<T> {
   private final Consumer<hd<T>> a;
   private final ea b;

   public hn(Consumer<hd<T>> $$0, ea $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void execute(hc<T> $$0, he $$1) {
      int $$2 = $$1.c() + 1;
      he $$3 = new he($$2, this.b, $$0.b($$2));
      this.a.accept(hd.a($$0, $$3));
   }
}
