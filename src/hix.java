import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hix<T>(kk<T> a) implements hjg<T> {
   private static final hjg.a<? extends hix<?>, ?> b = e();

   private static <T> hjg.a<hix<T>, T> e() {
      Codec<? extends kk<?>> $$0 = mh.am.q().validate($$0x -> $$0x.d() ? DataResult.error(() -> "Component can't be serialized") : DataResult.success($$0x));
      MapCodec<hhm.d<hix<T>, T>> $$2 = $$0.dispatchMap(
         "component", $$0x -> ((hix)$$0x.a()).a, $$0x -> hjg.a.a($$0x.c()).xmap($$1 -> new hhm.d<>(new hix($$0x), $$1), hhm.d::b)
      );
      return new hjg.a<>($$2);
   }

   public static <T> hjg.a<hix<T>, T> c() {
      return (hjg.a<hix<T>, T>)b;
   }

   @Nullable
   @Override
   public T b(dak $$0, @Nullable glo $$1, @Nullable byf $$2, int $$3, dai $$4) {
      return $$0.a(this.a);
   }

   @Override
   public hjg.a<hix<T>, T> a() {
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
