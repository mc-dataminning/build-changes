import java.util.function.Function;

public class op {
   private final Function<cyo, cza<?>> a;

   public op(Function<cyo, cza<?>> $$0) {
      this.a = $$0;
   }

   public static op a(Function<cyo, cza<?>> $$0) {
      return new op($$0);
   }

   public void a(oh $$0, String $$1) {
      this.a($$0, new akt($$1));
   }

   public void a(oh $$0, akt $$1) {
      $$0.a($$1, this.a.apply(cyo.d), null);
   }
}
