import com.mojang.brigadier.context.CommandContext;

public class gj extends gf<dol> {
   private gj() {
      super(dol.e, dol::values);
   }

   public static gj a() {
      return new gj();
   }

   public static dol a(CommandContext<ev> $$0, String $$1) {
      return (dol)$$0.getArgument($$1, dol.class);
   }
}
