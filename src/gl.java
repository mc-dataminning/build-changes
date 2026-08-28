import com.mojang.brigadier.context.CommandContext;

public class gl extends gh<dqf> {
   private gl() {
      super(dqf.e, dqf::values);
   }

   public static gl a() {
      return new gl();
   }

   public static dqf a(CommandContext<ex> $$0, String $$1) {
      return (dqf)$$0.getArgument($$1, dqf.class);
   }
}
