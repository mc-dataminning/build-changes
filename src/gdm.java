import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.sound.sampled.AudioFormat;

public class gdm implements gdk {
   private final gdm.a a;
   private gdk b;
   private final BufferedInputStream c;

   public gdm(gdm.a $$0, InputStream $$1) throws IOException {
      this.a = $$0;
      this.c = new BufferedInputStream($$1);
      this.c.mark(Integer.MAX_VALUE);
      this.b = $$0.create(new gdm.b(this.c));
   }

   @Override
   public AudioFormat a() {
      return this.b.a();
   }

   @Override
   public ByteBuffer a(int $$0) throws IOException {
      ByteBuffer $$1 = this.b.a($$0);
      if (!$$1.hasRemaining()) {
         this.b.close();
         this.c.reset();
         this.b = this.a.create(new gdm.b(this.c));
         $$1 = this.b.a($$0);
      }

      return $$1;
   }

   @Override
   public void close() throws IOException {
      this.b.close();
      this.c.close();
   }

   @FunctionalInterface
   public interface a {
      gdk create(InputStream var1) throws IOException;
   }

   static class b extends FilterInputStream {
      b(InputStream $$0) {
         super($$0);
      }

      @Override
      public void close() {
      }
   }
}
