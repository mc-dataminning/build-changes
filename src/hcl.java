import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hcl implements hcu {
   public static final MapCodec<hcl> a = hcm.a.xmap(hcl::new, $$0 -> $$0.b);
   private final hcm b;

   public hcl(boolean $$0, hcm.a $$1) {
      this(new hcm($$0, $$1));
   }

   private hcl(hcm $$0) {
      this.b = $$0;
   }

   @Override
   public float a(cwq $$0, @Nullable gga $$1, @Nullable bvi $$2, int $$3) {
      return this.b.a($$0, $$1, $$2, $$3);
   }

   @Override
   public MapCodec<hcl> a() {
      return a;
   }
}
