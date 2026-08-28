import java.io.IOException;
import java.io.InputStream;

public class grb {
   @Deprecated
   public static int[] a(aud $$0, akq $$1) throws IOException {
      int[] var4;
      try (
         InputStream $$2 = $$0.open($$1);
         fad $$3 = fad.a($$2);
      ) {
         var4 = $$3.e();
      }

      return var4;
   }
}
