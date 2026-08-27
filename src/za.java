import io.netty.buffer.ByteBuf;

public record za(ajt c, byte[] d) implements yn<yt> {
   public static final ye<vg, za> a = yn.a(za::a, za::new);
   private static final int e = 5120;
   public static final ye<ByteBuf, byte[]> b = yc.a(5120);

   private za(vg $$0) {
      this($$0.q(), b.decode($$0));
   }

   private void a(vg $$0) {
      $$0.a(this.c);
      b.encode($$0, this.d);
   }

   @Override
   public yp<za> a() {
      return zd.g;
   }

   public void a(yt $$0) {
      $$0.a(this);
   }

   public ajt b() {
      return this.c;
   }

   public byte[] e() {
      return this.d;
   }
}
