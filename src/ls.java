import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class ls extends ly {
   public static final int a = 16711680;
   public static final ls b = new ls(16711680, 1.0F);
   public static final MapCodec<ls> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ays.i.fieldOf("color").forGetter($$0x -> $$0x.h), g.fieldOf("scale").forGetter(ly::d)).apply($$0, ls::new)
   );
   public static final yu<wh, ls> d = yu.a(ys.g, $$0 -> $$0.h, ys.l, ly::d, ls::new);
   private final int h;

   public ls(int $$0, float $$1) {
      super($$1);
      this.h = $$0;
   }

   @Override
   public lw<ls> a() {
      return lx.n;
   }

   public Vector3f b() {
      return axu.h(this.h);
   }
}
