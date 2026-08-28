import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hdj implements hds {
   public static final MapCodec<hdj> a = hdk.a.xmap(hdj::new, $$0 -> $$0.b);
   private final hdk b;

   public hdj(boolean $$0, hdk.a $$1) {
      this(new hdk($$0, $$1));
   }

   private hdj(hdk $$0) {
      this.b = $$0;
   }

   @Override
   public float a(cxh $$0, @Nullable ggy $$1, @Nullable bvy $$2, int $$3) {
      return this.b.a($$0, $$1, $$2, $$3);
   }

   @Override
   public MapCodec<hdj> a() {
      return a;
   }
}
