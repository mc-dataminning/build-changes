import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class lt extends ma {
   public static final int a = 3790560;
   public static final lt b = new lt(3790560, 16711680, 1.0F);
   public static final MapCodec<lt> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ayy.i.fieldOf("from_color").forGetter($$0x -> $$0x.h), ayy.i.fieldOf("to_color").forGetter($$0x -> $$0x.i), g.fieldOf("scale").forGetter(ma::d)
            )
            .apply($$0, lt::new)
   );
   public static final za<wn, lt> d = za.a(yy.g, $$0 -> $$0.h, yy.g, $$0 -> $$0.i, yy.l, ma::d, lt::new);
   private final int h;
   private final int i;

   public lt(int $$0, int $$1, float $$2) {
      super($$2);
      this.h = $$0;
      this.i = $$1;
   }

   public Vector3f b() {
      return aya.h(this.h);
   }

   public Vector3f c() {
      return aya.h(this.i);
   }

   @Override
   public ly<lt> a() {
      return lz.o;
   }
}
