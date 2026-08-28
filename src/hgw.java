import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgw<T>(ki<T> a) implements hhf<T> {
   private static final hhf.a<? extends hgw<?>, ?> b = e();

   private static <T> hhf.a<hgw<T>, T> e() {
      Codec<? extends ki<?>> $$0 = mf.am.q().validate($$0x -> $$0x.d() ? DataResult.error(() -> "Component can't be serialized") : DataResult.success($$0x));
      MapCodec<hfl.d<hgw<T>, T>> $$2 = $$0.dispatchMap(
         "component", $$0x -> ((hgw)$$0x.a()).a, $$0x -> hhf.a.a($$0x.c()).xmap($$1 -> new hfl.d<>(new hgw($$0x), $$1), hfl.d::b)
      );
      return new hhf.a<>($$2);
   }

   public static <T> hhf.a<hgw<T>, T> c() {
      return (hhf.a<hgw<T>, T>)b;
   }

   @Nullable
   @Override
   public T b(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2, int $$3, cyw $$4) {
      return $$0.a(this.a);
   }

   @Override
   public hhf.a<hgw<T>, T> a() {
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
