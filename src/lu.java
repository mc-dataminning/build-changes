import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class lu extends ma {
   public static final int a = 16711680;
   public static final lu b = new lu(16711680, 1.0F);
   public static final MapCodec<lu> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(azg.i.fieldOf("color").forGetter($$0x -> $$0x.h), g.fieldOf("scale").forGetter(ma::d)).apply($$0, lu::new)
   );
   public static final ze<wp, lu> d = ze.a(zc.g, $$0 -> $$0.h, zc.l, ma::d, lu::new);
   private final int h;

   public lu(int $$0, float $$1) {
      super($$1);
      this.h = $$0;
   }

   @Override
   public ly<lu> a() {
      return lz.n;
   }

   public Vector3f b() {
      return ayh.h(this.h);
   }
}
