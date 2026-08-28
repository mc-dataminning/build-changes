import com.mojang.serialization.Codec;

public class ke {
   public static <E> Codec<jt<E>> a(alg<? extends kc<E>> $$0, Codec<E> $$1) {
      return a($$0, $$1, false);
   }

   public static <E> Codec<jt<E>> a(alg<? extends kc<E>> $$0, Codec<E> $$1, boolean $$2) {
      return alb.a($$0, ald.a($$0, $$1), $$2);
   }

   public static <E> Codec<jt<E>> a(alg<? extends kc<E>> $$0) {
      return a($$0, false);
   }

   public static <E> Codec<jt<E>> a(alg<? extends kc<E>> $$0, boolean $$1) {
      return alb.a($$0, ale.a($$0), $$1);
   }
}
