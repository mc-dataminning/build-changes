import com.mojang.brigadier.context.CommandContext;

public class gk extends gh<dol> {
   private gk() {
      super(dol.d, dol::values);
   }

   public static gh<dol> a() {
      return new gk();
   }

   public static dol a(CommandContext<ex> $$0, String $$1) {
      return (dol)$$0.getArgument($$1, dol.class);
   }
}
