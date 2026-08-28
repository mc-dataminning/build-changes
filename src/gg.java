import com.mojang.brigadier.context.CommandContext;

public class gg extends gd<dls> {
   private gg() {
      super(dls.d, dls::values);
   }

   public static gd<dls> a() {
      return new gg();
   }

   public static dls a(CommandContext<et> $$0, String $$1) {
      return (dls)$$0.getArgument($$1, dls.class);
   }
}
