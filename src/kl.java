import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public interface kl<T> {
   Codec<kl<?>> a = Codec.lazyInitialized(() -> lp.as.q());
   zn<xa, kl<?>> b = zn.a($$0 -> zl.a(lq.av));
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

   zn<? super xa, T> e();

   public static class a<T> {
      @Nullable
      private Codec<T> a;
      @Nullable
      private zn<? super xa, T> b;
      private boolean c;

      public kl.a<T> a(Codec<T> $$0) {
         this.a = $$0;
         return this;
      }

      public kl.a<T> a(zn<? super xa, T> $$0) {
         this.b = $$0;
         return this;
      }

      public kl.a<T> a() {
         this.c = true;
         return this;
      }

      public kl<T> b() {
         zn<? super xa, T> $$0 = Objects.requireNonNullElseGet(this.b, () -> zl.d(Objects.requireNonNull(this.a, "Missing Codec for component")));
         Codec<T> $$1 = this.c && this.a != null ? km.a.a(this.a) : this.a;
         return new kl.a.a<>($$1, $$0);
      }

      static class a<T> implements kl<T> {
         @Nullable
         private final Codec<T> e;
         private final zn<? super xa, T> f;

         a(@Nullable Codec<T> $$0, zn<? super xa, T> $$1) {
            this.e = $$0;
            this.f = $$1;
         }

         @Nullable
         @Override
         public Codec<T> b() {
            return this.e;
         }

         @Override
         public zn<? super xa, T> e() {
            return this.f;
         }

         @Override
         public String toString() {
            return ac.a((jv<kl.a.a<T>>)lp.as, this);
         }
      }
   }
}
