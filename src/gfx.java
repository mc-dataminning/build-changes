import java.io.IOException;
import java.io.InputStream;

public class gfx {
   @Deprecated
   public static int[] a(aqj $$0, ahh $$1) throws IOException {
      int[] var4;
      try (
         InputStream $$2 = $$0.open($$1);
         epl $$3 = epl.a($$2);
      ) {
         var4 = $$3.e();
      }

      return var4;
   }
}
