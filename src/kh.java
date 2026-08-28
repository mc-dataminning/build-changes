import com.mojang.serialization.Codec;

public class kh {
   public static <E> Codec<jw<E>> a(alc<? extends kf<E>> $$0, Codec<E> $$1) {
      return a($$0, $$1, false);
   }

   public static <E> Codec<jw<E>> a(alc<? extends kf<E>> $$0, Codec<E> $$1, boolean $$2) {
      return akx.a($$0, akz.a($$0, $$1), $$2);
   }

   public static <E> Codec<jw<E>> a(alc<? extends kf<E>> $$0) {
      return a($$0, false);
   }

   public static <E> Codec<jw<E>> a(alc<? extends kf<E>> $$0, boolean $$1) {
      return akx.a($$0, ala.a($$0), $$1);
   }
}
