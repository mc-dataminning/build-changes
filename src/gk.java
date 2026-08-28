import com.mojang.brigadier.context.CommandContext;

public class gk extends gg<dqv> {
   private gk() {
      super(dqv.e, dqv::values);
   }

   public static gk a() {
      return new gk();
   }

   public static dqv a(CommandContext<ew> $$0, String $$1) {
      return (dqv)$$0.getArgument($$1, dqv.class);
   }
}
