import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hcg() implements hby {
   public static final MapCodec<hcg> a = MapCodec.unit(new hcg());

   @Override
   public boolean a(cwq $$0, @Nullable gga $$1, @Nullable bvi $$2, int $$3, cwo $$4) {
      if ($$2 instanceof gkx $$5 && $$5.gi().f() == $$0) {
         return true;
      }

      return false;
   }

   @Override
   public MapCodec<hcg> a() {
      return a;
   }
}
