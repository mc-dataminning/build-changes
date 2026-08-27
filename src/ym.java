import io.netty.buffer.ByteBuf;

public record ym(ajc c, byte[] d) implements xz<yf> {
   public static final xq<us, ym> a = xz.a(ym::a, ym::new);
   private static final int e = 5120;
   public static final xq<ByteBuf, byte[]> b = xo.a(5120);

   private ym(us $$0) {
      this($$0.q(), b.decode($$0));
   }

   private void a(us $$0) {
      $$0.a(this.c);
      b.encode($$0, this.d);
   }

   @Override
   public yb<ym> a() {
      return yp.g;
   }

   public void a(yf $$0) {
      $$0.a(this);
   }

   public ajc b() {
      return this.c;
   }

   public byte[] e() {
      return this.d;
   }
}
