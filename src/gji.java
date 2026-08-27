public class gji<T extends brh & clw> extends ggw<T> {
   private static final float a = 12.25F;
   private final ghv f;
   private final float g;
   private final boolean h;

   public gji(ggx.a $$0, float $$1, boolean $$2) {
      super($$0);
      this.f = $$0.b();
      this.g = $$1;
      this.h = $$2;
   }

   public gji(ggx.a $$0) {
      this($$0, 1.0F, false);
   }

   @Override
   protected int a(T $$0, in $$1) {
      return this.h ? 15 : super.a($$0, $$1);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, exx $$3, gbo $$4, int $$5) {
      if ($$0.ai >= 2 || !(this.c.b.g().g($$0) < 12.25)) {
         $$3.a();
         $$3.b(this.g, this.g, this.g);
         $$3.a(this.c.b());
         $$3.a(a.d.rotationDegrees(180.0F));
         this.f.a($$0.p(), csw.h, $$5, gmp.d, $$3, $$4, $$0.dN(), $$0.aj());
         $$3.b();
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public akh a(brh $$0) {
      return gmx.e;
   }
}
