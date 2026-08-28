import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class lk implements lq {
   private static final Codec<dxn> a = Codec.withAlternative(dxn.a, ma.e.q(), dke::m);
   private final lr<lk> b;
   private final dxn c;

   public static MapCodec<lk> a(lr<lk> $$0) {
      return a.xmap($$1 -> new lk($$0, $$1), $$0x -> $$0x.c).fieldOf("block_state");
   }

   public static zt<? super xg, lk> b(lr<lk> $$0) {
      return zr.a(dke.q).a($$1 -> new lk($$0, $$1), $$0x -> $$0x.c);
   }

   public lk(lr<lk> $$0, dxn $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public lr<lk> a() {
      return this.b;
   }

   public dxn b() {
      return this.c;
   }
}
