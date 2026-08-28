import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public interface kk<T> {
   Codec<kk<?>> a = Codec.lazyInitialized(() -> mh.am.q());
   ze<wp, kk<?>> b = ze.a($$0 -> zc.a(mi.r));
   Codec<kk<?>> c = a.validate($$0 -> $$0.d() ? DataResult.error(() -> "Encountered transient component " + mh.am.b($$0)) : DataResult.success($$0));
   Codec<Map<kk<?>, Object>> d = Codec.dispatchedMap(c, kk::c);

   static <T> kk.a<T> a() {
      return new kk.a<>();
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

   ze<? super wp, T> e();

   public static class a<T> {
      @Nullable
      private Codec<T> a;
      @Nullable
      private ze<? super wp, T> b;
      private boolean c;

      public kk.a<T> a(Codec<T> $$0) {
         this.a = $$0;
         return this;
      }

      public kk.a<T> a(ze<? super wp, T> $$0) {
         this.b = $$0;
         return this;
      }

      public kk.a<T> a() {
         this.c = true;
         return this;
      }

      public kk<T> b() {
         ze<? super wp, T> $$0 = Objects.requireNonNullElseGet(this.b, () -> zc.d(Objects.requireNonNull(this.a, "Missing Codec for component")));
         Codec<T> $$1 = this.c && this.a != null ? kl.a.a(this.a) : this.a;
         return new kk.a.a<>($$1, $$0);
      }

      static class a<T> implements kk<T> {
         @Nullable
         private final Codec<T> e;
         private final ze<? super wp, T> f;

         a(@Nullable Codec<T> $$0, ze<? super wp, T> $$1) {
            this.e = $$0;
            this.f = $$1;
         }

         @Nullable
         @Override
         public Codec<T> b() {
            return this.e;
         }

         @Override
         public ze<? super wp, T> e() {
            return this.f;
         }

         @Override
         public String toString() {
            return ag.a((jt<kk.a.a<T>>)mh.am, this);
         }
      }
   }
}
