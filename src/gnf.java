public class gnf<T extends brv & cmo> extends gkp<T> {
   private static final float a = 12.25F;
   private final glp b;
   private final float g;
   private final boolean h;

   public gnf(gkq.a $$0, float $$1, boolean $$2) {
      super($$0);
      this.b = $$0.b();
      this.g = $$1;
      this.h = $$2;
   }

   public gnf(gkq.a $$0) {
      this($$0, 1.0F, false);
   }

   @Override
   protected int a(T $$0, ir $$1) {
      return this.h ? 15 : super.a($$0, $$1);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, fbc $$3, gfg $$4, int $$5) {
      if ($$0.am >= 2 || !(this.d.b.g().g($$0) < 12.25)) {
         $$3.a();
         $$3.b(this.g, this.g, this.g);
         $$3.a(this.d.b());
         $$3.a(a.d.rotationDegrees(180.0F));
         this.b.a($$0.p(), cue.h, $$5, gqp.d, $$3, $$4, $$0.dU(), $$0.al());
         $$3.b();
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public akt a(brv $$0) {
      return gqx.e;
   }
}
