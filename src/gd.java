import com.mojang.brigadier.context.CommandContext;

public class gd extends fz<dlm> {
   private gd() {
      super(dlm.e, dlm::values);
   }

   public static gd a() {
      return new gd();
   }

   public static dlm a(CommandContext<ep> $$0, String $$1) {
      return (dlm)$$0.getArgument($$1, dlm.class);
   }
}
