import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hcj implements hcs {
   public static final MapCodec<hcj> a = hck.a.xmap(hcj::new, $$0 -> $$0.b);
   private final hck b;

   public hcj(boolean $$0, hck.a $$1) {
      this(new hck($$0, $$1));
   }

   private hcj(hck $$0) {
      this.b = $$0;
   }

   @Override
   public float a(cwo $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3) {
      return this.b.a($$0, $$1, $$2, $$3);
   }

   @Override
   public MapCodec<hcj> a() {
      return a;
   }
}
