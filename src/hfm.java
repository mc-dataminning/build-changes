import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hfm implements hfn {
   public static final hfn a = new hfm();

   @Override
   public void a(hfq $$0, czd $$1, hfo $$2, czb $$3, @Nullable gjz $$4, @Nullable bxe $$5, int $$6) {
   }

   public static record a() implements hfn.b {
      public static final MapCodec<hfm.a> a = MapCodec.unit(hfm.a::new);

      @Override
      public void a(hlp.a $$0) {
      }

      @Override
      public hfn a(hfn.a $$0) {
         return hfm.a;
      }

      @Override
      public MapCodec<hfm.a> a() {
         return a;
      }
   }
}
