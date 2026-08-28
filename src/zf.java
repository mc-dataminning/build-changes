import io.netty.buffer.ByteBuf;

public record zf(wp b) implements yw<zc> {
   public static final yn<ByteBuf, zf> a = wr.f.a(zf::new, zf::b);

   @Override
   public yy<zf> a() {
      return zo.c;
   }

   public void a(zc $$0) {
      $$0.a(this);
   }
}
