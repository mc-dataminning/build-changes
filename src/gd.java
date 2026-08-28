import com.mojang.brigadier.context.CommandContext;

public class gd extends ga<dkc> {
   private gd() {
      super(dkc.d, dkc::values);
   }

   public static ga<dkc> a() {
      return new gd();
   }

   public static dkc a(CommandContext<eq> $$0, String $$1) {
      return (dkc)$$0.getArgument($$1, dkc.class);
   }
}
