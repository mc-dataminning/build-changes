import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class lj implements lp {
   private static final Codec<dvj> a = Codec.withAlternative(dvj.a, ly.e.q(), die::m);
   private final lq<lj> b;
   private final dvj c;

   public static MapCodec<lj> a(lq<lj> $$0) {
      return a.xmap($$1 -> new lj($$0, $$1), $$0x -> $$0x.c).fieldOf("block_state");
   }

   public static zg<? super wt, lj> b(lq<lj> $$0) {
      return ze.a(die.q).a($$1 -> new lj($$0, $$1), $$0x -> $$0x.c);
   }

   public lj(lq<lj> $$0, dvj $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public lq<lj> a() {
      return this.b;
   }

   public dvj b() {
      return this.c;
   }
}
