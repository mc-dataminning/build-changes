import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public interface kw<T> {
   Codec<kw<?>> a = Codec.lazyInitialized(() -> md.ao.q());
   yt<wg, kw<?>> b = yt.a($$0 -> yr.a(me.az));
   Codec<kw<?>> c = a.validate($$0 -> $$0.d() ? DataResult.error(() -> "Encountered transient component " + md.ao.b($$0)) : DataResult.success($$0));
   Codec<Map<kw<?>, Object>> d = Codec.dispatchedMap(c, kw::c);

   static <T> kw.a<T> a() {
      return new kw.a<>();
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

   yt<? super wg, T> e();

   public static class a<T> {
      @Nullable
      private Codec<T> a;
      @Nullable
      private yt<? super wg, T> b;
      private boolean c;

      public kw.a<T> a(Codec<T> $$0) {
         this.a = $$0;
         return this;
      }

      public kw.a<T> a(yt<? super wg, T> $$0) {
         this.b = $$0;
         return this;
      }

      public kw.a<T> a() {
         this.c = true;
         return this;
      }

      public kw<T> b() {
         yt<? super wg, T> $$0 = Objects.requireNonNullElseGet(this.b, () -> yr.d(Objects.requireNonNull(this.a, "Missing Codec for component")));
         Codec<T> $$1 = this.c && this.a != null ? kx.a.a(this.a) : this.a;
         return new kw.a.a<>($$1, $$0);
      }

      static class a<T> implements kw<T> {
         @Nullable
         private final Codec<T> e;
         private final yt<? super wg, T> f;

         a(@Nullable Codec<T> $$0, yt<? super wg, T> $$1) {
            this.e = $$0;
            this.f = $$1;
         }

         @Nullable
         @Override
         public Codec<T> b() {
            return this.e;
         }

         @Override
         public yt<? super wg, T> e() {
            return this.f;
         }

         @Override
         public String toString() {
            return af.a((kf<kw.a.a<T>>)md.ao, this);
         }
      }
   }
}
