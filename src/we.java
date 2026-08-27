public class we implements uo<ur> {
   private final int a;
   private final gu b;
   private final int c;
   private final boolean d;

   public we(int $$0, gu $$1, int $$2, boolean $$3) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
      this.d = $$3;
   }

   public we(sf $$0) {
      this.a = $$0.readInt();
      this.b = $$0.f();
      this.c = $$0.readInt();
      this.d = $$0.readBoolean();
   }

   @Override
   public void a(sf $$0) {
      $$0.writeInt(this.a);
      $$0.a(this.b);
      $$0.writeInt(this.c);
      $$0.writeBoolean(this.d);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public boolean a() {
      return this.d;
   }

   public int c() {
      return this.a;
   }

   public int d() {
      return this.c;
   }

   public gu e() {
      return this.b;
   }
}
