import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class le implements lg {
   private static final Codec<cup> a = Codec.withAlternative(cup.c, cup.a, cup::new);
   private final lh<le> b;
   private final cup c;

   public static MapCodec<le> a(lh<le> $$0) {
      return a.xmap($$1 -> new le($$0, $$1), $$0x -> $$0x.c).fieldOf("item");
   }

   public static zn<? super xa, le> b(lh<le> $$0) {
      return cup.i.a($$1 -> new le($$0, $$1), $$0x -> $$0x.c);
   }

   public le(lh<le> $$0, cup $$1) {
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

   public cup b() {
      return this.c;
   }
}
