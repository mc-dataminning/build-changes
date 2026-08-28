import com.mojang.brigadier.context.CommandContext;

public class gj extends gg<dpl> {
   private gj() {
      super(dpl.d, dpl::values);
   }

   public static gg<dpl> a() {
      return new gj();
   }

   public static dpl a(CommandContext<ew> $$0, String $$1) {
      return (dpl)$$0.getArgument($$1, dpl.class);
   }
}
