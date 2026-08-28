public class grs extends grp<cqi, gxx> {
   private static final alz a = alz.b("textures/entity/illager/evoker_fangs.png");
   private final gbn b;

   public grs(grq.a $$0) {
      super($$0);
      this.b = new gbn($$0.a(gen.aJ));
   }

   public void a(gxx $$0, fgs $$1, gll $$2, int $$3) {
      float $$4 = $$0.b;
      if ($$4 != 0.0F) {
         $$1.a();
         $$1.a(a.d.rotationDegrees(90.0F - $$0.a));
         $$1.b(-1.0F, -1.0F, 1.0F);
         $$1.a(0.0F, -1.501F, 0.0F);
         this.b.a($$0);
         fgw $$5 = $$2.getBuffer(this.b.a(a));
         this.b.a($$1, $$5, $$3, hbc.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public gxx a() {
      return new gxx();
   }

   public void a(cqi $$0, gxx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dM();
      $$1.b = $$0.a($$2);
   }
}
