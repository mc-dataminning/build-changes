public class zz implements uo<zb> {
   private final boolean a;
   private final boolean b;

   public zz(boolean $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public zz(sf $$0) {
      this.a = $$0.readBoolean();
      this.b = $$0.readBoolean();
   }

   @Override
   public void a(sf $$0) {
      $$0.writeBoolean(this.a);
      $$0.writeBoolean(this.b);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public boolean a() {
      return this.a;
   }

   public boolean c() {
      return this.b;
   }
}
