import com.mojang.brigadier.context.CommandContext;

public class gk extends gg<dqu> {
   private gk() {
      super(dqu.e, dqu::values);
   }

   public static gk a() {
      return new gk();
   }

   public static dqu a(CommandContext<ew> $$0, String $$1) {
      return (dqu)$$0.getArgument($$1, dqu.class);
   }
}
