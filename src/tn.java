import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public abstract class tn {
   private static final List<tn> a = new ArrayList<>();

   public static void a(tn $$0) {
      a.add($$0);
   }

   public static void b(jr<Consumer<sp>> $$0) {
      for (tn $$1 : a) {
         $$1.a(($$1x, $$2) -> jr.a($$0, $$1x, $$2));
      }
   }

   public abstract void a(BiConsumer<alf<Consumer<sp>>, Consumer<sp>> var1);
}
