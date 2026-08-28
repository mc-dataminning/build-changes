import com.mojang.brigadier.context.CommandContext;

public class fw extends ft<dqv> {
   private fw() {
      super(dqv.d, dqv::values);
   }

   public static ft<dqv> a() {
      return new fw();
   }

   public static dqv a(CommandContext<ei> $$0, String $$1) {
      return (dqv)$$0.getArgument($$1, dqv.class);
   }
}
