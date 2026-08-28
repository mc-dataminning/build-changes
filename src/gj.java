import com.mojang.brigadier.context.CommandContext;

public class gj extends gg<dpk> {
   private gj() {
      super(dpk.d, dpk::values);
   }

   public static gg<dpk> a() {
      return new gj();
   }

   public static dpk a(CommandContext<ew> $$0, String $$1) {
      return (dpk)$$0.getArgument($$1, dpk.class);
   }
}
