public class fuu {
   public static final vq a = vq.c("quickplay.error.title");
   private static final vq b = vq.c("quickplay.error.invalid_identifier");
   private static final vq c = vq.c("quickplay.error.realm_connect");
   private static final vq d = vq.c("quickplay.error.realm_permission");
   private static final vq e = vq.c("gui.toTitle");
   private static final vq f = vq.c("gui.toWorld");
   private static final vq g = vq.c("gui.toRealms");

   public static void a(exh $$0, fks.c $$1, esq $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!ac.b($$3)) {
         a($$0, $$3);
      } else if (!ac.b($$4)) {
         b($$0, $$4);
      } else if (!ac.b($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(exh $$0, String $$1) {
      if (!$$0.l().b($$1)) {
         ffe $$2 = new fka(new ffj());
         $$0.a(new feg($$2, a, b, f));
      } else {
         $$0.w().a($$1, () -> $$0.a(new ffj()));
      }
   }

   private static void b(exh $$0, String $$1) {
      fqj $$2 = new fqj($$0);
      $$2.a();
      fqi $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fqi(ghy.a("selectServer.defaultName"), $$1, fqi.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      frk $$4 = frk.a($$1);
      fdy.a(new fic(new ffj()), $$0, $$4, $$3, true, null);
   }

   private static void a(exh $$0, esq $$1, String $$2) {
      long $$3;
      etj $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         ffe $$6 = new esl(new ffj());
         $$0.a(new feg($$6, a, b, g));
         return;
      } catch (eud var10) {
         ffe $$8 = new ffj();
         $$0.a(new feg($$8, a, c, e));
         return;
      }

      eth $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         ffe $$12 = new esl(new ffj());
         $$0.a(new feg($$12, a, d, g));
      } else {
         ffj $$13 = new ffj();
         ewg $$14 = new ewg($$13, $$11);
         $$0.a(new eux($$13, $$14));
      }
   }
}
