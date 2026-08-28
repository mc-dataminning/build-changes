import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ma(fcu c, int d, int e) implements lt {
   public static final MapCodec<ma> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fcu.a.fieldOf("target").forGetter(ma::b), ays.i.fieldOf("color").forGetter(ma::c), ays.m.fieldOf("duration").forGetter(ma::d))
            .apply($$0, ma::new)
   );
   public static final yt<wg, ma> b = yt.a(fcu.b, ma::b, yr.g, ma::c, yr.h, ma::d, ma::new);

   @Override
   public lu<ma> a() {
      return lv.W;
   }

   public fcu b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
