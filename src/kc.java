import com.mojang.serialization.Codec;

public class kc {
   public static <E> Codec<jr<E>> a(ala<? extends ka<E>> $$0, Codec<E> $$1) {
      return a($$0, $$1, false);
   }

   public static <E> Codec<jr<E>> a(ala<? extends ka<E>> $$0, Codec<E> $$1, boolean $$2) {
      return akv.a($$0, akx.a($$0, $$1), $$2);
   }

   public static <E> Codec<jr<E>> a(ala<? extends ka<E>> $$0) {
      return a($$0, false);
   }

   public static <E> Codec<jr<E>> a(ala<? extends ka<E>> $$0, boolean $$1) {
      return akv.a($$0, aky.a($$0), $$1);
   }
}
