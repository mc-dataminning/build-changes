import com.mojang.brigadier.context.CommandContext;

public class fz extends fv<dui> {
   private fz() {
      super(dui.f, dui::values);
   }

   public static fz a() {
      return new fz();
   }

   public static dui a(CommandContext<ek> $$0, String $$1) {
      return (dui)$$0.getArgument($$1, dui.class);
   }
}
