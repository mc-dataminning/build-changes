import com.mojang.brigadier.context.CommandContext;

public class gg extends gd<dmg> {
   private gg() {
      super(dmg.d, dmg::values);
   }

   public static gd<dmg> a() {
      return new gg();
   }

   public static dmg a(CommandContext<et> $$0, String $$1) {
      return (dmg)$$0.getArgument($$1, dmg.class);
   }
}
