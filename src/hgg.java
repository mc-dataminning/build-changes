import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hgg implements hgp {
   public static final MapCodec<hgg> a = hgh.a.xmap(hgg::new, $$0 -> $$0.b);
   private final hgh b;

   public hgg(boolean $$0, hgh.a $$1) {
      this(new hgh($$0, $$1));
   }

   private hgg(hgh $$0) {
      this.b = $$0;
   }

   @Override
   public float a(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2, int $$3) {
      return this.b.a($$0, $$1, $$2, $$3);
   }

   @Override
   public MapCodec<hgg> a() {
      return a;
   }
}
