public class va implements uo<ur> {
   private final gu a;
   private final int b;
   private final int c;
   private final cpn d;

   public va(gu $$0, cpn $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public va(sf $$0) {
      this.a = $$0.f();
      this.b = $$0.readUnsignedByte();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.a(jb.f);
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.a);
      $$0.writeByte(this.b);
      $$0.writeByte(this.c);
      $$0.a(jb.f, this.d);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public gu a() {
      return this.a;
   }

   public int c() {
      return this.b;
   }

   public int d() {
      return this.c;
   }

   public cpn e() {
      return this.d;
   }
}
