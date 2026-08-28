import com.mojang.brigadier.context.CommandContext;

public class gc extends fz<djr> {
   private gc() {
      super(djr.d, djr::values);
   }

   public static fz<djr> a() {
      return new gc();
   }

   public static djr a(CommandContext<ep> $$0, String $$1) {
      return (djr)$$0.getArgument($$1, djr.class);
   }
}
