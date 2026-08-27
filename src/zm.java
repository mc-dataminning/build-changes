import io.netty.buffer.ByteBuf;

public record zm(wx b) implements ze<zk> {
   public static final yv<ByteBuf, zm> a = wz.f.a(zm::new, zm::b);

   @Override
   public zg<zm> a() {
      return zu.b;
   }

   public void a(zk $$0) {
      $$0.a(this);
   }
}
