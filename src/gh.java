import com.mojang.brigadier.context.CommandContext;

public class gh extends gd<dnx> {
   private gh() {
      super(dnx.e, dnx::values);
   }

   public static gh a() {
      return new gh();
   }

   public static dnx a(CommandContext<et> $$0, String $$1) {
      return (dnx)$$0.getArgument($$1, dnx.class);
   }
}
