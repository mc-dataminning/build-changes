import java.io.IOException;
import java.io.InputStream;

public class gnk {
   @Deprecated
   public static int[] a(ato $$0, akf $$1) throws IOException {
      int[] var4;
      try (
         InputStream $$2 = $$0.open($$1);
         ewo $$3 = ewo.a($$2);
      ) {
         var4 = $$3.e();
      }

      return var4;
   }
}
