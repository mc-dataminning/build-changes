public class zd implements xf<za> {
   public static final int a = 0;
   public static final int b = 2;
   public static final int c = 3;
   public static final int d = 4;
   public static final int e = 5;
   private final int f;
   private final int g;

   public zd(blu $$0, int $$1) {
      this.f = $$0.aj();
      this.g = $$1;
   }

   public zd(ui $$0) {
      this.f = $$0.n();
      this.g = $$0.readUnsignedByte();
   }

   @Override
   public void a(ui $$0) {
      $$0.c(this.f);
      $$0.k(this.g);
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.f;
   }

   public int d() {
      return this.g;
   }
}
