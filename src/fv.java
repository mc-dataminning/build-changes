import com.mojang.brigadier.context.CommandContext;

public class fv extends fr<dmd> {
   private fv() {
      super(dmd.e, dmd::values);
   }

   public static fv a() {
      return new fv();
   }

   public static dmd a(CommandContext<eh> $$0, String $$1) {
      return (dmd)$$0.getArgument($$1, dmd.class);
   }
}
