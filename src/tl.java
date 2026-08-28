import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public abstract class tl {
   private static final List<tl> a = new ArrayList<>();

   public static void a(tl $$0) {
      a.add($$0);
   }

   public static void b(kf<Consumer<sn>> $$0) {
      for (tl $$1 : a) {
         $$1.a(($$1x, $$2) -> kf.a($$0, $$1x, $$2));
      }
   }

   public abstract void a(BiConsumer<alc<Consumer<sn>>, Consumer<sn>> var1);
}
