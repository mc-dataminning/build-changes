import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record md(ffq c, int d, int e) implements lw {
   public static final MapCodec<md> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ffq.a.fieldOf("target").forGetter(md::b), ayw.i.fieldOf("color").forGetter(md::c), ayw.m.fieldOf("duration").forGetter(md::d))
            .apply($$0, md::new)
   );
   public static final yy<wl, md> b = yy.a(ffq.b, md::b, yw.g, md::c, yw.h, md::d, md::new);

   @Override
   public lx<md> a() {
      return ly.W;
   }

   public ffq b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
