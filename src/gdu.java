public class gdu extends gbf<gzz> implements gbo, gdq {
   protected final geh a;
   private final geh b;
   private final geh c;
   private final geh d;
   private final geh e;
   private final geh f;

   public gdu(geh $$0) {
      super($$0);
      this.b = $$0.b("head");
      this.c = this.b.b("hat");
      this.d = this.c.b("hat_rim");
      this.a = this.b.b("nose");
      this.e = $$0.b("right_leg");
      this.f = $$0.b("left_leg");
   }

   public static gen a() {
      gep $$0 = gdr.a();
      ger $$1 = $$0.a();
      ger $$2 = $$1.a("head", gem.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), gej.a);
      ger $$3 = $$2.a("hat", gem.c().a(0, 64).a(0.0F, 0.0F, 0.0F, 10.0F, 2.0F, 10.0F), gej.a(-5.0F, -10.03125F, -5.0F));
      ger $$4 = $$3.a("hat2", gem.c().a(0, 76).a(0.0F, 0.0F, 0.0F, 7.0F, 4.0F, 7.0F), gej.a(1.75F, -4.0F, 2.0F, -0.05235988F, 0.0F, 0.02617994F));
      ger $$5 = $$4.a("hat3", gem.c().a(0, 87).a(0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F), gej.a(1.75F, -4.0F, 2.0F, -0.10471976F, 0.0F, 0.05235988F));
      $$5.a(
         "hat4", gem.c().a(0, 95).a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new gel(0.25F)), gej.a(1.75F, -2.0F, 2.0F, (float) (-Math.PI / 15), 0.0F, 0.10471976F)
      );
      ger $$6 = $$2.b("nose");
      $$6.a("mole", gem.c().a(0, 0).a(0.0F, 3.0F, -6.75F, 1.0F, 1.0F, 1.0F, new gel(-0.25F)), gej.a(0.0F, -2.0F, 0.0F));
      return gen.a($$0, 64, 128);
   }

   public void a(gzz $$0) {
      super.a($$0);
      this.b.f = $$0.U * (float) (Math.PI / 180.0);
      this.b.e = $$0.V * (float) (Math.PI / 180.0);
      this.e.e = bae.b($$0.X * 0.6662F) * 1.4F * $$0.Y * 0.5F;
      this.f.e = bae.b($$0.X * 0.6662F + (float) Math.PI) * 1.4F * $$0.Y * 0.5F;
      float $$1 = 0.01F * (float)($$0.a % 10);
      this.a.e = bae.a($$0.p * $$1) * 4.5F * (float) (Math.PI / 180.0);
      this.a.g = bae.b($$0.p * $$1) * 2.5F * (float) (Math.PI / 180.0);
      if ($$0.b) {
         this.a.a(0.0F, 1.0F, -1.5F);
         this.a.e = -0.9F;
      }
   }

   public geh c() {
      return this.a;
   }

   @Override
   public geh b() {
      return this.b;
   }

   @Override
   public void a(boolean $$0) {
      this.b.k = $$0;
      this.c.k = $$0;
      this.d.k = $$0;
   }
}
