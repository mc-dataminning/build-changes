import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class lm extends lt {
   public static final int a = 3790560;
   public static final lm b = new lm(3790560, 16711680, 1.0F);
   public static final MapCodec<lm> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               azn.i.fieldOf("from_color").forGetter($$0x -> $$0x.h), azn.i.fieldOf("to_color").forGetter($$0x -> $$0x.i), g.fieldOf("scale").forGetter(lt::d)
            )
            .apply($$0, lm::new)
   );
   public static final zt<xg, lm> d = zt.a(zr.g, $$0 -> $$0.h, zr.g, $$0 -> $$0.i, zr.l, lt::d, lm::new);
   private final int h;
   private final int i;

   public lm(int $$0, int $$1, float $$2) {
      super($$2);
      this.h = $$0;
      this.i = $$1;
   }

   public Vector3f b() {
      return ayp.h(this.h);
   }

   public Vector3f c() {
      return ayp.h(this.i);
   }

   @Override
   public lr<lm> a() {
      return ls.o;
   }
}
