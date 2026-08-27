import java.util.function.Function;

public class ni {
   private final Function<crv, csf<?>> a;

   public ni(Function<crv, csf<?>> $$0) {
      this.a = $$0;
   }

   public static ni a(Function<crv, csf<?>> $$0) {
      return new ni($$0);
   }

   public void a(na $$0, String $$1) {
      this.a($$0, new aiy($$1));
   }

   public void a(na $$0, aiy $$1) {
      $$0.a($$1, this.a.apply(crv.d), null);
   }
}
