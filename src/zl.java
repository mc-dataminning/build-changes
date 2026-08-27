public record zl(String b, int c, bym d, boolean e, int f, bft g, boolean h, boolean i) implements uo<zb> {
   public static final int a = 16;

   public zl(sf $$0) {
      this($$0.e(16), $$0.readByte(), $$0.b(bym.class), $$0.readBoolean(), $$0.readUnsignedByte(), $$0.b(bft.class), $$0.readBoolean(), $$0.readBoolean());
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.b);
      $$0.writeByte(this.c);
      $$0.a(this.d);
      $$0.writeBoolean(this.e);
      $$0.writeByte(this.f);
      $$0.a(this.g);
      $$0.writeBoolean(this.h);
      $$0.writeBoolean(this.i);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public String a() {
      return this.b;
   }
}
