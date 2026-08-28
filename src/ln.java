import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ln implements lp {
   private static final Codec<cwb> a = Codec.withAlternative(cwb.c, cwb.a, cwb::new);
   private final lq<ln> b;
   private final cwb c;

   public static MapCodec<ln> a(lq<ln> $$0) {
      return a.xmap($$1 -> new ln($$0, $$1), $$0x -> $$0x.c).fieldOf("item");
   }

   public static zg<? super wt, ln> b(lq<ln> $$0) {
      return cwb.i.a($$1 -> new ln($$0, $$1), $$0x -> $$0x.c);
   }

   public ln(lq<ln> $$0, cwb $$1) {
      if ($$1.f()) {
         throw new IllegalArgumentException("Empty stacks are not allowed");
      } else {
         this.b = $$0;
         this.c = $$1;
      }
   }

   @Override
   public lq<ln> a() {
      return this.b;
   }

   public cwb b() {
      return this.c;
   }
}
