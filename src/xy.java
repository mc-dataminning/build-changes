public class xy implements uo<ur> {
   private final int a;
   private final int b;
   private final int c;
   private final int d;

   public xy(bfj $$0) {
      this($$0.af(), $$0.dl());
   }

   public xy(int $$0, eei $$1) {
      this.a = $$0;
      double $$2 = 3.9;
      double $$3 = apa.a($$1.c, -3.9, 3.9);
      double $$4 = apa.a($$1.d, -3.9, 3.9);
      double $$5 = apa.a($$1.e, -3.9, 3.9);
      this.b = (int)($$3 * 8000.0);
      this.c = (int)($$4 * 8000.0);
      this.d = (int)($$5 * 8000.0);
   }

   public xy(sf $$0) {
      this.a = $$0.m();
      this.b = $$0.readShort();
      this.c = $$0.readShort();
      this.d = $$0.readShort();
   }

   @Override
   public void a(sf $$0) {
      $$0.d(this.a);
      $$0.writeShort(this.b);
      $$0.writeShort(this.c);
      $$0.writeShort(this.d);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int c() {
      return this.b;
   }

   public int d() {
      return this.c;
   }

   public int e() {
      return this.d;
   }
}
