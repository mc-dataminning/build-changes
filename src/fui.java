public class fui extends fti<byj> {
   private static final aey a = new aey("textures/entity/lead_knot.png");
   private final ffw<byj> f;

   public fui(ftj.a $$0) {
      super($$0);
      this.f = new ffw<>($$0.a(fid.aq));
   }

   public void a(byj $$0, float $$1, float $$2, elr $$3, fog $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      elv $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, fyx.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aey a(byj $$0) {
      return a;
   }
}
