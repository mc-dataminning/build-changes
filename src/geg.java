public class geg {
   public static final wz a = wz.c("quickplay.error.title");
   private static final wz b = wz.c("quickplay.error.invalid_identifier");
   private static final wz c = wz.c("quickplay.error.realm_connect");
   private static final wz d = wz.c("quickplay.error.realm_permission");
   private static final wz e = wz.c("gui.toTitle");
   private static final wz f = wz.c("gui.toWorld");
   private static final wz g = wz.c("gui.toRealms");

   public static void a(fgm $$0, fty.c $$1, fbw $$2) {
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

   private static void a(fgm $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fob $$2 = new ftg(new fod());
         $$0.a(new fni($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fod()));
      }
   }

   private static void b(fgm $$0, String $$1) {
      fzs $$2 = new fzs($$0);
      $$2.a();
      fzr $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fzr(grp.a("selectServer.defaultName"), $$1, fzr.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      gav $$4 = gav.a($$1);
      fna.a(new fqr(new fod()), $$0, $$4, $$3, true, null);
   }

   private static void a(fgm $$0, fbw $$1, String $$2) {
      long $$3;
      fcp $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fob $$6 = new fbr(new fod());
         $$0.a(new fni($$6, a, b, g));
         return;
      } catch (fdh var10) {
         fob $$8 = new fod();
         $$0.a(new fni($$8, a, c, e));
         return;
      }

      fcn $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fob $$12 = new fbr(new fod());
         $$0.a(new fni($$12, a, d, g));
      } else {
         fod $$13 = new fod();
         ffk $$14 = new ffk($$13, $$11);
         $$0.a(new feb($$13, $$14));
      }
   }
}
