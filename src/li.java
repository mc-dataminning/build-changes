import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class li extends lp {
   public static final Vector3f a = eyw.a(3790560).k();
   public static final li b = new li(a, lj.a, 1.0F);
   public static final MapCodec<li> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ayo.c.fieldOf("from_color").forGetter($$0x -> $$0x.h), ayo.c.fieldOf("to_color").forGetter($$0x -> $$0x.i), g.fieldOf("scale").forGetter(lp::d)
            )
            .apply($$0, li::new)
   );
   public static final zc<wp, li> d = zc.a(za.s, $$0 -> $$0.h, za.s, $$0 -> $$0.i, za.j, lp::d, li::new);
   private final Vector3f h;
   private final Vector3f i;

   public li(Vector3f $$0, Vector3f $$1, float $$2) {
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
   public ln<li> a() {
      return lo.o;
   }
}
