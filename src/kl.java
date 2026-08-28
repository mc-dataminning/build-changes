import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public interface kl<T> {
   Codec<kl<?>> a = Codec.lazyInitialized(() -> lp.as.q());
   zj<ww, kl<?>> b = zj.a($$0 -> zh.a(lq.av));
   Codec<kl<?>> c = a.validate($$0 -> $$0.d() ? DataResult.error(() -> "Encountered transient component " + lp.as.b($$0)) : DataResult.success($$0));
   Codec<Map<kl<?>, Object>> d = Codec.dispatchedMap(c, kl::c);

   static <T> kl.a<T> a() {
      return new kl.a<>();
   }

   @Nullable
   Codec<T> b();

   default Codec<T> c() {
      Codec<T> $$0 = this.b();
      if ($$0 == null) {
         throw new IllegalStateException(this + " is not a persistent component");
      } else {
         return $$0;
      }
   }

   default boolean d() {
      return this.b() == null;
   }

   zj<? super ww, T> e();

   public static class a<T> {
      @Nullable
      private Codec<T> a;
      @Nullable
      private zj<? super ww, T> b;

      public kl.a<T> a(Codec<T> $$0) {
         this.a = $$0;
         return this;
      }

      public kl.a<T> a(zj<? super ww, T> $$0) {
         this.b = $$0;
         return this;
      }

      public kl<T> a() {
         zj<? super ww, T> $$0 = Objects.requireNonNullElseGet(this.b, () -> zh.d(Objects.requireNonNull(this.a, "Missing Codec for component")));
         return new kl.a.a<>(this.a, $$0);
      }

      static class a<T> implements kl<T> {
         @Nullable
         private final Codec<T> e;
         private final zj<? super ww, T> f;

         a(@Nullable Codec<T> $$0, zj<? super ww, T> $$1) {
            this.e = $$0;
            this.f = $$1;
         }

         @Nullable
         @Override
         public Codec<T> b() {
            return this.e;
         }

         @Override
         public zj<? super ww, T> e() {
            return this.f;
         }

         @Override
         public String toString() {
            return ac.a((jv<kl.a.a<T>>)lp.as, this);
         }
      }
   }
}
