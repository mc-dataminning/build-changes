import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class lc extends lj {
   public static final Vector3f a = evq.a(3790560).j();
   public static final lc b = new lc(a, ld.a, 1.0F);
   public static final MapCodec<lc> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ayg.c.fieldOf("from_color").forGetter($$0x -> $$0x.h), ayg.c.fieldOf("to_color").forGetter($$0x -> $$0x.i), g.fieldOf("scale").forGetter(lj::d)
            )
            .apply($$0, lc::new)
   );
   public static final zm<wz, lc> d = zm.a(zk.r, $$0 -> $$0.h, zk.r, $$0 -> $$0.i, zk.i, lj::d, lc::new);
   private final Vector3f h;
   private final Vector3f i;

   public lc(Vector3f $$0, Vector3f $$1, float $$2) {
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
   public lh<lc> a() {
      return li.o;
   }
}
