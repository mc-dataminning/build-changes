public class gea extends gda<cey> {
   private static final ajh a = new ajh("textures/entity/lead_knot.png");
   private final fow<cey> f;

   public gea(gdb.a $$0) {
      super($$0);
      this.f = new fow<>($$0.a(fre.aw));
   }

   public void a(cey $$0, float $$1, float $$2, eub $$3, fxs $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      euf $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, git.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ajh a(cey $$0) {
      return a;
   }
}
