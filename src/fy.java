import com.mojang.brigadier.context.CommandContext;

public class fy extends fu<dtl> {
   private fy() {
      super(dtl.f, dtl::values);
   }

   public static fy a() {
      return new fy();
   }

   public static dtl a(CommandContext<ej> $$0, String $$1) {
      return (dtl)$$0.getArgument($$1, dtl.class);
   }
}
