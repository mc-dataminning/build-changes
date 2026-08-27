import java.util.UUID;

public class wx implements vd<ww> {
   private static final double a = 8000.0;
   private static final double b = 3.9;
   private final int c;
   private final UUID d;
   private final biu<?> e;
   private final double f;
   private final double g;
   private final double h;
   private final int i;
   private final int j;
   private final int k;
   private final byte l;
   private final byte m;
   private final byte n;
   private final int o;

   public wx(biq $$0) {
      this($$0, 0);
   }

   public wx(biq $$0, int $$1) {
      this($$0.ah(), $$0.cv(), $$0.dq(), $$0.ds(), $$0.dw(), $$0.dD(), $$0.dB(), $$0.ag(), $$1, $$0.do(), (double)$$0.co());
   }

   public wx(biq $$0, int $$1, gw $$2) {
      this($$0.ah(), $$0.cv(), (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$0.dD(), $$0.dB(), $$0.ag(), $$1, $$0.do(), (double)$$0.co());
   }

   public wx(int $$0, UUID $$1, double $$2, double $$3, double $$4, float $$5, float $$6, biu<?> $$7, int $$8, ehn $$9, double $$10) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.l = (byte)arw.d($$5 * 256.0F / 360.0F);
      this.m = (byte)arw.d($$6 * 256.0F / 360.0F);
      this.n = (byte)arw.a($$10 * 256.0 / 360.0);
      this.e = $$7;
      this.o = $$8;
      this.i = (int)(arw.a($$9.c, -3.9, 3.9) * 8000.0);
      this.j = (int)(arw.a($$9.d, -3.9, 3.9) * 8000.0);
      this.k = (int)(arw.a($$9.e, -3.9, 3.9) * 8000.0);
   }

   public wx(so $$0) {
      this.c = $$0.m();
      this.d = $$0.o();
      this.e = $$0.a(jb.h);
      this.f = $$0.readDouble();
      this.g = $$0.readDouble();
      this.h = $$0.readDouble();
      this.l = $$0.readByte();
      this.m = $$0.readByte();
      this.n = $$0.readByte();
      this.o = $$0.m();
      this.i = $$0.readShort();
      this.j = $$0.readShort();
      this.k = $$0.readShort();
   }

   @Override
   public void a(so $$0) {
      $$0.c(this.c);
      $$0.a(this.d);
      $$0.a(jb.h, this.e);
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.k(this.l);
      $$0.k(this.m);
      $$0.k(this.n);
      $$0.c(this.o);
      $$0.l(this.i);
      $$0.l(this.j);
      $$0.l(this.k);
   }

   public void a(ww $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.c;
   }

   public UUID d() {
      return this.d;
   }

   public biu<?> e() {
      return this.e;
   }

   public double f() {
      return this.f;
   }

   public double g() {
      return this.g;
   }

   public double h() {
      return this.h;
   }

   public double i() {
      return (double)this.i / 8000.0;
   }

   public double j() {
      return (double)this.j / 8000.0;
   }

   public double k() {
      return (double)this.k / 8000.0;
   }

   public float l() {
      return (float)(this.l * 360) / 256.0F;
   }

   public float m() {
      return (float)(this.m * 360) / 256.0F;
   }

   public float n() {
      return (float)(this.n * 360) / 256.0F;
   }

   public int o() {
      return this.o;
   }
}
