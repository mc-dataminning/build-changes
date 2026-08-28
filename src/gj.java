import com.mojang.brigadier.context.CommandContext;

public class gj extends gg<dpd> {
   private gj() {
      super(dpd.d, dpd::values);
   }

   public static gg<dpd> a() {
      return new gj();
   }

   public static dpd a(CommandContext<ew> $$0, String $$1) {
      return (dpd)$$0.getArgument($$1, dpd.class);
   }
}
