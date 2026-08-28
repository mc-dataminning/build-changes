import com.mojang.serialization.Codec;

public class kb {
   public static <E> Codec<jq<E>> a(akp<? extends jz<E>> $$0, Codec<E> $$1) {
      return a($$0, $$1, false);
   }

   public static <E> Codec<jq<E>> a(akp<? extends jz<E>> $$0, Codec<E> $$1, boolean $$2) {
      return akk.a($$0, akm.a($$0, $$1), $$2);
   }

   public static <E> Codec<jq<E>> a(akp<? extends jz<E>> $$0) {
      return a($$0, false);
   }

   public static <E> Codec<jq<E>> a(akp<? extends jz<E>> $$0, boolean $$1) {
      return akk.a($$0, akn.a($$0), $$1);
   }
}
