import com.mojang.brigadier.context.CommandContext;

public class gk extends gg<dow> {
   private gk() {
      super(dow.e, dow::values);
   }

   public static gk a() {
      return new gk();
   }

   public static dow a(CommandContext<ew> $$0, String $$1) {
      return (dow)$$0.getArgument($$1, dow.class);
   }
}
