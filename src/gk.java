import com.mojang.brigadier.context.CommandContext;

public class gk extends gg<drb> {
   private gk() {
      super(drb.e, drb::values);
   }

   public static gk a() {
      return new gk();
   }

   public static drb a(CommandContext<ew> $$0, String $$1) {
      return (drb)$$0.getArgument($$1, drb.class);
   }
}
