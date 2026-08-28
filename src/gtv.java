public class gtv extends gti<chq, gzw, gca<gyi>> {
   private static final aku a = aku.b("textures/entity/fish/pufferfish.png");
   private final gca<gyi> b;
   private final gca<gyi> k;
   private final gca<gyi> l = this.c();

   public gtv(gsc.a $$0) {
      super($$0, new gdh($$0.a(gfb.cq)), 0.2F);
      this.k = new gdi($$0.a(gfb.cr));
      this.b = new gdj($$0.a(gfb.cs));
   }

   public aku a(gzw $$0) {
      return a;
   }

   public gzw b() {
      return new gzw();
   }

   protected float b(gzw $$0) {
      return 0.1F + 0.1F * (float)$$0.a;
   }

   public void a(gzw $$0, ffu $$1, glx $$2, int $$3) {
      this.h = switch ($$0.a) {
         case 0 -> this.b;
         case 1 -> this.k;
         default -> this.l;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   public void a(chq $$0, gzw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gq();
   }

   protected void a(gzw $$0, ffu $$1, float $$2, float $$3) {
      $$1.a(0.0F, ayz.b($$0.u * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3);
   }
}
