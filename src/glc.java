public class glc {
   public static final wp a = wp.c("quickplay.error.title");
   private static final wp b = wp.c("quickplay.error.invalid_identifier");
   private static final wp c = wp.c("quickplay.error.realm_connect");
   private static final wp d = wp.c("quickplay.error.realm_permission");
   private static final wp e = wp.c("gui.toTitle");
   private static final wp f = wp.c("gui.toWorld");
   private static final wp g = wp.c("gui.toRealms");

   public static void a(fli $$0, gak.c $$1, fgj $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!azw.h($$3)) {
         a($$0, $$3);
      } else if (!azw.h($$4)) {
         b($$0, $$4);
      } else if (!azw.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(fli $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fuk $$2 = new fzr(new fum());
         $$0.a(new ftr($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fum()));
      }
   }

   private static void b(fli $$0, String $$1) {
      ggo $$2 = new ggo($$0);
      $$2.a();
      ggn $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new ggn(hfz.a("selectServer.defaultName"), $$1, ggn.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      ghq $$4 = ghq.a($$1);
      ftj.a(new fxa(new fum()), $$0, $$4, $$3, true, null);
   }

   private static void a(fli $$0, fgj $$1, String $$2) {
      long $$3;
      fhm $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fuk $$6 = new fge(new fum());
         $$0.a(new ftr($$6, a, b, g));
         return;
      } catch (fif var10) {
         fuk $$8 = new fum();
         $$0.a(new ftr($$8, a, c, e));
         return;
      }

      fhk $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fuk $$12 = new fge(new fum());
         $$0.a(new ftr($$12, a, d, g));
      } else {
         fum $$13 = new fum();
         fkf $$14 = new fkf($$13, $$11);
         $$0.a(new fiz($$13, $$14));
      }
   }
}
