import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class ls extends lz {
   public static final int a = 3790560;
   public static final ls b = new ls(3790560, 16711680, 1.0F);
   public static final MapCodec<ls> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ayu.i.fieldOf("from_color").forGetter($$0x -> $$0x.h), ayu.i.fieldOf("to_color").forGetter($$0x -> $$0x.i), g.fieldOf("scale").forGetter(lz::d)
            )
            .apply($$0, ls::new)
   );
   public static final yw<wj, ls> d = yw.a(yu.g, $$0 -> $$0.h, yu.g, $$0 -> $$0.i, yu.l, lz::d, ls::new);
   private final int h;
   private final int i;

   public ls(int $$0, int $$1, float $$2) {
      super($$2);
      this.h = $$0;
      this.i = $$1;
   }

   public Vector3f b() {
      return axw.h(this.h);
   }

   public Vector3f c() {
      return axw.h(this.i);
   }

   @Override
   public lx<ls> a() {
      return ly.o;
   }
}
