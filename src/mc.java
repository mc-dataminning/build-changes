import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record mc(fdw c, int d, int e) implements lv {
   public static final MapCodec<mc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fdw.a.fieldOf("target").forGetter(mc::b), ays.i.fieldOf("color").forGetter(mc::c), ays.m.fieldOf("duration").forGetter(mc::d))
            .apply($$0, mc::new)
   );
   public static final yu<wh, mc> b = yu.a(fdw.b, mc::b, ys.g, mc::c, ys.h, mc::d, mc::new);

   @Override
   public lw<mc> a() {
      return lx.W;
   }

   public fdw b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
