public class wz implements ux<wp> {
   private final gu a;
   private final dfa b;

   public wz(gu $$0, dfa $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public wz(cos $$0, gu $$1) {
      this($$1, $$0.a_($$1));
   }

   public wz(si $$0) {
      this.a = $$0.e();
      this.b = $$0.a(csm.o);
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.a);
      $$0.a(csm.o, this.b);
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public dfa a() {
      return this.b;
   }

   public gu d() {
      return this.a;
   }
}
