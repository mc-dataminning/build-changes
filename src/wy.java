import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class wy {
   public static final MapCodec<ww> a = kd.ar.q().dispatchMap(ww::a, $$0 -> $$0.a().codec());
   public static final Codec<ww> b = a.codec();

   public static wx<?> a(it<wx<?>> $$0) {
      it.a($$0, "blank", wu.b);
      it.a($$0, "styled", wz.a);
      return it.a($$0, "fixed", wv.a);
   }

   public static <T extends ww> void a(uj $$0, T $$1) {
      wx<T> $$2 = (wx<T>)$$1.a();
      $$0.a(kd.ar, $$2);
      $$2.a($$0, $$1);
   }

   public static ww a(uj $$0) {
      wx<?> $$1 = $$0.a(kd.ar);
      return $$1.b($$0);
   }
}
