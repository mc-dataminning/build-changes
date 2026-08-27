import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface jq<T> {
   Codec<jq<?>> a = awu.a((Supplier<Codec<jq<?>>>)(() -> kt.as.q()));
   yg<vt, jq<?>> b = yg.a($$0 -> ye.a(ku.av));

   static <T> jq.a<T> a() {
      return new jq.a<>();
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

   yg<? super vt, T> e();

   public static class a<T> {
      @Nullable
      private Codec<T> a;
      @Nullable
      private yg<? super vt, T> b;

      public jq.a<T> a(Codec<T> $$0) {
         this.a = $$0;
         return this;
      }

      public jq.a<T> a(yg<? super vt, T> $$0) {
         this.b = $$0;
         return this;
      }

      public jq<T> a() {
         yg<? super vt, T> $$0 = Objects.requireNonNullElseGet(this.b, () -> ye.d(Objects.requireNonNull(this.a, "Missing Codec for component")));
         return new jq.a.a<>(this.a, $$0);
      }

      static class a<T> implements jq<T> {
         @Nullable
         private final Codec<T> c;
         private final yg<? super vt, T> d;

         a(@Nullable Codec<T> $$0, yg<? super vt, T> $$1) {
            this.c = $$0;
            this.d = $$1;
         }

         @Nullable
         @Override
         public Codec<T> b() {
            return this.c;
         }

         @Override
         public yg<? super vt, T> e() {
            return this.d;
         }

         @Override
         public String toString() {
            return ac.a((ja<jq.a.a<T>>)kt.as, this);
         }
      }
   }
}
