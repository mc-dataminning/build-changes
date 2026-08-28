public class gtr extends gqw<cho, gzs, gda> {
   private static final aku a = aku.b("textures/entity/pig/pig.png");

   public gtr(gsc.a $$0) {
      super($$0, new gda($$0.a(gfb.bP)), new gda($$0.a(gfb.ca)), 0.7F);
      this.a(new gws<>(this, new gda($$0.a(gfb.cc)), new gda($$0.a(gfb.cb)), aku.b("textures/entity/pig/pig_saddle.png")));
   }

   public aku a(gzs $$0) {
      return a;
   }

   public gzs b() {
      return new gzs();
   }

   public void a(cho $$0, gzs $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j();
   }
}
