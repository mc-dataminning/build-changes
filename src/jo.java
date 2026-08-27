import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface jo<T> {
   Codec<jo<?>> a = aws.a((Supplier<Codec<jo<?>>>)(() -> kr.at.q()));
   ye<vr, jo<?>> b = ye.a($$0 -> yc.a(ks.au));

   static <T> jo.a<T> a() {
      return new jo.a<>();
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

   ye<? super vr, T> e();

   public static class a<T> {
      @Nullable
      private Codec<T> a;
      @Nullable
      private ye<? super vr, T> b;

      public jo.a<T> a(Codec<T> $$0) {
         this.a = $$0;
         return this;
      }

      public jo.a<T> a(ye<? super vr, T> $$0) {
         this.b = $$0;
         return this;
      }

      public jo<T> a() {
         ye<? super vr, T> $$0 = Objects.requireNonNullElseGet(this.b, () -> yc.d(Objects.requireNonNull(this.a, "Missing Codec for component")));
         return new jo.a.a<>(this.a, $$0);
      }

      static class a<T> implements jo<T> {
         @Nullable
         private final Codec<T> c;
         private final ye<? super vr, T> d;

         a(@Nullable Codec<T> $$0, ye<? super vr, T> $$1) {
            this.c = $$0;
            this.d = $$1;
         }

         @Nullable
         @Override
         public Codec<T> b() {
            return this.c;
         }

         @Override
         public ye<? super vr, T> e() {
            return this.d;
         }

         @Override
         public String toString() {
            return ac.a((iy<jo.a.a<T>>)kr.at, this);
         }
      }
   }
}
