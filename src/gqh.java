public class gqh extends grf<gsl, fwn> {
   private static final alb a = alb.b("textures/entity/cat/cat_collar.png");
   private final fwn b;
   private final fwn c;

   public gqh(goo<gsl, fwn> $$0, fzx $$1) {
      super($$0);
      this.b = new fwn($$1.a(gaa.F));
      this.c = new fwn($$1.a(gaa.G));
   }

   public void a(fcu $$0, ggv $$1, int $$2, gsl $$3, float $$4, float $$5) {
      cue $$6 = $$3.c;
      if ($$6 != null) {
         int $$7 = $$6.d();
         fwn $$8 = $$3.ae ? this.c : this.b;
         a($$8, a, $$0, $$1, $$2, $$3, $$7);
      }
   }
}
