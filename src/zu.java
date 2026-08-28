import io.netty.buffer.ByteBuf;

public record zu(alg c, byte[] d) implements zf<zl> {
   public static final yw<vu, zu> a = zf.a(zu::a, zu::new);
   private static final int e = 5120;
   public static final yw<ByteBuf, byte[]> b = yu.a(5120);

   private zu(vu $$0) {
      this($$0.q(), b.decode($$0));
   }

   private void a(vu $$0) {
      $$0.a(this.c);
      b.encode($$0, this.d);
   }

   @Override
   public zh<zu> a() {
      return zx.i;
   }

   public void a(zl $$0) {
      $$0.a(this);
   }

   public alg b() {
      return this.c;
   }

   public byte[] e() {
      return this.d;
   }
}
