import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class lh extends ln {
   public static final Vector3f a = exa.a(16711680).j();
   public static final lh b = new lh(a, 1.0F);
   public static final MapCodec<lh> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axw.c.fieldOf("color").forGetter($$0x -> $$0x.h), g.fieldOf("scale").forGetter(ln::d)).apply($$0, lh::new)
   );
   public static final yx<wk, lh> d = yx.a(yv.r, $$0 -> $$0.h, yv.i, ln::d, lh::new);
   private final Vector3f h;

   public lh(Vector3f $$0, float $$1) {
      super($$1);
      this.h = $$0;
   }

   @Override
   public ll<lh> a() {
      return lm.n;
   }

   public Vector3f b() {
      return this.h;
   }
}
