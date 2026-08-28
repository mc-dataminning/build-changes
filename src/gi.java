import com.mojang.brigadier.context.CommandContext;

public class gi extends gf<dmu> {
   private gi() {
      super(dmu.d, dmu::values);
   }

   public static gf<dmu> a() {
      return new gi();
   }

   public static dmu a(CommandContext<ev> $$0, String $$1) {
      return (dmu)$$0.getArgument($$1, dmu.class);
   }
}
