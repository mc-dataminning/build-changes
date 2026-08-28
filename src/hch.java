import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hch() implements hbx {
   public static final MapCodec<hch> a = MapCodec.unit(new hch());

   @Override
   public boolean a(cwp $$0, @Nullable gfz $$1, @Nullable bvh $$2, int $$3, cwn $$4) {
      flj $$5 = flj.Q();
      bul $$6 = $$5.ao();
      return $$6 != null ? $$2 == $$6 : $$2 == $$5.t;
   }

   @Override
   public MapCodec<hch> a() {
      return a;
   }
}
