import com.mojang.brigadier.context.CommandContext;

public class gk extends gg<dpd> {
   private gk() {
      super(dpd.e, dpd::values);
   }

   public static gk a() {
      return new gk();
   }

   public static dpd a(CommandContext<ew> $$0, String $$1) {
      return (dpd)$$0.getArgument($$1, dpd.class);
   }
}
