public class gth extends gsu<cip, gzg, gbk<gxt>> {
   private static final alz a = alz.b("textures/entity/fish/pufferfish.png");
   private final gbk<gxt> b;
   private final gbk<gxt> k;
   private final gbk<gxt> l = this.c();

   public gth(gro.a $$0) {
      super($$0, new gcr($$0.a(gel.cn)), 0.2F);
      this.k = new gcs($$0.a(gel.co));
      this.b = new gct($$0.a(gel.cp));
   }

   public alz a(gzg $$0) {
      return a;
   }

   public gzg b() {
      return new gzg();
   }

   public void a(gzg $$0, fgq $$1, glj $$2, int $$3) {
      this.h = switch ($$0.a) {
         case 0 -> this.b;
         case 1 -> this.k;
         default -> this.l;
      };
      this.f = 0.1F + 0.1F * (float)$$0.a;
      super.a($$0, $$1, $$2, $$3);
   }

   public void a(cip $$0, gzg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gn();
   }

   protected void a(gzg $$0, fgq $$1, float $$2, float $$3) {
      $$1.a(0.0F, bae.b($$0.p * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3);
   }
}
