import com.mojang.serialization.Codec;

public class ju {
   public static <E> Codec<jj<E>> a(alh<? extends js<E>> $$0, Codec<E> $$1) {
      return a($$0, $$1, false);
   }

   public static <E> Codec<jj<E>> a(alh<? extends js<E>> $$0, Codec<E> $$1, boolean $$2) {
      return alc.a($$0, ale.a($$0, $$1), $$2);
   }

   public static <E> Codec<jj<E>> a(alh<? extends js<E>> $$0) {
      return a($$0, false);
   }

   public static <E> Codec<jj<E>> a(alh<? extends js<E>> $$0, boolean $$1) {
      return alc.a($$0, alf.a($$0), $$1);
   }
}
