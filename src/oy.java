import java.util.function.Function;

public class oy {
   private final Function<cyk, cyu<?>> a;

   public oy(Function<cyk, cyu<?>> $$0) {
      this.a = $$0;
   }

   public static oy a(Function<cyk, cyu<?>> $$0) {
      return new oy($$0);
   }

   public void a(oq $$0, String $$1) {
      this.a($$0, new ale($$1));
   }

   public void a(oq $$0, ale $$1) {
      $$0.a($$1, this.a.apply(cyk.d), null);
   }
}
