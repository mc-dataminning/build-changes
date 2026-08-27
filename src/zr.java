import io.netty.buffer.ByteBuf;

public record zr(akm c, byte[] d) implements ze<zk> {
   public static final yv<vx, zr> a = ze.a(zr::a, zr::new);
   private static final int e = 5120;
   public static final yv<ByteBuf, byte[]> b = yt.a(5120);

   private zr(vx $$0) {
      this($$0.q(), b.decode($$0));
   }

   private void a(vx $$0) {
      $$0.a(this.c);
      b.encode($$0, this.d);
   }

   @Override
   public zg<zr> a() {
      return zu.g;
   }

   public void a(zk $$0) {
      $$0.a(this);
   }

   public akm b() {
      return this.c;
   }

   public byte[] e() {
      return this.d;
   }
}
