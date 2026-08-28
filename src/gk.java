import com.mojang.brigadier.context.CommandContext;

public class gk extends gh<dpf> {
   private gk() {
      super(dpf.d, dpf::values);
   }

   public static gh<dpf> a() {
      return new gk();
   }

   public static dpf a(CommandContext<ex> $$0, String $$1) {
      return (dpf)$$0.getArgument($$1, dpf.class);
   }
}
