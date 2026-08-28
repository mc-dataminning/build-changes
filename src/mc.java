import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record mc(feq c, int d, int e) implements lv {
   public static final MapCodec<mc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(feq.a.fieldOf("target").forGetter(mc::b), ayu.i.fieldOf("color").forGetter(mc::c), ayu.m.fieldOf("duration").forGetter(mc::d))
            .apply($$0, mc::new)
   );
   public static final yw<wj, mc> b = yw.a(feq.b, mc::b, yu.g, mc::c, yu.h, mc::d, mc::new);

   @Override
   public lw<mc> a() {
      return lx.W;
   }

   public feq b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
