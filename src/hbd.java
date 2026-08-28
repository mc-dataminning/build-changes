import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hbd implements hbh {
   static final hbh a = new hbd();

   @Override
   public void a(hbk $$0, cwn $$1, hbi $$2, cwl $$3, @Nullable gfw $$4, @Nullable bvf $$5, int $$6) {
      cwn $$7 = cva.i($$1);
      if (!$$7.f()) {
         $$2.a($$0, $$7, $$3, $$4, $$5, $$6);
      }
   }

   public static record a() implements hbh.b {
      public static final MapCodec<hbd.a> a = MapCodec.unit(new hbd.a());

      @Override
      public MapCodec<hbd.a> a() {
         return a;
      }

      @Override
      public hbh a(hbh.a $$0) {
         return hbd.a;
      }

      @Override
      public void a(hhe.a $$0) {
      }
   }
}
