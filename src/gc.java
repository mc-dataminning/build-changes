import com.mojang.brigadier.context.CommandContext;

public class gc extends fz<djw> {
   private gc() {
      super(djw.d, djw::values);
   }

   public static fz<djw> a() {
      return new gc();
   }

   public static djw a(CommandContext<ep> $$0, String $$1) {
      return (djw)$$0.getArgument($$1, djw.class);
   }
}
