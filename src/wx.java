import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class wx {
   public static final MapCodec<wv> a = kd.ar.q().dispatchMap(wv::a, $$0 -> $$0.a().codec());
   public static final Codec<wv> b = a.codec();

   public static ww<?> a(it<ww<?>> $$0) {
      ww<?> $$1 = it.a($$0, "blank", wt.b);
      it.a($$0, "result", wy.a);
      it.a($$0, "fixed", wu.a);
      return $$1;
   }

   public static <T extends wv> void a(ui $$0, T $$1) {
      ww<T> $$2 = (ww<T>)$$1.a();
      $$0.a(kd.ar, $$2);
      $$2.a($$0, $$1);
   }

   public static wv a(ui $$0) {
      ww<?> $$1 = $$0.a(kd.ar);
      return $$1.b($$0);
   }
}
