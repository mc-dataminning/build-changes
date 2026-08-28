import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

public interface kq<T> {
   Codec<kq<?>> a = Codec.lazyInitialized(() -> lu.ap.q());
   zb<wo, kq<?>> b = zb.a($$0 -> yz.a(lv.aA));
   Codec<kq<?>> c = a.validate($$0 -> $$0.d() ? DataResult.error(() -> "Encountered transient component " + lu.ap.b($$0)) : DataResult.success($$0));
   Codec<Map<kq<?>, Object>> d = Codec.dispatchedMap(c, kq::c);

   static <T> kq.a<T> a() {
      return new kq.a<>();
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

   zb<? super wo, T> e();

   public static class a<T> {
      @Nullable
      private Codec<T> a;
      @Nullable
      private zb<? super wo, T> b;
      private boolean c;

      public kq.a<T> a(Codec<T> $$0) {
         this.a = $$0;
         return this;
      }

      public kq.a<T> a(zb<? super wo, T> $$0) {
         this.b = $$0;
         return this;
      }

      public kq.a<T> a() {
         this.c = true;
         return this;
      }

      public kq<T> b() {
         zb<? super wo, T> $$0 = Objects.requireNonNullElseGet(this.b, () -> yz.d(Objects.requireNonNull(this.a, "Missing Codec for component")));
         Codec<T> $$1 = this.c && this.a != null ? kr.a.a(this.a) : this.a;
         return new kq.a.a<>($$1, $$0);
      }

      static class a<T> implements kq<T> {
         @Nullable
         private final Codec<T> e;
         private final zb<? super wo, T> f;

         a(@Nullable Codec<T> $$0, zb<? super wo, T> $$1) {
            this.e = $$0;
            this.f = $$1;
         }

         @Nullable
         @Override
         public Codec<T> b() {
            return this.e;
         }

         @Override
         public zb<? super wo, T> e() {
            return this.f;
         }

         @Override
         public String toString() {
            return ad.a((ka<kq.a.a<T>>)lu.ap, this);
         }
      }
   }
}
