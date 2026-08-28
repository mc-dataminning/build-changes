import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class lq extends lw {
   public static final int a = 16711680;
   public static final lq b = new lq(16711680, 1.0F);
   public static final MapCodec<lq> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ays.i.fieldOf("color").forGetter($$0x -> $$0x.h), g.fieldOf("scale").forGetter(lw::d)).apply($$0, lq::new)
   );
   public static final yt<wg, lq> d = yt.a(yr.g, $$0 -> $$0.h, yr.l, lw::d, lq::new);
   private final int h;

   public lq(int $$0, float $$1) {
      super($$1);
      this.h = $$0;
   }

   @Override
   public lu<lq> a() {
      return lv.n;
   }

   public Vector3f b() {
      return axu.h(this.h);
   }
}
