import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record md(ffc c, int d, int e) implements lw {
   public static final MapCodec<md> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ffc.a.fieldOf("target").forGetter(md::b), ayu.i.fieldOf("color").forGetter(md::c), ayu.m.fieldOf("duration").forGetter(md::d))
            .apply($$0, md::new)
   );
   public static final yw<wj, md> b = yw.a(ffc.b, md::b, yu.g, md::c, yu.h, md::d, md::new);

   @Override
   public lx<md> a() {
      return ly.W;
   }

   public ffc b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
