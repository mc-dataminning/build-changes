import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hcg() implements hbx {
   public static final MapCodec<hcg> a = MapCodec.unit(new hcg());

   @Override
   public boolean a(cwp $$0, @Nullable gfz $$1, @Nullable bvh $$2, int $$3, cwn $$4) {
      return $$2 == null ? false : $$2.fz() && $$2.fB() == $$0;
   }

   @Override
   public MapCodec<hcg> a() {
      return a;
   }
}
