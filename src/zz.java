import io.netty.buffer.ByteBuf;

public record zz(alc c, byte[] d) implements zk<zq> {
   public static final zb<wa, zz> a = zk.a(zz::a, zz::new);
   private static final int e = 5120;
   public static final zb<ByteBuf, byte[]> b = yz.a(5120);

   private zz(wa $$0) {
      this($$0.q(), b.decode($$0));
   }

   private void a(wa $$0) {
      $$0.a(this.c);
      b.encode($$0, this.d);
   }

   @Override
   public zm<zz> a() {
      return aac.i;
   }

   public void a(zq $$0) {
      $$0.a(this);
   }

   public alc b() {
      return this.c;
   }

   public byte[] e() {
      return this.d;
   }
}
