import com.mojang.brigadier.context.CommandContext;

public class gl extends gh<dqe> {
   private gl() {
      super(dqe.e, dqe::values);
   }

   public static gl a() {
      return new gl();
   }

   public static dqe a(CommandContext<ex> $$0, String $$1) {
      return (dqe)$$0.getArgument($$1, dqe.class);
   }
}
