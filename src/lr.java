import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class lr extends ly {
   public static final int a = 3790560;
   public static final lr b = new lr(3790560, 16711680, 1.0F);
   public static final MapCodec<lr> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ays.i.fieldOf("from_color").forGetter($$0x -> $$0x.h), ays.i.fieldOf("to_color").forGetter($$0x -> $$0x.i), g.fieldOf("scale").forGetter(ly::d)
            )
            .apply($$0, lr::new)
   );
   public static final yu<wh, lr> d = yu.a(ys.g, $$0 -> $$0.h, ys.g, $$0 -> $$0.i, ys.l, ly::d, lr::new);
   private final int h;
   private final int i;

   public lr(int $$0, int $$1, float $$2) {
      super($$2);
      this.h = $$0;
      this.i = $$1;
   }

   public Vector3f b() {
      return axu.h(this.h);
   }

   public Vector3f c() {
      return axu.h(this.i);
   }

   @Override
   public lw<lr> a() {
      return lx.o;
   }
}
