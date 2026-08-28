import io.netty.buffer.ByteBuf;

public record zs(ale c, byte[] d) implements zd<zj> {
   public static final yu<vs, zs> a = zd.a(zs::a, zs::new);
   private static final int e = 5120;
   public static final yu<ByteBuf, byte[]> b = ys.a(5120);

   private zs(vs $$0) {
      this($$0.q(), b.decode($$0));
   }

   private void a(vs $$0) {
      $$0.a(this.c);
      b.encode($$0, this.d);
   }

   @Override
   public zf<zs> a() {
      return zv.i;
   }

   public void a(zj $$0) {
      $$0.a(this);
   }

   public ale b() {
      return this.c;
   }

   public byte[] e() {
      return this.d;
   }
}
