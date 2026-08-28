import com.mojang.brigadier.context.CommandContext;

public class gh extends gd<dmk> {
   private gh() {
      super(dmk.e, dmk::values);
   }

   public static gh a() {
      return new gh();
   }

   public static dmk a(CommandContext<et> $$0, String $$1) {
      return (dmk)$$0.getArgument($$1, dmk.class);
   }
}
