public class goh {
   public static final ww a = ww.c("quickplay.error.title");
   private static final ww b = ww.c("quickplay.error.invalid_identifier");
   private static final ww c = ww.c("quickplay.error.realm_connect");
   private static final ww d = ww.c("quickplay.error.realm_permission");
   private static final ww e = ww.c("gui.toTitle");
   private static final ww f = ww.c("gui.toWorld");
   private static final ww g = ww.c("gui.toRealms");

   public static void a(fof $$0, gdk.c $$1, fjg $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!baj.h($$3)) {
         a($$0, $$3);
      } else if (!baj.h($$4)) {
         b($$0, $$4);
      } else if (!baj.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(fof $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fxi $$2 = new gcr(new fxk());
         $$0.a(new fwp($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fxk()));
      }
   }

   private static void b(fof $$0, String $$1) {
      gjt $$2 = new gjt($$0);
      $$2.a();
      gjs $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new gjs(hjg.a("selectServer.defaultName"), $$1, gjs.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      gkv $$4 = gkv.a($$1);
      fwh.a(new gaa(new fxk()), $$0, $$4, $$3, true, null);
   }

   private static void a(fof $$0, fjg $$1, String $$2) {
      long $$3;
      fkj $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fxi $$6 = new fjb(new fxk());
         $$0.a(new fwp($$6, a, b, g));
         return;
      } catch (flc var10) {
         fxi $$8 = new fxk();
         $$0.a(new fwp($$8, a, c, e));
         return;
      }

      fkh $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fxi $$12 = new fjb(new fxk());
         $$0.a(new fwp($$12, a, d, g));
      } else {
         fxk $$13 = new fxk();
         fnc $$14 = new fnc($$13, $$11);
         $$0.a(new flw($$13, $$14));
      }
   }
}
