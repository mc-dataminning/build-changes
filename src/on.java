import java.util.function.Function;

public class on {
   private final Function<cxm, cxw<?>> a;

   public on(Function<cxm, cxw<?>> $$0) {
      this.a = $$0;
   }

   public static on a(Function<cxm, cxw<?>> $$0) {
      return new on($$0);
   }

   public void a(of $$0, String $$1) {
      this.a($$0, new akn($$1));
   }

   public void a(of $$0, akn $$1) {
      $$0.a($$1, this.a.apply(cxm.d), null);
   }
}
