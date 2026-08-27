public class gcs extends gcg<caq, fmi<caq>> {
   private static final aiy a = new aiy("textures/entity/fish/pufferfish.png");
   private int i = 3;
   private final fmi<caq> j;
   private final fmi<caq> k;
   private final fmi<caq> l = this.a();

   public gcs(gba.a $$0) {
      super($$0, new fnp<>($$0.a(fpi.aX)), 0.2F);
      this.k = new fnq<>($$0.a(fpi.aY));
      this.j = new fnr<>($$0.a(fpi.aZ));
   }

   public aiy a(caq $$0) {
      return a;
   }

   public void a(caq $$0, float $$1, float $$2, esh $$3, fvt $$4, int $$5) {
      int $$6 = $$0.gi();
      if ($$6 != this.i) {
         if ($$6 == 0) {
            this.f = this.j;
         } else if ($$6 == 1) {
            this.f = this.k;
         } else {
            this.f = this.l;
         }
      }

      this.i = $$6;
      this.d = 0.1F + 0.1F * (float)$$6;
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(caq $$0, esh $$1, float $$2, float $$3, float $$4, float $$5) {
      $$1.a(0.0F, awi.b($$2 * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
