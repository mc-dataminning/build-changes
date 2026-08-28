import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class sd extends tn {
   public static final alh<Consumer<sp>> a = a("always_pass");
   public static final Consumer<sp> b = sp::e;

   private static alh<Consumer<sp>> a(String $$0) {
      return alh.a(mh.ay, ali.b($$0));
   }

   public static Consumer<sp> a(js<Consumer<sp>> $$0) {
      a(new sd());
      b($$0);
      return b;
   }

   @Override
   public void a(BiConsumer<alh<Consumer<sp>>, Consumer<sp>> $$0) {
      $$0.accept(a, b);
   }
}
