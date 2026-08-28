import com.mojang.brigadier.context.CommandContext;

public class fx extends ft<dsm> {
   private fx() {
      super(dsm.f, dsm::values);
   }

   public static fx a() {
      return new fx();
   }

   public static dsm a(CommandContext<ei> $$0, String $$1) {
      return (dsm)$$0.getArgument($$1, dsm.class);
   }
}
