public class gtx extends gtk<chr, gzy, gcb<gyk>> {
   private static final akv a = akv.b("textures/entity/fish/pufferfish.png");
   private final gcb<gyk> b;
   private final gcb<gyk> k;
   private final gcb<gyk> l = this.c();

   public gtx(gse.a $$0) {
      super($$0, new gdi($$0.a(gfc.cq)), 0.2F);
      this.k = new gdj($$0.a(gfc.cr));
      this.b = new gdk($$0.a(gfc.cs));
   }

   public akv a(gzy $$0) {
      return a;
   }

   public gzy b() {
      return new gzy();
   }

   protected float b(gzy $$0) {
      return 0.1F + 0.1F * (float)$$0.a;
   }

   public void a(gzy $$0, ffu $$1, gly $$2, int $$3) {
      this.h = switch ($$0.a) {
         case 0 -> this.b;
         case 1 -> this.k;
         default -> this.l;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   public void a(chr $$0, gzy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gt();
   }

   protected void a(gzy $$0, ffu $$1, float $$2, float $$3) {
      $$1.a(0.0F, ayz.b($$0.u * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3);
   }
}
