import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class lf implements ll {
   private static final Codec<dua> a = Codec.withAlternative(dua.a, lu.e.q(), dgv::o);
   private final lm<lf> b;
   private final dua c;

   public static MapCodec<lf> a(lm<lf> $$0) {
      return a.xmap($$1 -> new lf($$0, $$1), $$0x -> $$0x.c).fieldOf("block_state");
   }

   public static zb<? super wo, lf> b(lm<lf> $$0) {
      return yz.a(dgv.q).a($$1 -> new lf($$0, $$1), $$0x -> $$0x.c);
   }

   public lf(lm<lf> $$0, dua $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public lm<lf> a() {
      return this.b;
   }

   public dua b() {
      return this.c;
   }
}
