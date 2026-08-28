import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class sd extends tm {
   public static final ald<Consumer<so>> a = a("always_pass");
   public static final Consumer<so> b = so::e;

   private static ald<Consumer<so>> a(String $$0) {
      return ald.a(mg.ay, ale.b($$0));
   }

   public static Consumer<so> a(jr<Consumer<so>> $$0) {
      a(new sd());
      b($$0);
      return b;
   }

   @Override
   public void a(BiConsumer<ald<Consumer<so>>, Consumer<so>> $$0) {
      $$0.accept(a, b);
   }
}
