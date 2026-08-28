public class gqd extends gop<clo, gvs, fzt> {
   private static final alc a = alc.b("textures/entity/illager/vex.png");
   private static final alc b = alc.b("textures/entity/illager/vex_charging.png");

   public gqd(gnj.a $$0) {
      super($$0, new fzt($$0.a(gak.cS)), 0.3F);
      this.a(new grp<>(this, $$0.b()));
   }

   protected int a(clo $$0, je $$1) {
      return 15;
   }

   public alc a(gvs $$0) {
      return $$0.a ? b : a;
   }

   public gvs c() {
      return new gvs();
   }

   public void a(clo $$0, gvs $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gp();
   }
}
