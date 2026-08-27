import java.io.IOException;
import java.io.InputStream;

public class gab {
   @Deprecated
   public static int[] a(anu $$0, aex $$1) throws IOException {
      int[] var4;
      try (
         InputStream $$2 = $$0.open($$1);
         ekq $$3 = ekq.a($$2);
      ) {
         var4 = $$3.e();
      }

      return var4;
   }
}
