import com.mojang.brigadier.context.CommandContext;

public class gg extends gd<dkv> {
   private gg() {
      super(dkv.d, dkv::values);
   }

   public static gd<dkv> a() {
      return new gg();
   }

   public static dkv a(CommandContext<et> $$0, String $$1) {
      return (dkv)$$0.getArgument($$1, dkv.class);
   }
}
