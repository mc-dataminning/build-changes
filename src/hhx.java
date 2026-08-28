import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hhx<T>(kj<T> a) implements hig<T> {
   private static final hig.a<? extends hhx<?>, ?> b = e();

   private static <T> hig.a<hhx<T>, T> e() {
      Codec<? extends kj<?>> $$0 = mg.am.q().validate($$0x -> $$0x.d() ? DataResult.error(() -> "Component can't be serialized") : DataResult.success($$0x));
      MapCodec<hgm.d<hhx<T>, T>> $$2 = $$0.dispatchMap(
         "component", $$0x -> ((hhx)$$0x.a()).a, $$0x -> hig.a.a($$0x.c()).xmap($$1 -> new hgm.d<>(new hhx($$0x), $$1), hgm.d::b)
      );
      return new hig.a<>($$2);
   }

   public static <T> hig.a<hhx<T>, T> c() {
      return (hig.a<hhx<T>, T>)b;
   }

   @Nullable
   @Override
   public T b(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2, int $$3, czl $$4) {
      return $$0.a(this.a);
   }

   @Override
   public hig.a<hhx<T>, T> a() {
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
