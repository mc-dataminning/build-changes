import io.netty.buffer.ByteBuf;

public record zy(akt c, byte[] d) implements zl<zr> {
   public static final zc<we, zy> a = zl.a(zy::a, zy::new);
   private static final int e = 5120;
   public static final zc<ByteBuf, byte[]> b = za.a(5120);

   private zy(we $$0) {
      this($$0.q(), b.decode($$0));
   }

   private void a(we $$0) {
      $$0.a(this.c);
      b.encode($$0, this.d);
   }

   @Override
   public zn<zy> a() {
      return aab.g;
   }

   public void a(zr $$0) {
      $$0.a(this);
   }

   public akt b() {
      return this.c;
   }

   public byte[] e() {
      return this.d;
   }
}
