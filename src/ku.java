import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public interface ku<T> {
   Codec<ku<?>> a = Codec.lazyInitialized(() -> mb.ao.q());
   ym<vz, ku<?>> b = ym.a($$0 -> yk.a(mc.az));
   Codec<ku<?>> c = a.validate($$0 -> $$0.d() ? DataResult.error(() -> "Encountered transient component " + mb.ao.b($$0)) : DataResult.success($$0));
   Codec<Map<ku<?>, Object>> d = Codec.dispatchedMap(c, ku::c);

   static <T> ku.a<T> a() {
      return new ku.a<>();
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

   ym<? super vz, T> e();

   public static class a<T> {
      @Nullable
      private Codec<T> a;
      @Nullable
      private ym<? super vz, T> b;
      private boolean c;

      public ku.a<T> a(Codec<T> $$0) {
         this.a = $$0;
         return this;
      }

      public ku.a<T> a(ym<? super vz, T> $$0) {
         this.b = $$0;
         return this;
      }

      public ku.a<T> a() {
         this.c = true;
         return this;
      }

      public ku<T> b() {
         ym<? super vz, T> $$0 = Objects.requireNonNullElseGet(this.b, () -> yk.d(Objects.requireNonNull(this.a, "Missing Codec for component")));
         Codec<T> $$1 = this.c && this.a != null ? kv.a.a(this.a) : this.a;
         return new ku.a.a<>($$1, $$0);
      }

      static class a<T> implements ku<T> {
         @Nullable
         private final Codec<T> e;
         private final ym<? super vz, T> f;

         a(@Nullable Codec<T> $$0, ym<? super vz, T> $$1) {
            this.e = $$0;
            this.f = $$1;
         }

         @Nullable
         @Override
         public Codec<T> b() {
            return this.e;
         }

         @Override
         public ym<? super vz, T> e() {
            return this.f;
         }

         @Override
         public String toString() {
            return af.a((ke<ku.a.a<T>>)mb.ao, this);
         }
      }
   }
}
