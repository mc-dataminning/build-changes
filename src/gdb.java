public class gdb extends gdc {
   protected final geh a;

   public gdb(geh $$0) {
      super($$0);
      this.a = $$0.b("head");
   }

   public static gep a() {
      gep $$0 = new gep();
      ger $$1 = $$0.a();
      $$1.a("head", gem.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gej.a);
      return $$0;
   }

   public static gen b() {
      gep $$0 = a();
      ger $$1 = $$0.a();
      $$1.b("head").a("hat", gem.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gel(0.25F)), gej.a);
      return gen.a($$0, 64, 64);
   }

   public static gen c() {
      gep $$0 = a();
      return gen.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }
}
