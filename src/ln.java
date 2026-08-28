import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class ln extends lu {
   public static final int a = 3790560;
   public static final ln b = new ln(3790560, 16711680, 1.0F);
   public static final MapCodec<ln> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ayi.i.fieldOf("from_color").forGetter($$0x -> $$0x.h), ayi.i.fieldOf("to_color").forGetter($$0x -> $$0x.i), g.fieldOf("scale").forGetter(lu::d)
            )
            .apply($$0, ln::new)
   );
   public static final ym<vz, ln> d = ym.a(yk.g, $$0 -> $$0.h, yk.g, $$0 -> $$0.i, yk.l, lu::d, ln::new);
   private final int h;
   private final int i;

   public ln(int $$0, int $$1, float $$2) {
      super($$2);
      this.h = $$0;
      this.i = $$1;
   }

   public Vector3f b() {
      return axk.h(this.h);
   }

   public Vector3f c() {
      return axk.h(this.i);
   }

   @Override
   public ls<ln> a() {
      return lt.o;
   }
}
