import java.util.function.Function;

public class oj {
   private final Function<das, dbf<?>> a;

   public oj(Function<das, dbf<?>> $$0) {
      this.a = $$0;
   }

   public static oj a(Function<das, dbf<?>> $$0) {
      return new oj($$0);
   }

   public void a(ob $$0, String $$1) {
      this.a($$0, aku.a(mc.bk, akv.a($$1)));
   }

   public void a(ob $$0, aku<dbf<?>> $$1) {
      $$0.a($$1, this.a.apply(das.d), null);
   }
}
