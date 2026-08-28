import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class ld extends lj {
   public static final Vector3f a = evq.a(16711680).j();
   public static final ld b = new ld(a, 1.0F);
   public static final MapCodec<ld> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayg.c.fieldOf("color").forGetter($$0x -> $$0x.h), g.fieldOf("scale").forGetter(lj::d)).apply($$0, ld::new)
   );
   public static final zm<wz, ld> d = zm.a(zk.r, $$0 -> $$0.h, zk.i, lj::d, ld::new);
   private final Vector3f h;

   public ld(Vector3f $$0, float $$1) {
      super($$1);
      this.h = $$0;
   }

   @Override
   public lh<ld> a() {
      return li.n;
   }

   public Vector3f b() {
      return this.h;
   }
}
