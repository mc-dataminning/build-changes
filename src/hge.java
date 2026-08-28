import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hge() implements hga {
   public static final MapCodec<hge> a = MapCodec.unit(new hge());

   @Override
   public boolean get(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2, int $$3, czb $$4) {
      if ($$2 instanceof crc $$5 && $$5.ck != null) {
         bwx $$6 = gwo.a($$5);
         return $$2.a($$6) == $$0;
      }

      return false;
   }

   @Override
   public MapCodec<hge> a() {
      return a;
   }
}
