import com.google.common.hash.HashCode;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public interface lu {
   lu a = ($$0, $$1, $$2) -> {
      v.c($$0.getParent());
      Files.write($$0, $$1);
   };

   void writeIfNeeded(Path var1, byte[] var2, HashCode var3) throws IOException;
}
