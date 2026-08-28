import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hhx() implements hht {
   public static final MapCodec<hhx> a = MapCodec.unit(new hhx());

   @Override
   public boolean get(dak $$0, @Nullable glo $$1, @Nullable byf $$2, int $$3, dai $$4) {
      if ($$2 instanceof csi $$5 && $$5.ck != null) {
         bxw $$6 = gyc.a($$5);
         return $$2.a($$6) == $$0;
      }

      return false;
   }

   @Override
   public MapCodec<hhx> a() {
      return a;
   }
}
