import java.util.function.Function;

public class oj {
   private final Function<dbi, dbv<?>> a;

   public oj(Function<dbi, dbv<?>> $$0) {
      this.a = $$0;
   }

   public static oj a(Function<dbi, dbv<?>> $$0) {
      return new oj($$0);
   }

   public void a(ob $$0, String $$1) {
      this.a($$0, akt.a(mc.bm, aku.a($$1)));
   }

   public void a(ob $$0, akt<dbv<?>> $$1) {
      $$0.a($$1, this.a.apply(dbi.d), null);
   }
}
