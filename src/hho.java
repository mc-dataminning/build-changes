import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hho implements hhp {
   public static final hhp a = new hho();

   @Override
   public void a(hhs $$0, czy $$1, hhq $$2, czw $$3, @Nullable gmb $$4, @Nullable bxu $$5, int $$6) {
   }

   public static record a() implements hhp.b {
      public static final MapCodec<hho.a> a = MapCodec.unit(hho.a::new);

      @Override
      public void a(hnr.a $$0) {
      }

      @Override
      public hhp a(hhp.a $$0) {
         return hho.a;
      }

      @Override
      public MapCodec<hho.a> a() {
         return a;
      }
   }
}
