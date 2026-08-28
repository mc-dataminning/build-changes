import io.netty.buffer.ByteBuf;

public record zu(akq c, byte[] d) implements zf<zl> {
   public static final yw<vv, zu> a = zf.a(zu::a, zu::new);
   private static final int e = 5120;
   public static final yw<ByteBuf, byte[]> b = yu.a(5120);

   private zu(vv $$0) {
      this($$0.q(), b.decode($$0));
   }

   private void a(vv $$0) {
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

   public akq b() {
      return this.c;
   }

   public byte[] e() {
      return this.d;
   }
}
