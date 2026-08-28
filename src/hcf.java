import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hcf implements hco {
   public static final MapCodec<hcf> a = hcg.a.xmap(hcf::new, $$0 -> $$0.b);
   private final hcg b;

   public hcf(boolean $$0, hcg.a $$1) {
      this(new hcg($$0, $$1));
   }

   private hcf(hcg $$0) {
      this.b = $$0;
   }

   @Override
   public float a(cwn $$0, @Nullable gfw $$1, @Nullable bvf $$2, int $$3) {
      return this.b.a($$0, $$1, $$2, $$3);
   }

   @Override
   public MapCodec<hcf> a() {
      return a;
   }
}
