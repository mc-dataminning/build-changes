public class gtu extends gtn<gwo, gaf> {
   public static final all a = all.b("textures/entity/trident_riptide.png");
   private final gbc b;

   public gtu(gqw<gwo, gaf> $$0, gby $$1) {
      super($$0);
      this.b = new gbc($$1.a(gcb.bR));
   }

   public void a(fek $$0, gix $$1, int $$2, gwo $$3, float $$4, float $$5) {
      if ($$3.ag) {
         feo $$6 = $$1.getBuffer(this.b.a(a));
         this.b.a($$3);
         this.b.a($$0, $$6, $$2, gyk.d);
      }
   }
}
