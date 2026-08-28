import com.mojang.brigadier.context.CommandContext;

public class gi extends ge<doa> {
   private gi() {
      super(doa.e, doa::values);
   }

   public static gi a() {
      return new gi();
   }

   public static doa a(CommandContext<eu> $$0, String $$1) {
      return (doa)$$0.getArgument($$1, doa.class);
   }
}
