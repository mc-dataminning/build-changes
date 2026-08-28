import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class lk implements lq {
   private static final Codec<dvo> a = Codec.withAlternative(dvo.a, lz.e.q(), dij::m);
   private final lr<lk> b;
   private final dvo c;

   public static MapCodec<lk> a(lr<lk> $$0) {
      return a.xmap($$1 -> new lk($$0, $$1), $$0x -> $$0x.c).fieldOf("block_state");
   }

   public static zj<? super ww, lk> b(lr<lk> $$0) {
      return zh.a(dij.q).a($$1 -> new lk($$0, $$1), $$0x -> $$0x.c);
   }

   public lk(lr<lk> $$0, dvo $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public lr<lk> a() {
      return this.b;
   }

   public dvo b() {
      return this.c;
   }
}
