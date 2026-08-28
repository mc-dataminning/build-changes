import com.mojang.brigadier.context.CommandContext;

public class gk extends gh<dok> {
   private gk() {
      super(dok.d, dok::values);
   }

   public static gh<dok> a() {
      return new gk();
   }

   public static dok a(CommandContext<ex> $$0, String $$1) {
      return (dok)$$0.getArgument($$1, dok.class);
   }
}
