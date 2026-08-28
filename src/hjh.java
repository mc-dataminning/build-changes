import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hjh<T>(kj<T> a) implements hjq<T> {
   private static final hjq.a<? extends hjh<?>, ?> b = e();

   private static <T> hjq.a<hjh<T>, T> e() {
      Codec<? extends kj<?>> $$0 = mg.am.q().validate($$0x -> $$0x.d() ? DataResult.error(() -> "Component can't be serialized") : DataResult.success($$0x));
      MapCodec<hhw.d<hjh<T>, T>> $$2 = $$0.dispatchMap(
         "component", $$0x -> ((hjh)$$0x.a()).a, $$0x -> hjq.a.a($$0x.c()).xmap($$1 -> new hhw.d<>(new hjh($$0x), $$1), hhw.d::b)
      );
      return new hjq.a<>($$2);
   }

   public static <T> hjq.a<hjh<T>, T> c() {
      return (hjq.a<hjh<T>, T>)b;
   }

   @Nullable
   @Override
   public T b(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2, int $$3, czw $$4) {
      return $$0.a(this.a);
   }

   @Override
   public hjq.a<hjh<T>, T> a() {
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
