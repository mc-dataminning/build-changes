import com.mojang.brigadier.context.CommandContext;

public class fx extends ft<dst> {
   private fx() {
      super(dst.f, dst::values);
   }

   public static fx a() {
      return new fx();
   }

   public static dst a(CommandContext<ei> $$0, String $$1) {
      return (dst)$$0.getArgument($$1, dst.class);
   }
}
