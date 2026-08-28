import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class lm extends lt {
   public static final Vector3f a = ezr.a(3790560).k();
   public static final lm b = new lm(a, ln.a, 1.0F);
   public static final MapCodec<lm> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ayw.c.fieldOf("from_color").forGetter($$0x -> $$0x.h), ayw.c.fieldOf("to_color").forGetter($$0x -> $$0x.i), g.fieldOf("scale").forGetter(lt::d)
            )
            .apply($$0, lm::new)
   );
   public static final zj<ww, lm> d = zj.a(zh.s, $$0 -> $$0.h, zh.s, $$0 -> $$0.i, zh.j, lt::d, lm::new);
   private final Vector3f h;
   private final Vector3f i;

   public lm(Vector3f $$0, Vector3f $$1, float $$2) {
      super($$2);
      this.h = $$0;
      this.i = $$1;
   }

   public Vector3f b() {
      return this.h;
   }

   public Vector3f c() {
      return this.i;
   }

   @Override
   public lr<lm> a() {
      return ls.o;
   }
}
