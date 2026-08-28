public class gqo<S extends gtk, M extends fxa<S>> extends grf<S, M> {
   private static final alb a = alb.b("textures/entity/elytra.png");
   private final fww b;
   private final fww c;

   public gqo(goo<S, M> $$0, fzx $$1) {
      super($$0);
      this.b = new fww($$1.a(gaa.ar));
      this.c = new fww($$1.a(gaa.as));
   }

   public void a(fcu $$0, ggv $$1, int $$2, S $$3, float $$4, float $$5) {
      if ($$3.Q.a(cvo.nU)) {
         alb $$8;
         if ($$3 instanceof guf $$6) {
            gxl $$7 = $$6.a;
            if ($$7.d() != null) {
               $$8 = $$7.d();
            } else if ($$7.c() != null && $$6.aw) {
               $$8 = $$7.c();
            } else {
               $$8 = a;
            }
         } else {
            $$8 = a;
         }

         fww $$12 = $$3.ae ? this.c : this.b;
         $$0.a();
         $$0.a(0.0F, 0.0F, 0.125F);
         $$12.a($$3);
         fcy $$13 = gnq.a($$1, ghe.a($$8), $$3.Q.z());
         $$12.a($$0, $$13, $$2, gwb.d);
         $$0.b();
      }
   }
}
