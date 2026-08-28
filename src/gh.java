import com.mojang.brigadier.context.CommandContext;

public class gh extends gd<dmm> {
   private gh() {
      super(dmm.e, dmm::values);
   }

   public static gh a() {
      return new gh();
   }

   public static dmm a(CommandContext<et> $$0, String $$1) {
      return (dmm)$$0.getArgument($$1, dmm.class);
   }
}
