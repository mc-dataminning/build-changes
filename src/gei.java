public class gei {
   public static final wz a = wz.c("quickplay.error.title");
   private static final wz b = wz.c("quickplay.error.invalid_identifier");
   private static final wz c = wz.c("quickplay.error.realm_connect");
   private static final wz d = wz.c("quickplay.error.realm_permission");
   private static final wz e = wz.c("gui.toTitle");
   private static final wz f = wz.c("gui.toWorld");
   private static final wz g = wz.c("gui.toRealms");

   public static void a(fgo $$0, fua.c $$1, fby $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!azl.h($$3)) {
         a($$0, $$3);
      } else if (!azl.h($$4)) {
         b($$0, $$4);
      } else if (!azl.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(fgo $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fod $$2 = new fti(new fof());
         $$0.a(new fnk($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fof()));
      }
   }

   private static void b(fgo $$0, String $$1) {
      fzu $$2 = new fzu($$0);
      $$2.a();
      fzt $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fzt(grr.a("selectServer.defaultName"), $$1, fzt.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      gax $$4 = gax.a($$1);
      fnc.a(new fqt(new fof()), $$0, $$4, $$3, true, null);
   }

   private static void a(fgo $$0, fby $$1, String $$2) {
      long $$3;
      fcr $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fod $$6 = new fbt(new fof());
         $$0.a(new fnk($$6, a, b, g));
         return;
      } catch (fdj var10) {
         fod $$8 = new fof();
         $$0.a(new fnk($$8, a, c, e));
         return;
      }

      fcp $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fod $$12 = new fbt(new fof());
         $$0.a(new fnk($$12, a, d, g));
      } else {
         fof $$13 = new fof();
         ffm $$14 = new ffm($$13, $$11);
         $$0.a(new fed($$13, $$14));
      }
   }
}
