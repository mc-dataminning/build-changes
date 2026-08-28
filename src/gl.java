import com.mojang.brigadier.context.CommandContext;

public class gl extends gh<dqd> {
   private gl() {
      super(dqd.e, dqd::values);
   }

   public static gl a() {
      return new gl();
   }

   public static dqd a(CommandContext<ex> $$0, String $$1) {
      return (dqd)$$0.getArgument($$1, dqd.class);
   }
}
