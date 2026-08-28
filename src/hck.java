import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hck implements hct {
   public static final MapCodec<hck> a = hcl.a.xmap(hck::new, $$0 -> $$0.b);
   private final hcl b;

   public hck(boolean $$0, hcl.a $$1) {
      this(new hcl($$0, $$1));
   }

   private hck(hcl $$0) {
      this.b = $$0;
   }

   @Override
   public float a(cwp $$0, @Nullable gfz $$1, @Nullable bvh $$2, int $$3) {
      return this.b.a($$0, $$1, $$2, $$3);
   }

   @Override
   public MapCodec<hck> a() {
      return a;
   }
}
