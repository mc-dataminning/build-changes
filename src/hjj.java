import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hjj<T>(kk<T> a) implements hjs<T> {
   private static final hjs.a<? extends hjj<?>, ?> b = e();

   private static <T> hjs.a<hjj<T>, T> e() {
      Codec<? extends kk<?>> $$0 = mh.am.q().validate($$0x -> $$0x.d() ? DataResult.error(() -> "Component can't be serialized") : DataResult.success($$0x));
      MapCodec<hhy.d<hjj<T>, T>> $$2 = $$0.dispatchMap(
         "component", $$0x -> ((hjj)$$0x.a()).a, $$0x -> hjs.a.a($$0x.c()).xmap($$1 -> new hhy.d<>(new hjj($$0x), $$1), hhy.d::b)
      );
      return new hjs.a<>($$2);
   }

   public static <T> hjs.a<hjj<T>, T> c() {
      return (hjs.a<hjj<T>, T>)b;
   }

   @Nullable
   @Override
   public T b(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2, int $$3, czy $$4) {
      return $$0.a(this.a);
   }

   @Override
   public hjs.a<hjj<T>, T> a() {
      return c();
   }

   @Override
   public Codec<T> b() {
      return this.a.c();
   }

   public kk<T> d() {
      return this.a;
   }
}
