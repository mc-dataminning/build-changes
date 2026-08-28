import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class lc extends le {
   public static final Vector3f a = evm.a(3790560).j();
   public static final lc b = new lc(a, ld.a, 1.0F);
   public static final MapCodec<lc> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ayc.c.fieldOf("from_color").forGetter($$0x -> $$0x.g),
               ayc.c.fieldOf("to_color").forGetter($$0x -> $$0x.i),
               Codec.FLOAT.fieldOf("scale").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, lc::new)
   );
   public static final zj<ww, lc> d = zj.a(zh.r, $$0 -> $$0.g, zh.r, $$0 -> $$0.i, zh.i, $$0 -> $$0.h, lc::new);
   private final Vector3f i;

   public lc(Vector3f $$0, Vector3f $$1, float $$2) {
      super($$0, $$2);
      this.i = $$1;
   }

   public Vector3f b() {
      return this.g;
   }

   public Vector3f c() {
      return this.i;
   }

   @Override
   public li<lc> a() {
      return lj.o;
   }
}
