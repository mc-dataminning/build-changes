public class ys implements uo<ur> {
   private final int a;
   private final double b;
   private final double c;
   private final double d;
   private final byte e;
   private final byte f;
   private final boolean g;

   public ys(bfj $$0) {
      this.a = $$0.af();
      eei $$1 = $$0.dh();
      this.b = $$1.c;
      this.c = $$1.d;
      this.d = $$1.e;
      this.e = (byte)((int)($$0.dy() * 256.0F / 360.0F));
      this.f = (byte)((int)($$0.dA() * 256.0F / 360.0F));
      this.g = $$0.ay();
   }

   public ys(sf $$0) {
      this.a = $$0.m();
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readByte();
      this.f = $$0.readByte();
      this.g = $$0.readBoolean();
   }

   @Override
   public void a(sf $$0) {
      $$0.d(this.a);
      $$0.writeDouble(this.b);
      $$0.writeDouble(this.c);
      $$0.writeDouble(this.d);
      $$0.writeByte(this.e);
      $$0.writeByte(this.f);
      $$0.writeBoolean(this.g);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public double c() {
      return this.b;
   }

   public double d() {
      return this.c;
   }

   public double e() {
      return this.d;
   }

   public byte f() {
      return this.e;
   }

   public byte g() {
      return this.f;
   }

   public boolean h() {
      return this.g;
   }
}
