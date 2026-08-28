import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record lv(float c) implements lr {
   public static final MapCodec<lv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("roll").forGetter($$0x -> $$0x.c)).apply($$0, lv::new));
   public static final ym<vz, lv> b = ym.a(yk.l, $$0 -> $$0.c, lv::new);

   @Override
   public ls<lv> a() {
      return lt.K;
   }

   public float b() {
      return this.c;
   }
}
