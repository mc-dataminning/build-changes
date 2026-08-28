import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.floats.FloatConsumer;
import java.nio.ByteBuffer;
import java.util.List;
import org.lwjgl.BufferUtils;

public class hgc implements FloatConsumer {
   private final List<ByteBuffer> a = Lists.newArrayList();
   private final int b;
   private int c;
   private ByteBuffer d;

   public hgc(int $$0) {
      this.b = $$0 + 1 & -2;
      this.d = BufferUtils.createByteBuffer($$0);
   }

   public void accept(float $$0) {
      if (this.d.remaining() == 0) {
         this.d.flip();
         this.a.add(this.d);
         this.d = BufferUtils.createByteBuffer(this.b);
      }

      int $$1 = bae.a((int)($$0 * 32767.5F - 0.5F), -32768, 32767);
      this.d.putShort((short)$$1);
      this.c += 2;
   }

   public ByteBuffer a() {
      this.d.flip();
      if (this.a.isEmpty()) {
         return this.d;
      } else {
         ByteBuffer $$0 = BufferUtils.createByteBuffer(this.c);
         this.a.forEach($$0::put);
         $$0.put(this.d);
         $$0.flip();
         return $$0;
      }
   }

   public int b() {
      return this.c;
   }
}
