import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class lk implements lq {
   private static final Codec<dxo> a = Codec.withAlternative(dxo.a, ma.e.q(), dkd::m);
   private final lr<lk> b;
   private final dxo c;

   public static MapCodec<lk> a(lr<lk> $$0) {
      return a.xmap($$1 -> new lk($$0, $$1), $$0x -> $$0x.c).fieldOf("block_state");
   }

   public static zi<? super wv, lk> b(lr<lk> $$0) {
      return zg.a(dkd.q).a($$1 -> new lk($$0, $$1), $$0x -> $$0x.c);
   }

   public lk(lr<lk> $$0, dxo $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public lr<lk> a() {
      return this.b;
   }

   public dxo b() {
      return this.c;
   }
}
