import com.mojang.serialization.Codec;

public class jy {
   public static <E> Codec<jn<E>> a(akj<? extends jw<E>> $$0, Codec<E> $$1) {
      return a($$0, $$1, false);
   }

   public static <E> Codec<jn<E>> a(akj<? extends jw<E>> $$0, Codec<E> $$1, boolean $$2) {
      return ake.a($$0, akg.a($$0, $$1), $$2);
   }

   public static <E> Codec<jn<E>> a(akj<? extends jw<E>> $$0) {
      return a($$0, false);
   }

   public static <E> Codec<jn<E>> a(akj<? extends jw<E>> $$0, boolean $$1) {
      return ake.a($$0, akh.a($$0), $$1);
   }
}
