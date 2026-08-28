import com.mojang.brigadier.context.CommandContext;

public class gl extends gi<dpv> {
   private gl() {
      super(dpv.d, dpv::values);
   }

   public static gi<dpv> a() {
      return new gl();
   }

   public static dpv a(CommandContext<ex> $$0, String $$1) {
      return (dpv)$$0.getArgument($$1, dpv.class);
   }
}
