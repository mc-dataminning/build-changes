import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hhr<T>(kj<T> a) implements hia<T> {
   private static final hia.a<? extends hhr<?>, ?> b = e();

   private static <T> hia.a<hhr<T>, T> e() {
      Codec<? extends kj<?>> $$0 = mg.am.q().validate($$0x -> $$0x.d() ? DataResult.error(() -> "Component can't be serialized") : DataResult.success($$0x));
      MapCodec<hgg.d<hhr<T>, T>> $$2 = $$0.dispatchMap(
         "component", $$0x -> ((hhr)$$0x.a()).a, $$0x -> hia.a.a($$0x.c()).xmap($$1 -> new hgg.d<>(new hhr($$0x), $$1), hgg.d::b)
      );
      return new hia.a<>($$2);
   }

   public static <T> hia.a<hhr<T>, T> c() {
      return (hia.a<hhr<T>, T>)b;
   }

   @Nullable
   @Override
   public T b(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2, int $$3, czi $$4) {
      return $$0.a(this.a);
   }

   @Override
   public hia.a<hhr<T>, T> a() {
      return c();
   }

   @Override
   public Codec<T> b() {
      return this.a.c();
   }

   public kj<T> d() {
      return this.a;
   }
}
