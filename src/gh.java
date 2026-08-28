import com.mojang.brigadier.context.CommandContext;

public class gh extends ge<dmj> {
   private gh() {
      super(dmj.d, dmj::values);
   }

   public static ge<dmj> a() {
      return new gh();
   }

   public static dmj a(CommandContext<eu> $$0, String $$1) {
      return (dmj)$$0.getArgument($$1, dmj.class);
   }
}
