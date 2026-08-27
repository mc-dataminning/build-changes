public class vm implements uo<ur> {
   public static final int a = -1;
   public static final int b = -2;
   private final int c;
   private final int d;
   private final int e;
   private final cfz f;

   public vm(int $$0, int $$1, int $$2, cfz $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3.p();
   }

   public vm(sf $$0) {
      this.c = $$0.readByte();
      this.d = $$0.m();
      this.e = $$0.readShort();
      this.f = $$0.r();
   }

   @Override
   public void a(sf $$0) {
      $$0.writeByte(this.c);
      $$0.d(this.d);
      $$0.writeShort(this.e);
      $$0.a(this.f);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.c;
   }

   public int c() {
      return this.e;
   }

   public cfz d() {
      return this.f;
   }

   public int e() {
      return this.d;
   }
}
