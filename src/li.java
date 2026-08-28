import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class li extends lo {
   public static final Vector3f a = eys.a(16711680).k();
   public static final li b = new li(a, 1.0F);
   public static final MapCodec<li> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aym.c.fieldOf("color").forGetter($$0x -> $$0x.h), g.fieldOf("scale").forGetter(lo::d)).apply($$0, li::new)
   );
   public static final zb<wo, li> d = zb.a(yz.r, $$0 -> $$0.h, yz.i, lo::d, li::new);
   private final Vector3f h;

   public li(Vector3f $$0, float $$1) {
      super($$1);
      this.h = $$0;
   }

   @Override
   public lm<li> a() {
      return ln.n;
   }

   public Vector3f b() {
      return this.h;
   }
}
