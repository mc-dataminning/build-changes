import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class lg extends ln {
   public static final Vector3f a = exa.a(3790560).j();
   public static final lg b = new lg(a, lh.a, 1.0F);
   public static final MapCodec<lg> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               axw.c.fieldOf("from_color").forGetter($$0x -> $$0x.h), axw.c.fieldOf("to_color").forGetter($$0x -> $$0x.i), g.fieldOf("scale").forGetter(ln::d)
            )
            .apply($$0, lg::new)
   );
   public static final yx<wk, lg> d = yx.a(yv.r, $$0 -> $$0.h, yv.r, $$0 -> $$0.i, yv.i, ln::d, lg::new);
   private final Vector3f h;
   private final Vector3f i;

   public lg(Vector3f $$0, Vector3f $$1, float $$2) {
      super($$2);
      this.h = $$0;
      this.i = $$1;
   }

   public Vector3f b() {
      return this.h;
   }

   public Vector3f c() {
      return this.i;
   }

   @Override
   public ll<lg> a() {
      return lm.o;
   }
}
