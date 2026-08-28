public class grh extends grf<gum, fyq> {
   private static final alb a = alb.b("textures/entity/sheep/sheep_fur.png");
   private final fxa<gum> b;
   private final fxa<gum> c;

   public grh(goo<gum, fyq> $$0, fzx $$1) {
      super($$0);
      this.b = new fyp($$1.a(gaa.ce));
      this.c = new fyp($$1.a(gaa.cf));
   }

   public void a(fcu $$0, ggv $$1, int $$2, gum $$3, float $$4, float $$5) {
      if (!$$3.c) {
         fxa<gum> $$6 = $$3.ae ? this.c : this.b;
         if ($$3.u) {
            if ($$3.aj) {
               $$6.a($$3);
               fcy $$7 = $$1.getBuffer(ghe.s(a));
               $$6.a($$0, $$7, $$2, gnt.a($$3, 0.0F), -16777216);
            }
         } else {
            int $$17;
            if ($$3.al != null && "jeb_".equals($$3.al.getString())) {
               int $$8 = 25;
               int $$9 = azc.d($$3.p);
               int $$10 = $$9 / 25 + $$3.e;
               int $$11 = cue.values().length;
               int $$12 = $$10 % $$11;
               int $$13 = ($$10 + 1) % $$11;
               float $$14 = ((float)($$9 % 25) + azc.h($$3.p)) / 25.0F;
               int $$15 = cgr.a(cue.a($$12));
               int $$16 = cgr.a(cue.a($$13));
               $$17 = axn.a($$14, $$15, $$16);
            } else {
               $$17 = cgr.a($$3.d);
            }

            a($$6, a, $$0, $$1, $$2, $$3, $$17);
         }
      }
   }
}
