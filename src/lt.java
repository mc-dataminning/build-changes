import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class lt extends lz {
   public static final int a = 16711680;
   public static final lt b = new lt(16711680, 1.0F);
   public static final MapCodec<lt> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayw.i.fieldOf("color").forGetter($$0x -> $$0x.h), g.fieldOf("scale").forGetter(lz::d)).apply($$0, lt::new)
   );
   public static final yy<wl, lt> d = yy.a(yw.g, $$0 -> $$0.h, yw.l, lz::d, lt::new);
   private final int h;

   public lt(int $$0, float $$1) {
      super($$1);
      this.h = $$0;
   }

   @Override
   public lx<lt> a() {
      return ly.n;
   }

   public Vector3f b() {
      return axy.h(this.h);
   }
}
