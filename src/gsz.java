public class gsz extends gsa<cof, gyy, gch> {
   private static final alz b = alz.b("textures/entity/piglin/piglin.png");
   private static final alz k = alz.b("textures/entity/piglin/piglin_brute.png");
   public static final gvc.a a = new gvc.a(0.0F, 0.0F, 1.0019531F);

   public gsz(grj.a $$0, gef $$1, gef $$2, gef $$3, gef $$4, gef $$5, gef $$6) {
      super($$0, new gch($$0.a($$1)), new gch($$0.a($$2)), 0.5F, a);
      this.a(new gvn<>(this, new gbr($$0.a($$3)), new gbr($$0.a($$4)), new gbr($$0.a($$5)), new gbr($$0.a($$6)), $$0.h()));
   }

   public alz a(gyy $$0) {
      return $$0.a ? k : b;
   }

   public gyy b() {
      return new gyy();
   }

   public void a(cof $$0, gyy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.aq() == bvm.aT;
      $$1.d = $$0.gn();
      $$1.c = (float)cwb.b($$0.fz(), $$0);
      $$1.b = $$0.x();
   }

   protected boolean b(gyy $$0) {
      return super.a($$0) || $$0.b;
   }
}
