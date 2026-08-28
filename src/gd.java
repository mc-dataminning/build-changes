import com.mojang.brigadier.context.CommandContext;

public class gd extends ga<dke> {
   private gd() {
      super(dke.d, dke::values);
   }

   public static ga<dke> a() {
      return new gd();
   }

   public static dke a(CommandContext<eq> $$0, String $$1) {
      return (dke)$$0.getArgument($$1, dke.class);
   }
}
