import com.mojang.brigadier.context.CommandContext;

public class gl extends gh<dqw> {
   private gl() {
      super(dqw.e, dqw::values);
   }

   public static gl a() {
      return new gl();
   }

   public static dqw a(CommandContext<ex> $$0, String $$1) {
      return (dqw)$$0.getArgument($$1, dqw.class);
   }
}
