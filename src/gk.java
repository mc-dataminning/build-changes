import com.mojang.brigadier.context.CommandContext;

public class gk extends gh<doj> {
   private gk() {
      super(doj.d, doj::values);
   }

   public static gh<doj> a() {
      return new gk();
   }

   public static doj a(CommandContext<ex> $$0, String $$1) {
      return (doj)$$0.getArgument($$1, doj.class);
   }
}
