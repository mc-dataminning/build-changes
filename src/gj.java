import com.mojang.brigadier.context.CommandContext;

public class gj extends gg<dna> {
   private gj() {
      super(dna.d, dna::values);
   }

   public static gg<dna> a() {
      return new gj();
   }

   public static dna a(CommandContext<ew> $$0, String $$1) {
      return (dna)$$0.getArgument($$1, dna.class);
   }
}
