public class xb implements uw<wo> {
   private final bgl a;
   private final boolean b;

   public xb(bgl $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public xb(sh $$0) {
      this.a = bgl.a($$0.readUnsignedByte());
      this.b = $$0.readBoolean();
   }

   @Override
   public void a(sh $$0) {
      $$0.k(this.a.a());
      $$0.a(this.b);
   }

   public void a(wo $$0) {
      $$0.a(this);
   }

   public boolean a() {
      return this.b;
   }

   public bgl d() {
      return this.a;
   }
}
