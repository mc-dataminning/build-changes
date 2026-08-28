import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class le implements lg {
   private static final Codec<cuq> a = Codec.withAlternative(cuq.c, cuq.a, cuq::new);
   private final lh<le> b;
   private final cuq c;

   public static MapCodec<le> a(lh<le> $$0) {
      return a.xmap($$1 -> new le($$0, $$1), $$0x -> $$0x.c).fieldOf("item");
   }

   public static zn<? super xa, le> b(lh<le> $$0) {
      return cuq.i.a($$1 -> new le($$0, $$1), $$0x -> $$0x.c);
   }

   public le(lh<le> $$0, cuq $$1) {
      if ($$1.e()) {
         throw new IllegalArgumentException("Empty stacks are not allowed");
      } else {
         this.b = $$0;
         this.c = $$1;
      }
   }

   @Override
   public lh<le> a() {
      return this.b;
   }

   public cuq b() {
      return this.c;
   }
}
