import io.netty.buffer.ByteBuf;

public record zl(aku c, byte[] d) implements yw<zc> {
   public static final yn<vl, zl> a = yw.a(zl::a, zl::new);
   private static final int e = 5120;
   public static final yn<ByteBuf, byte[]> b = yl.a(5120);

   private zl(vl $$0) {
      this($$0.q(), b.decode($$0));
   }

   private void a(vl $$0) {
      $$0.a(this.c);
      b.encode($$0, this.d);
   }

   @Override
   public yy<zl> a() {
      return zo.i;
   }

   public void a(zc $$0) {
      $$0.a(this);
   }

   public aku b() {
      return this.c;
   }

   public byte[] e() {
      return this.d;
   }
}
