import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class lh extends lo {
   public static final Vector3f a = eys.a(3790560).k();
   public static final lh b = new lh(a, li.a, 1.0F);
   public static final MapCodec<lh> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               aym.c.fieldOf("from_color").forGetter($$0x -> $$0x.h), aym.c.fieldOf("to_color").forGetter($$0x -> $$0x.i), g.fieldOf("scale").forGetter(lo::d)
            )
            .apply($$0, lh::new)
   );
   public static final zb<wo, lh> d = zb.a(yz.r, $$0 -> $$0.h, yz.r, $$0 -> $$0.i, yz.i, lo::d, lh::new);
   private final Vector3f h;
   private final Vector3f i;

   public lh(Vector3f $$0, Vector3f $$1, float $$2) {
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
   public lm<lh> a() {
      return ln.o;
   }
}
