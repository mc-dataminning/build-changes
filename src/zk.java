import io.netty.buffer.ByteBuf;

public record zk(aku c, byte[] d) implements yv<zb> {
   public static final ym<vl, zk> a = yv.a(zk::a, zk::new);
   private static final int e = 5120;
   public static final ym<ByteBuf, byte[]> b = yk.a(5120);

   private zk(vl $$0) {
      this($$0.q(), b.decode($$0));
   }

   private void a(vl $$0) {
      $$0.a(this.c);
      b.encode($$0, this.d);
   }

   @Override
   public yx<zk> a() {
      return zn.i;
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public aku b() {
      return this.c;
   }

   public byte[] e() {
      return this.d;
   }
}
