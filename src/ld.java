import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class ld extends le {
   public static final Vector3f a = evm.a(16711680).j();
   public static final ld b = new ld(a, 1.0F);
   public static final MapCodec<ld> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayc.c.fieldOf("color").forGetter($$0x -> $$0x.g), Codec.FLOAT.fieldOf("scale").forGetter($$0x -> $$0x.h)).apply($$0, ld::new)
   );
   public static final zj<ww, ld> d = zj.a(zh.r, $$0 -> $$0.g, zh.i, $$0 -> $$0.h, ld::new);

   public ld(Vector3f $$0, float $$1) {
      super($$0, $$1);
   }

   @Override
   public li<ld> a() {
      return lj.n;
   }
}
