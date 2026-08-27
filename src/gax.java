import java.io.IOException;
import java.io.InputStream;

public class gax {
   @Deprecated
   public static int[] a(aot $$0, afw $$1) throws IOException {
      int[] var4;
      try (
         InputStream $$2 = $$0.open($$1);
         eli $$3 = eli.a($$2);
      ) {
         var4 = $$3.e();
      }

      return var4;
   }
}
