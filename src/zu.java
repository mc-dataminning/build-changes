public class zu implements uo<zb> {
   private final gu a;
   private final int b;
   private final boolean c;

   public zu(gu $$0, int $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public zu(sf $$0) {
      this.a = $$0.f();
      this.b = $$0.m();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.a);
      $$0.d(this.b);
      $$0.writeBoolean(this.c);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public gu a() {
      return this.a;
   }

   public int c() {
      return this.b;
   }

   public boolean d() {
      return this.c;
   }
}
