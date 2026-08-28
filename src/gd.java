import com.mojang.brigadier.context.CommandContext;

public class gd extends fz<dln> {
   private gd() {
      super(dln.e, dln::values);
   }

   public static gd a() {
      return new gd();
   }

   public static dln a(CommandContext<ep> $$0, String $$1) {
      return (dln)$$0.getArgument($$1, dln.class);
   }
}
