public class gkn {
   public static final xv a = xv.c("quickplay.error.title");
   private static final xv b = xv.c("quickplay.error.invalid_identifier");
   private static final xv c = xv.c("quickplay.error.realm_connect");
   private static final xv d = xv.c("quickplay.error.realm_permission");
   private static final xv e = xv.c("gui.toTitle");
   private static final xv f = xv.c("gui.toWorld");
   private static final xv g = xv.c("gui.toRealms");

   public static void a(fmf $$0, fzx.c $$1, fhh $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!bbb.h($$3)) {
         a($$0, $$3);
      } else if (!bbb.h($$4)) {
         b($$0, $$4);
      } else if (!bbb.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(fmf $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         ftx $$2 = new fze(new ftz());
         $$0.a(new fte($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new ftz()));
      }
   }

   private static void b(fmf $$0, String $$1) {
      gfz $$2 = new gfz($$0);
      $$2.a();
      gfy $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new gfy(hcr.a("selectServer.defaultName"), $$1, gfy.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      ghb $$4 = ghb.a($$1);
      fsw.a(new fwn(new ftz()), $$0, $$4, $$3, true, null);
   }

   private static void a(fmf $$0, fhh $$1, String $$2) {
      long $$3;
      fik $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         ftx $$6 = new fhc(new ftz());
         $$0.a(new fte($$6, a, b, g));
         return;
      } catch (fjd var10) {
         ftx $$8 = new ftz();
         $$0.a(new fte($$8, a, c, e));
         return;
      }

      fii $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         ftx $$12 = new fhc(new ftz());
         $$0.a(new fte($$12, a, d, g));
      } else {
         ftz $$13 = new ftz();
         fld $$14 = new fld($$13, $$11);
         $$0.a(new fjx($$13, $$14));
      }
   }
}
