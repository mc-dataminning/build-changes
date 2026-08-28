import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class lq implements ll {
   public static final MapCodec<lq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.INT.fieldOf("delay").forGetter($$0x -> $$0x.c)).apply($$0, lq::new));
   public static final zb<wo, lq> b = zb.a(yz.g, $$0 -> $$0.c, lq::new);
   private final int c;

   public lq(int $$0) {
      this.c = $$0;
   }

   @Override
   public lm<lq> a() {
      return ln.aV;
   }

   public int b() {
      return this.c;
   }
}
