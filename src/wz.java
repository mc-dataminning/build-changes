public class wz implements ux<wp> {
   private final gu a;
   private final dez b;

   public wz(gu $$0, dez $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public wz(cor $$0, gu $$1) {
      this($$1, $$0.a_($$1));
   }

   public wz(si $$0) {
      this.a = $$0.e();
      this.b = $$0.a(csl.o);
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.a);
      $$0.a(csl.o, this.b);
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public dez a() {
      return this.b;
   }

   public gu d() {
      return this.a;
   }
}
