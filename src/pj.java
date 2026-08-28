import java.util.function.Function;

public class pj {
   private final Function<dbn, dbz<?>> a;

   public pj(Function<dbn, dbz<?>> $$0) {
      this.a = $$0;
   }

   public static pj a(Function<dbn, dbz<?>> $$0) {
      return new pj($$0);
   }

   public void a(pb $$0, String $$1) {
      this.a($$0, aly.a(mb.bj, alz.a($$1)));
   }

   public void a(pb $$0, aly<dbz<?>> $$1) {
      $$0.a($$1, this.a.apply(dbn.d), null);
   }
}
