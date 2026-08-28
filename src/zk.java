import io.netty.buffer.ByteBuf;
import java.util.List;

public record zk(List<alm.c> b) implements yw<zc> {
   public static final yn<ByteBuf, zk> a = yn.a(alm.c, zk::b, zk::new);

   @Override
   public yy<zk> a() {
      return zo.h;
   }

   public void a(zc $$0) {
      $$0.a(this);
   }
}
