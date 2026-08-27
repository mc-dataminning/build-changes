import java.util.function.Function;

public class on {
   private final Function<cxk, cxu<?>> a;

   public on(Function<cxk, cxu<?>> $$0) {
      this.a = $$0;
   }

   public static on a(Function<cxk, cxu<?>> $$0) {
      return new on($$0);
   }

   public void a(of $$0, String $$1) {
      this.a($$0, new akm($$1));
   }

   public void a(of $$0, akm $$1) {
      $$0.a($$1, this.a.apply(cxk.d), null);
   }
}
