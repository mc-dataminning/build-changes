import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class lj extends lp {
   public static final Vector3f a = eyw.a(16711680).k();
   public static final lj b = new lj(a, 1.0F);
   public static final MapCodec<lj> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayo.c.fieldOf("color").forGetter($$0x -> $$0x.h), g.fieldOf("scale").forGetter(lp::d)).apply($$0, lj::new)
   );
   public static final zc<wp, lj> d = zc.a(za.s, $$0 -> $$0.h, za.j, lp::d, lj::new);
   private final Vector3f h;

   public lj(Vector3f $$0, float $$1) {
      super($$1);
      this.h = $$0;
   }

   @Override
   public ln<lj> a() {
      return lo.n;
   }

   public Vector3f b() {
      return this.h;
   }
}
