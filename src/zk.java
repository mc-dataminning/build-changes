import io.netty.buffer.ByteBuf;
import java.util.List;

public record zk(List<aln.c> b) implements yw<zc> {
   public static final yn<ByteBuf, zk> a = yn.a(aln.c, zk::b, zk::new);

   @Override
   public yy<zk> a() {
      return zo.h;
   }

   public void a(zc $$0) {
      $$0.a(this);
   }
}
