import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class wv {
   public static final MapCodec<wt> a = kd.ar.q().dispatchMap(wt::a, $$0 -> $$0.a().codec());
   public static final Codec<wt> b = a.codec();

   public static wu<?> a(it<wu<?>> $$0) {
      wu<?> $$1 = it.a($$0, "blank", wr.b);
      it.a($$0, "result", ww.a);
      it.a($$0, "fixed", ws.a);
      return $$1;
   }

   public static <T extends wt> void a(ug $$0, T $$1) {
      wu<T> $$2 = (wu<T>)$$1.a();
      $$0.a(kd.ar, $$2);
      $$2.a($$0, $$1);
   }

   public static wt a(ug $$0) {
      wu<?> $$1 = $$0.a(kd.ar);
      return $$1.b($$0);
   }
}
