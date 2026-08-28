import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hhe<T>(ki<T> a) implements hhn<T> {
   private static final hhn.a<? extends hhe<?>, ?> b = e();

   private static <T> hhn.a<hhe<T>, T> e() {
      Codec<? extends ki<?>> $$0 = mf.am.q().validate($$0x -> $$0x.d() ? DataResult.error(() -> "Component can't be serialized") : DataResult.success($$0x));
      MapCodec<hft.d<hhe<T>, T>> $$2 = $$0.dispatchMap(
         "component", $$0x -> ((hhe)$$0x.a()).a, $$0x -> hhn.a.a($$0x.c()).xmap($$1 -> new hft.d<>(new hhe($$0x), $$1), hft.d::b)
      );
      return new hhn.a<>($$2);
   }

   public static <T> hhn.a<hhe<T>, T> c() {
      return (hhn.a<hhe<T>, T>)b;
   }

   @Nullable
   @Override
   public T b(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2, int $$3, czb $$4) {
      return $$0.a(this.a);
   }

   @Override
   public hhn.a<hhe<T>, T> a() {
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
