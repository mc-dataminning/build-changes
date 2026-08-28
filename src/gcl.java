public class gcl extends gbu<gzb> {
   public gcl(gej $$0) {
      super($$0);
   }

   public static gep a() {
      ger $$0 = gbu.a(gen.a, 0.0F);
      get $$1 = $$0.a();
      get $$2 = $$1.a("head");
      $$2.a("hat");
      $$1.a("body");
      $$1.a("left_arm");
      $$1.a("right_arm");
      $$1.a("left_leg");
      $$1.a("right_leg");
      geo $$3 = geo.c().a(24, 0).a(-3.0F, -6.0F, -1.0F, 6.0F, 6.0F, 1.0F, new gen(1.0F));
      $$2.a("left_ear", $$3, gel.a(-6.0F, -6.0F, 0.0F));
      $$2.a("right_ear", $$3, gel.a(6.0F, -6.0F, 0.0F));
      return gep.a($$0, 64, 64);
   }
}
