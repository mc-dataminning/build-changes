import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public interface ks<T> {
   Codec<ks<?>> a = Codec.lazyInitialized(() -> lx.ao.q());
   zf<ws, ks<?>> b = zf.a($$0 -> zd.a(ly.az));
   Codec<ks<?>> c = a.validate($$0 -> $$0.d() ? DataResult.error(() -> "Encountered transient component " + lx.ao.b($$0)) : DataResult.success($$0));
   Codec<Map<ks<?>, Object>> d = Codec.dispatchedMap(c, ks::c);

   static <T> ks.a<T> a() {
      return new ks.a<>();
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

   zf<? super ws, T> e();

   public static class a<T> {
      @Nullable
      private Codec<T> a;
      @Nullable
      private zf<? super ws, T> b;
      private boolean c;

      public ks.a<T> a(Codec<T> $$0) {
         this.a = $$0;
         return this;
      }

      public ks.a<T> a(zf<? super ws, T> $$0) {
         this.b = $$0;
         return this;
      }

      public ks.a<T> a() {
         this.c = true;
         return this;
      }

      public ks<T> b() {
         zf<? super ws, T> $$0 = Objects.requireNonNullElseGet(this.b, () -> zd.d(Objects.requireNonNull(this.a, "Missing Codec for component")));
         Codec<T> $$1 = this.c && this.a != null ? kt.a.a(this.a) : this.a;
         return new ks.a.a<>($$1, $$0);
      }

      static class a<T> implements ks<T> {
         @Nullable
         private final Codec<T> e;
         private final zf<? super ws, T> f;

         a(@Nullable Codec<T> $$0, zf<? super ws, T> $$1) {
            this.e = $$0;
            this.f = $$1;
         }

         @Nullable
         @Override
         public Codec<T> b() {
            return this.e;
         }

         @Override
         public zf<? super ws, T> e() {
            return this.f;
         }

         @Override
         public String toString() {
            return ad.a((kc<ks.a.a<T>>)lx.ao, this);
         }
      }
   }
}
