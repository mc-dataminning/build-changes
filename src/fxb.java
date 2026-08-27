public class fxb {
   public static final vu a = vu.c("quickplay.error.title");
   private static final vu b = vu.c("quickplay.error.invalid_identifier");
   private static final vu c = vu.c("quickplay.error.realm_connect");
   private static final vu d = vu.c("quickplay.error.realm_permission");
   private static final vu e = vu.c("gui.toTitle");
   private static final vu f = vu.c("gui.toWorld");
   private static final vu g = vu.c("gui.toRealms");

   public static void a(ezi $$0, fmv.c $$1, eur $$2) {
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

   private static void a(ezi $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fhh $$2 = new fmd(new fhm());
         $$0.a(new fgi($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fhm()));
      }
   }

   private static void b(ezi $$0, String $$1) {
      fsp $$2 = new fsp($$0);
      $$2.a();
      fso $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fso(gkh.a("selectServer.defaultName"), $$1, fso.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      ftr $$4 = ftr.a($$1);
      fga.a(new fkf(new fhm()), $$0, $$4, $$3, true, null);
   }

   private static void a(ezi $$0, eur $$1, String $$2) {
      long $$3;
      evk $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fhh $$6 = new eum(new fhm());
         $$0.a(new fgi($$6, a, b, g));
         return;
      } catch (ewe var10) {
         fhh $$8 = new fhm();
         $$0.a(new fgi($$8, a, c, e));
         return;
      }

      evi $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fhh $$12 = new eum(new fhm());
         $$0.a(new fgi($$12, a, d, g));
      } else {
         fhm $$13 = new fhm();
         eyh $$14 = new eyh($$13, $$11);
         $$0.a(new ewy($$13, $$14));
      }
   }
}
