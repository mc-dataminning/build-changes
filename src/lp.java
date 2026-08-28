import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class lp extends lw {
   public static final int a = 3790560;
   public static final lp b = new lp(3790560, 16711680, 1.0F);
   public static final MapCodec<lp> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ays.i.fieldOf("from_color").forGetter($$0x -> $$0x.h), ays.i.fieldOf("to_color").forGetter($$0x -> $$0x.i), g.fieldOf("scale").forGetter(lw::d)
            )
            .apply($$0, lp::new)
   );
   public static final yt<wg, lp> d = yt.a(yr.g, $$0 -> $$0.h, yr.g, $$0 -> $$0.i, yr.l, lw::d, lp::new);
   private final int h;
   private final int i;

   public lp(int $$0, int $$1, float $$2) {
      super($$2);
      this.h = $$0;
      this.i = $$1;
   }

   public Vector3f b() {
      return axu.h(this.h);
   }

   public Vector3f c() {
      return axu.h(this.i);
   }

   @Override
   public lu<lp> a() {
      return lv.o;
   }
}
