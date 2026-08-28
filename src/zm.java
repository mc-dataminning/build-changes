import io.netty.buffer.ByteBuf;

public record zm(ww b) implements zd<zj> {
   public static final yu<ByteBuf, zm> a = wy.f.a(zm::new, zm::b);

   @Override
   public zf<zm> a() {
      return zv.c;
   }

   public void a(zj $$0) {
      $$0.a(this);
   }
}
