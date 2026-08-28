import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public abstract class tn {
   private static final List<tn> a = new ArrayList<>();

   public static void a(tn $$0) {
      a.add($$0);
   }

   public static void b(js<Consumer<sp>> $$0) {
      for (tn $$1 : a) {
         $$1.a(($$1x, $$2) -> js.a($$0, $$1x, $$2));
      }
   }

   public abstract void a(BiConsumer<alh<Consumer<sp>>, Consumer<sp>> var1);
}
