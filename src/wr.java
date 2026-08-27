public class wr implements ux<wp> {
   private final int a;
   private final double b;
   private final double c;
   private final double d;
   private final int e;

   public wr(bio $$0) {
      this.a = $$0.ah();
      this.b = $$0.dp();
      this.c = $$0.dr();
      this.d = $$0.dv();
      this.e = $$0.j();
   }

   public wr(si $$0) {
      this.a = $$0.m();
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readShort();
   }

   @Override
   public void a(si $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.l(this.e);
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public double d() {
      return this.b;
   }

   public double e() {
      return this.c;
   }

   public double f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }
}
