import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class sc extends tl {
   public static final alc<Consumer<sn>> a = a("always_pass");
   public static final Consumer<sn> b = sn::e;

   private static alc<Consumer<sn>> a(String $$0) {
      return alc.a(me.aJ, ald.b($$0));
   }

   public static Consumer<sn> a(kf<Consumer<sn>> $$0) {
      a(new sc());
      b($$0);
      return b;
   }

   @Override
   public void a(BiConsumer<alc<Consumer<sn>>, Consumer<sn>> $$0) {
      $$0.accept(a, b);
   }
}
