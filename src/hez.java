import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hez<T>(kw<T> a) implements hfi<T> {
   private static final hfi.a<? extends hez<?>, ?> b = d();

   private static <T> hfi.a<hez<T>, T> d() {
      Codec<? extends kw<?>> $$0 = md.ao.q().validate($$0x -> $$0x.d() ? DataResult.error(() -> "Component can't be serialized") : DataResult.success($$0x));
      MapCodec<hdq.c<hez<T>, T>> $$2 = $$0.dispatchMap(
         "component", $$0x -> ((hez)$$0x.a()).a, $$0x -> hfi.a.a($$0x.c()).xmap($$1 -> new hdq.c<>(new hez($$0x), $$1), hdq.c::b)
      );
      return new hfi.a<>($$2);
   }

   public static <T> hfi.a<hez<T>, T> b() {
      return (hfi.a<hez<T>, T>)b;
   }

   @Nullable
   @Override
   public T b(cxy $$0, @Nullable ghz $$1, @Nullable bwr $$2, int $$3, cxw $$4) {
      return $$0.a(this.a);
   }

   @Override
   public hfi.a<hez<T>, T> a() {
      return b();
   }

   public kw<T> c() {
      return this.a;
   }
}
