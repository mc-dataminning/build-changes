import io.netty.buffer.ByteBuf;

public record zo(wy b) implements zf<zl> {
   public static final yw<ByteBuf, zo> a = xa.f.a(zo::new, zo::b);

   @Override
   public zh<zo> a() {
      return zx.c;
   }

   public void a(zl $$0) {
      $$0.a(this);
   }
}
