import com.mojang.brigadier.context.CommandContext;

public class gk extends gg<drc> {
   private gk() {
      super(drc.e, drc::values);
   }

   public static gk a() {
      return new gk();
   }

   public static drc a(CommandContext<ew> $$0, String $$1) {
      return (drc)$$0.getArgument($$1, drc.class);
   }
}
