import com.mojang.brigadier.context.CommandContext;

public class gk extends gg<dor> {
   private gk() {
      super(dor.e, dor::values);
   }

   public static gk a() {
      return new gk();
   }

   public static dor a(CommandContext<ew> $$0, String $$1) {
      return (dor)$$0.getArgument($$1, dor.class);
   }
}
