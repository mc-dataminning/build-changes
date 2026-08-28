import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class lk implements lq {
   private static final Codec<dvv> a = Codec.withAlternative(dvv.a, lz.e.q(), diq::m);
   private final lr<lk> b;
   private final dvv c;

   public static MapCodec<lk> a(lr<lk> $$0) {
      return a.xmap($$1 -> new lk($$0, $$1), $$0x -> $$0x.c).fieldOf("block_state");
   }

   public static zh<? super wu, lk> b(lr<lk> $$0) {
      return zf.a(diq.q).a($$1 -> new lk($$0, $$1), $$0x -> $$0x.c);
   }

   public lk(lr<lk> $$0, dvv $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public lr<lk> a() {
      return this.b;
   }

   public dvv b() {
      return this.c;
   }
}
