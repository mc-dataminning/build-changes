public class gow {
   public static final wy a = wy.c("quickplay.error.title");
   private static final wy b = wy.c("quickplay.error.invalid_identifier");
   private static final wy c = wy.c("quickplay.error.realm_connect");
   private static final wy d = wy.c("quickplay.error.realm_permission");
   private static final wy e = wy.c("gui.toTitle");
   private static final wy f = wy.c("gui.toWorld");
   private static final wy g = wy.c("gui.toRealms");

   public static void a(fos $$0, gdw.c $$1, fjs $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!bal.h($$3)) {
         a($$0, $$3);
      } else if (!bal.h($$4)) {
         b($$0, $$4);
      } else if (!bal.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(fos $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fxu $$2 = new gdd(new fxw());
         $$0.a(new fxb($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fxw()));
      }
   }

   private static void b(fos $$0, String $$1) {
      gkh $$2 = new gkh($$0);
      $$2.a();
      gkg $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new gkg(hjw.a("selectServer.defaultName"), $$1, gkg.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      glj $$4 = glj.a($$1);
      fwt.a(new gam(new fxw()), $$0, $$4, $$3, true, null);
   }

   private static void a(fos $$0, fjs $$1, String $$2) {
      long $$3;
      fkv $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fxu $$6 = new fjn(new fxw());
         $$0.a(new fxb($$6, a, b, g));
         return;
      } catch (flo var10) {
         fxu $$8 = new fxw();
         $$0.a(new fxb($$8, a, c, e));
         return;
      }

      fkt $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fxu $$12 = new fjn(new fxw());
         $$0.a(new fxb($$12, a, d, g));
      } else {
         fxw $$13 = new fxw();
         fno $$14 = new fno($$13, $$11);
         $$0.a(new fmi($$13, $$14));
      }
   }
}
