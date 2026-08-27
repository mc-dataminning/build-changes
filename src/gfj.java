import java.io.IOException;
import java.io.InputStream;

public class gfj {
   @Deprecated
   public static int[] a(aqi $$0, ahg $$1) throws IOException {
      int[] var4;
      try (
         InputStream $$2 = $$0.open($$1);
         epc $$3 = epc.a($$2);
      ) {
         var4 = $$3.e();
      }

      return var4;
   }
}
