public class zj implements xd<yx> {
   private final bjs a;
   private final boolean b;

   public zj(bjs $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public zj(ug $$0) {
      this.a = bjs.a($$0.readUnsignedByte());
      this.b = $$0.readBoolean();
   }

   @Override
   public void a(ug $$0) {
      $$0.k(this.a.a());
      $$0.a(this.b);
   }

   public void a(yx $$0) {
      $$0.a(this);
   }

   public boolean a() {
      return this.b;
   }

   public bjs d() {
      return this.a;
   }
}
