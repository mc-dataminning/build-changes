import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public interface ka<T> {
   Codec<ka<?>> a = Codec.lazyInitialized(() -> le.as.q());
   yv<wi, ka<?>> b = yv.a($$0 -> yt.a(lf.av));
   Codec<ka<?>> c = a.validate($$0 -> $$0.d() ? DataResult.error(() -> "Encountered transient component " + le.as.b($$0)) : DataResult.success($$0));
   Codec<Map<ka<?>, Object>> d = Codec.dispatchedMap(c, ka::c);

   static <T> ka.a<T> a() {
      return new ka.a<>();
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

   yv<? super wi, T> e();

   public static class a<T> {
      @Nullable
      private Codec<T> a;
      @Nullable
      private yv<? super wi, T> b;

      public ka.a<T> a(Codec<T> $$0) {
         this.a = $$0;
         return this;
      }

      public ka.a<T> a(yv<? super wi, T> $$0) {
         this.b = $$0;
         return this;
      }

      public ka<T> a() {
         yv<? super wi, T> $$0 = Objects.requireNonNullElseGet(this.b, () -> yt.d(Objects.requireNonNull(this.a, "Missing Codec for component")));
         return new ka.a.a<>(this.a, $$0);
      }

      static class a<T> implements ka<T> {
         @Nullable
         private final Codec<T> e;
         private final yv<? super wi, T> f;

         a(@Nullable Codec<T> $$0, yv<? super wi, T> $$1) {
            this.e = $$0;
            this.f = $$1;
         }

         @Nullable
         @Override
         public Codec<T> b() {
            return this.e;
         }

         @Override
         public yv<? super wi, T> e() {
            return this.f;
         }

         @Override
         public String toString() {
            return ac.a((jk<ka.a.a<T>>)le.as, this);
         }
      }
   }
}
