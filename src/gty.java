public class gty extends gtl<chs, gzz, gcc<gyl>> {
   private static final akv a = akv.b("textures/entity/fish/pufferfish.png");
   private final gcc<gyl> b;
   private final gcc<gyl> k;
   private final gcc<gyl> l = this.c();

   public gty(gsf.a $$0) {
      super($$0, new gdj($$0.a(gfd.cq)), 0.2F);
      this.k = new gdk($$0.a(gfd.cr));
      this.b = new gdl($$0.a(gfd.cs));
   }

   public akv a(gzz $$0) {
      return a;
   }

   public gzz b() {
      return new gzz();
   }

   protected float b(gzz $$0) {
      return 0.1F + 0.1F * (float)$$0.a;
   }

   public void a(gzz $$0, ffv $$1, glz $$2, int $$3) {
      this.h = switch ($$0.a) {
         case 0 -> this.b;
         case 1 -> this.k;
         default -> this.l;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   public void a(chs $$0, gzz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gt();
   }

   protected void a(gzz $$0, ffv $$1, float $$2, float $$3) {
      $$1.a(0.0F, ayz.b($$0.u * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3);
   }
}
