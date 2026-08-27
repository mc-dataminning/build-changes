import java.util.function.Consumer;

public class hb<T extends dw<T>> implements gp<T> {
   private final Consumer<gr<T>> a;
   private final dr b;

   public hb(Consumer<gr<T>> $$0, dr $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void execute(gq<T> $$0, gs $$1) {
      int $$2 = $$1.c() + 1;
      gs $$3 = new gs($$2, this.b, $$0.b($$2));
      this.a.accept(gr.a($$0, $$3));
   }
}
