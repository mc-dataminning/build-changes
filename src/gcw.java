import java.io.IOException;
import java.io.InputStream;

public class gcw {
   @Deprecated
   public static int[] a(apl $$0, agm $$1) throws IOException {
      int[] var4;
      try (
         InputStream $$2 = $$0.open($$1);
         enc $$3 = enc.a($$2);
      ) {
         var4 = $$3.e();
      }

      return var4;
   }
}
