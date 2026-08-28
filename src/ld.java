import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class ld extends lk {
   public static final Vector3f a = evz.a(3790560).j();
   public static final ld b = new ld(a, le.a, 1.0F);
   public static final MapCodec<ld> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               axm.c.fieldOf("from_color").forGetter($$0x -> $$0x.h), axm.c.fieldOf("to_color").forGetter($$0x -> $$0x.i), g.fieldOf("scale").forGetter(lk::d)
            )
            .apply($$0, ld::new)
   );
   public static final ys<wf, ld> d = ys.a(yq.r, $$0 -> $$0.h, yq.r, $$0 -> $$0.i, yq.i, lk::d, ld::new);
   private final Vector3f h;
   private final Vector3f i;

   public ld(Vector3f $$0, Vector3f $$1, float $$2) {
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
   public li<ld> a() {
      return lj.o;
   }
}
