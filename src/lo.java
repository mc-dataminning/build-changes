import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record lo(float c) implements lk {
   public static final MapCodec<lo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("roll").forGetter($$0x -> $$0x.c)).apply($$0, lo::new));
   public static final yw<wj, lo> b = yw.a(yu.i, $$0 -> $$0.c, lo::new);

   @Override
   public ll<lo> a() {
      return lm.J;
   }

   public float b() {
      return this.c;
   }
}
