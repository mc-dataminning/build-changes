import com.mojang.brigadier.context.CommandContext;

public class fy extends fu<dtg> {
   private fy() {
      super(dtg.f, dtg::values);
   }

   public static fy a() {
      return new fy();
   }

   public static dtg a(CommandContext<ej> $$0, String $$1) {
      return (dtg)$$0.getArgument($$1, dtg.class);
   }
}
