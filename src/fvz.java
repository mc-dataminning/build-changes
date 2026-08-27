public class fvz {
   public static final vs a = vs.c("quickplay.error.title");
   private static final vs b = vs.c("quickplay.error.invalid_identifier");
   private static final vs c = vs.c("quickplay.error.realm_connect");
   private static final vs d = vs.c("quickplay.error.realm_permission");
   private static final vs e = vs.c("gui.toTitle");
   private static final vs f = vs.c("gui.toWorld");
   private static final vs g = vs.c("gui.toRealms");

   public static void a(eyk $$0, flv.c $$1, ett $$2) {
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

   private static void a(eyk $$0, String $$1) {
      if (!$$0.l().b($$1)) {
         fgh $$2 = new fld(new fgm());
         $$0.a(new ffj($$2, a, b, f));
      } else {
         $$0.w().a($$1, () -> $$0.a(new fgm()));
      }
   }

   private static void b(eyk $$0, String $$1) {
      fro $$2 = new fro($$0);
      $$2.a();
      frn $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new frn(gje.a("selectServer.defaultName"), $$1, frn.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      fsp $$4 = fsp.a($$1);
      ffb.a(new fjf(new fgm()), $$0, $$4, $$3, true, null);
   }

   private static void a(eyk $$0, ett $$1, String $$2) {
      long $$3;
      eum $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fgh $$6 = new eto(new fgm());
         $$0.a(new ffj($$6, a, b, g));
         return;
      } catch (evg var10) {
         fgh $$8 = new fgm();
         $$0.a(new ffj($$8, a, c, e));
         return;
      }

      euk $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fgh $$12 = new eto(new fgm());
         $$0.a(new ffj($$12, a, d, g));
      } else {
         fgm $$13 = new fgm();
         exj $$14 = new exj($$13, $$11);
         $$0.a(new ewa($$13, $$14));
      }
   }
}
