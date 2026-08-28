import io.netty.buffer.ByteBuf;

public record zr(ald c, byte[] d) implements zc<zi> {
   public static final yt<vr, zr> a = zc.a(zr::a, zr::new);
   private static final int e = 5120;
   public static final yt<ByteBuf, byte[]> b = yr.a(5120);

   private zr(vr $$0) {
      this($$0.q(), b.decode($$0));
   }

   private void a(vr $$0) {
      $$0.a(this.c);
      b.encode($$0, this.d);
   }

   @Override
   public ze<zr> a() {
      return zu.i;
   }

   public void a(zi $$0) {
      $$0.a(this);
   }

   public ald b() {
      return this.c;
   }

   public byte[] e() {
      return this.d;
   }
}
