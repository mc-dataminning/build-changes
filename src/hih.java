import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hih implements hiq {
   public static final MapCodec<hih> a = hii.a.xmap(hih::new, $$0 -> $$0.b);
   private final hii b;

   public hih(boolean $$0, hii.a $$1) {
      this(new hii($$0, $$1));
   }

   private hih(hii $$0) {
      this.b = $$0;
   }

   @Override
   public float a(dak $$0, @Nullable glo $$1, @Nullable byf $$2, int $$3) {
      return this.b.a($$0, $$1, $$2, $$3);
   }

   @Override
   public MapCodec<hih> a() {
      return a;
   }
}
