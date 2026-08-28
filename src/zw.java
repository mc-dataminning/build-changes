import io.netty.buffer.ByteBuf;

public record zw(ali c, byte[] d) implements zh<zn> {
   public static final yy<vw, zw> a = zh.a(zw::a, zw::new);
   private static final int e = 5120;
   public static final yy<ByteBuf, byte[]> b = yw.a(5120);

   private zw(vw $$0) {
      this($$0.q(), b.decode($$0));
   }

   private void a(vw $$0) {
      $$0.a(this.c);
      b.encode($$0, this.d);
   }

   @Override
   public zj<zw> a() {
      return zz.i;
   }

   public void a(zn $$0) {
      $$0.a(this);
   }

   public ali b() {
      return this.c;
   }

   public byte[] e() {
      return this.d;
   }
}
