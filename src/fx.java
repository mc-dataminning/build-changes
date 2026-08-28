import com.mojang.brigadier.context.CommandContext;

public class fx extends ft<dsz> {
   private fx() {
      super(dsz.f, dsz::values);
   }

   public static fx a() {
      return new fx();
   }

   public static dsz a(CommandContext<ei> $$0, String $$1) {
      return (dsz)$$0.getArgument($$1, dsz.class);
   }
}
