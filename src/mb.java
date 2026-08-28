import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record mb(float c) implements lx {
   public static final MapCodec<mb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("roll").forGetter($$0x -> $$0x.c)).apply($$0, mb::new));
   public static final za<wn, mb> b = za.a(yy.l, $$0 -> $$0.c, mb::new);

   @Override
   public ly<mb> a() {
      return lz.L;
   }

   public float b() {
      return this.c;
   }
}
