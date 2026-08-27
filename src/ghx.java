import java.io.IOException;
import java.io.InputStream;

public class ghx {
   @Deprecated
   public static int[] a(asb $$0, aiy $$1) throws IOException {
      int[] var4;
      try (
         InputStream $$2 = $$0.open($$1);
         eri $$3 = eri.a($$2);
      ) {
         var4 = $$3.e();
      }

      return var4;
   }
}
