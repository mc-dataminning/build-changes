import java.io.IOException;
import java.io.InputStream;

public class gmf {
   @Deprecated
   public static int[] a(atc $$0, ajt $$1) throws IOException {
      int[] var4;
      try (
         InputStream $$2 = $$0.open($$1);
         evj $$3 = evj.a($$2);
      ) {
         var4 = $$3.e();
      }

      return var4;
   }
}
