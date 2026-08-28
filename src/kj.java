import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public interface kj<T> {
   Codec<kj<?>> a = Codec.lazyInitialized(() -> mg.am.q());
   yy<wl, kj<?>> b = yy.a($$0 -> yw.a(mh.r));
   Codec<kj<?>> c = a.validate($$0 -> $$0.d() ? DataResult.error(() -> "Encountered transient component " + mg.am.b($$0)) : DataResult.success($$0));
   Codec<Map<kj<?>, Object>> d = Codec.dispatchedMap(c, kj::c);

   static <T> kj.a<T> a() {
      return new kj.a<>();
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

   yy<? super wl, T> e();

   public static class a<T> {
      @Nullable
      private Codec<T> a;
      @Nullable
      private yy<? super wl, T> b;
      private boolean c;

      public kj.a<T> a(Codec<T> $$0) {
         this.a = $$0;
         return this;
      }

      public kj.a<T> a(yy<? super wl, T> $$0) {
         this.b = $$0;
         return this;
      }

      public kj.a<T> a() {
         this.c = true;
         return this;
      }

      public kj<T> b() {
         yy<? super wl, T> $$0 = Objects.requireNonNullElseGet(this.b, () -> yw.d(Objects.requireNonNull(this.a, "Missing Codec for component")));
         Codec<T> $$1 = this.c && this.a != null ? kk.a.a(this.a) : this.a;
         return new kj.a.a<>($$1, $$0);
      }

      static class a<T> implements kj<T> {
         @Nullable
         private final Codec<T> e;
         private final yy<? super wl, T> f;

         a(@Nullable Codec<T> $$0, yy<? super wl, T> $$1) {
            this.e = $$0;
            this.f = $$1;
         }

         @Nullable
         @Override
         public Codec<T> b() {
            return this.e;
         }

         @Override
         public yy<? super wl, T> e() {
            return this.f;
         }

         @Override
         public String toString() {
            return ag.a((js<kj.a.a<T>>)mg.am, this);
         }
      }
   }
}
