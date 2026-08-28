import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hir implements hja {
   public static final MapCodec<hir> a = his.a.xmap(hir::new, $$0 -> $$0.b);
   private final his b;

   public hir(boolean $$0, his.a $$1) {
      this(new his($$0, $$1));
   }

   private hir(his $$0) {
      this.b = $$0;
   }

   @Override
   public float a(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2, int $$3) {
      return this.b.a($$0, $$1, $$2, $$3);
   }

   @Override
   public MapCodec<hir> a() {
      return a;
   }
}
