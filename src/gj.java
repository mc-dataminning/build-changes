import com.mojang.brigadier.context.CommandContext;

public class gj extends gg<dnm> {
   private gj() {
      super(dnm.d, dnm::values);
   }

   public static gg<dnm> a() {
      return new gj();
   }

   public static dnm a(CommandContext<ew> $$0, String $$1) {
      return (dnm)$$0.getArgument($$1, dnm.class);
   }
}
