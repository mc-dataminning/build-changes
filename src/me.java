import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record me(ffs c, int d, int e) implements lx {
   public static final MapCodec<me> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ffs.a.fieldOf("target").forGetter(me::b), ayy.i.fieldOf("color").forGetter(me::c), ayy.m.fieldOf("duration").forGetter(me::d))
            .apply($$0, me::new)
   );
   public static final za<wn, me> b = za.a(ffs.b, me::b, yy.g, me::c, yy.h, me::d, me::new);

   @Override
   public ly<me> a() {
      return lz.W;
   }

   public ffs b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
