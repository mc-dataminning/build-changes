import com.mojang.brigadier.context.CommandContext;

public class fx extends fu<drp> {
   private fx() {
      super(drp.d, drp::values);
   }

   public static fu<drp> a() {
      return new fx();
   }

   public static drp a(CommandContext<ej> $$0, String $$1) {
      return (drp)$$0.getArgument($$1, drp.class);
   }
}
