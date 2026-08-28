import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hfq implements hfz {
   public static final MapCodec<hfq> a = hfr.a.xmap(hfq::new, $$0 -> $$0.b);
   private final hfr b;

   public hfq(boolean $$0, hfr.a $$1) {
      this(new hfr($$0, $$1));
   }

   private hfq(hfr $$0) {
      this.b = $$0;
   }

   @Override
   public float a(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2, int $$3) {
      return this.b.a($$0, $$1, $$2, $$3);
   }

   @Override
   public MapCodec<hfq> a() {
      return a;
   }
}
