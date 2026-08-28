import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class le extends lk {
   public static final Vector3f a = ewf.a(16711680).j();
   public static final le b = new le(a, 1.0F);
   public static final MapCodec<le> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axo.c.fieldOf("color").forGetter($$0x -> $$0x.h), g.fieldOf("scale").forGetter(lk::d)).apply($$0, le::new)
   );
   public static final ys<wf, le> d = ys.a(yq.r, $$0 -> $$0.h, yq.i, lk::d, le::new);
   private final Vector3f h;

   public le(Vector3f $$0, float $$1) {
      super($$1);
      this.h = $$0;
   }

   @Override
   public li<le> a() {
      return lj.n;
   }

   public Vector3f b() {
      return this.h;
   }
}
