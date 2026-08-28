import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hit implements hjc {
   public static final MapCodec<hit> a = hiu.a.xmap(hit::new, $$0 -> $$0.b);
   private final hiu b;

   public hit(boolean $$0, hiu.a $$1) {
      this(new hiu($$0, $$1));
   }

   private hit(hiu $$0) {
      this.b = $$0;
   }

   @Override
   public float a(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2, int $$3) {
      return this.b.a($$0, $$1, $$2, $$3);
   }

   @Override
   public MapCodec<hit> a() {
      return a;
   }
}
