import java.util.function.Function;

public class ov {
   private final Function<cyo, cyz<?>> a;

   public ov(Function<cyo, cyz<?>> $$0) {
      this.a = $$0;
   }

   public static ov a(Function<cyo, cyz<?>> $$0) {
      return new ov($$0);
   }

   public void a(on $$0, String $$1) {
      this.a($$0, akr.a($$1));
   }

   public void a(on $$0, akr $$1) {
      $$0.a($$1, this.a.apply(cyo.d), null);
   }
}
