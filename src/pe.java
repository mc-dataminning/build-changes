import java.util.function.Function;

public class pe {
   private final Function<dao, dba<?>> a;

   public pe(Function<dao, dba<?>> $$0) {
      this.a = $$0;
   }

   public static pe a(Function<dao, dba<?>> $$0) {
      return new pe($$0);
   }

   public void a(ow $$0, String $$1) {
      this.a($$0, alj.a($$1));
   }

   public void a(ow $$0, alj $$1) {
      $$0.a($$1, this.a.apply(dao.d), null);
   }
}
