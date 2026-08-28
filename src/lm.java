import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class lm extends ls {
   public static final Vector3f a = ezn.a(16711680).k();
   public static final lm b = new lm(a, 1.0F);
   public static final MapCodec<lm> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayt.c.fieldOf("color").forGetter($$0x -> $$0x.h), g.fieldOf("scale").forGetter(ls::d)).apply($$0, lm::new)
   );
   public static final zg<wt, lm> d = zg.a(ze.s, $$0 -> $$0.h, ze.j, ls::d, lm::new);
   private final Vector3f h;

   public lm(Vector3f $$0, float $$1) {
      super($$1);
      this.h = $$0;
   }

   @Override
   public lq<lm> a() {
      return lr.n;
   }

   public Vector3f b() {
      return this.h;
   }
}
