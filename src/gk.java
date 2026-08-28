import com.mojang.brigadier.context.CommandContext;

public class gk extends gh<dom> {
   private gk() {
      super(dom.d, dom::values);
   }

   public static gh<dom> a() {
      return new gk();
   }

   public static dom a(CommandContext<ex> $$0, String $$1) {
      return (dom)$$0.getArgument($$1, dom.class);
   }
}
