import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public interface km<T> {
   Codec<km<?>> a = Codec.lazyInitialized(() -> lq.aq.r());
   ys<wf, km<?>> b = ys.a($$0 -> yq.a(lr.az));
   Codec<km<?>> c = a.validate($$0 -> $$0.d() ? DataResult.error(() -> "Encountered transient component " + lq.aq.b($$0)) : DataResult.success($$0));
   Codec<Map<km<?>, Object>> d = Codec.dispatchedMap(c, km::c);

   static <T> km.a<T> a() {
      return new km.a<>();
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
      private boolean c;

      public km.a<T> a(Codec<T> $$0) {
         this.a = $$0;
         return this;
      }

      public km.a<T> a(ys<? super wf, T> $$0) {
         this.b = $$0;
         return this;
      }

      public km.a<T> a() {
         this.c = true;
         return this;
      }

      public km<T> b() {
         ys<? super wf, T> $$0 = Objects.requireNonNullElseGet(this.b, () -> yq.d(Objects.requireNonNull(this.a, "Missing Codec for component")));
         Codec<T> $$1 = this.c && this.a != null ? kn.a.a(this.a) : this.a;
         return new km.a.a<>($$1, $$0);
      }

      static class a<T> implements km<T> {
         @Nullable
         private final Codec<T> e;
         private final ys<? super wf, T> f;

         a(@Nullable Codec<T> $$0, ys<? super wf, T> $$1) {
            this.e = $$0;
            this.f = $$1;
         }

         @Nullable
         @Override
         public Codec<T> b() {
            return this.e;
         }

         @Override
         public ys<? super wf, T> e() {
            return this.f;
         }

         @Override
         public String toString() {
            return ac.a((jw<km.a.a<T>>)lq.aq, this);
         }
      }
   }
}
