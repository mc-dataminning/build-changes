import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class lo extends lu {
   public static final int a = 16711680;
   public static final lo b = new lo(16711680, 1.0F);
   public static final MapCodec<lo> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayi.i.fieldOf("color").forGetter($$0x -> $$0x.h), g.fieldOf("scale").forGetter(lu::d)).apply($$0, lo::new)
   );
   public static final ym<vz, lo> d = ym.a(yk.g, $$0 -> $$0.h, yk.l, lu::d, lo::new);
   private final int h;

   public lo(int $$0, float $$1) {
      super($$1);
      this.h = $$0;
   }

   @Override
   public ls<lo> a() {
      return lt.n;
   }

   public Vector3f b() {
      return axk.h(this.h);
   }
}
