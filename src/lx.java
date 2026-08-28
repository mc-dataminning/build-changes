import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record lx(fbr c, int d, int e) implements lq {
   public static final MapCodec<lx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fbr.a.fieldOf("target").forGetter(lx::b), azd.i.fieldOf("color").forGetter(lx::c), azd.m.fieldOf("duration").forGetter(lx::d))
            .apply($$0, lx::new)
   );
   public static final zi<wv, lx> b = zi.a(fbr.b, lx::b, zg.g, lx::c, zg.h, lx::d, lx::new);

   @Override
   public lr<lx> a() {
      return ls.V;
   }

   public fbr b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
