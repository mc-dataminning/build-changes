import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hgo implements hgx {
   public static final MapCodec<hgo> a = hgp.a.xmap(hgo::new, $$0 -> $$0.b);
   private final hgp b;

   public hgo(boolean $$0, hgp.a $$1) {
      this(new hgp($$0, $$1));
   }

   private hgo(hgp $$0) {
      this.b = $$0;
   }

   @Override
   public float a(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2, int $$3) {
      return this.b.a($$0, $$1, $$2, $$3);
   }

   @Override
   public MapCodec<hgo> a() {
      return a;
   }
}
