import com.mojang.brigadier.context.CommandContext;

public class gc extends fz<djv> {
   private gc() {
      super(djv.d, djv::values);
   }

   public static fz<djv> a() {
      return new gc();
   }

   public static djv a(CommandContext<ep> $$0, String $$1) {
      return (djv)$$0.getArgument($$1, djv.class);
   }
}
