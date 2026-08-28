public class gmo extends gmc<ckk, gsz> {
   private static final alc a = alc.b("textures/entity/skeleton/bogged.png");
   private static final alc b = alc.b("textures/entity/skeleton/bogged_overlay.png");

   public gmo(gnj.a $$0) {
      super($$0, gak.x, gak.y, new fwt($$0.a(gak.w)));
      this.a(new grz<>(this, $$0.f(), gak.z, b));
   }

   public alc a(gsz $$0) {
      return a;
   }

   public gsz a() {
      return new gsz();
   }

   public void a(ckk $$0, gsz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gt();
   }
}
