public class hda extends hcy<hgj, gjt> {
   private static final alk a = alk.b("textures/entity/sheep/sheep_wool_undercoat.png");
   private final gic<hgj> b;
   private final gic<hgj> c;

   public hda(hah<hgj, gjt> $$0, glc $$1) {
      super($$0);
      this.b = new gjs($$1.a(glf.cR));
      this.c = new gjs($$1.a(glf.cS));
   }

   public void a(flq $$0, gsc $$1, int $$2, hgj $$3, float $$4, float $$5) {
      if (!$$3.z && ($$3.b() || $$3.d != cyy.a)) {
         gic<hgj> $$6 = $$3.aj ? this.c : this.b;
         a($$6, a, $$0, $$1, $$2, $$3, $$3.a());
      }
   }
}
