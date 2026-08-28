import com.mojang.brigadier.context.CommandContext;

public class fz extends fv<dty> {
   private fz() {
      super(dty.f, dty::values);
   }

   public static fz a() {
      return new fz();
   }

   public static dty a(CommandContext<ek> $$0, String $$1) {
      return (dty)$$0.getArgument($$1, dty.class);
   }
}
