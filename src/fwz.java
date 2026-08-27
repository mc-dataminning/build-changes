public class fwz {
   public static final vu a = vu.c("quickplay.error.title");
   private static final vu b = vu.c("quickplay.error.invalid_identifier");
   private static final vu c = vu.c("quickplay.error.realm_connect");
   private static final vu d = vu.c("quickplay.error.realm_permission");
   private static final vu e = vu.c("gui.toTitle");
   private static final vu f = vu.c("gui.toWorld");
   private static final vu g = vu.c("gui.toRealms");

   public static void a(ezg $$0, fmt.c $$1, eup $$2) {
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

   private static void a(ezg $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fhf $$2 = new fmb(new fhk());
         $$0.a(new fgg($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fhk()));
      }
   }

   private static void b(ezg $$0, String $$1) {
      fsn $$2 = new fsn($$0);
      $$2.a();
      fsm $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fsm(gke.a("selectServer.defaultName"), $$1, fsm.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      ftp $$4 = ftp.a($$1);
      ffy.a(new fkd(new fhk()), $$0, $$4, $$3, true, null);
   }

   private static void a(ezg $$0, eup $$1, String $$2) {
      long $$3;
      evi $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fhf $$6 = new euk(new fhk());
         $$0.a(new fgg($$6, a, b, g));
         return;
      } catch (ewc var10) {
         fhf $$8 = new fhk();
         $$0.a(new fgg($$8, a, c, e));
         return;
      }

      evg $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fhf $$12 = new euk(new fhk());
         $$0.a(new fgg($$12, a, d, g));
      } else {
         fhk $$13 = new fhk();
         eyf $$14 = new eyf($$13, $$11);
         $$0.a(new eww($$13, $$14));
      }
   }
}
