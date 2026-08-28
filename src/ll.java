import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class ll extends lr {
   public static final Vector3f a = ezh.a(16711680).k();
   public static final ll b = new ll(a, 1.0F);
   public static final MapCodec<ll> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ays.c.fieldOf("color").forGetter($$0x -> $$0x.h), g.fieldOf("scale").forGetter(lr::d)).apply($$0, ll::new)
   );
   public static final zf<ws, ll> d = zf.a(zd.s, $$0 -> $$0.h, zd.j, lr::d, ll::new);
   private final Vector3f h;

   public ll(Vector3f $$0, float $$1) {
      super($$1);
      this.h = $$0;
   }

   @Override
   public lp<ll> a() {
      return lq.n;
   }

   public Vector3f b() {
      return this.h;
   }
}
