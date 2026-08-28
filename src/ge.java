import com.mojang.brigadier.context.CommandContext;

public class ge extends ga<dlu> {
   private ge() {
      super(dlu.e, dlu::values);
   }

   public static ge a() {
      return new ge();
   }

   public static dlu a(CommandContext<eq> $$0, String $$1) {
      return (dlu)$$0.getArgument($$1, dlu.class);
   }
}
