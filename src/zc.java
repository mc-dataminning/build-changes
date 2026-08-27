import io.netty.buffer.ByteBuf;

public record zc(ajv c, byte[] d) implements yp<yv> {
   public static final yg<vi, zc> a = yp.a(zc::a, zc::new);
   private static final int e = 5120;
   public static final yg<ByteBuf, byte[]> b = ye.a(5120);

   private zc(vi $$0) {
      this($$0.q(), b.decode($$0));
   }

   private void a(vi $$0) {
      $$0.a(this.c);
      b.encode($$0, this.d);
   }

   @Override
   public yr<zc> a() {
      return zf.g;
   }

   public void a(yv $$0) {
      $$0.a(this);
   }

   public ajv b() {
      return this.c;
   }

   public byte[] e() {
      return this.d;
   }
}
