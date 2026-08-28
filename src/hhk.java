import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hhk implements hhp {
   static final hhp a = new hhk();

   @Override
   public void a(hhs $$0, czy $$1, hhq $$2, czw $$3, @Nullable gmb $$4, @Nullable bxu $$5, int $$6) {
      czy $$7 = cyn.i($$1);
      if (!$$7.f()) {
         $$2.b($$0, $$7, $$3, $$4, $$5, $$6);
      }
   }

   public static record a() implements hhp.b {
      public static final MapCodec<hhk.a> a = MapCodec.unit(new hhk.a());

      @Override
      public MapCodec<hhk.a> a() {
         return a;
      }

      @Override
      public hhp a(hhp.a $$0) {
         return hhk.a;
      }

      @Override
      public void a(hnr.a $$0) {
      }
   }
}
