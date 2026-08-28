public class gui extends gti<chv, hah, gea> {
   private static final aku a = aku.b("textures/entity/snow_golem.png");

   public gui(gsc.a $$0) {
      super($$0, new gea($$0.a(gfb.cS)), 0.5F);
      this.a(new gww(this, $$0.d()));
   }

   public aku a(hah $$0) {
      return a;
   }

   public hah b() {
      return new hah();
   }

   public void a(chv $$0, hah $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.p();
   }
}
