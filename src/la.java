import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class la implements lg {
   private static final Codec<dsd> a = Codec.withAlternative(dsd.b, lp.e.q(), dfa::o);
   private final lh<la> b;
   private final dsd c;

   public static MapCodec<la> a(lh<la> $$0) {
      return a.xmap($$1 -> new la($$0, $$1), $$0x -> $$0x.c).fieldOf("block_state");
   }

   public static zn<? super xa, la> b(lh<la> $$0) {
      return zl.a(dfa.q).a($$1 -> new la($$0, $$1), $$0x -> $$0x.c);
   }

   public la(lh<la> $$0, dsd $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public lh<la> a() {
      return this.b;
   }

   public dsd b() {
      return this.c;
   }
}
