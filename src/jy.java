import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface jy<T> {
   Codec<jy<?>> a = axe.a((Supplier<Codec<jy<?>>>)(() -> lc.as.q()));
   yq<wd, jy<?>> b = yq.a($$0 -> yo.a(ld.av));

   static <T> jy.a<T> a() {
      return new jy.a<>();
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

   yq<? super wd, T> e();

   public static class a<T> {
      @Nullable
      private Codec<T> a;
      @Nullable
      private yq<? super wd, T> b;

      public jy.a<T> a(Codec<T> $$0) {
         this.a = $$0;
         return this;
      }

      public jy.a<T> a(yq<? super wd, T> $$0) {
         this.b = $$0;
         return this;
      }

      public jy<T> a() {
         yq<? super wd, T> $$0 = Objects.requireNonNullElseGet(this.b, () -> yo.d(Objects.requireNonNull(this.a, "Missing Codec for component")));
         return new jy.a.a<>(this.a, $$0);
      }

      static class a<T> implements jy<T> {
         @Nullable
         private final Codec<T> c;
         private final yq<? super wd, T> d;

         a(@Nullable Codec<T> $$0, yq<? super wd, T> $$1) {
            this.c = $$0;
            this.d = $$1;
         }

         @Nullable
         @Override
         public Codec<T> b() {
            return this.c;
         }

         @Override
         public yq<? super wd, T> e() {
            return this.d;
         }

         @Override
         public String toString() {
            return ac.a((ji<jy.a.a<T>>)lc.as, this);
         }
      }
   }
}
