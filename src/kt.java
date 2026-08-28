import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public interface kt<T> {
   Codec<kt<?>> a = Codec.lazyInitialized(() -> ma.ao.q());
   zt<xg, kt<?>> b = zt.a($$0 -> zr.a(mb.az));
   Codec<kt<?>> c = a.validate($$0 -> $$0.d() ? DataResult.error(() -> "Encountered transient component " + ma.ao.b($$0)) : DataResult.success($$0));
   Codec<Map<kt<?>, Object>> d = Codec.dispatchedMap(c, kt::c);

   static <T> kt.a<T> a() {
      return new kt.a<>();
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

   zt<? super xg, T> e();

   public static class a<T> {
      @Nullable
      private Codec<T> a;
      @Nullable
      private zt<? super xg, T> b;
      private boolean c;

      public kt.a<T> a(Codec<T> $$0) {
         this.a = $$0;
         return this;
      }

      public kt.a<T> a(zt<? super xg, T> $$0) {
         this.b = $$0;
         return this;
      }

      public kt.a<T> a() {
         this.c = true;
         return this;
      }

      public kt<T> b() {
         zt<? super xg, T> $$0 = Objects.requireNonNullElseGet(this.b, () -> zr.d(Objects.requireNonNull(this.a, "Missing Codec for component")));
         Codec<T> $$1 = this.c && this.a != null ? ku.a.a(this.a) : this.a;
         return new kt.a.a<>($$1, $$0);
      }

      static class a<T> implements kt<T> {
         @Nullable
         private final Codec<T> e;
         private final zt<? super xg, T> f;

         a(@Nullable Codec<T> $$0, zt<? super xg, T> $$1) {
            this.e = $$0;
            this.f = $$1;
         }

         @Nullable
         @Override
         public Codec<T> b() {
            return this.e;
         }

         @Override
         public zt<? super xg, T> e() {
            return this.f;
         }

         @Override
         public String toString() {
            return ae.a((kd<kt.a.a<T>>)ma.ao, this);
         }
      }
   }
}
