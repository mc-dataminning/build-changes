import java.util.Collection;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class x {
   @Nullable
   public static <T, R> R a(@Nullable T $$0, Function<T, R> $$1) {
      return $$0 == null ? null : $$1.apply($$0);
   }

   public static <T, R> R a(@Nullable T $$0, Function<T, R> $$1, R $$2) {
      return $$0 == null ? $$2 : $$1.apply($$0);
   }

   public static <T, R> R a(@Nullable T $$0, Function<T, R> $$1, Supplier<R> $$2) {
      return $$0 == null ? $$2.get() : $$1.apply($$0);
   }

   @Nullable
   public static <T> T a(Collection<T> $$0) {
      Iterator<T> $$1 = $$0.iterator();
      return $$1.hasNext() ? $$1.next() : null;
   }

   public static <T> T a(Collection<T> $$0, T $$1) {
      Iterator<T> $$2 = $$0.iterator();
      return $$2.hasNext() ? $$2.next() : $$1;
   }

   public static <T> T a(Collection<T> $$0, Supplier<T> $$1) {
      Iterator<T> $$2 = $$0.iterator();
      return $$2.hasNext() ? $$2.next() : $$1.get();
   }

   public static <T> boolean a(@Nullable T[] $$0) {
      return $$0 == null || $$0.length == 0;
   }

   public static boolean a(@Nullable boolean[] $$0) {
      return $$0 == null || $$0.length == 0;
   }

   public static boolean a(@Nullable byte[] $$0) {
      return $$0 == null || $$0.length == 0;
   }

   public static boolean a(@Nullable char[] $$0) {
      return $$0 == null || $$0.length == 0;
   }

   public static boolean a(@Nullable short[] $$0) {
      return $$0 == null || $$0.length == 0;
   }

   public static boolean a(@Nullable int[] $$0) {
      return $$0 == null || $$0.length == 0;
   }

   public static boolean a(@Nullable long[] $$0) {
      return $$0 == null || $$0.length == 0;
   }

   public static boolean a(@Nullable float[] $$0) {
      return $$0 == null || $$0.length == 0;
   }

   public static boolean a(@Nullable double[] $$0) {
      return $$0 == null || $$0.length == 0;
   }
}
