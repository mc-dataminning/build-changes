import com.mojang.brigadier.context.CommandContext;

public class fy extends fv<dsh> {
   private fy() {
      super(dsh.d, dsh::values);
   }

   public static fv<dsh> a() {
      return new fy();
   }

   public static dsh a(CommandContext<ek> $$0, String $$1) {
      return (dsh)$$0.getArgument($$1, dsh.class);
   }
}
