import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class ln extends lt {
   public static final Vector3f a = fbs.a(16711680).k();
   public static final ln b = new ln(a, 1.0F);
   public static final MapCodec<ln> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(azn.c.fieldOf("color").forGetter($$0x -> $$0x.h), g.fieldOf("scale").forGetter(lt::d)).apply($$0, ln::new)
   );
   public static final zt<xg, ln> d = zt.a(zr.u, $$0 -> $$0.h, zr.l, lt::d, ln::new);
   private final Vector3f h;

   public ln(Vector3f $$0, float $$1) {
      super($$1);
      this.h = $$0;
   }

   @Override
   public lr<ln> a() {
      return ls.n;
   }

   public Vector3f b() {
      return this.h;
   }
}
