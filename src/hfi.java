import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hfi implements hfn {
   static final hfn a = new hfi();

   @Override
   public void a(hfq $$0, czd $$1, hfo $$2, czb $$3, @Nullable gjz $$4, @Nullable bxe $$5, int $$6) {
      czd $$7 = cxs.i($$1);
      if (!$$7.f()) {
         $$2.a($$0, $$7, $$3, $$4, $$5, $$6);
      }
   }

   public static record a() implements hfn.b {
      public static final MapCodec<hfi.a> a = MapCodec.unit(new hfi.a());

      @Override
      public MapCodec<hfi.a> a() {
         return a;
      }

      @Override
      public hfn a(hfn.a $$0) {
         return hfi.a;
      }

      @Override
      public void a(hlp.a $$0) {
      }
   }
}
