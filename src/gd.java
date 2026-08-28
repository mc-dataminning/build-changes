import com.mojang.brigadier.context.CommandContext;

public class gd extends fz<dlh> {
   private gd() {
      super(dlh.e, dlh::values);
   }

   public static gd a() {
      return new gd();
   }

   public static dlh a(CommandContext<ep> $$0, String $$1) {
      return (dlh)$$0.getArgument($$1, dlh.class);
   }
}
