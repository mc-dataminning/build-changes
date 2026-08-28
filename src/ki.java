import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public interface ki<T> {
   Codec<ki<?>> a = Codec.lazyInitialized(() -> mf.am.q());
   yw<wj, ki<?>> b = yw.a($$0 -> yu.a(mg.r));
   Codec<ki<?>> c = a.validate($$0 -> $$0.d() ? DataResult.error(() -> "Encountered transient component " + mf.am.b($$0)) : DataResult.success($$0));
   Codec<Map<ki<?>, Object>> d = Codec.dispatchedMap(c, ki::c);

   static <T> ki.a<T> a() {
      return new ki.a<>();
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

      public ki.a<T> a(Codec<T> $$0) {
         this.a = $$0;
         return this;
      }

      public ki.a<T> a(yw<? super wj, T> $$0) {
         this.b = $$0;
         return this;
      }

      public ki.a<T> a() {
         this.c = true;
         return this;
      }

      public ki<T> b() {
         yw<? super wj, T> $$0 = Objects.requireNonNullElseGet(this.b, () -> yu.d(Objects.requireNonNull(this.a, "Missing Codec for component")));
         Codec<T> $$1 = this.c && this.a != null ? kj.a.a(this.a) : this.a;
         return new ki.a.a<>($$1, $$0);
      }

      static class a<T> implements ki<T> {
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
            return af.a((jr<ki.a.a<T>>)mf.am, this);
         }
      }
   }
}
