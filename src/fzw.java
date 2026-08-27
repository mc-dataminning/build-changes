import java.io.IOException;
import java.io.InputStream;

public class fzw {
   @Deprecated
   public static int[] a(anp $$0, aeu $$1) throws IOException {
      int[] var4;
      try (
         InputStream $$2 = $$0.open($$1);
         ekl $$3 = ekl.a($$2);
      ) {
         var4 = $$3.e();
      }

      return var4;
   }
}
