public class guh extends gue<cqt, ham> {
   private static final ald a = ald.b("textures/entity/illager/evoker_fangs.png");
   private final gec g;

   public guh(guf.a $$0) {
      super($$0);
      this.g = new gec($$0.a(ghc.aS));
   }

   public void a(ham $$0, fho $$1, gny $$2, int $$3) {
      float $$4 = $$0.b;
      if ($$4 != 0.0F) {
         $$1.a();
         $$1.a(a.d.rotationDegrees(90.0F - $$0.a));
         $$1.b(-1.0F, -1.0F, 1.0F);
         $$1.a(0.0F, -1.501F, 0.0F);
         this.g.a($$0);
         fhs $$5 = $$2.getBuffer(this.g.a(a));
         this.g.a($$1, $$5, $$3, hgi.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public ham a() {
      return new ham();
   }

   public void a(cqt $$0, ham $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dL();
      $$1.b = $$0.a($$2);
   }
}
