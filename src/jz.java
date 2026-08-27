import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface jz<T> {
   Codec<jz<?>> a = axh.a((Supplier<Codec<jz<?>>>)(() -> ld.as.q()));
   ys<wf, jz<?>> b = ys.a($$0 -> yq.a(le.av));

   static <T> jz.a<T> a() {
      return new jz.a<>();
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

   ys<? super wf, T> e();

   public static class a<T> {
      @Nullable
      private Codec<T> a;
      @Nullable
      private ys<? super wf, T> b;

      public jz.a<T> a(Codec<T> $$0) {
         this.a = $$0;
         return this;
      }

      public jz.a<T> a(ys<? super wf, T> $$0) {
         this.b = $$0;
         return this;
      }

      public jz<T> a() {
         ys<? super wf, T> $$0 = Objects.requireNonNullElseGet(this.b, () -> yq.d(Objects.requireNonNull(this.a, "Missing Codec for component")));
         return new jz.a.a<>(this.a, $$0);
      }

      static class a<T> implements jz<T> {
         @Nullable
         private final Codec<T> c;
         private final ys<? super wf, T> d;

         a(@Nullable Codec<T> $$0, ys<? super wf, T> $$1) {
            this.c = $$0;
            this.d = $$1;
         }

         @Nullable
         @Override
         public Codec<T> b() {
            return this.c;
         }

         @Override
         public ys<? super wf, T> e() {
            return this.d;
         }

         @Override
         public String toString() {
            return ac.a((jj<jz.a.a<T>>)ld.as, this);
         }
      }
   }
}
