import com.mojang.brigadier.context.CommandContext;

public class fx extends fu<dsf> {
   private fx() {
      super(dsf.d, dsf::values);
   }

   public static fu<dsf> a() {
      return new fx();
   }

   public static dsf a(CommandContext<ej> $$0, String $$1) {
      return (dsf)$$0.getArgument($$1, dsf.class);
   }
}
