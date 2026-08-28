import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hid() implements hht {
   public static final MapCodec<hid> a = MapCodec.unit(new hid());

   @Override
   public boolean get(dak $$0, @Nullable glo $$1, @Nullable byf $$2, int $$3, dai $$4) {
      fqq $$5 = fqq.Q();
      bxe $$6 = $$5.ao();
      return $$6 != null ? $$2 == $$6 : $$2 == $$5.t;
   }

   @Override
   public MapCodec<hid> a() {
      return a;
   }
}
