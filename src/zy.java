import io.netty.buffer.ByteBuf;

public record zy(alk c, byte[] d) implements zj<zp> {
   public static final za<vy, zy> a = zj.a(zy::a, zy::new);
   private static final int e = 5120;
   public static final za<ByteBuf, byte[]> b = yy.a(5120);

   private zy(vy $$0) {
      this($$0.q(), b.decode($$0));
   }

   private void a(vy $$0) {
      $$0.a(this.c);
      b.encode($$0, this.d);
   }

   @Override
   public zl<zy> a() {
      return aab.i;
   }

   public void a(zp $$0) {
      $$0.a(this);
   }

   public alk b() {
      return this.c;
   }

   public byte[] e() {
      return this.d;
   }
}
