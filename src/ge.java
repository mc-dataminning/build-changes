import com.mojang.brigadier.context.CommandContext;

public class ge extends ga<dls> {
   private ge() {
      super(dls.e, dls::values);
   }

   public static ge a() {
      return new ge();
   }

   public static dls a(CommandContext<eq> $$0, String $$1) {
      return (dls)$$0.getArgument($$1, dls.class);
   }
}
