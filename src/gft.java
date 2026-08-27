public class gft extends ggo<cgu, fqz<cgu>> {
   private static final ajt a = new ajt("textures/entity/zombie/zombie.png");
   private final float i;

   public gft(gfi.a $$0, float $$1) {
      super($$0, new fqr($$0.a(ftl.ah)), 0.5F * $$1);
      this.i = $$1;
      this.a(new gjm<>(this, $$0.d()));
      this.a(new gjj<>(this, new fqr($$0.a(ftl.ai)), new fqr($$0.a(ftl.aj)), $$0.g()));
   }

   protected void a(cgu $$0, ewi $$1, float $$2) {
      $$1.b(this.i, this.i, this.i);
   }

   public ajt a(cgu $$0) {
      return a;
   }
}
