import it.unimi.dsi.fastutil.floats.FloatConsumer;
import java.io.IOException;
import java.nio.ByteBuffer;

public interface gtn extends gtm {
   int a = 8192;

   boolean a(FloatConsumer var1) throws IOException;

   @Override
   default ByteBuffer a(int $$0) throws IOException {
      gtl $$1 = new gtl($$0 + 8192);

      while (this.a($$1) && $$1.b() < $$0) {
      }

      return $$1.a();
   }

   @Override
   default ByteBuffer b() throws IOException {
      gtl $$0 = new gtl(16384);

      while (this.a($$0)) {
      }

      return $$0.a();
   }
}
