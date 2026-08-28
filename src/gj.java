import com.mojang.brigadier.context.CommandContext;

public class gj extends gg<dnf> {
   private gj() {
      super(dnf.d, dnf::values);
   }

   public static gg<dnf> a() {
      return new gj();
   }

   public static dnf a(CommandContext<ew> $$0, String $$1) {
      return (dnf)$$0.getArgument($$1, dnf.class);
   }
}
