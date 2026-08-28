import java.io.IOException;
import java.io.InputStream;

public class gyc {
   @Deprecated
   public static int[] a(auv $$0, ale $$1) throws IOException {
      int[] var4;
      try (
         InputStream $$2 = $$0.open($$1);
         fci $$3 = fci.a($$2);
      ) {
         var4 = $$3.f();
      }

      return var4;
   }
}
