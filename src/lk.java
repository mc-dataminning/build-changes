import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record lk(float c) implements lg {
   public static final MapCodec<lk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("roll").forGetter($$0x -> $$0x.c)).apply($$0, lk::new));
   public static final zm<wz, lk> b = zm.a(zk.i, $$0 -> $$0.c, lk::new);

   @Override
   public lh<lk> a() {
      return li.J;
   }

   public float b() {
      return this.c;
   }
}
