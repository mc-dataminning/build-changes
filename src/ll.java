import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class ll extends ls {
   public static final Vector3f a = ezn.a(3790560).k();
   public static final ll b = new ll(a, lm.a, 1.0F);
   public static final MapCodec<ll> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ayt.c.fieldOf("from_color").forGetter($$0x -> $$0x.h), ayt.c.fieldOf("to_color").forGetter($$0x -> $$0x.i), g.fieldOf("scale").forGetter(ls::d)
            )
            .apply($$0, ll::new)
   );
   public static final zg<wt, ll> d = zg.a(ze.s, $$0 -> $$0.h, ze.s, $$0 -> $$0.i, ze.j, ls::d, ll::new);
   private final Vector3f h;
   private final Vector3f i;

   public ll(Vector3f $$0, Vector3f $$1, float $$2) {
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
   public lq<ll> a() {
      return lr.o;
   }
}
