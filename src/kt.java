import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public interface kt<T> {
   Codec<kt<?>> a = Codec.lazyInitialized(() -> lz.ao.q());
   zj<ww, kt<?>> b = zj.a($$0 -> zh.a(ma.az));
   Codec<kt<?>> c = a.validate($$0 -> $$0.d() ? DataResult.error(() -> "Encountered transient component " + lz.ao.b($$0)) : DataResult.success($$0));
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

   zj<? super ww, T> e();

   public static class a<T> {
      @Nullable
      private Codec<T> a;
      @Nullable
      private zj<? super ww, T> b;
      private boolean c;

      public kt.a<T> a(Codec<T> $$0) {
         this.a = $$0;
         return this;
      }

      public kt.a<T> a(zj<? super ww, T> $$0) {
         this.b = $$0;
         return this;
      }

      public kt.a<T> a() {
         this.c = true;
         return this;
      }

      public kt<T> b() {
         zj<? super ww, T> $$0 = Objects.requireNonNullElseGet(this.b, () -> zh.d(Objects.requireNonNull(this.a, "Missing Codec for component")));
         Codec<T> $$1 = this.c && this.a != null ? ku.a.a(this.a) : this.a;
         return new kt.a.a<>($$1, $$0);
      }

      static class a<T> implements kt<T> {
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
            return ae.a((kd<kt.a.a<T>>)lz.ao, this);
         }
      }
   }
}
