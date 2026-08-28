import com.mojang.brigadier.context.CommandContext;

public class gc extends fz<djy> {
   private gc() {
      super(djy.d, djy::values);
   }

   public static fz<djy> a() {
      return new gc();
   }

   public static djy a(CommandContext<ep> $$0, String $$1) {
      return (djy)$$0.getArgument($$1, djy.class);
   }
}
