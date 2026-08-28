import com.mojang.brigadier.context.CommandContext;

public class gd extends ga<dkf> {
   private gd() {
      super(dkf.d, dkf::values);
   }

   public static ga<dkf> a() {
      return new gd();
   }

   public static dkf a(CommandContext<eq> $$0, String $$1) {
      return (dkf)$$0.getArgument($$1, dkf.class);
   }
}
