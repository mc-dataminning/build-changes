import com.mojang.brigadier.context.CommandContext;

public class gh extends gd<dnj> {
   private gh() {
      super(dnj.e, dnj::values);
   }

   public static gh a() {
      return new gh();
   }

   public static dnj a(CommandContext<et> $$0, String $$1) {
      return (dnj)$$0.getArgument($$1, dnj.class);
   }
}
