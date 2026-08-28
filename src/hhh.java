import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hhh implements hhq {
   public static final MapCodec<hhh> a = hhi.a.xmap(hhh::new, $$0 -> $$0.b);
   private final hhi b;

   public hhh(boolean $$0, hhi.a $$1) {
      this(new hhi($$0, $$1));
   }

   private hhh(hhi $$0) {
      this.b = $$0;
   }

   @Override
   public float a(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2, int $$3) {
      return this.b.a($$0, $$1, $$2, $$3);
   }

   @Override
   public MapCodec<hhh> a() {
      return a;
   }
}
