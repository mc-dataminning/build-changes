import com.mojang.brigadier.context.CommandContext;

public class gc extends fz<djx> {
   private gc() {
      super(djx.d, djx::values);
   }

   public static fz<djx> a() {
      return new gc();
   }

   public static djx a(CommandContext<ep> $$0, String $$1) {
      return (djx)$$0.getArgument($$1, djx.class);
   }
}
