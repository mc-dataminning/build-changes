import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class lk implements lq {
   private static final Codec<dxu> a = Codec.withAlternative(dxu.a, ma.e.q(), dkl::m);
   private final lr<lk> b;
   private final dxu c;

   public static MapCodec<lk> a(lr<lk> $$0) {
      return a.xmap($$1 -> new lk($$0, $$1), $$0x -> $$0x.c).fieldOf("block_state");
   }

   public static zt<? super xg, lk> b(lr<lk> $$0) {
      return zr.a(dkl.q).a($$1 -> new lk($$0, $$1), $$0x -> $$0x.c);
   }

   public lk(lr<lk> $$0, dxu $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public lr<lk> a() {
      return this.b;
   }

   public dxu b() {
      return this.c;
   }
}
