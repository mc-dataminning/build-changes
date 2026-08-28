import com.mojang.brigadier.context.CommandContext;

public class gg extends gd<dkt> {
   private gg() {
      super(dkt.d, dkt::values);
   }

   public static gd<dkt> a() {
      return new gg();
   }

   public static dkt a(CommandContext<et> $$0, String $$1) {
      return (dkt)$$0.getArgument($$1, dkt.class);
   }
}
