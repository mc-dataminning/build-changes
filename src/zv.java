import io.netty.buffer.ByteBuf;

public record zv(akr c, byte[] d) implements zg<zm> {
   public static final yx<vw, zv> a = zg.a(zv::a, zv::new);
   private static final int e = 5120;
   public static final yx<ByteBuf, byte[]> b = yv.a(5120);

   private zv(vw $$0) {
      this($$0.q(), b.decode($$0));
   }

   private void a(vw $$0) {
      $$0.a(this.c);
      b.encode($$0, this.d);
   }

   @Override
   public zi<zv> a() {
      return zy.i;
   }

   public void a(zm $$0) {
      $$0.a(this);
   }

   public akr b() {
      return this.c;
   }

   public byte[] e() {
      return this.d;
   }
}
