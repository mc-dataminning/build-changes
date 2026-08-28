import com.mojang.serialization.Codec;

public class jx {
   public static <E> Codec<jm<E>> a(ale<? extends jv<E>> $$0, Codec<E> $$1) {
      return a($$0, $$1, false);
   }

   public static <E> Codec<jm<E>> a(ale<? extends jv<E>> $$0, Codec<E> $$1, boolean $$2) {
      return akz.a($$0, alb.a($$0, $$1), $$2);
   }

   public static <E> Codec<jm<E>> a(ale<? extends jv<E>> $$0) {
      return a($$0, false);
   }

   public static <E> Codec<jm<E>> a(ale<? extends jv<E>> $$0, boolean $$1) {
      return akz.a($$0, alc.a($$0), $$1);
   }
}
