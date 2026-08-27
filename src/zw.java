public class zw implements uo<zb> {
   private final boolean a;

   public zw(boolean $$0) {
      this.a = $$0;
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public zw(sf $$0) {
      this.a = $$0.readBoolean();
   }

   @Override
   public void a(sf $$0) {
      $$0.writeBoolean(this.a);
   }

   public boolean a() {
      return this.a;
   }
}
