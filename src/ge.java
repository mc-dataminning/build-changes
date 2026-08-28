import com.mojang.brigadier.context.CommandContext;

public class ge extends ga<dlv> {
   private ge() {
      super(dlv.e, dlv::values);
   }

   public static ge a() {
      return new ge();
   }

   public static dlv a(CommandContext<eq> $$0, String $$1) {
      return (dlv)$$0.getArgument($$1, dlv.class);
   }
}
