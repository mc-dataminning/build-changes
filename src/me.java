import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record me(fgc c, int d, int e) implements lx {
   public static final MapCodec<me> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fgc.a.fieldOf("target").forGetter(me::b), azg.i.fieldOf("color").forGetter(me::c), azg.m.fieldOf("duration").forGetter(me::d))
            .apply($$0, me::new)
   );
   public static final ze<wp, me> b = ze.a(fgc.b, me::b, zc.g, me::c, zc.h, me::d, me::new);

   @Override
   public ly<me> a() {
      return lz.W;
   }

   public fgc b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
