import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public abstract class to {
   private static final List<to> a = new ArrayList<>();

   public static void a(to $$0) {
      a.add($$0);
   }

   public static void b(jt<Consumer<sq>> $$0) {
      for (to $$1 : a) {
         $$1.a(($$1x, $$2) -> jt.a($$0, $$1x, $$2));
      }
   }

   public abstract void a(BiConsumer<alq<Consumer<sq>>, Consumer<sq>> var1);
}
