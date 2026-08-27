public class xg implements ux<wp> {
   private final boolean a;

   public xg(boolean $$0) {
      this.a = $$0;
   }

   public xg(si $$0) {
      this.a = $$0.readBoolean();
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.a);
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public boolean a() {
      return this.a;
   }
}
