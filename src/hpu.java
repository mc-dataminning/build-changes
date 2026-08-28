import it.unimi.dsi.fastutil.floats.FloatConsumer;
import java.io.IOException;
import java.nio.ByteBuffer;

public interface hpu extends hpt {
   int a = 8192;

   boolean a(FloatConsumer var1) throws IOException;

   @Override
   default ByteBuffer a(int $$0) throws IOException {
      hps $$1 = new hps($$0 + 8192);

      while (this.a($$1) && $$1.b() < $$0) {
      }

      return $$1.a();
   }

   @Override
   default ByteBuffer b() throws IOException {
      hps $$0 = new hps(16384);

      while (this.a($$0)) {
      }

      return $$0.a();
   }
}
