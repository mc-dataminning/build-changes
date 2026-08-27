import io.netty.buffer.ByteBuf;

public record zh(ws b) implements yz<zf> {
   public static final yq<ByteBuf, zh> a = wu.f.a(zh::new, zh::b);

   @Override
   public zb<zh> a() {
      return zp.b;
   }

   public void a(zf $$0) {
      $$0.a(this);
   }
}
