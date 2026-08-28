import io.netty.buffer.ByteBuf;

public record zj(wu b) implements zb<zh> {
   public static final ys<ByteBuf, zj> a = ww.f.a(zj::new, zj::b);

   @Override
   public zd<zj> a() {
      return zr.b;
   }

   public void a(zh $$0) {
      $$0.a(this);
   }
}
