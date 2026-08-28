import com.mojang.brigadier.context.CommandContext;

public class fw extends ft<drc> {
   private fw() {
      super(drc.d, drc::values);
   }

   public static ft<drc> a() {
      return new fw();
   }

   public static drc a(CommandContext<ei> $$0, String $$1) {
      return (drc)$$0.getArgument($$1, drc.class);
   }
}
