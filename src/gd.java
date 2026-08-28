import com.mojang.brigadier.context.CommandContext;

public class gd extends fz<dlk> {
   private gd() {
      super(dlk.e, dlk::values);
   }

   public static gd a() {
      return new gd();
   }

   public static dlk a(CommandContext<ep> $$0, String $$1) {
      return (dlk)$$0.getArgument($$1, dlk.class);
   }
}
