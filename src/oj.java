import java.util.function.Function;

public class oj {
   private final Function<dap, dbc<?>> a;

   public oj(Function<dap, dbc<?>> $$0) {
      this.a = $$0;
   }

   public static oj a(Function<dap, dbc<?>> $$0) {
      return new oj($$0);
   }

   public void a(ob $$0, String $$1) {
      this.a($$0, akt.a(mc.bk, aku.a($$1)));
   }

   public void a(ob $$0, akt<dbc<?>> $$1) {
      $$0.a($$1, this.a.apply(dap.d), null);
   }
}
