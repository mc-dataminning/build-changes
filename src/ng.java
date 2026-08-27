import java.util.function.Function;

public class ng {
   private final Function<cps, cqc<?>> a;

   public ng(Function<cps, cqc<?>> $$0) {
      this.a = $$0;
   }

   public static ng a(Function<cps, cqc<?>> $$0) {
      return new ng($$0);
   }

   public void a(my $$0, String $$1) {
      this.a($$0, new ahg($$1));
   }

   public void a(my $$0, ahg $$1) {
      $$0.a($$1, this.a.apply(cps.d), null);
   }
}
