public class yl implements uo<ur> {
   private final he<amg> a;
   private final ami b;
   private final int c;
   private final float d;
   private final float e;
   private final long f;

   public yl(he<amg> $$0, ami $$1, bfj $$2, float $$3, float $$4, long $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.af();
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public yl(sf $$0) {
      this.a = $$0.a(jb.c.t(), amg::b);
      this.b = $$0.b(ami.class);
      this.c = $$0.m();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
      this.f = $$0.readLong();
   }

   @Override
   public void a(sf $$0) {
      $$0.a(jb.c.t(), this.a, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.b);
      $$0.d(this.c);
      $$0.writeFloat(this.d);
      $$0.writeFloat(this.e);
      $$0.writeLong(this.f);
   }

   public he<amg> a() {
      return this.a;
   }

   public ami c() {
      return this.b;
   }

   public int d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }

   public float f() {
      return this.e;
   }

   public long g() {
      return this.f;
   }

   public void a(ur $$0) {
      $$0.a(this);
   }
}
