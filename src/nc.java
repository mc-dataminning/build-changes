import java.util.function.Function;

public class nc {
   private final Function<cpb, cpl<?>> a;

   public nc(Function<cpb, cpl<?>> $$0) {
      this.a = $$0;
   }

   public static nc a(Function<cpb, cpl<?>> $$0) {
      return new nc($$0);
   }

   public void a(mu $$0, String $$1) {
      this.a($$0, new agt($$1));
   }

   public void a(mu $$0, agt $$1) {
      $$0.a($$1, this.a.apply(cpb.d), null);
   }
}
