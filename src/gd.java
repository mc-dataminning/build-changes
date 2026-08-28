import com.mojang.brigadier.context.CommandContext;

public class gd extends fz<dll> {
   private gd() {
      super(dll.e, dll::values);
   }

   public static gd a() {
      return new gd();
   }

   public static dll a(CommandContext<ep> $$0, String $$1) {
      return (dll)$$0.getArgument($$1, dll.class);
   }
}
