import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class la implements lg {
   private static final Codec<dsa> a = Codec.withAlternative(dsa.b, lp.e.q(), dex::o);
   private final lh<la> b;
   private final dsa c;

   public static MapCodec<la> a(lh<la> $$0) {
      return a.xmap($$1 -> new la($$0, $$1), $$0x -> $$0x.c).fieldOf("block_state");
   }

   public static zm<? super wz, la> b(lh<la> $$0) {
      return zk.a(dex.q).a($$1 -> new la($$0, $$1), $$0x -> $$0x.c);
   }

   public la(lh<la> $$0, dsa $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public lh<la> a() {
      return this.b;
   }

   public dsa b() {
      return this.c;
   }
}
