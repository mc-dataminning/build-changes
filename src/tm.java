import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public abstract class tm {
   private static final List<tm> a = new ArrayList<>();

   public static void a(tm $$0) {
      a.add($$0);
   }

   public static void b(jr<Consumer<so>> $$0) {
      for (tm $$1 : a) {
         $$1.a(($$1x, $$2) -> jr.a($$0, $$1x, $$2));
      }
   }

   public abstract void a(BiConsumer<ald<Consumer<so>>, Consumer<so>> var1);
}
