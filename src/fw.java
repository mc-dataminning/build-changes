import com.mojang.brigadier.context.CommandContext;

public class fw extends ft<dri> {
   private fw() {
      super(dri.d, dri::values);
   }

   public static ft<dri> a() {
      return new fw();
   }

   public static dri a(CommandContext<ei> $$0, String $$1) {
      return (dri)$$0.getArgument($$1, dri.class);
   }
}
