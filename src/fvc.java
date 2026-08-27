public class fvc {
   public static final vq a = vq.c("quickplay.error.title");
   private static final vq b = vq.c("quickplay.error.invalid_identifier");
   private static final vq c = vq.c("quickplay.error.realm_connect");
   private static final vq d = vq.c("quickplay.error.realm_permission");
   private static final vq e = vq.c("gui.toTitle");
   private static final vq f = vq.c("gui.toWorld");
   private static final vq g = vq.c("gui.toRealms");

   public static void a(exo $$0, fkz.c $$1, esx $$2) {
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

   private static void a(exo $$0, String $$1) {
      if (!$$0.l().b($$1)) {
         ffl $$2 = new fkh(new ffq());
         $$0.a(new fen($$2, a, b, f));
      } else {
         $$0.w().a($$1, () -> $$0.a(new ffq()));
      }
   }

   private static void b(exo $$0, String $$1) {
      fqr $$2 = new fqr($$0);
      $$2.a();
      fqq $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fqq(gig.a("selectServer.defaultName"), $$1, fqq.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      frs $$4 = frs.a($$1);
      fef.a(new fij(new ffq()), $$0, $$4, $$3, true, null);
   }

   private static void a(exo $$0, esx $$1, String $$2) {
      long $$3;
      etq $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         ffl $$6 = new ess(new ffq());
         $$0.a(new fen($$6, a, b, g));
         return;
      } catch (euk var10) {
         ffl $$8 = new ffq();
         $$0.a(new fen($$8, a, c, e));
         return;
      }

      eto $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         ffl $$12 = new ess(new ffq());
         $$0.a(new fen($$12, a, d, g));
      } else {
         ffq $$13 = new ffq();
         ewn $$14 = new ewn($$13, $$11);
         $$0.a(new eve($$13, $$14));
      }
   }
}
