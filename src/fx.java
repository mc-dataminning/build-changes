import com.mojang.brigadier.context.CommandContext;

public class fx extends fu<dru> {
   private fx() {
      super(dru.d, dru::values);
   }

   public static fu<dru> a() {
      return new fx();
   }

   public static dru a(CommandContext<ej> $$0, String $$1) {
      return (dru)$$0.getArgument($$1, dru.class);
   }
}
