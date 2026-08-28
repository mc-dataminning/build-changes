import com.mojang.brigadier.context.CommandContext;

public class gc extends fz<dju> {
   private gc() {
      super(dju.d, dju::values);
   }

   public static fz<dju> a() {
      return new gc();
   }

   public static dju a(CommandContext<ep> $$0, String $$1) {
      return (dju)$$0.getArgument($$1, dju.class);
   }
}
