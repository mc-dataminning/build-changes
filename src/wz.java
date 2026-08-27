import java.util.UUID;

public class wz implements vd<ww> {
   private final int a;
   private final UUID b;
   private final double c;
   private final double d;
   private final double e;
   private final byte f;
   private final byte g;

   public wz(cbu $$0) {
      this.a = $$0.ai();
      this.b = $$0.fQ().getId();
      this.c = $$0.dq();
      this.d = $$0.ds();
      this.e = $$0.dw();
      this.f = (byte)((int)($$0.dB() * 256.0F / 360.0F));
      this.g = (byte)((int)($$0.dD() * 256.0F / 360.0F));
   }

   public wz(so $$0) {
      this.a = $$0.m();
      this.b = $$0.o();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readDouble();
      this.f = $$0.readByte();
      this.g = $$0.readByte();
   }

   @Override
   public void a(so $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.k(this.f);
      $$0.k(this.g);
   }

   public void a(ww $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public UUID d() {
      return this.b;
   }

   public double e() {
      return this.c;
   }

   public double f() {
      return this.d;
   }

   public double g() {
      return this.e;
   }

   public byte h() {
      return this.f;
   }

   public byte i() {
      return this.g;
   }
}
