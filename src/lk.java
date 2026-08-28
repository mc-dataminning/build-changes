import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class lk extends lr {
   public static final Vector3f a = ezh.a(3790560).k();
   public static final lk b = new lk(a, ll.a, 1.0F);
   public static final MapCodec<lk> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ays.c.fieldOf("from_color").forGetter($$0x -> $$0x.h), ays.c.fieldOf("to_color").forGetter($$0x -> $$0x.i), g.fieldOf("scale").forGetter(lr::d)
            )
            .apply($$0, lk::new)
   );
   public static final zf<ws, lk> d = zf.a(zd.s, $$0 -> $$0.h, zd.s, $$0 -> $$0.i, zd.j, lr::d, lk::new);
   private final Vector3f h;
   private final Vector3f i;

   public lk(Vector3f $$0, Vector3f $$1, float $$2) {
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
   public lp<lk> a() {
      return lq.o;
   }
}
