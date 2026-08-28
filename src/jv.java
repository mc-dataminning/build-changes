import com.mojang.serialization.Codec;

public class jv {
   public static <E> Codec<jk<E>> a(alj<? extends jt<E>> $$0, Codec<E> $$1) {
      return a($$0, $$1, false);
   }

   public static <E> Codec<jk<E>> a(alj<? extends jt<E>> $$0, Codec<E> $$1, boolean $$2) {
      return ale.a($$0, alg.a($$0, $$1), $$2);
   }

   public static <E> Codec<jk<E>> a(alj<? extends jt<E>> $$0) {
      return a($$0, false);
   }

   public static <E> Codec<jk<E>> a(alj<? extends jt<E>> $$0, boolean $$1) {
      return ale.a($$0, alh.a($$0), $$1);
   }
}
