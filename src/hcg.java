import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hcg implements hcp {
   public static final MapCodec<hcg> a = hch.a.xmap(hcg::new, $$0 -> $$0.b);
   private final hch b;

   public hcg(boolean $$0, hch.a $$1) {
      this(new hch($$0, $$1));
   }

   private hcg(hch $$0) {
      this.b = $$0;
   }

   @Override
   public float a(cwp $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3) {
      return this.b.a($$0, $$1, $$2, $$3);
   }

   @Override
   public MapCodec<hcg> a() {
      return a;
   }
}
