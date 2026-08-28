import com.mojang.brigadier.context.CommandContext;

public class gm extends gi<drm> {
   private gm() {
      super(drm.f, drm::values);
   }

   public static gm a() {
      return new gm();
   }

   public static drm a(CommandContext<ex> $$0, String $$1) {
      return (drm)$$0.getArgument($$1, drm.class);
   }
}
