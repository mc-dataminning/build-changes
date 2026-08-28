import java.io.IOException;
import java.io.InputStream;

public class hcc {
   @Deprecated
   public static int[] a(avl $$0, alp $$1) throws IOException {
      int[] var4;
      try (
         InputStream $$2 = $$0.open($$1);
         ffl $$3 = ffl.a($$2);
      ) {
         var4 = $$3.f();
      }

      return var4;
   }
}
