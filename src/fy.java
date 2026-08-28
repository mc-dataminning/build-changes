import com.mojang.brigadier.context.CommandContext;

public class fy extends fu<dtw> {
   private fy() {
      super(dtw.f, dtw::values);
   }

   public static fy a() {
      return new fy();
   }

   public static dtw a(CommandContext<ej> $$0, String $$1) {
      return (dtw)$$0.getArgument($$1, dtw.class);
   }
}
