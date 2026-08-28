import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record lq(float c) implements lm {
   public static final MapCodec<lq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("roll").forGetter($$0x -> $$0x.c)).apply($$0, lq::new));
   public static final zc<wp, lq> b = zc.a(za.j, $$0 -> $$0.c, lq::new);

   @Override
   public ln<lq> a() {
      return lo.J;
   }

   public float b() {
      return this.c;
   }
}
