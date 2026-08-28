import com.mojang.serialization.Codec;

public class jv {
   public static <E> Codec<jk<E>> a(alq<? extends jt<E>> $$0, Codec<E> $$1) {
      return a($$0, $$1, false);
   }

   public static <E> Codec<jk<E>> a(alq<? extends jt<E>> $$0, Codec<E> $$1, boolean $$2) {
      return all.a($$0, aln.a($$0, $$1), $$2);
   }

   public static <E> Codec<jk<E>> a(alq<? extends jt<E>> $$0) {
      return a($$0, false);
   }

   public static <E> Codec<jk<E>> a(alq<? extends jt<E>> $$0, boolean $$1) {
      return all.a($$0, alo.a($$0), $$1);
   }
}
