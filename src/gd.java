import com.mojang.brigadier.context.CommandContext;

public class gd extends fz<dlo> {
   private gd() {
      super(dlo.e, dlo::values);
   }

   public static gd a() {
      return new gd();
   }

   public static dlo a(CommandContext<ep> $$0, String $$1) {
      return (dlo)$$0.getArgument($$1, dlo.class);
   }
}
