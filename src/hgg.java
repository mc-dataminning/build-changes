import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgg<T>(ki<T> a) implements hgp<T> {
   private static final hgp.a<? extends hgg<?>, ?> b = e();

   private static <T> hgp.a<hgg<T>, T> e() {
      Codec<? extends ki<?>> $$0 = mf.am.q().validate($$0x -> $$0x.d() ? DataResult.error(() -> "Component can't be serialized") : DataResult.success($$0x));
      MapCodec<hev.d<hgg<T>, T>> $$2 = $$0.dispatchMap(
         "component", $$0x -> ((hgg)$$0x.a()).a, $$0x -> hgp.a.a($$0x.c()).xmap($$1 -> new hev.d<>(new hgg($$0x), $$1), hev.d::b)
      );
      return new hgp.a<>($$2);
   }

   public static <T> hgp.a<hgg<T>, T> c() {
      return (hgp.a<hgg<T>, T>)b;
   }

   @Nullable
   @Override
   public T b(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2, int $$3, cyq $$4) {
      return $$0.a(this.a);
   }

   @Override
   public hgp.a<hgg<T>, T> a() {
      return c();
   }

   @Override
   public Codec<T> b() {
      return this.a.c();
   }

   public ki<T> d() {
      return this.a;
   }
}
