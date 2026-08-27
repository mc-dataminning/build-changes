import java.util.function.Consumer;

public class gz<T extends dw<T>> implements gn<T> {
   private final Consumer<gp<T>> a;
   private final dq b;

   public gz(Consumer<gp<T>> $$0, dq $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void execute(go<T> $$0, gq $$1) {
      int $$2 = $$1.c() + 1;
      gq $$3 = new gq($$2, this.b, $$0.b($$2));
      this.a.accept(gp.a($$0, $$3));
   }
}
