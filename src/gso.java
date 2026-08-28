public class gso extends gro<clu, gxu> {
   private static final alz a = alz.b("textures/entity/lead_knot.png");
   private final gcc b;

   public gso(grp.a $$0) {
      super($$0);
      this.b = new gcc($$0.a(gem.bo));
   }

   @Override
   public void a(gxu $$0, fgr $$1, glk $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.b.a($$0);
      fgv $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, hbb.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public gxu d() {
      return new gxu();
   }
}
