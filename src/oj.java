import java.util.function.Function;

public class oj {
   private final Function<daq, dbd<?>> a;

   public oj(Function<daq, dbd<?>> $$0) {
      this.a = $$0;
   }

   public static oj a(Function<daq, dbd<?>> $$0) {
      return new oj($$0);
   }

   public void a(ob $$0, String $$1) {
      this.a($$0, aku.a(mc.bk, akv.a($$1)));
   }

   public void a(ob $$0, aku<dbd<?>> $$1) {
      $$0.a($$1, this.a.apply(daq.d), null);
   }
}
