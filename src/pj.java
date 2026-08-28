import java.util.function.Function;

public class pj {
   private final Function<dbr, dce<?>> a;

   public pj(Function<dbr, dce<?>> $$0) {
      this.a = $$0;
   }

   public static pj a(Function<dbr, dce<?>> $$0) {
      return new pj($$0);
   }

   public void a(pb $$0, String $$1) {
      this.a($$0, aly.a(mb.bk, alz.a($$1)));
   }

   public void a(pb $$0, aly<dce<?>> $$1) {
      $$0.a($$1, this.a.apply(dbr.d), null);
   }
}
