import io.netty.buffer.ByteBuf;
import java.util.List;

public record zj(List<alm.c> b) implements yv<zb> {
   public static final ym<ByteBuf, zj> a = ym.a(alm.c, zj::b, zj::new);

   @Override
   public yx<zj> a() {
      return zn.h;
   }

   public void a(zb $$0) {
      $$0.a(this);
   }
}
