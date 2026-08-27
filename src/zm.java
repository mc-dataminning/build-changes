public class zm implements ux<wp> {
   private final int a;

   public zm(int $$0) {
      this.a = $$0;
   }

   public zm(si $$0) {
      this.a = $$0.readByte();
   }

   @Override
   public void a(si $$0) {
      $$0.k(this.a);
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }
}
