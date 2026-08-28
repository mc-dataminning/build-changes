import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record lp(float c) implements ll {
   public static final MapCodec<lp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("roll").forGetter($$0x -> $$0x.c)).apply($$0, lp::new));
   public static final zb<wo, lp> b = zb.a(yz.i, $$0 -> $$0.c, lp::new);

   @Override
   public lm<lp> a() {
      return ln.J;
   }

   public float b() {
      return this.c;
   }
}
