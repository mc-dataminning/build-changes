import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class lg extends ln {
   public static final Vector3f a = eww.a(3790560).j();
   public static final lg b = new lg(a, lh.a, 1.0F);
   public static final MapCodec<lg> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               axv.c.fieldOf("from_color").forGetter($$0x -> $$0x.h), axv.c.fieldOf("to_color").forGetter($$0x -> $$0x.i), g.fieldOf("scale").forGetter(ln::d)
            )
            .apply($$0, lg::new)
   );
   public static final yw<wj, lg> d = yw.a(yu.r, $$0 -> $$0.h, yu.r, $$0 -> $$0.i, yu.i, ln::d, lg::new);
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
