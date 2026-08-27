public class gax {
   public static final wu a = wu.c("quickplay.error.title");
   private static final wu b = wu.c("quickplay.error.invalid_identifier");
   private static final wu c = wu.c("quickplay.error.realm_connect");
   private static final wu d = wu.c("quickplay.error.realm_permission");
   private static final wu e = wu.c("gui.toTitle");
   private static final wu f = wu.c("gui.toWorld");
   private static final wu g = wu.c("gui.toRealms");

   public static void a(fde $$0, fqr.c $$1, eyn $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!ayu.h($$3)) {
         a($$0, $$3);
      } else if (!ayu.h($$4)) {
         b($$0, $$4);
      } else if (!ayu.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(fde $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fld $$2 = new fpz(new fli());
         $$0.a(new fke($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fli()));
      }
   }

   private static void b(fde $$0, String $$1) {
      fwl $$2 = new fwl($$0);
      $$2.a();
      fwk $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fwk(goe.a("selectServer.defaultName"), $$1, fwk.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      fxn $$4 = fxn.a($$1);
      fjw.a(new foa(new fli()), $$0, $$4, $$3, true, null);
   }

   private static void a(fde $$0, eyn $$1, String $$2) {
      long $$3;
      ezg $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fld $$6 = new eyi(new fli());
         $$0.a(new fke($$6, a, b, g));
         return;
      } catch (faa var10) {
         fld $$8 = new fli();
         $$0.a(new fke($$8, a, c, e));
         return;
      }

      eze $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fld $$12 = new eyi(new fli());
         $$0.a(new fke($$12, a, d, g));
      } else {
         fli $$13 = new fli();
         fcd $$14 = new fcd($$13, $$11);
         $$0.a(new fau($$13, $$14));
      }
   }
}
