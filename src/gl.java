import com.mojang.brigadier.context.CommandContext;

public class gl extends gh<dqc> {
   private gl() {
      super(dqc.e, dqc::values);
   }

   public static gl a() {
      return new gl();
   }

   public static dqc a(CommandContext<ex> $$0, String $$1) {
      return (dqc)$$0.getArgument($$1, dqc.class);
   }
}
