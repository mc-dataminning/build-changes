import io.netty.buffer.ByteBuf;

public record zo(akk c, byte[] d) implements zb<zh> {
   public static final ys<vr, zo> a = zb.a(zo::a, zo::new);
   private static final int e = 5120;
   public static final ys<ByteBuf, byte[]> b = yq.a(5120);

   private zo(vr $$0) {
      this($$0.q(), b.decode($$0));
   }

   private void a(vr $$0) {
      $$0.a(this.c);
      b.encode($$0, this.d);
   }

   @Override
   public zd<zo> a() {
      return zr.g;
   }

   public void a(zh $$0) {
      $$0.a(this);
   }

   public akk b() {
      return this.c;
   }

   public byte[] e() {
      return this.d;
   }
}
