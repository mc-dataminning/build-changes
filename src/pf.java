import java.util.function.Function;

public class pf {
   private final Function<dbi, dbv<?>> a;

   public pf(Function<dbi, dbv<?>> $$0) {
      this.a = $$0;
   }

   public static pf a(Function<dbi, dbv<?>> $$0) {
      return new pf($$0);
   }

   public void a(ox $$0, String $$1) {
      this.a($$0, alo.a(mb.bk, alp.a($$1)));
   }

   public void a(ox $$0, alo<dbv<?>> $$1) {
      $$0.a($$1, this.a.apply(dbi.d), null);
   }
}
