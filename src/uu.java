import java.util.UUID;

public class uu implements uo<ur> {
   private final int a;
   private final UUID b;
   private final double c;
   private final double d;
   private final double e;
   private final byte f;
   private final byte g;

   public uu(byo $$0) {
      this.a = $$0.af();
      this.b = $$0.fM().getId();
      this.c = $$0.dn();
      this.d = $$0.dp();
      this.e = $$0.dt();
      this.f = (byte)((int)($$0.dy() * 256.0F / 360.0F));
      this.g = (byte)((int)($$0.dA() * 256.0F / 360.0F));
   }

   public uu(sf $$0) {
      this.a = $$0.m();
      this.b = $$0.o();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readDouble();
      this.f = $$0.readByte();
      this.g = $$0.readByte();
   }

   @Override
   public void a(sf $$0) {
      $$0.d(this.a);
      $$0.a(this.b);
      $$0.writeDouble(this.c);
      $$0.writeDouble(this.d);
      $$0.writeDouble(this.e);
      $$0.writeByte(this.f);
      $$0.writeByte(this.g);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public UUID c() {
      return this.b;
   }

   public double d() {
      return this.c;
   }

   public double e() {
      return this.d;
   }

   public double f() {
      return this.e;
   }

   public byte g() {
      return this.f;
   }

   public byte h() {
      return this.g;
   }
}
