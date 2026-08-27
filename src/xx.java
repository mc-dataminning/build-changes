public class xx implements wb<xu> {
   public static final int a = 0;
   public static final int b = 2;
   public static final int c = 3;
   public static final int d = 4;
   public static final int e = 5;
   private final int f;
   private final int g;

   public xx(bjt $$0, int $$1) {
      this.f = $$0.ah();
      this.g = $$1;
   }

   public xx(tl $$0) {
      this.f = $$0.n();
      this.g = $$0.readUnsignedByte();
   }

   @Override
   public void a(tl $$0) {
      $$0.c(this.f);
      $$0.k(this.g);
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.f;
   }

   public int d() {
      return this.g;
   }
}
