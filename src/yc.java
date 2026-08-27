public class yc implements uo<ur> {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   private final String d;
   private final sw e;
   private final efj.a f;
   private final int g;

   public yc(efd $$0, int $$1) {
      this.d = $$0.b();
      this.e = $$0.d();
      this.f = $$0.f();
      this.g = $$1;
   }

   public yc(sf $$0) {
      this.d = $$0.s();
      this.g = $$0.readByte();
      if (this.g != 0 && this.g != 2) {
         this.e = sv.a;
         this.f = efj.a.a;
      } else {
         this.e = $$0.l();
         this.f = $$0.b(efj.a.class);
      }
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.d);
      $$0.writeByte(this.g);
      if (this.g == 0 || this.g == 2) {
         $$0.a(this.e);
         $$0.a(this.f);
      }
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public String a() {
      return this.d;
   }

   public sw c() {
      return this.e;
   }

   public int d() {
      return this.g;
   }

   public efj.a e() {
      return this.f;
   }
}
