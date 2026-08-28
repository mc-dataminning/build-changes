import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public interface kr<T> {
   Codec<kr<?>> a = Codec.lazyInitialized(() -> lv.ap.q());
   zc<wp, kr<?>> b = zc.a($$0 -> za.a(lw.aA));
   Codec<kr<?>> c = a.validate($$0 -> $$0.d() ? DataResult.error(() -> "Encountered transient component " + lv.ap.b($$0)) : DataResult.success($$0));
   Codec<Map<kr<?>, Object>> d = Codec.dispatchedMap(c, kr::c);

   static <T> kr.a<T> a() {
      return new kr.a<>();
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

   zc<? super wp, T> e();

   public static class a<T> {
      @Nullable
      private Codec<T> a;
      @Nullable
      private zc<? super wp, T> b;
      private boolean c;

      public kr.a<T> a(Codec<T> $$0) {
         this.a = $$0;
         return this;
      }

      public kr.a<T> a(zc<? super wp, T> $$0) {
         this.b = $$0;
         return this;
      }

      public kr.a<T> a() {
         this.c = true;
         return this;
      }

      public kr<T> b() {
         zc<? super wp, T> $$0 = Objects.requireNonNullElseGet(this.b, () -> za.d(Objects.requireNonNull(this.a, "Missing Codec for component")));
         Codec<T> $$1 = this.c && this.a != null ? ks.a.a(this.a) : this.a;
         return new kr.a.a<>($$1, $$0);
      }

      static class a<T> implements kr<T> {
         @Nullable
         private final Codec<T> e;
         private final zc<? super wp, T> f;

         a(@Nullable Codec<T> $$0, zc<? super wp, T> $$1) {
            this.e = $$0;
            this.f = $$1;
         }

         @Nullable
         @Override
         public Codec<T> b() {
            return this.e;
         }

         @Override
         public zc<? super wp, T> e() {
            return this.f;
         }

         @Override
         public String toString() {
            return ad.a((kb<kr.a.a<T>>)lv.ap, this);
         }
      }
   }
}
