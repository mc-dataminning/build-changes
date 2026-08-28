import com.mojang.brigadier.context.CommandContext;

public class gj extends gg<dpc> {
   private gj() {
      super(dpc.d, dpc::values);
   }

   public static gg<dpc> a() {
      return new gj();
   }

   public static dpc a(CommandContext<ew> $$0, String $$1) {
      return (dpc)$$0.getArgument($$1, dpc.class);
   }
}
