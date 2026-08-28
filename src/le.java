import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class le implements lg {
   private static final Codec<cur> a = Codec.withAlternative(cur.c, cur.a, cur::new);
   private final lh<le> b;
   private final cur c;

   public static MapCodec<le> a(lh<le> $$0) {
      return a.xmap($$1 -> new le($$0, $$1), $$0x -> $$0x.c).fieldOf("item");
   }

   public static zn<? super xa, le> b(lh<le> $$0) {
      return cur.i.a($$1 -> new le($$0, $$1), $$0x -> $$0x.c);
   }

   public le(lh<le> $$0, cur $$1) {
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

   public cur b() {
      return this.c;
   }
}
