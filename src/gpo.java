public class gpo extends gnl<clk, gtl> {
   private static final alb a = alb.b("textures/entity/illager/vindicator.png");

   public gpo(gms.a $$0) {
      super($$0, new fxo<>($$0.a(gaa.cT)), 0.5F);
      this.a(new gqy<gtl, fxo<gtl>>(this, $$0.b()) {
         public void a(fcu $$0, ggv $$1, int $$2, gtl $$3, float $$4, float $$5) {
            if ($$3.c) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public alb a(gtl $$0) {
      return a;
   }

   public gtl c() {
      return new gtl();
   }
}
