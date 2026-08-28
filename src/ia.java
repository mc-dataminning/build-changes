import java.util.function.Consumer;

public class ia<T extends es<T>> implements ho<T> {
   private final Consumer<hq<T>> a;
   private final en b;

   public ia(Consumer<hq<T>> $$0, en $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void execute(hp<T> $$0, hr $$1) {
      int $$2 = $$1.c() + 1;
      hr $$3 = new hr($$2, this.b, $$0.b($$2));
      this.a.accept(hq.a($$0, $$3));
   }
}
