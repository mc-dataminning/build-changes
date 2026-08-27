import io.netty.buffer.ByteBuf;

public record yo(ajh c, byte[] d) implements yb<yh> {
   public static final xs<uu, yo> a = yb.a(yo::a, yo::new);
   private static final int e = 5120;
   public static final xs<ByteBuf, byte[]> b = xq.a(5120);

   private yo(uu $$0) {
      this($$0.q(), b.decode($$0));
   }

   private void a(uu $$0) {
      $$0.a(this.c);
      b.encode($$0, this.d);
   }

   @Override
   public yd<yo> a() {
      return yr.g;
   }

   public void a(yh $$0) {
      $$0.a(this);
   }

   public ajh b() {
      return this.c;
   }

   public byte[] e() {
      return this.d;
   }
}
