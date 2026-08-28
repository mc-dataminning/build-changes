import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class lg implements lm {
   private static final Codec<dus> a = Codec.withAlternative(dus.a, lv.e.q(), dhm::n);
   private final ln<lg> b;
   private final dus c;

   public static MapCodec<lg> a(ln<lg> $$0) {
      return a.xmap($$1 -> new lg($$0, $$1), $$0x -> $$0x.c).fieldOf("block_state");
   }

   public static zc<? super wp, lg> b(ln<lg> $$0) {
      return za.a(dhm.q).a($$1 -> new lg($$0, $$1), $$0x -> $$0x.c);
   }

   public lg(ln<lg> $$0, dus $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public ln<lg> a() {
      return this.b;
   }

   public dus b() {
      return this.c;
   }
}
