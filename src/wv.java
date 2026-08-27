import java.util.UUID;

public class wv implements va<ws> {
   private final int a;
   private final UUID b;
   private final double c;
   private final double d;
   private final double e;
   private final byte f;
   private final byte g;

   public wv(cbp $$0) {
      this.a = $$0.ah();
      this.b = $$0.fP().getId();
      this.c = $$0.dp();
      this.d = $$0.dr();
      this.e = $$0.dv();
      this.f = (byte)((int)($$0.dA() * 256.0F / 360.0F));
      this.g = (byte)((int)($$0.dC() * 256.0F / 360.0F));
   }

   public wv(sl $$0) {
      this.a = $$0.m();
      this.b = $$0.o();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readDouble();
      this.f = $$0.readByte();
      this.g = $$0.readByte();
   }

   @Override
   public void a(sl $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.k(this.f);
      $$0.k(this.g);
   }

   public void a(ws $$0) {
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
