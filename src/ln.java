import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class ln extends lt {
   public static final int a = 16711680;
   public static final ln b = new ln(16711680, 1.0F);
   public static final MapCodec<ln> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(azd.i.fieldOf("color").forGetter($$0x -> $$0x.h), g.fieldOf("scale").forGetter(lt::d)).apply($$0, ln::new)
   );
   public static final zi<wv, ln> d = zi.a(zg.g, $$0 -> $$0.h, zg.l, lt::d, ln::new);
   private final int h;

   public ln(int $$0, float $$1) {
      super($$1);
      this.h = $$0;
   }

   @Override
   public lr<ln> a() {
      return ls.n;
   }

   public Vector3f b() {
      return ayf.h(this.h);
   }
}
