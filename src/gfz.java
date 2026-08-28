public class gfz {
   public static final xd a = xd.c("quickplay.error.title");
   private static final xd b = xd.c("quickplay.error.invalid_identifier");
   private static final xd c = xd.c("quickplay.error.realm_connect");
   private static final xd d = xd.c("quickplay.error.realm_permission");
   private static final xd e = xd.c("gui.toTitle");
   private static final xd f = xd.c("gui.toWorld");
   private static final xd g = xd.c("gui.toRealms");

   public static void a(fib $$0, fvo.c $$1, fdk $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!azz.h($$3)) {
         a($$0, $$3);
      } else if (!azz.h($$4)) {
         b($$0, $$4);
      } else if (!azz.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(fib $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fpt $$2 = new fuw(new fpv());
         $$0.a(new fpa($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fpv()));
      }
   }

   private static void b(fib $$0, String $$1) {
      gbm $$2 = new gbm($$0);
      $$2.a();
      gbl $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new gbl(gxr.a("selectServer.defaultName"), $$1, gbl.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      gco $$4 = gco.a($$1);
      fos.a(new fsi(new fpv()), $$0, $$4, $$3, true, null);
   }

   private static void a(fib $$0, fdk $$1, String $$2) {
      long $$3;
      fed $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fpt $$6 = new fdf(new fpv());
         $$0.a(new fpa($$6, a, b, g));
         return;
      } catch (fev var10) {
         fpt $$8 = new fpv();
         $$0.a(new fpa($$8, a, c, e));
         return;
      }

      feb $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fpt $$12 = new fdf(new fpv());
         $$0.a(new fpa($$12, a, d, g));
      } else {
         fpv $$13 = new fpv();
         fgy $$14 = new fgy($$13, $$11);
         $$0.a(new ffp($$13, $$14));
      }
   }
}
