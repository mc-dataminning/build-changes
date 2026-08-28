import io.netty.buffer.ByteBuf;
import java.util.List;

public record zr(List<alw.c> b) implements zd<zj> {
   public static final yu<ByteBuf, zr> a = yu.a(alw.c, zr::b, zr::new);

   @Override
   public zf<zr> a() {
      return zv.h;
   }

   public void a(zj $$0) {
      $$0.a(this);
   }
}
