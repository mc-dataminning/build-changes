import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface kd<T> {
   Codec<kd<?>> a = axu.a((Supplier<Codec<kd<?>>>)(() -> lh.as.q()));
   zc<wp, kd<?>> b = zc.a($$0 -> za.a(li.av));

   static <T> kd.a<T> a() {
      return new kd.a<>();
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

      public kd.a<T> a(Codec<T> $$0) {
         this.a = $$0;
         return this;
      }

      public kd.a<T> a(zc<? super wp, T> $$0) {
         this.b = $$0;
         return this;
      }

      public kd<T> a() {
         zc<? super wp, T> $$0 = Objects.requireNonNullElseGet(this.b, () -> za.d(Objects.requireNonNull(this.a, "Missing Codec for component")));
         return new kd.a.a<>(this.a, $$0);
      }

      static class a<T> implements kd<T> {
         @Nullable
         private final Codec<T> c;
         private final zc<? super wp, T> d;

         a(@Nullable Codec<T> $$0, zc<? super wp, T> $$1) {
            this.c = $$0;
            this.d = $$1;
         }

         @Nullable
         @Override
         public Codec<T> b() {
            return this.c;
         }

         @Override
         public zc<? super wp, T> e() {
            return this.d;
         }

         @Override
         public String toString() {
            return ad.a((jn<kd.a.a<T>>)lh.as, this);
         }
      }
   }
}
