import java.util.function.Function;

public class ne {
   private final Function<cpl, cpv<?>> a;

   public ne(Function<cpl, cpv<?>> $$0) {
      this.a = $$0;
   }

   public static ne a(Function<cpl, cpv<?>> $$0) {
      return new ne($$0);
   }

   public void a(mw $$0, String $$1) {
      this.a($$0, new ahd($$1));
   }

   public void a(mw $$0, ahd $$1) {
      $$0.a($$1, this.a.apply(cpl.d), null);
   }
}
