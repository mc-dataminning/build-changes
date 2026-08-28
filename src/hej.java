import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hej implements hes {
   public static final MapCodec<hej> a = hek.a.xmap(hej::new, $$0 -> $$0.b);
   private final hek b;

   public hej(boolean $$0, hek.a $$1) {
      this(new hek($$0, $$1));
   }

   private hej(hek $$0) {
      this.b = $$0;
   }

   @Override
   public float a(cxy $$0, @Nullable ghz $$1, @Nullable bwr $$2, int $$3) {
      return this.b.a($$0, $$1, $$2, $$3);
   }

   @Override
   public MapCodec<hej> a() {
      return a;
   }
}
