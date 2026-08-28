import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hdf implements hdk {
   static final hdk a = new hdf();

   @Override
   public void a(hdn $$0, cxy $$1, hdl $$2, cxw $$3, @Nullable ghz $$4, @Nullable bwr $$5, int $$6) {
      cxy $$7 = cwm.i($$1);
      if (!$$7.f()) {
         $$2.a($$0, $$7, $$3, $$4, $$5, $$6);
      }
   }

   public static record a() implements hdk.b {
      public static final MapCodec<hdf.a> a = MapCodec.unit(new hdf.a());

      @Override
      public MapCodec<hdf.a> a() {
         return a;
      }

      @Override
      public hdk a(hdk.a $$0) {
         return hdf.a;
      }

      @Override
      public void a(hjk.a $$0) {
      }
   }
}
