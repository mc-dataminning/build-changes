import com.mojang.serialization.Codec;

public class jm {
   public static <E> Codec<jb<E>> a(akm<? extends jk<E>> $$0, Codec<E> $$1) {
      return a($$0, $$1, false);
   }

   public static <E> Codec<jb<E>> a(akm<? extends jk<E>> $$0, Codec<E> $$1, boolean $$2) {
      return akh.a($$0, akj.a($$0, $$1), $$2);
   }

   public static <E> Codec<jb<E>> a(akm<? extends jk<E>> $$0) {
      return a($$0, false);
   }

   public static <E> Codec<jb<E>> a(akm<? extends jk<E>> $$0, boolean $$1) {
      return akh.a($$0, akk.a($$0), $$1);
   }
}
