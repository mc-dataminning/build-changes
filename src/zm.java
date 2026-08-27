import io.netty.buffer.ByteBuf;

public record zm(akf c, byte[] d) implements yz<zf> {
   public static final yq<vs, zm> a = yz.a(zm::a, zm::new);
   private static final int e = 5120;
   public static final yq<ByteBuf, byte[]> b = yo.a(5120);

   private zm(vs $$0) {
      this($$0.q(), b.decode($$0));
   }

   private void a(vs $$0) {
      $$0.a(this.c);
      b.encode($$0, this.d);
   }

   @Override
   public zb<zm> a() {
      return zp.g;
   }

   public void a(zf $$0) {
      $$0.a(this);
   }

   public akf b() {
      return this.c;
   }

   public byte[] e() {
      return this.d;
   }
}
