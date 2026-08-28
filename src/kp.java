import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public interface kp<T> {
   Codec<kp<?>> a = Codec.lazyInitialized(() -> lt.aq.r());
   yw<wj, kp<?>> b = yw.a($$0 -> yu.a(lu.aA));
   Codec<kp<?>> c = a.validate($$0 -> $$0.d() ? DataResult.error(() -> "Encountered transient component " + lt.aq.b($$0)) : DataResult.success($$0));
   Codec<Map<kp<?>, Object>> d = Codec.dispatchedMap(c, kp::c);

   static <T> kp.a<T> a() {
      return new kp.a<>();
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

   yw<? super wj, T> e();

   public static class a<T> {
      @Nullable
      private Codec<T> a;
      @Nullable
      private yw<? super wj, T> b;
      private boolean c;

      public kp.a<T> a(Codec<T> $$0) {
         this.a = $$0;
         return this;
      }

      public kp.a<T> a(yw<? super wj, T> $$0) {
         this.b = $$0;
         return this;
      }

      public kp.a<T> a() {
         this.c = true;
         return this;
      }

      public kp<T> b() {
         yw<? super wj, T> $$0 = Objects.requireNonNullElseGet(this.b, () -> yu.d(Objects.requireNonNull(this.a, "Missing Codec for component")));
         Codec<T> $$1 = this.c && this.a != null ? kq.a.a(this.a) : this.a;
         return new kp.a.a<>($$1, $$0);
      }

      static class a<T> implements kp<T> {
         @Nullable
         private final Codec<T> e;
         private final yw<? super wj, T> f;

         a(@Nullable Codec<T> $$0, yw<? super wj, T> $$1) {
            this.e = $$0;
            this.f = $$1;
         }

         @Nullable
         @Override
         public Codec<T> b() {
            return this.e;
         }

         @Override
         public yw<? super wj, T> e() {
            return this.f;
         }

         @Override
         public String toString() {
            return ad.a((jz<kp.a.a<T>>)lt.aq, this);
         }
      }
   }
}
