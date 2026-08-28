import com.mojang.brigadier.context.CommandContext;

public class fy extends fv<dsr> {
   private fy() {
      super(dsr.d, dsr::values);
   }

   public static fv<dsr> a() {
      return new fy();
   }

   public static dsr a(CommandContext<ek> $$0, String $$1) {
      return (dsr)$$0.getArgument($$1, dsr.class);
   }
}
